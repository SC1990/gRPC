// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: video_recorder.proto

package org.stu.video_recorder;

/**
 * Protobuf type {@code video_recorder.VideoRecorderOnStatus}
 */
public  final class VideoRecorderOnStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:video_recorder.VideoRecorderOnStatus)
    VideoRecorderOnStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoRecorderOnStatus.newBuilder() to construct.
  private VideoRecorderOnStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoRecorderOnStatus() {
    onStatus_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoRecorderOnStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            onStatus_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.stu.video_recorder.VideoRecorderProto.internal_static_video_recorder_VideoRecorderOnStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.stu.video_recorder.VideoRecorderProto.internal_static_video_recorder_VideoRecorderOnStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.stu.video_recorder.VideoRecorderOnStatus.class, org.stu.video_recorder.VideoRecorderOnStatus.Builder.class);
  }

  public static final int ONSTATUS_FIELD_NUMBER = 1;
  private volatile java.lang.Object onStatus_;
  /**
   * <code>string onStatus = 1;</code>
   */
  public java.lang.String getOnStatus() {
    java.lang.Object ref = onStatus_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      onStatus_ = s;
      return s;
    }
  }
  /**
   * <code>string onStatus = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOnStatusBytes() {
    java.lang.Object ref = onStatus_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      onStatus_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOnStatusBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, onStatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOnStatusBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, onStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.stu.video_recorder.VideoRecorderOnStatus)) {
      return super.equals(obj);
    }
    org.stu.video_recorder.VideoRecorderOnStatus other = (org.stu.video_recorder.VideoRecorderOnStatus) obj;

    boolean result = true;
    result = result && getOnStatus()
        .equals(other.getOnStatus());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ONSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getOnStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stu.video_recorder.VideoRecorderOnStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.stu.video_recorder.VideoRecorderOnStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code video_recorder.VideoRecorderOnStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:video_recorder.VideoRecorderOnStatus)
      org.stu.video_recorder.VideoRecorderOnStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.stu.video_recorder.VideoRecorderProto.internal_static_video_recorder_VideoRecorderOnStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.stu.video_recorder.VideoRecorderProto.internal_static_video_recorder_VideoRecorderOnStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.stu.video_recorder.VideoRecorderOnStatus.class, org.stu.video_recorder.VideoRecorderOnStatus.Builder.class);
    }

    // Construct using org.stu.video_recorder.VideoRecorderOnStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      onStatus_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.stu.video_recorder.VideoRecorderProto.internal_static_video_recorder_VideoRecorderOnStatus_descriptor;
    }

    @java.lang.Override
    public org.stu.video_recorder.VideoRecorderOnStatus getDefaultInstanceForType() {
      return org.stu.video_recorder.VideoRecorderOnStatus.getDefaultInstance();
    }

    @java.lang.Override
    public org.stu.video_recorder.VideoRecorderOnStatus build() {
      org.stu.video_recorder.VideoRecorderOnStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.stu.video_recorder.VideoRecorderOnStatus buildPartial() {
      org.stu.video_recorder.VideoRecorderOnStatus result = new org.stu.video_recorder.VideoRecorderOnStatus(this);
      result.onStatus_ = onStatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.stu.video_recorder.VideoRecorderOnStatus) {
        return mergeFrom((org.stu.video_recorder.VideoRecorderOnStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.stu.video_recorder.VideoRecorderOnStatus other) {
      if (other == org.stu.video_recorder.VideoRecorderOnStatus.getDefaultInstance()) return this;
      if (!other.getOnStatus().isEmpty()) {
        onStatus_ = other.onStatus_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.stu.video_recorder.VideoRecorderOnStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.stu.video_recorder.VideoRecorderOnStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object onStatus_ = "";
    /**
     * <code>string onStatus = 1;</code>
     */
    public java.lang.String getOnStatus() {
      java.lang.Object ref = onStatus_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onStatus_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string onStatus = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOnStatusBytes() {
      java.lang.Object ref = onStatus_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        onStatus_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string onStatus = 1;</code>
     */
    public Builder setOnStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      onStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string onStatus = 1;</code>
     */
    public Builder clearOnStatus() {
      
      onStatus_ = getDefaultInstance().getOnStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string onStatus = 1;</code>
     */
    public Builder setOnStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      onStatus_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:video_recorder.VideoRecorderOnStatus)
  }

  // @@protoc_insertion_point(class_scope:video_recorder.VideoRecorderOnStatus)
  private static final org.stu.video_recorder.VideoRecorderOnStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.stu.video_recorder.VideoRecorderOnStatus();
  }

  public static org.stu.video_recorder.VideoRecorderOnStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoRecorderOnStatus>
      PARSER = new com.google.protobuf.AbstractParser<VideoRecorderOnStatus>() {
    @java.lang.Override
    public VideoRecorderOnStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoRecorderOnStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoRecorderOnStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoRecorderOnStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.stu.video_recorder.VideoRecorderOnStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

