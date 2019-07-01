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
import org.stu.projector.AspectRatio;
import org.stu.projector.BrightnessLevel;
import org.stu.projector.InputType;
import org.stu.projector.Orientation;
import org.stu.projector.ProjectorGrpc;
import org.stu.projector.ProjectorOffStatus;
import org.stu.projector.ProjectorOnStatus;
import org.stu.projector.Resolution;



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

        //registering bed service so any listeners can pick it up - how bed server finds bed client
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

    /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final ProjectorServer server = new ProjectorServer();
        server.start();
        server.blockUntilShutdown();
    }

    // generated code 
    static class ProjectorImpl extends ProjectorGrpc.ProjectorImplBase {

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
            
            InputType inputType1 = InputType.newBuilder().build();
            responseObserver.onNext(inputType1);
            responseObserver.onCompleted();
            
        }
        
        @Override
        public void listInputs(Empty request, StreamObserver<InputType> responseObserver) {
            
        }
        
        @Override
        public void increaseBrightness(Empty request, StreamObserver<BrightnessLevel> responseObserver) {
            
        }
        
        @Override
        public void decreaseBrightness(Empty request, StreamObserver<BrightnessLevel> responseObserver) {
            
        }
        
        @Override
        public void setAspectRatio(AspectRatio request, StreamObserver<Empty> responseObserver) {
            
        }
        
        @Override
        public void listRatios(Empty request, StreamObserver<AspectRatio> responseObserver) {
      
        }
        
        @Override
        public void setResolution(Resolution request, StreamObserver<Empty> responseObserver) {
      
        }

    
        @Override
        public void setOrientation(Orientation request, StreamObserver<Empty> responseObserver) {
      
        }

     

    }

}
