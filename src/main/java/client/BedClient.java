package client;

import javax.swing.JPanel;
import clientui.BedClientGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dominic.example.bed.BedGrpc;
import org.dominic.example.bed.BedStatus;

public class BedClient implements ServiceObserver {

    protected BedClientGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
   

    private ManagedChannel channel;
    private BedGrpc.BedBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public BedClient() {
        serviceType = "_bed._udp.local.";
        name = "Bedroom";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 ui = new BedClientGUI(BedClient.this);
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
        //multiple beds -> multiple channels
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        
        //To call service methods, we first need to create a stub,  
        //a blocking/synchronous stub: this means that the RPC call waits for the server to respond, 
        //and will either return a response or raise an exception.
        blockingStub = BedGrpc.newBlockingStub(channel);
        warm();
        
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

    /**
     * Say hello to server.
     */
    //make request to server
    public void warm() {
        try {

            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<BedStatus> response = blockingStub.warm(request);
                    while (response.hasNext()) {
                        ui.append(response.next().toString());
                    }
                }
            }.start();

            //unary request - one thing in, one thing out
            Empty request = Empty.newBuilder().build();
            BedStatus status = blockingStub.getStatus(request);
            System.out.println("Hello " + status);

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new BedClient();
    }

}
