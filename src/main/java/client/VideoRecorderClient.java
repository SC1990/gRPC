package client;

import clientui.VideoRecorderGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.stu.video_recorder.AudioStatus;
import org.stu.video_recorder.DecreaseAmount;
import org.stu.video_recorder.IncreaseAmount;
import org.stu.video_recorder.RecordStatus;
import org.stu.video_recorder.Resolution;
import org.stu.video_recorder.ResultMessage;
import org.stu.video_recorder.VideoRecorderGrpc;
import org.stu.video_recorder.VideoRecorderOffStatus;
import org.stu.video_recorder.VideoRecorderOnStatus;

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

                    VideoRecorderOnStatus response = blockingStub.activateVideoRecorder(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void deActivateVideoRecorder() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    VideoRecorderOffStatus response = blockingStub.deActivateVideoRecorder(request);

                    ui.appendVideoRecorderStatus(response.toString());
                    ui.close();
                    channel.shutdown();

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
        ;
    }

    public void recordVideo() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    RecordStatus response = blockingStub.recordVideo(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }
    
    public void stopRecording() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    RecordStatus response = blockingStub.recordVideo(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }

    }

    public void zoomIn(final int percentage) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    IncreaseAmount request = IncreaseAmount.newBuilder().setPercentage(percentage).build();

                    IncreaseAmount response = blockingStub.zoomIn(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void zoomOut(final int percentage) {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    DecreaseAmount request = DecreaseAmount.newBuilder().setPercentage(percentage).build();

                    DecreaseAmount response = blockingStub.zoomOut(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void muteAudio() {

           try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    AudioStatus response = blockingStub.muteAudio(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }
    
     public void unmuteAudio() {

           try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    AudioStatus response = blockingStub.muteAudio(request);

                    ui.appendVideoRecorderStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

   
    public void listResolutions() {

        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<Resolution> response = blockingStub.listResolutions(request);

                    while (response.hasNext()) {
                        ui.appendVideoRecorderStatus(response.next().toString());
                    }

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    
    public void setResolution(final String res) {

         try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Resolution resolution = Resolution.newBuilder().setRes(res).build();

                    ResultMessage response = blockingStub.setResolution(resolution);

                    ui.appendVideoRecorderStatus(response.toString());

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
        new VideoRecorderClient();
    }

}
