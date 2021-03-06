package client;

import clientui.ThermostatGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.stu.thermostat.CurrentTemp;
import org.stu.thermostat.FanMode;
import org.stu.thermostat.FanStatus;
import org.stu.thermostat.Hours;
import org.stu.thermostat.ThermostatGrpc;
import org.stu.thermostat.ThermostatOffStatus;
import org.stu.thermostat.ThermostatOnStatus;

public class ThermostatClient implements ServiceObserver {

    protected ThermostatGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    private ThermostatGrpc.ThermostatBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public ThermostatClient() {
        serviceType = "_thermostat._udp.local.";
        name = "Thermostat";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new ThermostatGUI(ThermostatClient.this);
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
        blockingStub = ThermostatGrpc.newBlockingStub(channel);

        activateThermostat();

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
    public void activateThermostat() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    ThermostatOnStatus response = blockingStub.activateThermostat(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

//            //unary request - one thing in, one thing out
//            Empty request = Empty.newBuilder().build();
//            BedStatus status = blockingStub.getStatus(request);
//            System.out.println("Hello " + status);
        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void deActivateThermostat() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    ThermostatOffStatus response = blockingStub.deActivateThermostat(request);

                    ui.appendThermostatStatus(response.toString());
                    ui.close();
                    channel.shutdown();

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void triggerFan() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    FanStatus response = blockingStub.triggerFan(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }
    
    public void shutdownFan() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    FanStatus response = blockingStub.shutdownFan(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }

    public void setFanMode(final String mode) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    FanMode request = FanMode.newBuilder().setMode(mode).build();

                    FanMode response = blockingStub.setFanMode(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }

    public void increaseTemp(final int amount) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    CurrentTemp request = CurrentTemp.newBuilder().setTemp(amount).build();

                    CurrentTemp response = blockingStub.increaseTemp(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void decreaseTemp(final int amount) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    CurrentTemp request = CurrentTemp.newBuilder().setTemp(amount).build();

                    CurrentTemp response = blockingStub.decreaseTemp(request);

                    ui.appendThermostatStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void setShutDownTime(final int hours) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Hours request = Hours.newBuilder().setNumHours(hours).build();

                    Hours response = blockingStub.setShutDownTime(request);

                    ui.appendThermostatStatus(response.toString());

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
        new ThermostatClient();
    }

}
