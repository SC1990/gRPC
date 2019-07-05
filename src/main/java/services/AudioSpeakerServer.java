/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Logger;
import org.stu.audio_speaker.AudioInput;
import org.stu.audio_speaker.AudioSpeakerGrpc;
import org.stu.audio_speaker.AudioSpeakerOffStatus;
import org.stu.audio_speaker.AudioSpeakerOnStatus;
import org.stu.audio_speaker.CurrentVolume;

/**
 *
 * @author stuar
 */
public class AudioSpeakerServer {

    private static final Logger LOGGER = Logger.getLogger(AudioSpeakerServer.class.getName());

    /* The port on which the server should run */
    private int port = 50023;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new AudioSpeakerImpl())
                .build()
                .start();

        //registering bed service so any listeners can pick it up - how bed server finds bed client
        //JmDNSRegistrationHelper waiting for requests
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Speaker", "_speaker._udp.local.", "", port);

        LOGGER.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                AudioSpeakerServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final AudioSpeakerServer server = new AudioSpeakerServer();
        server.start();
        server.blockUntilShutdown();
    }

    // ImplBase -> generated code 
    static class AudioSpeakerImpl extends AudioSpeakerGrpc.AudioSpeakerImplBase {

        public AudioSpeakerImpl() {
            String name = "Stu's";
            String serviceType = "_speaker._udp.local.";
        }

        @Override
        public void activateAudioSpeaker(Empty request, StreamObserver<AudioSpeakerOnStatus> responseObserver) {

            AudioSpeakerOnStatus status = AudioSpeakerOnStatus.newBuilder().setOnStatus("Audio speaker activated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();

        }

        @Override
        public void deActivateAudioSpeaker(Empty request, StreamObserver<AudioSpeakerOffStatus> responseObserver) {

            AudioSpeakerOffStatus status = AudioSpeakerOffStatus.newBuilder().setOffStatus("Audio speaker deactivated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void increaseVolume(CurrentVolume request, StreamObserver<CurrentVolume> responseObserver) {

            CurrentVolume currentVolume = CurrentVolume.newBuilder().setVolume(request.getVolume()).build();
            responseObserver.onNext(currentVolume);
            responseObserver.onCompleted();
        }

        @Override
        public void decreaseVolume(CurrentVolume request, StreamObserver<CurrentVolume> responseObserver) {

            CurrentVolume currentVolume = CurrentVolume.newBuilder().setVolume(request.getVolume()).build();
            responseObserver.onNext(currentVolume);
            responseObserver.onCompleted();
        }

        @Override
        public void setInput(AudioInput request, StreamObserver<AudioInput> responseObserver) {

            AudioInput audioInput = AudioInput.newBuilder().setInputType(request.getInputType()).build();
            responseObserver.onNext(audioInput);
            responseObserver.onCompleted();
        }

        @Override
        public void listSupportedInputs(Empty request, StreamObserver<AudioInput> responseObserver) {

            AudioInput audioInput = AudioInput.newBuilder().setInputType("HDMI || " + "VGA || " + "USB-A || " + "USB-B || " + "USB-C || " + "IEEE 1394 || " + "DVI").build();
            responseObserver.onNext(audioInput);
            responseObserver.onCompleted();
        }

    }

}
