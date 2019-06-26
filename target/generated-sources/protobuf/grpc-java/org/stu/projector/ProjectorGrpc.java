package org.stu.projector;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: projector.proto")
public final class ProjectorGrpc {

  private ProjectorGrpc() {}

  public static final String SERVICE_NAME = "projector.Projector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorStatus> getActivateProjectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateProjector",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.ProjectorStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorStatus> getActivateProjectorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.ProjectorStatus> getActivateProjectorMethod;
    if ((getActivateProjectorMethod = ProjectorGrpc.getActivateProjectorMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getActivateProjectorMethod = ProjectorGrpc.getActivateProjectorMethod) == null) {
          ProjectorGrpc.getActivateProjectorMethod = getActivateProjectorMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.ProjectorStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "activateProjector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.ProjectorStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("activateProjector"))
                  .build();
          }
        }
     }
     return getActivateProjectorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProjectorStub newStub(io.grpc.Channel channel) {
    return new ProjectorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProjectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProjectorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProjectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProjectorFutureStub(channel);
  }

  /**
   */
  public static abstract class ProjectorImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateProjectorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateProjectorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.ProjectorStatus>(
                  this, METHODID_ACTIVATE_PROJECTOR)))
          .build();
    }
  }

  /**
   */
  public static final class ProjectorStub extends io.grpc.stub.AbstractStub<ProjectorStub> {
    private ProjectorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorStub(channel, callOptions);
    }

    /**
     */
    public void activateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateProjectorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProjectorBlockingStub extends io.grpc.stub.AbstractStub<ProjectorBlockingStub> {
    private ProjectorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stu.projector.ProjectorStatus activateProjector(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateProjectorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProjectorFutureStub extends io.grpc.stub.AbstractStub<ProjectorFutureStub> {
    private ProjectorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProjectorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProjectorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProjectorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.ProjectorStatus> activateProjector(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateProjectorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_PROJECTOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProjectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProjectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_PROJECTOR:
          serviceImpl.activateProjector((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.ProjectorStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProjectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProjectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stu.projector.ProjectorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Projector");
    }
  }

  private static final class ProjectorFileDescriptorSupplier
      extends ProjectorBaseDescriptorSupplier {
    ProjectorFileDescriptorSupplier() {}
  }

  private static final class ProjectorMethodDescriptorSupplier
      extends ProjectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProjectorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProjectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProjectorFileDescriptorSupplier())
              .addMethod(getActivateProjectorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
