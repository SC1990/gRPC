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
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.stu.projector.AspectRatio;
import org.stu.projector.BrightnessLevel;
import org.stu.projector.InputType;
import org.stu.projector.Orientation;
import org.stu.projector.OrientationOptions;
import org.stu.projector.ProjectorGrpc;
import org.stu.projector.ProjectorOffStatus;
import org.stu.projector.ProjectorOnStatus;
import org.stu.projector.Resolution;
import org.stu.projector.ResolutionOptions;

/**
 *
 * @author stuar
 */
public class ProjectorServer {

    private static final Logger LOGGER = Logger.getLogger(ControlPanelServer.class.getName());

    /* The port on which the server should run */
    private int port = 50021;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ProjectorImpl())
                .build()
                .start();

        //registering service so any listeners can pick it up
        //JmDNSRegistrationHelper waiting for requests
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Projector", "_projector._udp.local.", "", port);

        LOGGER.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ProjectorServer.this.stop();
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

    public void close() throws Exception {
        server.shutdown();
        server.awaitTermination(1, TimeUnit.MINUTES);
        server.shutdownNow();
    }

    /**
     * Main launches the server from the command line.
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        ProjectorServer server = new ProjectorServer();
        server.start();
        server.blockUntilShutdown();

    }

    //method implementations for projector service
    static class ProjectorImpl extends ProjectorGrpc.ProjectorImplBase {

        private final Collection<InputType> inputTypes = new ArrayList<>();

        final ArrayList<String> inputTypeNames = new ArrayList<>(
                Arrays.asList("HDMI", "VGA", "USB-A", "USB-B", "USB-C", "IEEE 1394", "DVI")
        );

        ArrayList<String> aspectRatios = new ArrayList<>(
                Arrays.asList("HDMI", "VGA", "USB-A", "USB-B", "USB-C", "IEEE 1394", "DVI")
        );

        ArrayList<String> resolutions = new ArrayList<>(
                Arrays.asList("HDMI", "VGA", "USB-A", "USB-B", "USB-C", "IEEE 1394", "DVI")
        );

        public ProjectorImpl() {
            String name = "Stu's";
            String serviceType = "_projector._udp.local.";
        }

        @Override
        public void activateProjector(Empty request, StreamObserver<ProjectorOnStatus> responseObserver) {

            ProjectorOnStatus status = ProjectorOnStatus.newBuilder().setOnStatus("Projector activated").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();

        }

        @Override
        public void deActivateProjector(Empty request, StreamObserver<ProjectorOffStatus> responseObserver) {

            ProjectorOffStatus status = ProjectorOffStatus.newBuilder().setOffStatus("Preparing for shutdown.....").build();
            responseObserver.onNext(status);
            responseObserver.onCompleted();
            

        }

        @Override
        public void setInputType(InputType inputType, StreamObserver<InputType> responseObserver) {

            InputType inputType1 = InputType.newBuilder().setSupportedInputs(inputType.getSupportedInputs()).build();
            responseObserver.onNext(inputType1);
            responseObserver.onCompleted();

        }

        @Override
        public void listInputs(Empty request, StreamObserver<InputType> responseObserver) {

            InputType inputType1 = InputType.newBuilder().setSupportedInputs("HDMI || " + "VGA || " + "USB-A || " + "USB-B || " + "USB-C || " + "IEEE 1394 || " + "DVI").build();
            responseObserver.onNext(inputType1);
            responseObserver.onCompleted();
        }

        private String getInputs() {
            int i = 0;
            String inputType = null;

            for (String name : inputTypeNames) {

                inputType = inputTypeNames.get(i);
                i++;

            }

            return inputType;
        }

        @Override
        public void increaseBrightness(BrightnessLevel brightnessLevel, StreamObserver<BrightnessLevel> responseObserver) {

            BrightnessLevel brightnessLevel1 = BrightnessLevel.newBuilder().setCurrentBrightness(brightnessLevel.getCurrentBrightness()).build();
            responseObserver.onNext(brightnessLevel1);
            responseObserver.onCompleted();
        }

        @Override
        public void decreaseBrightness(BrightnessLevel brightnessLevel, StreamObserver<BrightnessLevel> responseObserver) {

            BrightnessLevel brightnessLevel1 = BrightnessLevel.newBuilder().setCurrentBrightness(brightnessLevel.getCurrentBrightness()).build();
            responseObserver.onNext(brightnessLevel1);
            responseObserver.onCompleted();
        }

        @Override
        public void setAspectRatio(AspectRatio request, StreamObserver<AspectRatio> responseObserver) {

            AspectRatio aspectRatio1 = AspectRatio.newBuilder().setRatio(request.getRatio()).build();
            responseObserver.onNext(aspectRatio1);
            responseObserver.onCompleted();
        }

        @Override
        public void listRatios(Empty request, StreamObserver<AspectRatio> responseObserver) {

            AspectRatio aspectRatio1 = AspectRatio.newBuilder().setRatio("16:9 || " + "16:10 || " + "4:3 || " + "1:1 || " + "1.2:1 || " + "2.2:1 || " + "21:9").build();
            responseObserver.onNext(aspectRatio1);
            responseObserver.onCompleted();
        }

        @Override
        public void setResolution(Resolution request, StreamObserver<Resolution> responseObserver) {

            Resolution resolution1 = Resolution.newBuilder().setResOption(request.getResOption()).build();
            responseObserver.onNext(resolution1);
            responseObserver.onCompleted();
        }

        @Override
        public void listAvailableResolutions(Empty request, StreamObserver<Resolution> responseObserver) {

            Resolution resolution1 = Resolution.newBuilder().setResOption("720p || " + "1080p || " + "1440p || " + "2k || " + "4k").build();
            responseObserver.onNext(resolution1);
            responseObserver.onCompleted();
        }

        @Override
        public void setOrientation(Orientation request, StreamObserver<Orientation> responseObserver) {

            Orientation orientation1 = Orientation.newBuilder().setOrientation(request.getOrientation()).build();
            responseObserver.onNext(orientation1);
            responseObserver.onCompleted();
        }

        @Override
        public void listAvailableOrientations(Empty request, StreamObserver<Orientation> responseObserver) {

            Orientation orientation1 = Orientation.newBuilder().setOrientation("Landscape || " + "Portrait || " + "Default").build();
            responseObserver.onNext(orientation1);
            responseObserver.onCompleted();
        }

    }

}
