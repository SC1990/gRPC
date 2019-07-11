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
 * <pre>
 *projector service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: projector.proto")
public final class ProjectorGrpc {

  private ProjectorGrpc() {}

  public static final String SERVICE_NAME = "projector.Projector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorOnStatus> getActivateProjectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "activateProjector",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.ProjectorOnStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorOnStatus> getActivateProjectorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.ProjectorOnStatus> getActivateProjectorMethod;
    if ((getActivateProjectorMethod = ProjectorGrpc.getActivateProjectorMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getActivateProjectorMethod = ProjectorGrpc.getActivateProjectorMethod) == null) {
          ProjectorGrpc.getActivateProjectorMethod = getActivateProjectorMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.ProjectorOnStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "activateProjector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.ProjectorOnStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("activateProjector"))
                  .build();
          }
        }
     }
     return getActivateProjectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorOffStatus> getDeActivateProjectorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deActivateProjector",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.ProjectorOffStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.ProjectorOffStatus> getDeActivateProjectorMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.ProjectorOffStatus> getDeActivateProjectorMethod;
    if ((getDeActivateProjectorMethod = ProjectorGrpc.getDeActivateProjectorMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getDeActivateProjectorMethod = ProjectorGrpc.getDeActivateProjectorMethod) == null) {
          ProjectorGrpc.getDeActivateProjectorMethod = getDeActivateProjectorMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.ProjectorOffStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "deActivateProjector"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.ProjectorOffStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("deActivateProjector"))
                  .build();
          }
        }
     }
     return getDeActivateProjectorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.InputType,
      org.stu.projector.InputType> getSetInputTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setInputType",
      requestType = org.stu.projector.InputType.class,
      responseType = org.stu.projector.InputType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.InputType,
      org.stu.projector.InputType> getSetInputTypeMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.InputType, org.stu.projector.InputType> getSetInputTypeMethod;
    if ((getSetInputTypeMethod = ProjectorGrpc.getSetInputTypeMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getSetInputTypeMethod = ProjectorGrpc.getSetInputTypeMethod) == null) {
          ProjectorGrpc.getSetInputTypeMethod = getSetInputTypeMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.InputType, org.stu.projector.InputType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "setInputType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.InputType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.InputType.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("setInputType"))
                  .build();
          }
        }
     }
     return getSetInputTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.InputType> getListInputsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listInputs",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.InputType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.InputType> getListInputsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.InputType> getListInputsMethod;
    if ((getListInputsMethod = ProjectorGrpc.getListInputsMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getListInputsMethod = ProjectorGrpc.getListInputsMethod) == null) {
          ProjectorGrpc.getListInputsMethod = getListInputsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.InputType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "listInputs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.InputType.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("listInputs"))
                  .build();
          }
        }
     }
     return getListInputsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel,
      org.stu.projector.BrightnessLevel> getIncreaseBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increaseBrightness",
      requestType = org.stu.projector.BrightnessLevel.class,
      responseType = org.stu.projector.BrightnessLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel,
      org.stu.projector.BrightnessLevel> getIncreaseBrightnessMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel, org.stu.projector.BrightnessLevel> getIncreaseBrightnessMethod;
    if ((getIncreaseBrightnessMethod = ProjectorGrpc.getIncreaseBrightnessMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getIncreaseBrightnessMethod = ProjectorGrpc.getIncreaseBrightnessMethod) == null) {
          ProjectorGrpc.getIncreaseBrightnessMethod = getIncreaseBrightnessMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.BrightnessLevel, org.stu.projector.BrightnessLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "increaseBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.BrightnessLevel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.BrightnessLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("increaseBrightness"))
                  .build();
          }
        }
     }
     return getIncreaseBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel,
      org.stu.projector.BrightnessLevel> getDecreaseBrightnessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "decreaseBrightness",
      requestType = org.stu.projector.BrightnessLevel.class,
      responseType = org.stu.projector.BrightnessLevel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel,
      org.stu.projector.BrightnessLevel> getDecreaseBrightnessMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.BrightnessLevel, org.stu.projector.BrightnessLevel> getDecreaseBrightnessMethod;
    if ((getDecreaseBrightnessMethod = ProjectorGrpc.getDecreaseBrightnessMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getDecreaseBrightnessMethod = ProjectorGrpc.getDecreaseBrightnessMethod) == null) {
          ProjectorGrpc.getDecreaseBrightnessMethod = getDecreaseBrightnessMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.BrightnessLevel, org.stu.projector.BrightnessLevel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "decreaseBrightness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.BrightnessLevel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.BrightnessLevel.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("decreaseBrightness"))
                  .build();
          }
        }
     }
     return getDecreaseBrightnessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.AspectRatio,
      org.stu.projector.AspectRatio> getSetAspectRatioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setAspectRatio",
      requestType = org.stu.projector.AspectRatio.class,
      responseType = org.stu.projector.AspectRatio.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.AspectRatio,
      org.stu.projector.AspectRatio> getSetAspectRatioMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.AspectRatio, org.stu.projector.AspectRatio> getSetAspectRatioMethod;
    if ((getSetAspectRatioMethod = ProjectorGrpc.getSetAspectRatioMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getSetAspectRatioMethod = ProjectorGrpc.getSetAspectRatioMethod) == null) {
          ProjectorGrpc.getSetAspectRatioMethod = getSetAspectRatioMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.AspectRatio, org.stu.projector.AspectRatio>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "setAspectRatio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.AspectRatio.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.AspectRatio.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("setAspectRatio"))
                  .build();
          }
        }
     }
     return getSetAspectRatioMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.AspectRatio> getListRatiosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listRatios",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.AspectRatio.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.AspectRatio> getListRatiosMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.AspectRatio> getListRatiosMethod;
    if ((getListRatiosMethod = ProjectorGrpc.getListRatiosMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getListRatiosMethod = ProjectorGrpc.getListRatiosMethod) == null) {
          ProjectorGrpc.getListRatiosMethod = getListRatiosMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.AspectRatio>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "listRatios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.AspectRatio.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("listRatios"))
                  .build();
          }
        }
     }
     return getListRatiosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.Resolution,
      org.stu.projector.Resolution> getSetResolutionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setResolution",
      requestType = org.stu.projector.Resolution.class,
      responseType = org.stu.projector.Resolution.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.Resolution,
      org.stu.projector.Resolution> getSetResolutionMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.Resolution, org.stu.projector.Resolution> getSetResolutionMethod;
    if ((getSetResolutionMethod = ProjectorGrpc.getSetResolutionMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getSetResolutionMethod = ProjectorGrpc.getSetResolutionMethod) == null) {
          ProjectorGrpc.getSetResolutionMethod = getSetResolutionMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.Resolution, org.stu.projector.Resolution>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "setResolution"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Resolution.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Resolution.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("setResolution"))
                  .build();
          }
        }
     }
     return getSetResolutionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.Resolution> getListAvailableResolutionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAvailableResolutions",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.Resolution.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.Resolution> getListAvailableResolutionsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.Resolution> getListAvailableResolutionsMethod;
    if ((getListAvailableResolutionsMethod = ProjectorGrpc.getListAvailableResolutionsMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getListAvailableResolutionsMethod = ProjectorGrpc.getListAvailableResolutionsMethod) == null) {
          ProjectorGrpc.getListAvailableResolutionsMethod = getListAvailableResolutionsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.Resolution>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "listAvailableResolutions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Resolution.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("listAvailableResolutions"))
                  .build();
          }
        }
     }
     return getListAvailableResolutionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.stu.projector.Orientation,
      org.stu.projector.Orientation> getSetOrientationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setOrientation",
      requestType = org.stu.projector.Orientation.class,
      responseType = org.stu.projector.Orientation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.stu.projector.Orientation,
      org.stu.projector.Orientation> getSetOrientationMethod() {
    io.grpc.MethodDescriptor<org.stu.projector.Orientation, org.stu.projector.Orientation> getSetOrientationMethod;
    if ((getSetOrientationMethod = ProjectorGrpc.getSetOrientationMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getSetOrientationMethod = ProjectorGrpc.getSetOrientationMethod) == null) {
          ProjectorGrpc.getSetOrientationMethod = getSetOrientationMethod = 
              io.grpc.MethodDescriptor.<org.stu.projector.Orientation, org.stu.projector.Orientation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "setOrientation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Orientation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Orientation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("setOrientation"))
                  .build();
          }
        }
     }
     return getSetOrientationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.Orientation> getListAvailableOrientationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAvailableOrientations",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.stu.projector.Orientation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.stu.projector.Orientation> getListAvailableOrientationsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.stu.projector.Orientation> getListAvailableOrientationsMethod;
    if ((getListAvailableOrientationsMethod = ProjectorGrpc.getListAvailableOrientationsMethod) == null) {
      synchronized (ProjectorGrpc.class) {
        if ((getListAvailableOrientationsMethod = ProjectorGrpc.getListAvailableOrientationsMethod) == null) {
          ProjectorGrpc.getListAvailableOrientationsMethod = getListAvailableOrientationsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.stu.projector.Orientation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "projector.Projector", "listAvailableOrientations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.stu.projector.Orientation.getDefaultInstance()))
                  .setSchemaDescriptor(new ProjectorMethodDescriptorSupplier("listAvailableOrientations"))
                  .build();
          }
        }
     }
     return getListAvailableOrientationsMethod;
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
   * <pre>
   *projector service definition
   * </pre>
   */
  public static abstract class ProjectorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *switch on projector and return status message
     * </pre>
     */
    public void activateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOnStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateProjectorMethod(), responseObserver);
    }

    /**
     * <pre>
     *switch off
     * </pre>
     */
    public void deActivateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOffStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getDeActivateProjectorMethod(), responseObserver);
    }

    /**
     * <pre>
     *choose type of input (HDMI, VGA etc.)
     * </pre>
     */
    public void setInputType(org.stu.projector.InputType request,
        io.grpc.stub.StreamObserver<org.stu.projector.InputType> responseObserver) {
      asyncUnimplementedUnaryCall(getSetInputTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     *list supported inputs
     * </pre>
     */
    public void listInputs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.InputType> responseObserver) {
      asyncUnimplementedUnaryCall(getListInputsMethod(), responseObserver);
    }

    /**
     * <pre>
     *screen brightness control
     * </pre>
     */
    public void increaseBrightness(org.stu.projector.BrightnessLevel request,
        io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getIncreaseBrightnessMethod(), responseObserver);
    }

    /**
     */
    public void decreaseBrightness(org.stu.projector.BrightnessLevel request,
        io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel> responseObserver) {
      asyncUnimplementedUnaryCall(getDecreaseBrightnessMethod(), responseObserver);
    }

    /**
     * <pre>
     *set aspect ratio for projector screen
     * </pre>
     */
    public void setAspectRatio(org.stu.projector.AspectRatio request,
        io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio> responseObserver) {
      asyncUnimplementedUnaryCall(getSetAspectRatioMethod(), responseObserver);
    }

    /**
     * <pre>
     *list supported aspect ratios
     * </pre>
     */
    public void listRatios(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio> responseObserver) {
      asyncUnimplementedUnaryCall(getListRatiosMethod(), responseObserver);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public void setResolution(org.stu.projector.Resolution request,
        io.grpc.stub.StreamObserver<org.stu.projector.Resolution> responseObserver) {
      asyncUnimplementedUnaryCall(getSetResolutionMethod(), responseObserver);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public void listAvailableResolutions(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.Resolution> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailableResolutionsMethod(), responseObserver);
    }

    /**
     */
    public void setOrientation(org.stu.projector.Orientation request,
        io.grpc.stub.StreamObserver<org.stu.projector.Orientation> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOrientationMethod(), responseObserver);
    }

    /**
     */
    public void listAvailableOrientations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.Orientation> responseObserver) {
      asyncUnimplementedUnaryCall(getListAvailableOrientationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateProjectorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.ProjectorOnStatus>(
                  this, METHODID_ACTIVATE_PROJECTOR)))
          .addMethod(
            getDeActivateProjectorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.ProjectorOffStatus>(
                  this, METHODID_DE_ACTIVATE_PROJECTOR)))
          .addMethod(
            getSetInputTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.InputType,
                org.stu.projector.InputType>(
                  this, METHODID_SET_INPUT_TYPE)))
          .addMethod(
            getListInputsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.InputType>(
                  this, METHODID_LIST_INPUTS)))
          .addMethod(
            getIncreaseBrightnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.BrightnessLevel,
                org.stu.projector.BrightnessLevel>(
                  this, METHODID_INCREASE_BRIGHTNESS)))
          .addMethod(
            getDecreaseBrightnessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.BrightnessLevel,
                org.stu.projector.BrightnessLevel>(
                  this, METHODID_DECREASE_BRIGHTNESS)))
          .addMethod(
            getSetAspectRatioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.AspectRatio,
                org.stu.projector.AspectRatio>(
                  this, METHODID_SET_ASPECT_RATIO)))
          .addMethod(
            getListRatiosMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.AspectRatio>(
                  this, METHODID_LIST_RATIOS)))
          .addMethod(
            getSetResolutionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.Resolution,
                org.stu.projector.Resolution>(
                  this, METHODID_SET_RESOLUTION)))
          .addMethod(
            getListAvailableResolutionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.Resolution>(
                  this, METHODID_LIST_AVAILABLE_RESOLUTIONS)))
          .addMethod(
            getSetOrientationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.stu.projector.Orientation,
                org.stu.projector.Orientation>(
                  this, METHODID_SET_ORIENTATION)))
          .addMethod(
            getListAvailableOrientationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.stu.projector.Orientation>(
                  this, METHODID_LIST_AVAILABLE_ORIENTATIONS)))
          .build();
    }
  }

  /**
   * <pre>
   *projector service definition
   * </pre>
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
     * <pre>
     *switch on projector and return status message
     * </pre>
     */
    public void activateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOnStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateProjectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *switch off
     * </pre>
     */
    public void deActivateProjector(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOffStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeActivateProjectorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *choose type of input (HDMI, VGA etc.)
     * </pre>
     */
    public void setInputType(org.stu.projector.InputType request,
        io.grpc.stub.StreamObserver<org.stu.projector.InputType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetInputTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *list supported inputs
     * </pre>
     */
    public void listInputs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.InputType> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListInputsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *screen brightness control
     * </pre>
     */
    public void increaseBrightness(org.stu.projector.BrightnessLevel request,
        io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncreaseBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decreaseBrightness(org.stu.projector.BrightnessLevel request,
        io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecreaseBrightnessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *set aspect ratio for projector screen
     * </pre>
     */
    public void setAspectRatio(org.stu.projector.AspectRatio request,
        io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetAspectRatioMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *list supported aspect ratios
     * </pre>
     */
    public void listRatios(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListRatiosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public void setResolution(org.stu.projector.Resolution request,
        io.grpc.stub.StreamObserver<org.stu.projector.Resolution> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetResolutionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public void listAvailableResolutions(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.Resolution> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAvailableResolutionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOrientation(org.stu.projector.Orientation request,
        io.grpc.stub.StreamObserver<org.stu.projector.Orientation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOrientationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAvailableOrientations(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.stu.projector.Orientation> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListAvailableOrientationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *projector service definition
   * </pre>
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
     * <pre>
     *switch on projector and return status message
     * </pre>
     */
    public org.stu.projector.ProjectorOnStatus activateProjector(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getActivateProjectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *switch off
     * </pre>
     */
    public org.stu.projector.ProjectorOffStatus deActivateProjector(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDeActivateProjectorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *choose type of input (HDMI, VGA etc.)
     * </pre>
     */
    public org.stu.projector.InputType setInputType(org.stu.projector.InputType request) {
      return blockingUnaryCall(
          getChannel(), getSetInputTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *list supported inputs
     * </pre>
     */
    public java.util.Iterator<org.stu.projector.InputType> listInputs(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListInputsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *screen brightness control
     * </pre>
     */
    public org.stu.projector.BrightnessLevel increaseBrightness(org.stu.projector.BrightnessLevel request) {
      return blockingUnaryCall(
          getChannel(), getIncreaseBrightnessMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.projector.BrightnessLevel decreaseBrightness(org.stu.projector.BrightnessLevel request) {
      return blockingUnaryCall(
          getChannel(), getDecreaseBrightnessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *set aspect ratio for projector screen
     * </pre>
     */
    public org.stu.projector.AspectRatio setAspectRatio(org.stu.projector.AspectRatio request) {
      return blockingUnaryCall(
          getChannel(), getSetAspectRatioMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *list supported aspect ratios
     * </pre>
     */
    public java.util.Iterator<org.stu.projector.AspectRatio> listRatios(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListRatiosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public org.stu.projector.Resolution setResolution(org.stu.projector.Resolution request) {
      return blockingUnaryCall(
          getChannel(), getSetResolutionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *list available screen resolutions
     * </pre>
     */
    public java.util.Iterator<org.stu.projector.Resolution> listAvailableResolutions(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListAvailableResolutionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.stu.projector.Orientation setOrientation(org.stu.projector.Orientation request) {
      return blockingUnaryCall(
          getChannel(), getSetOrientationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.stu.projector.Orientation> listAvailableOrientations(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListAvailableOrientationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *projector service definition
   * </pre>
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
     * <pre>
     *switch on projector and return status message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.ProjectorOnStatus> activateProjector(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateProjectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *switch off
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.ProjectorOffStatus> deActivateProjector(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDeActivateProjectorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *choose type of input (HDMI, VGA etc.)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.InputType> setInputType(
        org.stu.projector.InputType request) {
      return futureUnaryCall(
          getChannel().newCall(getSetInputTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *screen brightness control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.BrightnessLevel> increaseBrightness(
        org.stu.projector.BrightnessLevel request) {
      return futureUnaryCall(
          getChannel().newCall(getIncreaseBrightnessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.BrightnessLevel> decreaseBrightness(
        org.stu.projector.BrightnessLevel request) {
      return futureUnaryCall(
          getChannel().newCall(getDecreaseBrightnessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *set aspect ratio for projector screen
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.AspectRatio> setAspectRatio(
        org.stu.projector.AspectRatio request) {
      return futureUnaryCall(
          getChannel().newCall(getSetAspectRatioMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *set screen resolution
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.Resolution> setResolution(
        org.stu.projector.Resolution request) {
      return futureUnaryCall(
          getChannel().newCall(getSetResolutionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.stu.projector.Orientation> setOrientation(
        org.stu.projector.Orientation request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOrientationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_PROJECTOR = 0;
  private static final int METHODID_DE_ACTIVATE_PROJECTOR = 1;
  private static final int METHODID_SET_INPUT_TYPE = 2;
  private static final int METHODID_LIST_INPUTS = 3;
  private static final int METHODID_INCREASE_BRIGHTNESS = 4;
  private static final int METHODID_DECREASE_BRIGHTNESS = 5;
  private static final int METHODID_SET_ASPECT_RATIO = 6;
  private static final int METHODID_LIST_RATIOS = 7;
  private static final int METHODID_SET_RESOLUTION = 8;
  private static final int METHODID_LIST_AVAILABLE_RESOLUTIONS = 9;
  private static final int METHODID_SET_ORIENTATION = 10;
  private static final int METHODID_LIST_AVAILABLE_ORIENTATIONS = 11;

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
              (io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOnStatus>) responseObserver);
          break;
        case METHODID_DE_ACTIVATE_PROJECTOR:
          serviceImpl.deActivateProjector((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.ProjectorOffStatus>) responseObserver);
          break;
        case METHODID_SET_INPUT_TYPE:
          serviceImpl.setInputType((org.stu.projector.InputType) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.InputType>) responseObserver);
          break;
        case METHODID_LIST_INPUTS:
          serviceImpl.listInputs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.InputType>) responseObserver);
          break;
        case METHODID_INCREASE_BRIGHTNESS:
          serviceImpl.increaseBrightness((org.stu.projector.BrightnessLevel) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel>) responseObserver);
          break;
        case METHODID_DECREASE_BRIGHTNESS:
          serviceImpl.decreaseBrightness((org.stu.projector.BrightnessLevel) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.BrightnessLevel>) responseObserver);
          break;
        case METHODID_SET_ASPECT_RATIO:
          serviceImpl.setAspectRatio((org.stu.projector.AspectRatio) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio>) responseObserver);
          break;
        case METHODID_LIST_RATIOS:
          serviceImpl.listRatios((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.AspectRatio>) responseObserver);
          break;
        case METHODID_SET_RESOLUTION:
          serviceImpl.setResolution((org.stu.projector.Resolution) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.Resolution>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_RESOLUTIONS:
          serviceImpl.listAvailableResolutions((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.Resolution>) responseObserver);
          break;
        case METHODID_SET_ORIENTATION:
          serviceImpl.setOrientation((org.stu.projector.Orientation) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.Orientation>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_ORIENTATIONS:
          serviceImpl.listAvailableOrientations((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.stu.projector.Orientation>) responseObserver);
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
              .addMethod(getDeActivateProjectorMethod())
              .addMethod(getSetInputTypeMethod())
              .addMethod(getListInputsMethod())
              .addMethod(getIncreaseBrightnessMethod())
              .addMethod(getDecreaseBrightnessMethod())
              .addMethod(getSetAspectRatioMethod())
              .addMethod(getListRatiosMethod())
              .addMethod(getSetResolutionMethod())
              .addMethod(getListAvailableResolutionsMethod())
              .addMethod(getSetOrientationMethod())
              .addMethod(getListAvailableOrientationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
