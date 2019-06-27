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
import org.stu.video_recorder.VideoRecorderGrpc;
import org.stu.video_recorder.VideoRecorderStatus;

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
        public void activateVideoRecorder(Empty request, StreamObserver<VideoRecorderStatus> responseObserver) {
            
            VideoRecorderStatus status = VideoRecorderStatus.newBuilder().setStatus("Video recorder activated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();

        }

     

    }

}

