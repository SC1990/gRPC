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
      org.stu.thermostat.ThermostatMode> getActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activate",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.ThermostatMode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatMode> getActivateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.ThermostatMode> getActivateMethod;
    if ((getActivateMethod = ThermostatGrpc.getActivateMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getActivateMethod = ThermostatGrpc.getActivateMethod) == null) {
          ThermostatGrpc.getActivateMethod = getActivateMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.ThermostatMode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "activate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ThermostatMode.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("activate"))
                  .build();
          }
        }
     }
     return getActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatMode> getDeActivateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deActivate",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.ThermostatMode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatMode> getDeActivateMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.ThermostatMode> getDeActivateMethod;
    if ((getDeActivateMethod = ThermostatGrpc.getDeActivateMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getDeActivateMethod = ThermostatGrpc.getDeActivateMethod) == null) {
          ThermostatGrpc.getDeActivateMethod = getDeActivateMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.ThermostatMode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "deActivate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ThermostatMode.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("deActivate"))
                  .build();
          }
        }
     }
     return getDeActivateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.Degrees,
      org.stu.thermostat.TempStatus> getIncreaseTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increaseTemp",
      requestType = org.stu.thermostat.Degrees.class,
      responseType = org.stu.thermostat.TempStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.Degrees,
      org.stu.thermostat.TempStatus> getIncreaseTempMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.Degrees, org.stu.thermostat.TempStatus> getIncreaseTempMethod;
    if ((getIncreaseTempMethod = ThermostatGrpc.getIncreaseTempMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getIncreaseTempMethod = ThermostatGrpc.getIncreaseTempMethod) == null) {
          ThermostatGrpc.getIncreaseTempMethod = getIncreaseTempMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.Degrees, org.stu.thermostat.TempStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "increaseTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.Degrees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.TempStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("increaseTemp"))
                  .build();
          }
        }
     }
     return getIncreaseTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.Degrees,
      org.stu.thermostat.TempStatus> getDecreaseTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "decreaseTemp",
      requestType = org.stu.thermostat.Degrees.class,
      responseType = org.stu.thermostat.TempStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.Degrees,
      org.stu.thermostat.TempStatus> getDecreaseTempMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.Degrees, org.stu.thermostat.TempStatus> getDecreaseTempMethod;
    if ((getDecreaseTempMethod = ThermostatGrpc.getDecreaseTempMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getDecreaseTempMethod = ThermostatGrpc.getDecreaseTempMethod) == null) {
          ThermostatGrpc.getDecreaseTempMethod = getDecreaseTempMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.Degrees, org.stu.thermostat.TempStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "decreaseTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.Degrees.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.TempStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("decreaseTemp"))
                  .build();
          }
        }
     }
     return getDecreaseTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.ControlPanel,
      org.stu.thermostat.TempStatus> getConnectToDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connectToDevice",
      requestType = org.stu.thermostat.ControlPanel.class,
      responseType = org.stu.thermostat.TempStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.ControlPanel,
      org.stu.thermostat.TempStatus> getConnectToDeviceMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.ControlPanel, org.stu.thermostat.TempStatus> getConnectToDeviceMethod;
    if ((getConnectToDeviceMethod = ThermostatGrpc.getConnectToDeviceMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getConnectToDeviceMethod = ThermostatGrpc.getConnectToDeviceMethod) == null) {
          ThermostatGrpc.getConnectToDeviceMethod = getConnectToDeviceMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.ControlPanel, org.stu.thermostat.TempStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "connectToDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ControlPanel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.TempStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("connectToDevice"))
                  .build();
          }
        }
     }
     return getConnectToDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.SleepTime,
      org.stu.thermostat.DeviceStatus> getSleepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sleep",
      requestType = org.stu.thermostat.SleepTime.class,
      responseType = org.stu.thermostat.DeviceStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.SleepTime,
      org.stu.thermostat.DeviceStatus> getSleepMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.SleepTime, org.stu.thermostat.DeviceStatus> getSleepMethod;
    if ((getSleepMethod = ThermostatGrpc.getSleepMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getSleepMethod = ThermostatGrpc.getSleepMethod) == null) {
          ThermostatGrpc.getSleepMethod = getSleepMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.SleepTime, org.stu.thermostat.DeviceStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "sleep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.SleepTime.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.DeviceStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("sleep"))
                  .build();
          }
        }
     }
     return getSleepMethod;
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
    public void activate(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateMethod(), responseObserver);
    }

    /**
     */
    public void deActivate(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode> responseObserver) {
      asyncUnimplementedUnaryCall(getDeActivateMethod(), responseObserver);
    }

    /**
     */
    public void increaseTemp(org.stu.thermostat.Degrees request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getIncreaseTempMethod(), responseObserver);
    }

    /**
     */
    public void decreaseTemp(org.stu.thermostat.Degrees request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getDecreaseTempMethod(), responseObserver);
    }

    /**
     */
    public void connectToDevice(org.stu.thermostat.ControlPanel request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectToDeviceMethod(), responseObserver);
    }

    /**
     */
    public void sleep(org.stu.thermostat.SleepTime request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.DeviceStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getSleepMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.ThermostatMode>(
                  this, METHODID_ACTIVATE)))
          .addMethod(
            getDeActivateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.ThermostatMode>(
                  this, METHODID_DE_ACTIVATE)))
          .addMethod(
            getIncreaseTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.Degrees,
                org.stu.thermostat.TempStatus>(
                  this, METHODID_INCREASE_TEMP)))
          .addMethod(
            getDecreaseTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.Degrees,
                org.stu.thermostat.TempStatus>(
                  this, METHODID_DECREASE_TEMP)))
          .addMethod(
            getConnectToDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.ControlPanel,
                org.stu.thermostat.TempStatus>(
                  this, METHODID_CONNECT_TO_DEVICE)))
          .addMethod(
            getSleepMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.SleepTime,
                org.stu.thermostat.DeviceStatus>(
                  this, METHODID_SLEEP)))
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
    public void activate(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deActivate(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeActivateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void increaseTemp(org.stu.thermostat.Degrees request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncreaseTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseTemp(org.stu.thermostat.Degrees request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecreaseTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void connectToDevice(org.stu.thermostat.ControlPanel request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectToDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sleep(org.stu.thermostat.SleepTime request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.DeviceStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSleepMethod(), getCallOptions()), request, responseObserver);
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
    public org.stu.thermostat.ThermostatMode activate(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.ThermostatMode deActivate(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeActivateMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.TempStatus increaseTemp(org.stu.thermostat.Degrees request) {
      return blockingUnaryCall(
          getChannel(), getIncreaseTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.TempStatus decreaseTemp(org.stu.thermostat.Degrees request) {
      return blockingUnaryCall(
          getChannel(), getDecreaseTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.TempStatus connectToDevice(org.stu.thermostat.ControlPanel request) {
      return blockingUnaryCall(
          getChannel(), getConnectToDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.DeviceStatus sleep(org.stu.thermostat.SleepTime request) {
      return blockingUnaryCall(
          getChannel(), getSleepMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.ThermostatMode> activate(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.ThermostatMode> deActivate(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeActivateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.TempStatus> increaseTemp(
        org.stu.thermostat.Degrees request) {
      return futureUnaryCall(
          getChannel().newCall(getIncreaseTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.TempStatus> decreaseTemp(
        org.stu.thermostat.Degrees request) {
      return futureUnaryCall(
          getChannel().newCall(getDecreaseTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.TempStatus> connectToDevice(
        org.stu.thermostat.ControlPanel request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectToDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.DeviceStatus> sleep(
        org.stu.thermostat.SleepTime request) {
      return futureUnaryCall(
          getChannel().newCall(getSleepMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE = 0;
  private static final int METHODID_DE_ACTIVATE = 1;
  private static final int METHODID_INCREASE_TEMP = 2;
  private static final int METHODID_DECREASE_TEMP = 3;
  private static final int METHODID_CONNECT_TO_DEVICE = 4;
  private static final int METHODID_SLEEP = 5;

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
        case METHODID_ACTIVATE:
          serviceImpl.activate((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode>) responseObserver);
          break;
        case METHODID_DE_ACTIVATE:
          serviceImpl.deActivate((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatMode>) responseObserver);
          break;
        case METHODID_INCREASE_TEMP:
          serviceImpl.increaseTemp((org.stu.thermostat.Degrees) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus>) responseObserver);
          break;
        case METHODID_DECREASE_TEMP:
          serviceImpl.decreaseTemp((org.stu.thermostat.Degrees) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus>) responseObserver);
          break;
        case METHODID_CONNECT_TO_DEVICE:
          serviceImpl.connectToDevice((org.stu.thermostat.ControlPanel) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.TempStatus>) responseObserver);
          break;
        case METHODID_SLEEP:
          serviceImpl.sleep((org.stu.thermostat.SleepTime) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.DeviceStatus>) responseObserver);
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
              .addMethod(getActivateMethod())
              .addMethod(getDeActivateMethod())
              .addMethod(getIncreaseTempMethod())
              .addMethod(getDecreaseTempMethod())
              .addMethod(getConnectToDeviceMethod())
              .addMethod(getSleepMethod())
              .build();
        }
      }
    }
    return result;
  }
}
