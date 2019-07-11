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
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.stu.control_panel.ControlPanelGrpc;
import org.stu.control_panel.InputMachine;
import org.stu.control_panel.PreShutDownMessage;
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

    //attach control panel service to server
    //attach port to server
    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new ControlPanelImpl())
                .build()
                .start();

        //registering service so any listeners can pick it up - how server finds client
        //JmDNSRegistrationHelper waiting for requests
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Stu's Control Panel", "_cpanel._udp.local.", "", port);

        LOGGER.log(Level.INFO, "Server started, listening on {0}", port);

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

    //method implementations for control panel service
    static class ControlPanelImpl extends ControlPanelGrpc.ControlPanelImplBase {

        public ControlPanelImpl() {
            String name = "Stu's";
            String serviceType = "_cpanel._udp.local.";
        }

        //retrieve details of local user machine and connect to device
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

        //retrieve IP address of local machine 
        private String findMachine() throws UnknownHostException {
            InetAddress localhost = InetAddress.getLocalHost();
            return ("Searching for machines........Detected machine: " + (localhost.getHostName()).trim());
        }

        //shut down control panel
        @Override
        public void shutDown(Empty request, StreamObserver<PreShutDownMessage> responseObserver) {

            PreShutDownMessage status = PreShutDownMessage.newBuilder().setShutDownMsg("Shutting down control panel...").build();

            responseObserver.onNext(status);
            responseObserver.onCompleted();
        }

    }

}
