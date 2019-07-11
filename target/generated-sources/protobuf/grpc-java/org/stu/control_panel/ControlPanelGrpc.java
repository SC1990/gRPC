package org.stu.control_panel;

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
 *control panel service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: control_panel.proto")
public final class ControlPanelGrpc {

  private ControlPanelGrpc() {}

  public static final String SERVICE_NAME = "control_panel.ControlPanel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.stu.control_panel.InputMachine,
      org.stu.control_panel.ResponseMessage> getSetInputMachineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setInputMachine",
      requestType = org.stu.control_panel.InputMachine.class,
      responseType = org.stu.control_panel.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.control_panel.InputMachine,
      org.stu.control_panel.ResponseMessage> getSetInputMachineMethod() {
    io.grpc.MethodDescriptor<org.stu.control_panel.InputMachine, org.stu.control_panel.ResponseMessage> getSetInputMachineMethod;
    if ((getSetInputMachineMethod = ControlPanelGrpc.getSetInputMachineMethod) == null) {
      synchronized (ControlPanelGrpc.class) {
        if ((getSetInputMachineMethod = ControlPanelGrpc.getSetInputMachineMethod) == null) {
          ControlPanelGrpc.getSetInputMachineMethod = getSetInputMachineMethod = 
              io.grpc.MethodDescriptor.<org.stu.control_panel.InputMachine, org.stu.control_panel.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "control_panel.ControlPanel", "setInputMachine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.control_panel.InputMachine.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.control_panel.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ControlPanelMethodDescriptorSupplier("setInputMachine"))
                  .build();
          }
        }
     }
     return getSetInputMachineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.control_panel.PreShutDownMessage> getShutDownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shutDown",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.control_panel.PreShutDownMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.control_panel.PreShutDownMessage> getShutDownMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.control_panel.PreShutDownMessage> getShutDownMethod;
    if ((getShutDownMethod = ControlPanelGrpc.getShutDownMethod) == null) {
      synchronized (ControlPanelGrpc.class) {
        if ((getShutDownMethod = ControlPanelGrpc.getShutDownMethod) == null) {
          ControlPanelGrpc.getShutDownMethod = getShutDownMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.control_panel.PreShutDownMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "control_panel.ControlPanel", "shutDown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.control_panel.PreShutDownMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new ControlPanelMethodDescriptorSupplier("shutDown"))
                  .build();
          }
        }
     }
     return getShutDownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ControlPanelStub newStub(io.grpc.Channel channel) {
    return new ControlPanelStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ControlPanelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ControlPanelBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ControlPanelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ControlPanelFutureStub(channel);
  }

  /**
   * <pre>
   *control panel service definition
   * </pre>
   */
  public static abstract class ControlPanelImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *retrieve details of, and connect to, local detected machines (e.g. a user's laptop)
     * </pre>
     */
    public void setInputMachine(org.stu.control_panel.InputMachine request,
        io.grpc.stub.StreamObserver<org.stu.control_panel.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInputMachineMethod(), responseObserver);
    }

    /**
     * <pre>
     *deactivate control panel and disconnect from local connected machine
     * </pre>
     */
    public void shutDown(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.control_panel.PreShutDownMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getShutDownMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetInputMachineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.control_panel.InputMachine,
                org.stu.control_panel.ResponseMessage>(
                  this, METHODID_SET_INPUT_MACHINE)))
          .addMethod(
            getShutDownMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.control_panel.PreShutDownMessage>(
                  this, METHODID_SHUT_DOWN)))
          .build();
    }
  }

  /**
   * <pre>
   *control panel service definition
   * </pre>
   */
  public static final class ControlPanelStub extends io.grpc.stub.AbstractStub<ControlPanelStub> {
    private ControlPanelStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControlPanelStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControlPanelStub(channel, callOptions);
    }

    /**
     * <pre>
     *retrieve details of, and connect to, local detected machines (e.g. a user's laptop)
     * </pre>
     */
    public void setInputMachine(org.stu.control_panel.InputMachine request,
        io.grpc.stub.StreamObserver<org.stu.control_panel.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInputMachineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *deactivate control panel and disconnect from local connected machine
     * </pre>
     */
    public void shutDown(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.control_panel.PreShutDownMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShutDownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *control panel service definition
   * </pre>
   */
  public static final class ControlPanelBlockingStub extends io.grpc.stub.AbstractStub<ControlPanelBlockingStub> {
    private ControlPanelBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControlPanelBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControlPanelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *retrieve details of, and connect to, local detected machines (e.g. a user's laptop)
     * </pre>
     */
    public org.stu.control_panel.ResponseMessage setInputMachine(org.stu.control_panel.InputMachine request) {
      return blockingUnaryCall(
          getChannel(), getSetInputMachineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *deactivate control panel and disconnect from local connected machine
     * </pre>
     */
    public org.stu.control_panel.PreShutDownMessage shutDown(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getShutDownMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *control panel service definition
   * </pre>
   */
  public static final class ControlPanelFutureStub extends io.grpc.stub.AbstractStub<ControlPanelFutureStub> {
    private ControlPanelFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ControlPanelFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ControlPanelFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ControlPanelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *retrieve details of, and connect to, local detected machines (e.g. a user's laptop)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.control_panel.ResponseMessage> setInputMachine(
        org.stu.control_panel.InputMachine request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInputMachineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *deactivate control panel and disconnect from local connected machine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.control_panel.PreShutDownMessage> shutDown(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getShutDownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_INPUT_MACHINE = 0;
  private static final int METHODID_SHUT_DOWN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ControlPanelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ControlPanelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_INPUT_MACHINE:
          serviceImpl.setInputMachine((org.stu.control_panel.InputMachine) request,
              (io.grpc.stub.StreamObserver<org.stu.control_panel.ResponseMessage>) responseObserver);
          break;
        case METHODID_SHUT_DOWN:
          serviceImpl.shutDown((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.control_panel.PreShutDownMessage>) responseObserver);
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

  private static abstract class ControlPanelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ControlPanelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stu.control_panel.ControlPanelProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ControlPanel");
    }
  }

  private static final class ControlPanelFileDescriptorSupplier
      extends ControlPanelBaseDescriptorSupplier {
    ControlPanelFileDescriptorSupplier() {}
  }

  private static final class ControlPanelMethodDescriptorSupplier
      extends ControlPanelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ControlPanelMethodDescriptorSupplier(String methodName) {
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
      synchronized (ControlPanelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ControlPanelFileDescriptorSupplier())
              .addMethod(getSetInputMachineMethod())
              .addMethod(getShutDownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
