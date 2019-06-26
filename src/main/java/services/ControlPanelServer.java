/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.stu.control_panel.ControlPanelGrpc;
import org.stu.control_panel.InputMachine;
import org.stu.control_panel.ResponseMessage;

/**
 *
 * @author stuar
 */
public class ControlPanelServer {

    private static final Logger LOGGER = Logger.getLogger(ControlPanelServer.class.getName());

    /* The port on which the server should run */
    private int port = 50022;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ControlPanelImpl())
                .build()
                .start();

        //registering bed service so any listeners can pick it up - how bed server finds bed client
        //JmDNSRegistrationHelper waiting for requests
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Stu's Control Panel", "_cpanel._udp.local.", "", port);

        LOGGER.info("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                ControlPanelServer.this.stop();
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
        final ControlPanelServer server = new ControlPanelServer();
        server.start();
        server.blockUntilShutdown();
    }

    // generated code 
    static class ControlPanelImpl extends ControlPanelGrpc.ControlPanelImplBase {

        public ControlPanelImpl() {
            String name = "Stu's";
            String serviceType = "_cpanel._udp.local.";
        }

        @Override
        public void setInputMachine(InputMachine request, StreamObserver<ResponseMessage> responseObserver) {
            
            ResponseMessage message = null;
            
            try {
                message = ResponseMessage.newBuilder().setUserMsg(findMachine()).build();
            } catch (UnknownHostException ex) {
                Logger.getLogger(ControlPanelServer.class.getName()).log(Level.SEVERE, null, ex);
            }

            responseObserver.onNext(message);
            responseObserver.onCompleted();

        }

        private String findMachine() throws UnknownHostException {
            InetAddress localhost = InetAddress.getLocalHost();
            return ("Searching for machines........Detected machine: " + (localhost.getHostName()).trim());
        }

        //streams out results to client using Timer - every 2 seconds
//        @Override
//        public void warm(com.google.protobuf.Empty request,
//                io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
//            Timer t = new Timer();
//            
//            // 0 -> starts immediately
//            //responseObserver communicates back to client
//            t.schedule(new RemindTask(responseObserver), 0, 2000);
//
//        }
//        @Override
//        public void getStatus(com.google.protobuf.Empty request,
//                io.grpc.stub.StreamObserver<org.dominic.example.bed.BedStatus> responseObserver) {
//            responseObserver.onNext(BedStatus.newBuilder().setPercentageHeated(percentHot).build());
//            responseObserver.onCompleted();
//        }
    }

}
