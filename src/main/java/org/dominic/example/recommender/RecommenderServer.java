package org.dominic.example.recommender;

import org.jpdna.grpchello.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Logger;

public class RecommenderServer {

    private static final Logger logger = Logger.getLogger(RecommenderServer.class.getName());

    /* The port on which the server should run */
    private int port = 50051;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new RecommenderImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                RecommenderServer.this.stop();
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
        final RecommenderServer server = new RecommenderServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class RecommenderImpl extends MovieRecommenderGrpc.MovieRecommenderImplBase {

        private List<Movie> movies;

        public RecommenderImpl() {
            movies = new ArrayList<Movie>();
            Movie terminator = Movie.newBuilder().setTitle("Terminator").setGenre("Awesome").build();
            Movie predator = Movie.newBuilder().setTitle("Predator").setGenre("Awesomest").build();
            Movie terminator2 = Movie.newBuilder().setTitle("Terminator 2").setGenre("Awesomeer").build();
            movies.add(terminator);
            movies.add(predator);
            movies.add(terminator2);

        }

        @Override
        public void recommendMovie(Profile request, StreamObserver<Recommendations> responseObserver) {
            List<Movie> seenMovies = request.getSeenList();
            List<Movie> recommendations = new ArrayList<Movie>();
            for (Movie movie : movies) {
                boolean seen = false;
                for (Movie option : seenMovies) {
                    if (movie.getTitle().equals(option.getTitle())) {
                        seen = true;
                    }
                }
                if (!seen) {
                    recommendations.add(movie);
                }
            }

            responseObserver.onNext(Recommendations.newBuilder().addAllMovies(recommendations).build());
            responseObserver.onCompleted();

        }
    }
}
