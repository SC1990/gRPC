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
 * <pre>
 *thermostat definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: thermostat.proto")
public final class ThermostatGrpc {

  private ThermostatGrpc() {}

  public static final String SERVICE_NAME = "thermostat.Thermostat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatOnStatus> getActivateThermostatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateThermostat",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.ThermostatOnStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatOnStatus> getActivateThermostatMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.ThermostatOnStatus> getActivateThermostatMethod;
    if ((getActivateThermostatMethod = ThermostatGrpc.getActivateThermostatMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getActivateThermostatMethod = ThermostatGrpc.getActivateThermostatMethod) == null) {
          ThermostatGrpc.getActivateThermostatMethod = getActivateThermostatMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.ThermostatOnStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "activateThermostat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ThermostatOnStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("activateThermostat"))
                  .build();
          }
        }
     }
     return getActivateThermostatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatOffStatus> getDeActivateThermostatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deActivateThermostat",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.ThermostatOffStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.ThermostatOffStatus> getDeActivateThermostatMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.ThermostatOffStatus> getDeActivateThermostatMethod;
    if ((getDeActivateThermostatMethod = ThermostatGrpc.getDeActivateThermostatMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getDeActivateThermostatMethod = ThermostatGrpc.getDeActivateThermostatMethod) == null) {
          ThermostatGrpc.getDeActivateThermostatMethod = getDeActivateThermostatMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.ThermostatOffStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "deActivateThermostat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.ThermostatOffStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("deActivateThermostat"))
                  .build();
          }
        }
     }
     return getDeActivateThermostatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.FanStatus> getTriggerFanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "triggerFan",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.FanStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.FanStatus> getTriggerFanMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.FanStatus> getTriggerFanMethod;
    if ((getTriggerFanMethod = ThermostatGrpc.getTriggerFanMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getTriggerFanMethod = ThermostatGrpc.getTriggerFanMethod) == null) {
          ThermostatGrpc.getTriggerFanMethod = getTriggerFanMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.FanStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "triggerFan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.FanStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("triggerFan"))
                  .build();
          }
        }
     }
     return getTriggerFanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.FanStatus> getShutdownFanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shutdownFan",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.thermostat.FanStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.thermostat.FanStatus> getShutdownFanMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.thermostat.FanStatus> getShutdownFanMethod;
    if ((getShutdownFanMethod = ThermostatGrpc.getShutdownFanMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getShutdownFanMethod = ThermostatGrpc.getShutdownFanMethod) == null) {
          ThermostatGrpc.getShutdownFanMethod = getShutdownFanMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.thermostat.FanStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "shutdownFan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.FanStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("shutdownFan"))
                  .build();
          }
        }
     }
     return getShutdownFanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.FanMode,
      org.stu.thermostat.FanMode> getSetFanModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setFanMode",
      requestType = org.stu.thermostat.FanMode.class,
      responseType = org.stu.thermostat.FanMode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.FanMode,
      org.stu.thermostat.FanMode> getSetFanModeMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.FanMode, org.stu.thermostat.FanMode> getSetFanModeMethod;
    if ((getSetFanModeMethod = ThermostatGrpc.getSetFanModeMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getSetFanModeMethod = ThermostatGrpc.getSetFanModeMethod) == null) {
          ThermostatGrpc.getSetFanModeMethod = getSetFanModeMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.FanMode, org.stu.thermostat.FanMode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "setFanMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.FanMode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.FanMode.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("setFanMode"))
                  .build();
          }
        }
     }
     return getSetFanModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp,
      org.stu.thermostat.CurrentTemp> getIncreaseTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increaseTemp",
      requestType = org.stu.thermostat.CurrentTemp.class,
      responseType = org.stu.thermostat.CurrentTemp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp,
      org.stu.thermostat.CurrentTemp> getIncreaseTempMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp, org.stu.thermostat.CurrentTemp> getIncreaseTempMethod;
    if ((getIncreaseTempMethod = ThermostatGrpc.getIncreaseTempMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getIncreaseTempMethod = ThermostatGrpc.getIncreaseTempMethod) == null) {
          ThermostatGrpc.getIncreaseTempMethod = getIncreaseTempMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.CurrentTemp, org.stu.thermostat.CurrentTemp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "increaseTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.CurrentTemp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.CurrentTemp.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("increaseTemp"))
                  .build();
          }
        }
     }
     return getIncreaseTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp,
      org.stu.thermostat.CurrentTemp> getDecreaseTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "decreaseTemp",
      requestType = org.stu.thermostat.CurrentTemp.class,
      responseType = org.stu.thermostat.CurrentTemp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp,
      org.stu.thermostat.CurrentTemp> getDecreaseTempMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.CurrentTemp, org.stu.thermostat.CurrentTemp> getDecreaseTempMethod;
    if ((getDecreaseTempMethod = ThermostatGrpc.getDecreaseTempMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getDecreaseTempMethod = ThermostatGrpc.getDecreaseTempMethod) == null) {
          ThermostatGrpc.getDecreaseTempMethod = getDecreaseTempMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.CurrentTemp, org.stu.thermostat.CurrentTemp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "decreaseTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.CurrentTemp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.CurrentTemp.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("decreaseTemp"))
                  .build();
          }
        }
     }
     return getDecreaseTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.thermostat.Hours,
      org.stu.thermostat.Hours> getSetShutDownTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setShutDownTime",
      requestType = org.stu.thermostat.Hours.class,
      responseType = org.stu.thermostat.Hours.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.thermostat.Hours,
      org.stu.thermostat.Hours> getSetShutDownTimeMethod() {
    io.grpc.MethodDescriptor<org.stu.thermostat.Hours, org.stu.thermostat.Hours> getSetShutDownTimeMethod;
    if ((getSetShutDownTimeMethod = ThermostatGrpc.getSetShutDownTimeMethod) == null) {
      synchronized (ThermostatGrpc.class) {
        if ((getSetShutDownTimeMethod = ThermostatGrpc.getSetShutDownTimeMethod) == null) {
          ThermostatGrpc.getSetShutDownTimeMethod = getSetShutDownTimeMethod = 
              io.grpc.MethodDescriptor.<org.stu.thermostat.Hours, org.stu.thermostat.Hours>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "thermostat.Thermostat", "setShutDownTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.Hours.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.thermostat.Hours.getDefaultInstance()))
                  .setSchemaDescriptor(new ThermostatMethodDescriptorSupplier("setShutDownTime"))
                  .build();
          }
        }
     }
     return getSetShutDownTimeMethod;
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
   * <pre>
   *thermostat definition
   * </pre>
   */
  public static abstract class ThermostatImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *switch on thermostat and return status message
     * </pre>
     */
    public void activateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOnStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateThermostatMethod(), responseObserver);
    }

    /**
     * <pre>
     *switch off thermostat and return status message
     * </pre>
     */
    public void deActivateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOffStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getDeActivateThermostatMethod(), responseObserver);
    }

    /**
     */
    public void triggerFan(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getTriggerFanMethod(), responseObserver);
    }

    /**
     */
    public void shutdownFan(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getShutdownFanMethod(), responseObserver);
    }

    /**
     * <pre>
     *e.g. cool mode, dry mode etc.
     * </pre>
     */
    public void setFanMode(org.stu.thermostat.FanMode request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanMode> responseObserver) {
      asyncUnimplementedUnaryCall(getSetFanModeMethod(), responseObserver);
    }

    /**
     * <pre>
     *temperature control
     * </pre>
     */
    public void increaseTemp(org.stu.thermostat.CurrentTemp request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp> responseObserver) {
      asyncUnimplementedUnaryCall(getIncreaseTempMethod(), responseObserver);
    }

    /**
     */
    public void decreaseTemp(org.stu.thermostat.CurrentTemp request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp> responseObserver) {
      asyncUnimplementedUnaryCall(getDecreaseTempMethod(), responseObserver);
    }

    /**
     * <pre>
     *set specific time for shutdown
     * </pre>
     */
    public void setShutDownTime(org.stu.thermostat.Hours request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.Hours> responseObserver) {
      asyncUnimplementedUnaryCall(getSetShutDownTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateThermostatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.ThermostatOnStatus>(
                  this, METHODID_ACTIVATE_THERMOSTAT)))
          .addMethod(
            getDeActivateThermostatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.ThermostatOffStatus>(
                  this, METHODID_DE_ACTIVATE_THERMOSTAT)))
          .addMethod(
            getTriggerFanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.FanStatus>(
                  this, METHODID_TRIGGER_FAN)))
          .addMethod(
            getShutdownFanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.thermostat.FanStatus>(
                  this, METHODID_SHUTDOWN_FAN)))
          .addMethod(
            getSetFanModeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.FanMode,
                org.stu.thermostat.FanMode>(
                  this, METHODID_SET_FAN_MODE)))
          .addMethod(
            getIncreaseTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.CurrentTemp,
                org.stu.thermostat.CurrentTemp>(
                  this, METHODID_INCREASE_TEMP)))
          .addMethod(
            getDecreaseTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.CurrentTemp,
                org.stu.thermostat.CurrentTemp>(
                  this, METHODID_DECREASE_TEMP)))
          .addMethod(
            getSetShutDownTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.thermostat.Hours,
                org.stu.thermostat.Hours>(
                  this, METHODID_SET_SHUT_DOWN_TIME)))
          .build();
    }
  }

  /**
   * <pre>
   *thermostat definition
   * </pre>
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
     * <pre>
     *switch on thermostat and return status message
     * </pre>
     */
    public void activateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOnStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateThermostatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *switch off thermostat and return status message
     * </pre>
     */
    public void deActivateThermostat(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOffStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeActivateThermostatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void triggerFan(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTriggerFanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void shutdownFan(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShutdownFanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *e.g. cool mode, dry mode etc.
     * </pre>
     */
    public void setFanMode(org.stu.thermostat.FanMode request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.FanMode> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetFanModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *temperature control
     * </pre>
     */
    public void increaseTemp(org.stu.thermostat.CurrentTemp request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncreaseTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseTemp(org.stu.thermostat.CurrentTemp request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecreaseTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *set specific time for shutdown
     * </pre>
     */
    public void setShutDownTime(org.stu.thermostat.Hours request,
        io.grpc.stub.StreamObserver<org.stu.thermostat.Hours> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetShutDownTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *thermostat definition
   * </pre>
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
     * <pre>
     *switch on thermostat and return status message
     * </pre>
     */
    public org.stu.thermostat.ThermostatOnStatus activateThermostat(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateThermostatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *switch off thermostat and return status message
     * </pre>
     */
    public org.stu.thermostat.ThermostatOffStatus deActivateThermostat(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeActivateThermostatMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.FanStatus triggerFan(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getTriggerFanMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.FanStatus shutdownFan(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getShutdownFanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *e.g. cool mode, dry mode etc.
     * </pre>
     */
    public org.stu.thermostat.FanMode setFanMode(org.stu.thermostat.FanMode request) {
      return blockingUnaryCall(
          getChannel(), getSetFanModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *temperature control
     * </pre>
     */
    public org.stu.thermostat.CurrentTemp increaseTemp(org.stu.thermostat.CurrentTemp request) {
      return blockingUnaryCall(
          getChannel(), getIncreaseTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.thermostat.CurrentTemp decreaseTemp(org.stu.thermostat.CurrentTemp request) {
      return blockingUnaryCall(
          getChannel(), getDecreaseTempMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *set specific time for shutdown
     * </pre>
     */
    public org.stu.thermostat.Hours setShutDownTime(org.stu.thermostat.Hours request) {
      return blockingUnaryCall(
          getChannel(), getSetShutDownTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *thermostat definition
   * </pre>
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
     * <pre>
     *switch on thermostat and return status message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.ThermostatOnStatus> activateThermostat(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateThermostatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *switch off thermostat and return status message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.ThermostatOffStatus> deActivateThermostat(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeActivateThermostatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.FanStatus> triggerFan(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getTriggerFanMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.FanStatus> shutdownFan(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getShutdownFanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *e.g. cool mode, dry mode etc.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.FanMode> setFanMode(
        org.stu.thermostat.FanMode request) {
      return futureUnaryCall(
          getChannel().newCall(getSetFanModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *temperature control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.CurrentTemp> increaseTemp(
        org.stu.thermostat.CurrentTemp request) {
      return futureUnaryCall(
          getChannel().newCall(getIncreaseTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.CurrentTemp> decreaseTemp(
        org.stu.thermostat.CurrentTemp request) {
      return futureUnaryCall(
          getChannel().newCall(getDecreaseTempMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *set specific time for shutdown
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.thermostat.Hours> setShutDownTime(
        org.stu.thermostat.Hours request) {
      return futureUnaryCall(
          getChannel().newCall(getSetShutDownTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_THERMOSTAT = 0;
  private static final int METHODID_DE_ACTIVATE_THERMOSTAT = 1;
  private static final int METHODID_TRIGGER_FAN = 2;
  private static final int METHODID_SHUTDOWN_FAN = 3;
  private static final int METHODID_SET_FAN_MODE = 4;
  private static final int METHODID_INCREASE_TEMP = 5;
  private static final int METHODID_DECREASE_TEMP = 6;
  private static final int METHODID_SET_SHUT_DOWN_TIME = 7;

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
              (io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOnStatus>) responseObserver);
          break;
        case METHODID_DE_ACTIVATE_THERMOSTAT:
          serviceImpl.deActivateThermostat((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.ThermostatOffStatus>) responseObserver);
          break;
        case METHODID_TRIGGER_FAN:
          serviceImpl.triggerFan((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus>) responseObserver);
          break;
        case METHODID_SHUTDOWN_FAN:
          serviceImpl.shutdownFan((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.FanStatus>) responseObserver);
          break;
        case METHODID_SET_FAN_MODE:
          serviceImpl.setFanMode((org.stu.thermostat.FanMode) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.FanMode>) responseObserver);
          break;
        case METHODID_INCREASE_TEMP:
          serviceImpl.increaseTemp((org.stu.thermostat.CurrentTemp) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp>) responseObserver);
          break;
        case METHODID_DECREASE_TEMP:
          serviceImpl.decreaseTemp((org.stu.thermostat.CurrentTemp) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.CurrentTemp>) responseObserver);
          break;
        case METHODID_SET_SHUT_DOWN_TIME:
          serviceImpl.setShutDownTime((org.stu.thermostat.Hours) request,
              (io.grpc.stub.StreamObserver<org.stu.thermostat.Hours>) responseObserver);
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
              .addMethod(getDeActivateThermostatMethod())
              .addMethod(getTriggerFanMethod())
              .addMethod(getShutdownFanMethod())
              .addMethod(getSetFanModeMethod())
              .addMethod(getIncreaseTempMethod())
              .addMethod(getDecreaseTempMethod())
              .addMethod(getSetShutDownTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
