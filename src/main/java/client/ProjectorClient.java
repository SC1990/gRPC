package client;

import clientui.ProjectorGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.stu.projector.AspectRatio;
import org.stu.projector.BrightnessLevel;
import org.stu.projector.InputType;
import org.stu.projector.Orientation;
import org.stu.projector.ProjectorOnStatus;
import org.stu.projector.ProjectorGrpc;
import org.stu.projector.ProjectorOffStatus;
import org.stu.projector.Resolution;

public class ProjectorClient implements ServiceObserver {

    protected ProjectorGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;

    private ManagedChannel channel;
    private ProjectorGrpc.ProjectorBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public ProjectorClient() {
        serviceType = "_projector._udp.local.";
        name = "Projector";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new ProjectorGUI(ProjectorClient.this);
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
        blockingStub = ProjectorGrpc.newBlockingStub(channel);

        activateProjector();
        //listInputs();

    }

    public void closeUI() {

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
    public void activateProjector() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    ProjectorOnStatus response = blockingStub.activateProjector(request);

                    ui.appendProjectorStatus(response.toString() + "\n");

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void deActivateProjector() throws InterruptedException {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    ProjectorOffStatus response = blockingStub.deActivateProjector(request);

                    ui.appendProjectorStatus(response.toString());
                    ui.close();
                    channel.shutdown();

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }

    public void listInputs() {

        final ArrayList<String> ls = new ArrayList<>();
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<InputType> response = blockingStub.listInputs(request);

                    while (response.hasNext()) {
                        ui.appendProjectorStatus(response.next().toString());
                    }

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }

    }

    public void setInput(final String input) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    InputType inputType = InputType.newBuilder().setSupportedInputs(input).build();

                    InputType response = blockingStub.setInputType(inputType);

                    ui.appendProjectorStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }

    }

    public void increaseBrightness(final int amount) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    BrightnessLevel brightnessLevel = BrightnessLevel.newBuilder().setCurrentBrightness(amount).build();

                    BrightnessLevel response = blockingStub.increaseBrightness(brightnessLevel);

                    ui.appendProjectorStatus("\n" +response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }

    }

    public void decreaseBrightness(final int amount) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    BrightnessLevel brightnessLevel = BrightnessLevel.newBuilder().setCurrentBrightness(amount).build();

                    BrightnessLevel response = blockingStub.decreaseBrightness(brightnessLevel);

                    ui.appendProjectorStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }

    }

    public void setAspectRatio(final String ratioToSet) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    AspectRatio aspectRatio = AspectRatio.newBuilder().setRatio(ratioToSet).build();

                    AspectRatio response = blockingStub.setAspectRatio(aspectRatio);

                    ui.appendProjectorStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void listRatios() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<AspectRatio> response = blockingStub.listRatios(request);

                    while (response.hasNext()) {
                        ui.appendProjectorStatus(response.next().toString());
                    }

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void setResolution(final String resToSet) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Resolution resolution = Resolution.newBuilder().setResOption(resToSet).build();

                    Resolution response = blockingStub.setResolution(resolution);

                    ui.appendProjectorStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void listAvailableResolutions() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<Resolution> response = blockingStub.listAvailableResolutions(request);

                    while (response.hasNext()) {
                        ui.appendProjectorStatus(response.next().toString());
                    }

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void setOrientation(final String orientationToSet) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Orientation orientation = Orientation.newBuilder().setOrientation(orientationToSet).build();

                    Orientation response = blockingStub.setOrientation(orientation);

                    ui.appendProjectorStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void listAvailableOrientations() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<Orientation> response = blockingStub.listAvailableOrientations(request);

                    while (response.hasNext()) {
                        ui.appendProjectorStatus(response.next().toString());
                    }

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        ProjectorClient projectorClient = new ProjectorClient();

    }

}
