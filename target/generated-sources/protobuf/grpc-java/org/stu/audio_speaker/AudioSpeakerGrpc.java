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
      org.stu.audio_speaker.AudioSpeakerStatus> getActivateAudioSpeakerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateAudioSpeaker",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.audio_speaker.AudioSpeakerStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.audio_speaker.AudioSpeakerStatus> getActivateAudioSpeakerMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerStatus> getActivateAudioSpeakerMethod;
    if ((getActivateAudioSpeakerMethod = AudioSpeakerGrpc.getActivateAudioSpeakerMethod) == null) {
      synchronized (AudioSpeakerGrpc.class) {
        if ((getActivateAudioSpeakerMethod = AudioSpeakerGrpc.getActivateAudioSpeakerMethod) == null) {
          AudioSpeakerGrpc.getActivateAudioSpeakerMethod = getActivateAudioSpeakerMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.audio_speaker.AudioSpeakerStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "audio_speaker.AudioSpeaker", "activateAudioSpeaker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.audio_speaker.AudioSpeakerStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new AudioSpeakerMethodDescriptorSupplier("activateAudioSpeaker"))
                  .build();
          }
        }
     }
     return getActivateAudioSpeakerMethod;
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
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateAudioSpeakerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateAudioSpeakerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.audio_speaker.AudioSpeakerStatus>(
                  this, METHODID_ACTIVATE_AUDIO_SPEAKER)))
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
        io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateAudioSpeakerMethod(), getCallOptions()), request, responseObserver);
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
    public org.stu.audio_speaker.AudioSpeakerStatus activateAudioSpeaker(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateAudioSpeakerMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<org.stu.audio_speaker.AudioSpeakerStatus> activateAudioSpeaker(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateAudioSpeakerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_AUDIO_SPEAKER = 0;

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
              (io.grpc.stub.StreamObserver<org.stu.audio_speaker.AudioSpeakerStatus>) responseObserver);
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
              .build();
        }
      }
    }
    return result;
  }
}
