package org.stu.audio_speaker;

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
    comments = "Source: audio_speaker.proto")
public final class AudioSpeakerGrpc {

  private AudioSpeakerGrpc() {}

  public static final String SERVICE_NAME = "audio_speaker.AudioSpeaker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioSpeakerOnStatus> getActivateAudioSpeakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateAudioSpeaker",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.AudioSpeakerOnStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioSpeakerOnStatus> getActivateAudioSpeakerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerOnStatus> getActivateAudioSpeakerMethod;
    if ((getActivateAudioSpeakerMethod = AudioSpeakerGrpc.getActivateAudioSpeakerMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getActivateAudioSpeakerMethod = AudioSpeakerGrpc.getActivateAudioSpeakerMethod) == null) {
          AudioSpeakerGrpc.getActivateAudioSpeakerMethod = getActivateAudioSpeakerMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerOnStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "activateAudioSpeaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.AudioSpeakerOnStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("activateAudioSpeaker"))
                  .build();
          }
        }
     }
     return getActivateAudioSpeakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioSpeakerOffStatus> getDeActivateAudioSpeakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deActivateAudioSpeaker",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.AudioSpeakerOffStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioSpeakerOffStatus> getDeActivateAudioSpeakerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerOffStatus> getDeActivateAudioSpeakerMethod;
    if ((getDeActivateAudioSpeakerMethod = AudioSpeakerGrpc.getDeActivateAudioSpeakerMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getDeActivateAudioSpeakerMethod = AudioSpeakerGrpc.getDeActivateAudioSpeakerMethod) == null) {
          AudioSpeakerGrpc.getDeActivateAudioSpeakerMethod = getDeActivateAudioSpeakerMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerOffStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "deActivateAudioSpeaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.AudioSpeakerOffStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("deActivateAudioSpeaker"))
                  .build();
          }
        }
     }
     return getDeActivateAudioSpeakerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.CurrentVolume> getIncreaseVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increaseVolume",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.CurrentVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.CurrentVolume> getIncreaseVolumeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.CurrentVolume> getIncreaseVolumeMethod;
    if ((getIncreaseVolumeMethod = AudioSpeakerGrpc.getIncreaseVolumeMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getIncreaseVolumeMethod = AudioSpeakerGrpc.getIncreaseVolumeMethod) == null) {
          AudioSpeakerGrpc.getIncreaseVolumeMethod = getIncreaseVolumeMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.CurrentVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "increaseVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.CurrentVolume.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("increaseVolume"))
                  .build();
          }
        }
     }
     return getIncreaseVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.CurrentVolume> getDecreaseVolumeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "decreaseVolume",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.CurrentVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.CurrentVolume> getDecreaseVolumeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.CurrentVolume> getDecreaseVolumeMethod;
    if ((getDecreaseVolumeMethod = AudioSpeakerGrpc.getDecreaseVolumeMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getDecreaseVolumeMethod = AudioSpeakerGrpc.getDecreaseVolumeMethod) == null) {
          AudioSpeakerGrpc.getDecreaseVolumeMethod = getDecreaseVolumeMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.CurrentVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "decreaseVolume"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.CurrentVolume.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("decreaseVolume"))
                  .build();
          }
        }
     }
     return getDecreaseVolumeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.audio_speaker.AudioInput,
      com.google.protobuf.Empty> getSetInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setInput",
      requestType = org.stu.audio_speaker.AudioInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.audio_speaker.AudioInput,
      com.google.protobuf.Empty> getSetInputMethod() {
    io.grpc.MethodDescriptor<org.stu.audio_speaker.AudioInput, com.google.protobuf.Empty> getSetInputMethod;
    if ((getSetInputMethod = AudioSpeakerGrpc.getSetInputMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getSetInputMethod = AudioSpeakerGrpc.getSetInputMethod) == null) {
          AudioSpeakerGrpc.getSetInputMethod = getSetInputMethod = 
              io.grpc.MethodDescriptor.<org.stu.audio_speaker.AudioInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "setInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.AudioInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("setInput"))
                  .build();
          }
        }
     }
     return getSetInputMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioInput> getListSupportedInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSupportedInputs",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.AudioInput.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioInput> getListSupportedInputsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.AudioInput> getListSupportedInputsMethod;
    if ((getListSupportedInputsMethod = AudioSpeakerGrpc.getListSupportedInputsMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getListSupportedInputsMethod = AudioSpeakerGrpc.getListSupportedInputsMethod) == null) {
          AudioSpeakerGrpc.getListSupportedInputsMethod = getListSupportedInputsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.AudioInput>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "ListSupportedInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.AudioInput.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("ListSupportedInputs"))
                  .build();
          }
        }
     }
     return getListSupportedInputsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AudioSpeakerStub newStub(io.grpc.Channel channel) {
    return new AudioSpeakerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AudioSpeakerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AudioSpeakerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AudioSpeakerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AudioSpeakerFutureStub(channel);
  }

  /**
   */
  public static abstract class AudioSpeakerImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateAudioSpeaker(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOnStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateAudioSpeakerMethod(), responseObserver);
    }

    /**
     */
    public void deActivateAudioSpeaker(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOffStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getDeActivateAudioSpeakerMethod(), responseObserver);
    }

    /**
     */
    public void increaseVolume(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume> responseObserver) {
      asyncUnimplementedUnaryCall(getIncreaseVolumeMethod(), responseObserver);
    }

    /**
     */
    public void decreaseVolume(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume> responseObserver) {
      asyncUnimplementedUnaryCall(getDecreaseVolumeMethod(), responseObserver);
    }

    /**
     */
    public void setInput(org.stu.audio_speaker.AudioInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInputMethod(), responseObserver);
    }

    /**
     */
    public void listSupportedInputs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioInput> responseObserver) {
      asyncUnimplementedUnaryCall(getListSupportedInputsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateAudioSpeakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.AudioSpeakerOnStatus>(
                  this, METHODID_ACTIVATE_AUDIO_SPEAKER)))
          .addMethod(
            getDeActivateAudioSpeakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.AudioSpeakerOffStatus>(
                  this, METHODID_DE_ACTIVATE_AUDIO_SPEAKER)))
          .addMethod(
            getIncreaseVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.CurrentVolume>(
                  this, METHODID_INCREASE_VOLUME)))
          .addMethod(
            getDecreaseVolumeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.CurrentVolume>(
                  this, METHODID_DECREASE_VOLUME)))
          .addMethod(
            getSetInputMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.audio_speaker.AudioInput,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_INPUT)))
          .addMethod(
            getListSupportedInputsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.AudioInput>(
                  this, METHODID_LIST_SUPPORTED_INPUTS)))
          .build();
    }
  }

  /**
   */
  public static final class AudioSpeakerStub extends io.grpc.stub.AbstractStub<AudioSpeakerStub> {
    private AudioSpeakerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioSpeakerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSpeakerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioSpeakerStub(channel, callOptions);
    }

    /**
     */
    public void activateAudioSpeaker(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOnStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateAudioSpeakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deActivateAudioSpeaker(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOffStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeActivateAudioSpeakerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void increaseVolume(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncreaseVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseVolume(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecreaseVolumeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setInput(org.stu.audio_speaker.AudioInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInputMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSupportedInputs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioInput> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListSupportedInputsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AudioSpeakerBlockingStub extends io.grpc.stub.AbstractStub<AudioSpeakerBlockingStub> {
    private AudioSpeakerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioSpeakerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSpeakerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioSpeakerBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.stu.audio_speaker.AudioSpeakerOnStatus activateAudioSpeaker(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateAudioSpeakerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.audio_speaker.AudioSpeakerOffStatus deActivateAudioSpeaker(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeActivateAudioSpeakerMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.audio_speaker.CurrentVolume increaseVolume(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getIncreaseVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.audio_speaker.CurrentVolume decreaseVolume(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDecreaseVolumeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setInput(org.stu.audio_speaker.AudioInput request) {
      return blockingUnaryCall(
          getChannel(), getSetInputMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.stu.audio_speaker.AudioInput> listSupportedInputs(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListSupportedInputsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AudioSpeakerFutureStub extends io.grpc.stub.AbstractStub<AudioSpeakerFutureStub> {
    private AudioSpeakerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AudioSpeakerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AudioSpeakerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AudioSpeakerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.audio_speaker.AudioSpeakerOnStatus> activateAudioSpeaker(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateAudioSpeakerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.audio_speaker.AudioSpeakerOffStatus> deActivateAudioSpeaker(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeActivateAudioSpeakerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.audio_speaker.CurrentVolume> increaseVolume(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getIncreaseVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.audio_speaker.CurrentVolume> decreaseVolume(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDecreaseVolumeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setInput(
        org.stu.audio_speaker.AudioInput request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInputMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_AUDIO_SPEAKER = 0;
  private static final int METHODID_DE_ACTIVATE_AUDIO_SPEAKER = 1;
  private static final int METHODID_INCREASE_VOLUME = 2;
  private static final int METHODID_DECREASE_VOLUME = 3;
  private static final int METHODID_SET_INPUT = 4;
  private static final int METHODID_LIST_SUPPORTED_INPUTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AudioSpeakerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AudioSpeakerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_AUDIO_SPEAKER:
          serviceImpl.activateAudioSpeaker((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOnStatus>) responseObserver);
          break;
        case METHODID_DE_ACTIVATE_AUDIO_SPEAKER:
          serviceImpl.deActivateAudioSpeaker((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerOffStatus>) responseObserver);
          break;
        case METHODID_INCREASE_VOLUME:
          serviceImpl.increaseVolume((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume>) responseObserver);
          break;
        case METHODID_DECREASE_VOLUME:
          serviceImpl.decreaseVolume((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.CurrentVolume>) responseObserver);
          break;
        case METHODID_SET_INPUT:
          serviceImpl.setInput((org.stu.audio_speaker.AudioInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_SUPPORTED_INPUTS:
          serviceImpl.listSupportedInputs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioInput>) responseObserver);
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

  private static abstract class AudioSpeakerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AudioSpeakerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.stu.audio_speaker.AudioSpeakerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AudioSpeaker");
    }
  }

  private static final class AudioSpeakerFileDescriptorSupplier
      extends AudioSpeakerBaseDescriptorSupplier {
    AudioSpeakerFileDescriptorSupplier() {}
  }

  private static final class AudioSpeakerMethodDescriptorSupplier
      extends AudioSpeakerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AudioSpeakerMethodDescriptorSupplier(String methodName) {
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
      synchronized (AudioSpeakerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AudioSpeakerFileDescriptorSupplier())
              .addMethod(getActivateAudioSpeakerMethod())
              .addMethod(getDeActivateAudioSpeakerMethod())
              .addMethod(getIncreaseVolumeMethod())
              .addMethod(getDecreaseVolumeMethod())
              .addMethod(getSetInputMethod())
              .addMethod(getListSupportedInputsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
