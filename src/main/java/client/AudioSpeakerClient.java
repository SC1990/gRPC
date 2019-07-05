package client;

import clientui.AudioSpeakerGUI;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.stu.audio_speaker.AudioInput;
import org.stu.audio_speaker.AudioSpeakerGrpc;
import org.stu.audio_speaker.AudioSpeakerOffStatus;
import org.stu.audio_speaker.AudioSpeakerOnStatus;
import org.stu.audio_speaker.CurrentVolume;

public class AudioSpeakerClient implements ServiceObserver {

    protected AudioSpeakerGUI ui;
    protected ServiceDescription current;
    private final String serviceType;
    private final String name;
    private ManagedChannel channel;
    private AudioSpeakerGrpc.AudioSpeakerBlockingStub blockingStub;

    /**
     * Constructor.
     */
    public AudioSpeakerClient() {
        serviceType = "_speaker._udp.local.";
        name = "AudioSpeaker";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui = new AudioSpeakerGUI(AudioSpeakerClient.this);
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
        blockingStub = AudioSpeakerGrpc.newBlockingStub(channel);

        activateAudioSpeaker();

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
    public void activateAudioSpeaker() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    AudioSpeakerOnStatus response = blockingStub.activateAudioSpeaker(request);

                    ui.appendAudioSpeakerStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void deactivateAudioSpeaker() {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    AudioSpeakerOffStatus response = blockingStub.deActivateAudioSpeaker(request);

                    ui.appendAudioSpeakerStatus(response.toString());
                    ui.close();
                    channel.shutdown();

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void increaseVolume(final int amount) {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    CurrentVolume request = CurrentVolume.newBuilder().setVolume(amount).build();

                    CurrentVolume response = blockingStub.increaseVolume(request);

                    ui.appendAudioSpeakerStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void decreaseVolume(final int amount) {
        try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    CurrentVolume request = CurrentVolume.newBuilder().setVolume(amount).build();

                    CurrentVolume response = blockingStub.decreaseVolume(request);

                    ui.appendAudioSpeakerStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);
            return;
        }
    }

    public void setInput(final String input) {

          try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    AudioInput input1 = AudioInput.newBuilder().setInputType(input).build();

                    AudioInput response = blockingStub.setInput(input1);

                    ui.appendAudioSpeakerStatus(response.toString());

                }
            }.start();

        } catch (RuntimeException e) {
            System.out.println("RPC failed: " + e);

        }
    }

    public void listSupportedInputs() {

         try {
            //new thread so client and server can run concurrently
            new Thread() {
                public void run() {
                    Empty request = Empty.newBuilder().build();

                    Iterator<AudioInput> response = blockingStub.listSupportedInputs(request);

                    while (response.hasNext()) {
                        ui.appendAudioSpeakerStatus(response.next().toString());
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
        new AudioSpeakerClient();
    }

}
