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
 * <pre>
 *video recorder service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: video_recorder.proto")
public final class VideoRecorderGrpc {

  private VideoRecorderGrpc() {}

  public static final String SERVICE_NAME = "video_recorder.VideoRecorder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderOnStatus> getActivateVideoRecorderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateVideoRecorder",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.VideoRecorderOnStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderOnStatus> getActivateVideoRecorderMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderOnStatus> getActivateVideoRecorderMethod;
    if ((getActivateVideoRecorderMethod = VideoRecorderGrpc.getActivateVideoRecorderMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getActivateVideoRecorderMethod = VideoRecorderGrpc.getActivateVideoRecorderMethod) == null) {
          VideoRecorderGrpc.getActivateVideoRecorderMethod = getActivateVideoRecorderMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderOnStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "activateVideoRecorder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.VideoRecorderOnStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("activateVideoRecorder"))
                  .build();
          }
        }
     }
     return getActivateVideoRecorderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderOffStatus> getDeActivateVideoRecorderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deActivateVideoRecorder",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.VideoRecorderOffStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.VideoRecorderOffStatus> getDeActivateVideoRecorderMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderOffStatus> getDeActivateVideoRecorderMethod;
    if ((getDeActivateVideoRecorderMethod = VideoRecorderGrpc.getDeActivateVideoRecorderMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getDeActivateVideoRecorderMethod = VideoRecorderGrpc.getDeActivateVideoRecorderMethod) == null) {
          VideoRecorderGrpc.getDeActivateVideoRecorderMethod = getDeActivateVideoRecorderMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.VideoRecorderOffStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "deActivateVideoRecorder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.VideoRecorderOffStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("deActivateVideoRecorder"))
                  .build();
          }
        }
     }
     return getDeActivateVideoRecorderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.RecordStatus> getRecordVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordVideo",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.RecordStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.RecordStatus> getRecordVideoMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.RecordStatus> getRecordVideoMethod;
    if ((getRecordVideoMethod = VideoRecorderGrpc.getRecordVideoMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getRecordVideoMethod = VideoRecorderGrpc.getRecordVideoMethod) == null) {
          VideoRecorderGrpc.getRecordVideoMethod = getRecordVideoMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.RecordStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "recordVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.RecordStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("recordVideo"))
                  .build();
          }
        }
     }
     return getRecordVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.RecordStatus> getStopRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stopRecording",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.RecordStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.RecordStatus> getStopRecordingMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.RecordStatus> getStopRecordingMethod;
    if ((getStopRecordingMethod = VideoRecorderGrpc.getStopRecordingMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getStopRecordingMethod = VideoRecorderGrpc.getStopRecordingMethod) == null) {
          VideoRecorderGrpc.getStopRecordingMethod = getStopRecordingMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.RecordStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "stopRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.RecordStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("stopRecording"))
                  .build();
          }
        }
     }
     return getStopRecordingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.video_recorder.IncreaseAmount,
      org.stu.video_recorder.IncreaseAmount> getZoomInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "zoomIn",
      requestType = org.stu.video_recorder.IncreaseAmount.class,
      responseType = org.stu.video_recorder.IncreaseAmount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.video_recorder.IncreaseAmount,
      org.stu.video_recorder.IncreaseAmount> getZoomInMethod() {
    io.grpc.MethodDescriptor<org.stu.video_recorder.IncreaseAmount, org.stu.video_recorder.IncreaseAmount> getZoomInMethod;
    if ((getZoomInMethod = VideoRecorderGrpc.getZoomInMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getZoomInMethod = VideoRecorderGrpc.getZoomInMethod) == null) {
          VideoRecorderGrpc.getZoomInMethod = getZoomInMethod = 
              io.grpc.MethodDescriptor.<org.stu.video_recorder.IncreaseAmount, org.stu.video_recorder.IncreaseAmount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "zoomIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.IncreaseAmount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.IncreaseAmount.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("zoomIn"))
                  .build();
          }
        }
     }
     return getZoomInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.video_recorder.DecreaseAmount,
      org.stu.video_recorder.DecreaseAmount> getZoomOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "zoomOut",
      requestType = org.stu.video_recorder.DecreaseAmount.class,
      responseType = org.stu.video_recorder.DecreaseAmount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.video_recorder.DecreaseAmount,
      org.stu.video_recorder.DecreaseAmount> getZoomOutMethod() {
    io.grpc.MethodDescriptor<org.stu.video_recorder.DecreaseAmount, org.stu.video_recorder.DecreaseAmount> getZoomOutMethod;
    if ((getZoomOutMethod = VideoRecorderGrpc.getZoomOutMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getZoomOutMethod = VideoRecorderGrpc.getZoomOutMethod) == null) {
          VideoRecorderGrpc.getZoomOutMethod = getZoomOutMethod = 
              io.grpc.MethodDescriptor.<org.stu.video_recorder.DecreaseAmount, org.stu.video_recorder.DecreaseAmount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "zoomOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.DecreaseAmount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.DecreaseAmount.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("zoomOut"))
                  .build();
          }
        }
     }
     return getZoomOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.AudioStatus> getMuteAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "muteAudio",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.AudioStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.AudioStatus> getMuteAudioMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.AudioStatus> getMuteAudioMethod;
    if ((getMuteAudioMethod = VideoRecorderGrpc.getMuteAudioMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getMuteAudioMethod = VideoRecorderGrpc.getMuteAudioMethod) == null) {
          VideoRecorderGrpc.getMuteAudioMethod = getMuteAudioMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.AudioStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "muteAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.AudioStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("muteAudio"))
                  .build();
          }
        }
     }
     return getMuteAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.AudioStatus> getUnmuteAudioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unmuteAudio",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.AudioStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.AudioStatus> getUnmuteAudioMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.AudioStatus> getUnmuteAudioMethod;
    if ((getUnmuteAudioMethod = VideoRecorderGrpc.getUnmuteAudioMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getUnmuteAudioMethod = VideoRecorderGrpc.getUnmuteAudioMethod) == null) {
          VideoRecorderGrpc.getUnmuteAudioMethod = getUnmuteAudioMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.AudioStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "unmuteAudio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.AudioStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("unmuteAudio"))
                  .build();
          }
        }
     }
     return getUnmuteAudioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.Resolution> getListResolutionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listResolutions",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.video_recorder.Resolution.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.video_recorder.Resolution> getListResolutionsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.video_recorder.Resolution> getListResolutionsMethod;
    if ((getListResolutionsMethod = VideoRecorderGrpc.getListResolutionsMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getListResolutionsMethod = VideoRecorderGrpc.getListResolutionsMethod) == null) {
          VideoRecorderGrpc.getListResolutionsMethod = getListResolutionsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.video_recorder.Resolution>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "listResolutions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.Resolution.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("listResolutions"))
                  .build();
          }
        }
     }
     return getListResolutionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.video_recorder.Resolution,
      org.stu.video_recorder.ResultMessage> getSetResolutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setResolution",
      requestType = org.stu.video_recorder.Resolution.class,
      responseType = org.stu.video_recorder.ResultMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.video_recorder.Resolution,
      org.stu.video_recorder.ResultMessage> getSetResolutionMethod() {
    io.grpc.MethodDescriptor<org.stu.video_recorder.Resolution, org.stu.video_recorder.ResultMessage> getSetResolutionMethod;
    if ((getSetResolutionMethod = VideoRecorderGrpc.getSetResolutionMethod) == null) {
      synchronized (VideoRecorderGrpc.class) {
        if ((getSetResolutionMethod = VideoRecorderGrpc.getSetResolutionMethod) == null) {
          VideoRecorderGrpc.getSetResolutionMethod = getSetResolutionMethod = 
              io.grpc.MethodDescriptor.<org.stu.video_recorder.Resolution, org.stu.video_recorder.ResultMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "video_recorder.VideoRecorder", "setResolution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.Resolution.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.video_recorder.ResultMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new VideoRecorderMethodDescriptorSupplier("setResolution"))
                  .build();
          }
        }
     }
     return getSetResolutionMethod;
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
   * <pre>
   *video recorder service definition
   * </pre>
   */
  public static abstract class VideoRecorderImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *switch on video recorder and return status message
     * </pre>
     */
    public void activateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOnStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateVideoRecorderMethod(), responseObserver);
    }

    /**
     * <pre>
     *switch off video recorder and return status message
     * </pre>
     */
    public void deActivateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOffStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getDeActivateVideoRecorderMethod(), responseObserver);
    }

    /**
     */
    public void recordVideo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordVideoMethod(), responseObserver);
    }

    /**
     */
    public void stopRecording(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStopRecordingMethod(), responseObserver);
    }

    /**
     */
    public void zoomIn(org.stu.video_recorder.IncreaseAmount request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.IncreaseAmount> responseObserver) {
      asyncUnimplementedUnaryCall(getZoomInMethod(), responseObserver);
    }

    /**
     */
    public void zoomOut(org.stu.video_recorder.DecreaseAmount request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.DecreaseAmount> responseObserver) {
      asyncUnimplementedUnaryCall(getZoomOutMethod(), responseObserver);
    }

    /**
     */
    public void muteAudio(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getMuteAudioMethod(), responseObserver);
    }

    /**
     */
    public void unmuteAudio(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getUnmuteAudioMethod(), responseObserver);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public void listResolutions(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.Resolution> responseObserver) {
      asyncUnimplementedUnaryCall(getListResolutionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public void setResolution(org.stu.video_recorder.Resolution request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.ResultMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSetResolutionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateVideoRecorderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.VideoRecorderOnStatus>(
                  this, METHODID_ACTIVATE_VIDEO_RECORDER)))
          .addMethod(
            getDeActivateVideoRecorderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.VideoRecorderOffStatus>(
                  this, METHODID_DE_ACTIVATE_VIDEO_RECORDER)))
          .addMethod(
            getRecordVideoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.RecordStatus>(
                  this, METHODID_RECORD_VIDEO)))
          .addMethod(
            getStopRecordingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.RecordStatus>(
                  this, METHODID_STOP_RECORDING)))
          .addMethod(
            getZoomInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.video_recorder.IncreaseAmount,
                org.stu.video_recorder.IncreaseAmount>(
                  this, METHODID_ZOOM_IN)))
          .addMethod(
            getZoomOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.video_recorder.DecreaseAmount,
                org.stu.video_recorder.DecreaseAmount>(
                  this, METHODID_ZOOM_OUT)))
          .addMethod(
            getMuteAudioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.AudioStatus>(
                  this, METHODID_MUTE_AUDIO)))
          .addMethod(
            getUnmuteAudioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.AudioStatus>(
                  this, METHODID_UNMUTE_AUDIO)))
          .addMethod(
            getListResolutionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.video_recorder.Resolution>(
                  this, METHODID_LIST_RESOLUTIONS)))
          .addMethod(
            getSetResolutionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.video_recorder.Resolution,
                org.stu.video_recorder.ResultMessage>(
                  this, METHODID_SET_RESOLUTION)))
          .build();
    }
  }

  /**
   * <pre>
   *video recorder service definition
   * </pre>
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
     * <pre>
     *switch on video recorder and return status message
     * </pre>
     */
    public void activateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOnStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateVideoRecorderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *switch off video recorder and return status message
     * </pre>
     */
    public void deActivateVideoRecorder(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOffStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeActivateVideoRecorderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordVideo(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopRecording(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void zoomIn(org.stu.video_recorder.IncreaseAmount request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.IncreaseAmount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoomInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void zoomOut(org.stu.video_recorder.DecreaseAmount request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.DecreaseAmount> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getZoomOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void muteAudio(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMuteAudioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unmuteAudio(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnmuteAudioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public void listResolutions(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.Resolution> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListResolutionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public void setResolution(org.stu.video_recorder.Resolution request,
        io.grpc.stub.StreamObserver<org.stu.video_recorder.ResultMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetResolutionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *video recorder service definition
   * </pre>
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
     * <pre>
     *switch on video recorder and return status message
     * </pre>
     */
    public org.stu.video_recorder.VideoRecorderOnStatus activateVideoRecorder(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateVideoRecorderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *switch off video recorder and return status message
     * </pre>
     */
    public org.stu.video_recorder.VideoRecorderOffStatus deActivateVideoRecorder(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeActivateVideoRecorderMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.RecordStatus recordVideo(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getRecordVideoMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.RecordStatus stopRecording(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getStopRecordingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.IncreaseAmount zoomIn(org.stu.video_recorder.IncreaseAmount request) {
      return blockingUnaryCall(
          getChannel(), getZoomInMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.DecreaseAmount zoomOut(org.stu.video_recorder.DecreaseAmount request) {
      return blockingUnaryCall(
          getChannel(), getZoomOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.AudioStatus muteAudio(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getMuteAudioMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.video_recorder.AudioStatus unmuteAudio(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getUnmuteAudioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public java.util.Iterator<org.stu.video_recorder.Resolution> listResolutions(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListResolutionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public org.stu.video_recorder.ResultMessage setResolution(org.stu.video_recorder.Resolution request) {
      return blockingUnaryCall(
          getChannel(), getSetResolutionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *video recorder service definition
   * </pre>
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
     * <pre>
     *switch on video recorder and return status message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.VideoRecorderOnStatus> activateVideoRecorder(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateVideoRecorderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *switch off video recorder and return status message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.VideoRecorderOffStatus> deActivateVideoRecorder(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeActivateVideoRecorderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.RecordStatus> recordVideo(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordVideoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.RecordStatus> stopRecording(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getStopRecordingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.IncreaseAmount> zoomIn(
        org.stu.video_recorder.IncreaseAmount request) {
      return futureUnaryCall(
          getChannel().newCall(getZoomInMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.DecreaseAmount> zoomOut(
        org.stu.video_recorder.DecreaseAmount request) {
      return futureUnaryCall(
          getChannel().newCall(getZoomOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.AudioStatus> muteAudio(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getMuteAudioMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.AudioStatus> unmuteAudio(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getUnmuteAudioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.video_recorder.ResultMessage> setResolution(
        org.stu.video_recorder.Resolution request) {
      return futureUnaryCall(
          getChannel().newCall(getSetResolutionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_VIDEO_RECORDER = 0;
  private static final int METHODID_DE_ACTIVATE_VIDEO_RECORDER = 1;
  private static final int METHODID_RECORD_VIDEO = 2;
  private static final int METHODID_STOP_RECORDING = 3;
  private static final int METHODID_ZOOM_IN = 4;
  private static final int METHODID_ZOOM_OUT = 5;
  private static final int METHODID_MUTE_AUDIO = 6;
  private static final int METHODID_UNMUTE_AUDIO = 7;
  private static final int METHODID_LIST_RESOLUTIONS = 8;
  private static final int METHODID_SET_RESOLUTION = 9;

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
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOnStatus>) responseObserver);
          break;
        case METHODID_DE_ACTIVATE_VIDEO_RECORDER:
          serviceImpl.deActivateVideoRecorder((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.VideoRecorderOffStatus>) responseObserver);
          break;
        case METHODID_RECORD_VIDEO:
          serviceImpl.recordVideo((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus>) responseObserver);
          break;
        case METHODID_STOP_RECORDING:
          serviceImpl.stopRecording((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.RecordStatus>) responseObserver);
          break;
        case METHODID_ZOOM_IN:
          serviceImpl.zoomIn((org.stu.video_recorder.IncreaseAmount) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.IncreaseAmount>) responseObserver);
          break;
        case METHODID_ZOOM_OUT:
          serviceImpl.zoomOut((org.stu.video_recorder.DecreaseAmount) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.DecreaseAmount>) responseObserver);
          break;
        case METHODID_MUTE_AUDIO:
          serviceImpl.muteAudio((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus>) responseObserver);
          break;
        case METHODID_UNMUTE_AUDIO:
          serviceImpl.unmuteAudio((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.AudioStatus>) responseObserver);
          break;
        case METHODID_LIST_RESOLUTIONS:
          serviceImpl.listResolutions((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.Resolution>) responseObserver);
          break;
        case METHODID_SET_RESOLUTION:
          serviceImpl.setResolution((org.stu.video_recorder.Resolution) request,
              (io.grpc.stub.StreamObserver<org.stu.video_recorder.ResultMessage>) responseObserver);
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
              .addMethod(getDeActivateVideoRecorderMethod())
              .addMethod(getRecordVideoMethod())
              .addMethod(getStopRecordingMethod())
              .addMethod(getZoomInMethod())
              .addMethod(getZoomOutMethod())
              .addMethod(getMuteAudioMethod())
              .addMethod(getUnmuteAudioMethod())
              .addMethod(getListResolutionsMethod())
              .addMethod(getSetResolutionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
