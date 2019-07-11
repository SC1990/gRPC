package client;

import clientui.ControlPanelGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.stu.control_panel.ControlPanelGrpc;
import org.stu.control_panel.InputMachine;
import org.stu.control_panel.PreShutDownMessage;
import org.stu.control_panel.ResponseMessage;

public class ControlPanelClient implements ServiceObserver {

    protected ControlPanelGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;

    private ManagedChannel channel;
    private ControlPanelGrpc.ControlPanelBlockingStub blockingStub;

    /**
     * Constructor.
     */
    //set up client service so jmDNS can listen
    public ControlPanelClient() {
        serviceType = "_cpanel._udp.local.";
        name = "Control Panel";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //instantiate GUI
                    ui = new ControlPanelGUI(ControlPanelClient.this);
                } catch (Exception ex) {
                    Logger.getLogger(ControlPanelClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                ui.setVisible(true);
            }
        });
        serviceAdded(new ServiceDescription("34.241.178.93", 50021));
    }

    String getServiceType() {
        return serviceType;
    }

    void disable() {
        // no services exist for this client type
    }

    public List<String> serviceInterests() {
        List<String> interests = new ArrayList<String>();
        interests.add(serviceType);
        return interests;
    }

    //new service created using grpc
    public void serviceAdded(ServiceDescription service) {
        System.out.println("service added");
        current = service;
        
        //set up channel to communicate with server
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();

        //create stub to call service methods
        blockingStub = ControlPanelGrpc.newBlockingStub(channel);

        //find and connect to local machine to be used as control panel
        setInputMachine();

    }

    public boolean interested(String type) {
        return serviceType.equals(type);
    }

    public String getName() {
        return name;
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    
    //make request to server
    public void setInputMachine() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                @Override
                public void run() {
                    InputMachine request = InputMachine.newBuilder().build();

                    ResponseMessage response = blockingStub.setInputMachine(request);

                    ui.appendDetectedMachine(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
        
        
    }
    
     public void shutdownCPanel() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    PreShutDownMessage response = blockingStub.shutDown(request);

                    ui.appendMessage(response.toString());
                    ui.close();
                    channel.shutdown();

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new ControlPanelClient();
    }

}
