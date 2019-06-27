package org.stu.video_recorder;

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
    comments = "Source: video_recorder.proto")
public final class VideoRecorderGrpc {

  private VideoRecorderGrpc() {}

  public static final String SERVICE_NAME = "video_recorder.VideoRecorder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderStatus> getActivateVideoRecorderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateVideoRecorder",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.VideoRecorderStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderStatus> getActivateVideoRecorderMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderStatus> getActivateVideoRecorderMethod;
    if ((getActivateVideoRecorderMethod = VideoRecorderGrpc.getActivateVideoRecorderMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getActivateVideoRecorderMethod = VideoRecorderGrpc.getActivateVideoRecorderMethod) == null) {
          VideoRecorderGrpc.getActivateVideoRecorderMethod = getActivateVideoRecorderMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "activateVideoRecorder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.VideoRecorderStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("activateVideoRecorder"))
                  .build();
          }
        }
     }
     return getActivateVideoRecorderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoRecorderStub newStub(io.grpc.Channel channel) {
    return new VideoRecorderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoRecorderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VideoRecorderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoRecorderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VideoRecorderFutureStub(channel);
  }

  /**
   */
  public static abstract class VideoRecorderImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateVideoRecorderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateVideoRecorderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.VideoRecorderStatus>(
                  this, METHODID_ACTIVATE_VIDEO_RECORDER)))
          .build();
    }
  }

  /**
   */
  public static final class VideoRecorderStub extends io.grpc.stub.AbstractStub<VideoRecorderStub> {
    private VideoRecorderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoRecorderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecorderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoRecorderStub(channel, callOptions);
    }

    /**
     */
    public void activateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateVideoRecorderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VideoRecorderBlockingStub extends io.grpc.stub.AbstractStub<VideoRecorderBlockingStub> {
    private VideoRecorderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoRecorderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecorderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoRecorderBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stu.video_recorder.VideoRecorderStatus activateVideoRecorder(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateVideoRecorderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VideoRecorderFutureStub extends io.grpc.stub.AbstractStub<VideoRecorderFutureStub> {
    private VideoRecorderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VideoRecorderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecorderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VideoRecorderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.VideoRecorderStatus> activateVideoRecorder(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateVideoRecorderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_VIDEO_RECORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VideoRecorderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VideoRecorderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_VIDEO_RECORDER:
          serviceImpl.activateVideoRecorder((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderStatus>) responseObserver);
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

  private static abstract class VideoRecorderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoRecorderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stu.video_recorder.VideoRecorderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoRecorder");
    }
  }

  private static final class VideoRecorderFileDescriptorSupplier
      extends VideoRecorderBaseDescriptorSupplier {
    VideoRecorderFileDescriptorSupplier() {}
  }

  private static final class VideoRecorderMethodDescriptorSupplier
      extends VideoRecorderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VideoRecorderMethodDescriptorSupplier(String methodName) {
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
      synchronized (VideoRecorderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoRecorderFileDescriptorSupplier())
              .addMethod(getActivateVideoRecorderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
