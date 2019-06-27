package client;

import clientui.VideoRecorderGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.stu.video_recorder.VideoRecorderGrpc;
import org.stu.video_recorder.VideoRecorderStatus;


public class VideoRecorderClient implements ServiceObserver {

    protected VideoRecorderGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    private VideoRecorderGrpc.VideoRecorderBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public VideoRecorderClient() {
        serviceType = "_vrecorder._udp.local.";
        name = "Video recorder";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new VideoRecorderGUI(VideoRecorderClient.this);
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
        blockingStub = VideoRecorderGrpc.newBlockingStub(channel);

        activateVideoRecorder();

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
    public void activateVideoRecorder() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    VideoRecorderStatus response = blockingStub.activateVideoRecorder(request);

                    ui.appendVideoRecorderStatus(response.toString());

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

    public void switchService(String name) {
        // TODO
    }

    public static void main(String[] args) {
        new VideoRecorderClient();
    }

}