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
import org.stu.video_recorder.AudioStatus;
import org.stu.video_recorder.DecreaseAmount;
import org.stu.video_recorder.IncreaseAmount;
import org.stu.video_recorder.RecordStatus;
import org.stu.video_recorder.Resolution;
import org.stu.video_recorder.ResultMessage;
import org.stu.video_recorder.VideoRecorderGrpc;
import org.stu.video_recorder.VideoRecorderOffStatus;
import org.stu.video_recorder.VideoRecorderOnStatus;

/**
 *
 * @author stuar
 */
public class VideoRecorderServer {

    private static final Logger LOGGER = Logger.getLogger(VideoRecorderServer.class.getName());

    /* The port on which the server should run */
    private int port = 50025;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new VideoRecorderImpl())
                .build()
                .start();

        //registering bed service so any listeners can pick it up - how bed server finds bed client
        //JmDNSRegistrationHelper waiting for requests
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Video Recorder", "_vrecorder._udp.local.", "", port);

        LOGGER.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                VideoRecorderServer.this.stop();
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
        final VideoRecorderServer server = new VideoRecorderServer();
        server.start();
        server.blockUntilShutdown();
    }

    // ImplBase -> generated code 
    static class VideoRecorderImpl extends VideoRecorderGrpc.VideoRecorderImplBase {

        public VideoRecorderImpl() {
            String name = "Stu's";
            String serviceType = "_vrecorder._udp.local.";
        }

        @Override
        public void activateVideoRecorder(Empty request, StreamObserver<VideoRecorderOnStatus> responseObserver) {

            VideoRecorderOnStatus status = VideoRecorderOnStatus.newBuilder().setOnStatus("Video recorder activated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();

        }

        @Override
        public void deActivateVideoRecorder(Empty request, StreamObserver<VideoRecorderOffStatus> responseObserver) {

            VideoRecorderOffStatus status = VideoRecorderOffStatus.newBuilder().setOffStatus("Video recorder deactivated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void recordVideo(Empty request, StreamObserver<RecordStatus> responseObserver) {

            RecordStatus status = RecordStatus.newBuilder().setStatus("Recording.....").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void stopRecording(Empty request, StreamObserver<RecordStatus> responseObserver) {

            RecordStatus status = RecordStatus.newBuilder().setStatus("Recording stopped").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void zoomIn(IncreaseAmount request, StreamObserver<IncreaseAmount> responseObserver) {

            IncreaseAmount status = IncreaseAmount.newBuilder().setPercentage(request.getPercentage()).build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void zoomOut(DecreaseAmount request, StreamObserver<DecreaseAmount> responseObserver) {

            DecreaseAmount status = DecreaseAmount.newBuilder().setPercentage(request.getPercentage()).build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void muteAudio(Empty request, StreamObserver<AudioStatus> responseObserver) {

            AudioStatus status = AudioStatus.newBuilder().setAStatus("Audio muted").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void unmuteAudio(Empty request, StreamObserver<AudioStatus> responseObserver) {

            AudioStatus status = AudioStatus.newBuilder().setAStatus("Audio unmuted").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

        @Override
        public void listResolutions(Empty request, StreamObserver<Resolution> responseObserver) {

            Resolution resolution1 = Resolution.newBuilder().setRes("720p || " + "1080p || " + "1440p || " + "2k || " + "4k").build();
            responseObserver.onNext(resolution1);
            responseObserver.onCompleted();
        }

        @Override
        public void setResolution(Resolution request, StreamObserver<ResultMessage> responseObserver) {

            ResultMessage resultMessage = ResultMessage.newBuilder().setMessage(request.getRes()).build();
            responseObserver.onNext(resultMessage);
            responseObserver.onCompleted();
        }

    }

}
