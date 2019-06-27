package org.stu.thermostat;

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
    comments = "Source: thermostat.proto")
public final class ThermostatGrpc {

  private ThermostatGrpc() {}

  public static final String SERVICE_NAME = "thermostat.Thermostat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatStatus> getActivateThermostatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateThermostat",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.ThermostatStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatStatus> getActivateThermostatMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.ThermostatStatus> getActivateThermostatMethod;
    if ((getActivateThermostatMethod = ThermostatGrpc.getActivateThermostatMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getActivateThermostatMethod = ThermostatGrpc.getActivateThermostatMethod) == null) {
          ThermostatGrpc.getActivateThermostatMethod = getActivateThermostatMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.ThermostatStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "activateThermostat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ThermostatStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("activateThermostat"))
                  .build();
          }
        }
     }
     return getActivateThermostatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ThermostatStub newStub(io.grpc.Channel channel) {
    return new ThermostatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ThermostatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ThermostatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ThermostatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ThermostatFutureStub(channel);
  }

  /**
   */
  public static abstract class ThermostatImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateThermostatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateThermostatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.ThermostatStatus>(
                  this, METHODID_ACTIVATE_THERMOSTAT)))
          .build();
    }
  }

  /**
   */
  public static final class ThermostatStub extends io.grpc.stub.AbstractStub<ThermostatStub> {
    private ThermostatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermostatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermostatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermostatStub(channel, callOptions);
    }

    /**
     */
    public void activateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateThermostatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ThermostatBlockingStub extends io.grpc.stub.AbstractStub<ThermostatBlockingStub> {
    private ThermostatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermostatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermostatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermostatBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stu.thermostat.ThermostatStatus activateThermostat(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateThermostatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ThermostatFutureStub extends io.grpc.stub.AbstractStub<ThermostatFutureStub> {
    private ThermostatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ThermostatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ThermostatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ThermostatFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.ThermostatStatus> activateThermostat(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateThermostatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_THERMOSTAT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ThermostatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ThermostatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_THERMOSTAT:
          serviceImpl.activateThermostat((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatStatus>) responseObserver);
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

  private static abstract class ThermostatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ThermostatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stu.thermostat.ThermostatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Thermostat");
    }
  }

  private static final class ThermostatFileDescriptorSupplier
      extends ThermostatBaseDescriptorSupplier {
    ThermostatFileDescriptorSupplier() {}
  }

  private static final class ThermostatMethodDescriptorSupplier
      extends ThermostatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ThermostatMethodDescriptorSupplier(String methodName) {
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
      synchronized (ThermostatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ThermostatFileDescriptorSupplier())
              .addMethod(getActivateThermostatMethod())
              .build();
        }
      }
    }
    return result;
  }
}