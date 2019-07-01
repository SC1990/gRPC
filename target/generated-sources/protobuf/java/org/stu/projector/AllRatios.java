// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: projector.proto

package org.stu.projector;

/**
 * Protobuf type {@code projector.AllRatios}
 */
public  final class AllRatios extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:projector.AllRatios)
    AllRatiosOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllRatios.newBuilder() to construct.
  private AllRatios(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllRatios() {
    aspectRatios_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllRatios(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              aspectRatios_ = new java.util.ArrayList<org.stu.projector.AspectRatio>();
              mutable_bitField0_ |= 0x00000001;
            }
            aspectRatios_.add(
                input.readMessage(org.stu.projector.AspectRatio.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        aspectRatios_ = java.util.Collections.unmodifiableList(aspectRatios_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.stu.projector.ProjectorProto.internal_static_projector_AllRatios_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.stu.projector.ProjectorProto.internal_static_projector_AllRatios_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.stu.projector.AllRatios.class, org.stu.projector.AllRatios.Builder.class);
  }

  public static final int ASPECTRATIOS_FIELD_NUMBER = 1;
  private java.util.List<org.stu.projector.AspectRatio> aspectRatios_;
  /**
   * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
   */
  public java.util.List<org.stu.projector.AspectRatio> getAspectRatiosList() {
    return aspectRatios_;
  }
  /**
   * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
   */
  public java.util.List<? extends org.stu.projector.AspectRatioOrBuilder> 
      getAspectRatiosOrBuilderList() {
    return aspectRatios_;
  }
  /**
   * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
   */
  public int getAspectRatiosCount() {
    return aspectRatios_.size();
  }
  /**
   * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
   */
  public org.stu.projector.AspectRatio getAspectRatios(int index) {
    return aspectRatios_.get(index);
  }
  /**
   * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
   */
  public org.stu.projector.AspectRatioOrBuilder getAspectRatiosOrBuilder(
      int index) {
    return aspectRatios_.get(index);
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
    for (int i = 0; i < aspectRatios_.size(); i++) {
      output.writeMessage(1, aspectRatios_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aspectRatios_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, aspectRatios_.get(i));
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
    if (!(obj instanceof org.stu.projector.AllRatios)) {
      return super.equals(obj);
    }
    org.stu.projector.AllRatios other = (org.stu.projector.AllRatios) obj;

    boolean result = true;
    result = result && getAspectRatiosList()
        .equals(other.getAspectRatiosList());
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
    if (getAspectRatiosCount() > 0) {
      hash = (37 * hash) + ASPECTRATIOS_FIELD_NUMBER;
      hash = (53 * hash) + getAspectRatiosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.stu.projector.AllRatios parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.projector.AllRatios parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.projector.AllRatios parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.projector.AllRatios parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.projector.AllRatios parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.stu.projector.AllRatios parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.stu.projector.AllRatios parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stu.projector.AllRatios parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stu.projector.AllRatios parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.stu.projector.AllRatios parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.stu.projector.AllRatios parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.stu.projector.AllRatios parseFrom(
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
  public static Builder newBuilder(org.stu.projector.AllRatios prototype) {
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
   * Protobuf type {@code projector.AllRatios}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:projector.AllRatios)
      org.stu.projector.AllRatiosOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.stu.projector.ProjectorProto.internal_static_projector_AllRatios_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.stu.projector.ProjectorProto.internal_static_projector_AllRatios_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.stu.projector.AllRatios.class, org.stu.projector.AllRatios.Builder.class);
    }

    // Construct using org.stu.projector.AllRatios.newBuilder()
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
        getAspectRatiosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (aspectRatiosBuilder_ == null) {
        aspectRatios_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        aspectRatiosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.stu.projector.ProjectorProto.internal_static_projector_AllRatios_descriptor;
    }

    @java.lang.Override
    public org.stu.projector.AllRatios getDefaultInstanceForType() {
      return org.stu.projector.AllRatios.getDefaultInstance();
    }

    @java.lang.Override
    public org.stu.projector.AllRatios build() {
      org.stu.projector.AllRatios result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.stu.projector.AllRatios buildPartial() {
      org.stu.projector.AllRatios result = new org.stu.projector.AllRatios(this);
      int from_bitField0_ = bitField0_;
      if (aspectRatiosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          aspectRatios_ = java.util.Collections.unmodifiableList(aspectRatios_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aspectRatios_ = aspectRatios_;
      } else {
        result.aspectRatios_ = aspectRatiosBuilder_.build();
      }
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
      if (other instanceof org.stu.projector.AllRatios) {
        return mergeFrom((org.stu.projector.AllRatios)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.stu.projector.AllRatios other) {
      if (other == org.stu.projector.AllRatios.getDefaultInstance()) return this;
      if (aspectRatiosBuilder_ == null) {
        if (!other.aspectRatios_.isEmpty()) {
          if (aspectRatios_.isEmpty()) {
            aspectRatios_ = other.aspectRatios_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAspectRatiosIsMutable();
            aspectRatios_.addAll(other.aspectRatios_);
          }
          onChanged();
        }
      } else {
        if (!other.aspectRatios_.isEmpty()) {
          if (aspectRatiosBuilder_.isEmpty()) {
            aspectRatiosBuilder_.dispose();
            aspectRatiosBuilder_ = null;
            aspectRatios_ = other.aspectRatios_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aspectRatiosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAspectRatiosFieldBuilder() : null;
          } else {
            aspectRatiosBuilder_.addAllMessages(other.aspectRatios_);
          }
        }
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
      org.stu.projector.AllRatios parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.stu.projector.AllRatios) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.stu.projector.AspectRatio> aspectRatios_ =
      java.util.Collections.emptyList();
    private void ensureAspectRatiosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        aspectRatios_ = new java.util.ArrayList<org.stu.projector.AspectRatio>(aspectRatios_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.stu.projector.AspectRatio, org.stu.projector.AspectRatio.Builder, org.stu.projector.AspectRatioOrBuilder> aspectRatiosBuilder_;

    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public java.util.List<org.stu.projector.AspectRatio> getAspectRatiosList() {
      if (aspectRatiosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aspectRatios_);
      } else {
        return aspectRatiosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public int getAspectRatiosCount() {
      if (aspectRatiosBuilder_ == null) {
        return aspectRatios_.size();
      } else {
        return aspectRatiosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public org.stu.projector.AspectRatio getAspectRatios(int index) {
      if (aspectRatiosBuilder_ == null) {
        return aspectRatios_.get(index);
      } else {
        return aspectRatiosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder setAspectRatios(
        int index, org.stu.projector.AspectRatio value) {
      if (aspectRatiosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAspectRatiosIsMutable();
        aspectRatios_.set(index, value);
        onChanged();
      } else {
        aspectRatiosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder setAspectRatios(
        int index, org.stu.projector.AspectRatio.Builder builderForValue) {
      if (aspectRatiosBuilder_ == null) {
        ensureAspectRatiosIsMutable();
        aspectRatios_.set(index, builderForValue.build());
        onChanged();
      } else {
        aspectRatiosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder addAspectRatios(org.stu.projector.AspectRatio value) {
      if (aspectRatiosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAspectRatiosIsMutable();
        aspectRatios_.add(value);
        onChanged();
      } else {
        aspectRatiosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder addAspectRatios(
        int index, org.stu.projector.AspectRatio value) {
      if (aspectRatiosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAspectRatiosIsMutable();
        aspectRatios_.add(index, value);
        onChanged();
      } else {
        aspectRatiosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder addAspectRatios(
        org.stu.projector.AspectRatio.Builder builderForValue) {
      if (aspectRatiosBuilder_ == null) {
        ensureAspectRatiosIsMutable();
        aspectRatios_.add(builderForValue.build());
        onChanged();
      } else {
        aspectRatiosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder addAspectRatios(
        int index, org.stu.projector.AspectRatio.Builder builderForValue) {
      if (aspectRatiosBuilder_ == null) {
        ensureAspectRatiosIsMutable();
        aspectRatios_.add(index, builderForValue.build());
        onChanged();
      } else {
        aspectRatiosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder addAllAspectRatios(
        java.lang.Iterable<? extends org.stu.projector.AspectRatio> values) {
      if (aspectRatiosBuilder_ == null) {
        ensureAspectRatiosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aspectRatios_);
        onChanged();
      } else {
        aspectRatiosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder clearAspectRatios() {
      if (aspectRatiosBuilder_ == null) {
        aspectRatios_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aspectRatiosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public Builder removeAspectRatios(int index) {
      if (aspectRatiosBuilder_ == null) {
        ensureAspectRatiosIsMutable();
        aspectRatios_.remove(index);
        onChanged();
      } else {
        aspectRatiosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public org.stu.projector.AspectRatio.Builder getAspectRatiosBuilder(
        int index) {
      return getAspectRatiosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public org.stu.projector.AspectRatioOrBuilder getAspectRatiosOrBuilder(
        int index) {
      if (aspectRatiosBuilder_ == null) {
        return aspectRatios_.get(index);  } else {
        return aspectRatiosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public java.util.List<? extends org.stu.projector.AspectRatioOrBuilder> 
         getAspectRatiosOrBuilderList() {
      if (aspectRatiosBuilder_ != null) {
        return aspectRatiosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aspectRatios_);
      }
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public org.stu.projector.AspectRatio.Builder addAspectRatiosBuilder() {
      return getAspectRatiosFieldBuilder().addBuilder(
          org.stu.projector.AspectRatio.getDefaultInstance());
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public org.stu.projector.AspectRatio.Builder addAspectRatiosBuilder(
        int index) {
      return getAspectRatiosFieldBuilder().addBuilder(
          index, org.stu.projector.AspectRatio.getDefaultInstance());
    }
    /**
     * <code>repeated .projector.AspectRatio aspectRatios = 1;</code>
     */
    public java.util.List<org.stu.projector.AspectRatio.Builder> 
         getAspectRatiosBuilderList() {
      return getAspectRatiosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.stu.projector.AspectRatio, org.stu.projector.AspectRatio.Builder, org.stu.projector.AspectRatioOrBuilder> 
        getAspectRatiosFieldBuilder() {
      if (aspectRatiosBuilder_ == null) {
        aspectRatiosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.stu.projector.AspectRatio, org.stu.projector.AspectRatio.Builder, org.stu.projector.AspectRatioOrBuilder>(
                aspectRatios_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        aspectRatios_ = null;
      }
      return aspectRatiosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:projector.AllRatios)
  }

  // @@protoc_insertion_point(class_scope:projector.AllRatios)
  private static final org.stu.projector.AllRatios DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.stu.projector.AllRatios();
  }

  public static org.stu.projector.AllRatios getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllRatios>
      PARSER = new com.google.protobuf.AbstractParser<AllRatios>() {
    @java.lang.Override
    public AllRatios parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllRatios(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllRatios> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllRatios> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.stu.projector.AllRatios getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

