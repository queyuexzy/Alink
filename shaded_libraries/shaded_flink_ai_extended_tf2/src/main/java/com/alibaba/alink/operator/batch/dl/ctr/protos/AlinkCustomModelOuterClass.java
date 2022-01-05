// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: easy_rec/python/protos/alink_custom_model.proto

package com.alibaba.alink.operator.batch.dl.ctr.protos;

public final class AlinkCustomModelOuterClass {
  private AlinkCustomModelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AlinkCustomModelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protos.AlinkCustomModel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string script_path = 1;</code>
     */
    boolean hasScriptPath();
    /**
     * <code>required string script_path = 1;</code>
     */
    java.lang.String getScriptPath();
    /**
     * <code>required string script_path = 1;</code>
     */
    com.google.protobuf.ByteString
        getScriptPathBytes();

    /**
     * <code>required string func_name = 2;</code>
     */
    boolean hasFuncName();
    /**
     * <code>required string func_name = 2;</code>
     */
    java.lang.String getFuncName();
    /**
     * <code>required string func_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getFuncNameBytes();

    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    boolean hasConfig();
    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    java.lang.String getConfig();
    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    com.google.protobuf.ByteString
        getConfigBytes();
  }
  /**
   * Protobuf type {@code protos.AlinkCustomModel}
   */
  public  static final class AlinkCustomModel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protos.AlinkCustomModel)
      AlinkCustomModelOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AlinkCustomModel.newBuilder() to construct.
    private AlinkCustomModel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AlinkCustomModel() {
      scriptPath_ = "";
      funcName_ = "";
      config_ = "{}";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AlinkCustomModel();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AlinkCustomModel(
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              scriptPath_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              funcName_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              config_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.internal_static_protos_AlinkCustomModel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.internal_static_protos_AlinkCustomModel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.class, com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.Builder.class);
    }

    private int bitField0_;
    public static final int SCRIPT_PATH_FIELD_NUMBER = 1;
    private volatile java.lang.Object scriptPath_;
    /**
     * <code>required string script_path = 1;</code>
     */
    public boolean hasScriptPath() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string script_path = 1;</code>
     */
    public java.lang.String getScriptPath() {
      java.lang.Object ref = scriptPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          scriptPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string script_path = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScriptPathBytes() {
      java.lang.Object ref = scriptPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FUNC_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object funcName_;
    /**
     * <code>required string func_name = 2;</code>
     */
    public boolean hasFuncName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required string func_name = 2;</code>
     */
    public java.lang.String getFuncName() {
      java.lang.Object ref = funcName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          funcName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string func_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFuncNameBytes() {
      java.lang.Object ref = funcName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        funcName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONFIG_FIELD_NUMBER = 3;
    private volatile java.lang.Object config_;
    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    public java.lang.String getConfig() {
      java.lang.Object ref = config_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          config_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string config = 3 [default = "{}"];</code>
     */
    public com.google.protobuf.ByteString
        getConfigBytes() {
      java.lang.Object ref = config_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        config_ = b;
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

      if (!hasScriptPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFuncName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasConfig()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scriptPath_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, funcName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, config_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scriptPath_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, funcName_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, config_);
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
      if (!(obj instanceof com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel)) {
        return super.equals(obj);
      }
      com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel other = (com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel) obj;

      if (hasScriptPath() != other.hasScriptPath()) return false;
      if (hasScriptPath()) {
        if (!getScriptPath()
            .equals(other.getScriptPath())) return false;
      }
      if (hasFuncName() != other.hasFuncName()) return false;
      if (hasFuncName()) {
        if (!getFuncName()
            .equals(other.getFuncName())) return false;
      }
      if (hasConfig() != other.hasConfig()) return false;
      if (hasConfig()) {
        if (!getConfig()
            .equals(other.getConfig())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasScriptPath()) {
        hash = (37 * hash) + SCRIPT_PATH_FIELD_NUMBER;
        hash = (53 * hash) + getScriptPath().hashCode();
      }
      if (hasFuncName()) {
        hash = (37 * hash) + FUNC_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getFuncName().hashCode();
      }
      if (hasConfig()) {
        hash = (37 * hash) + CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getConfig().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parseFrom(
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
    public static Builder newBuilder(com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel prototype) {
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
     * Protobuf type {@code protos.AlinkCustomModel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protos.AlinkCustomModel)
        com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.internal_static_protos_AlinkCustomModel_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.internal_static_protos_AlinkCustomModel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.class, com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.Builder.class);
      }

      // Construct using com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.newBuilder()
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
        scriptPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        funcName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        config_ = "{}";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.internal_static_protos_AlinkCustomModel_descriptor;
      }

      @java.lang.Override
      public com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel getDefaultInstanceForType() {
        return com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.getDefaultInstance();
      }

      @java.lang.Override
      public com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel build() {
        com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel buildPartial() {
        com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel result = new com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.scriptPath_ = scriptPath_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.funcName_ = funcName_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.config_ = config_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel) {
          return mergeFrom((com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel other) {
        if (other == com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel.getDefaultInstance()) return this;
        if (other.hasScriptPath()) {
          bitField0_ |= 0x00000001;
          scriptPath_ = other.scriptPath_;
          onChanged();
        }
        if (other.hasFuncName()) {
          bitField0_ |= 0x00000002;
          funcName_ = other.funcName_;
          onChanged();
        }
        if (other.hasConfig()) {
          bitField0_ |= 0x00000004;
          config_ = other.config_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasScriptPath()) {
          return false;
        }
        if (!hasFuncName()) {
          return false;
        }
        if (!hasConfig()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object scriptPath_ = "";
      /**
       * <code>required string script_path = 1;</code>
       */
      public boolean hasScriptPath() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string script_path = 1;</code>
       */
      public java.lang.String getScriptPath() {
        java.lang.Object ref = scriptPath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            scriptPath_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string script_path = 1;</code>
       */
      public com.google.protobuf.ByteString
          getScriptPathBytes() {
        java.lang.Object ref = scriptPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          scriptPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string script_path = 1;</code>
       */
      public Builder setScriptPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        scriptPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string script_path = 1;</code>
       */
      public Builder clearScriptPath() {
        bitField0_ = (bitField0_ & ~0x00000001);
        scriptPath_ = getDefaultInstance().getScriptPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string script_path = 1;</code>
       */
      public Builder setScriptPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        scriptPath_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object funcName_ = "";
      /**
       * <code>required string func_name = 2;</code>
       */
      public boolean hasFuncName() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required string func_name = 2;</code>
       */
      public java.lang.String getFuncName() {
        java.lang.Object ref = funcName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            funcName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string func_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFuncNameBytes() {
        java.lang.Object ref = funcName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          funcName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string func_name = 2;</code>
       */
      public Builder setFuncName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        funcName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string func_name = 2;</code>
       */
      public Builder clearFuncName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        funcName_ = getDefaultInstance().getFuncName();
        onChanged();
        return this;
      }
      /**
       * <code>required string func_name = 2;</code>
       */
      public Builder setFuncNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        funcName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object config_ = "{}";
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public boolean hasConfig() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public java.lang.String getConfig() {
        java.lang.Object ref = config_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            config_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public com.google.protobuf.ByteString
          getConfigBytes() {
        java.lang.Object ref = config_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          config_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public Builder setConfig(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        config_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public Builder clearConfig() {
        bitField0_ = (bitField0_ & ~0x00000004);
        config_ = getDefaultInstance().getConfig();
        onChanged();
        return this;
      }
      /**
       * <code>required string config = 3 [default = "{}"];</code>
       */
      public Builder setConfigBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        config_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protos.AlinkCustomModel)
    }

    // @@protoc_insertion_point(class_scope:protos.AlinkCustomModel)
    private static final com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel();
    }

    public static com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<AlinkCustomModel>
        PARSER = new com.google.protobuf.AbstractParser<AlinkCustomModel>() {
      @java.lang.Override
      public AlinkCustomModel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AlinkCustomModel(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AlinkCustomModel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AlinkCustomModel> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.alibaba.alink.operator.batch.dl.ctr.protos.AlinkCustomModelOuterClass.AlinkCustomModel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_AlinkCustomModel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_AlinkCustomModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/easy_rec/python/protos/alink_custom_mo" +
      "del.proto\022\006protos\"N\n\020AlinkCustomModel\022\023\n" +
      "\013script_path\030\001 \002(\t\022\021\n\tfunc_name\030\002 \002(\t\022\022\n" +
      "\006config\030\003 \002(\t:\002{}B0\n.com.alibaba.alink.o" +
      "perator.batch.dl.ctr.protos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_AlinkCustomModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_AlinkCustomModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_AlinkCustomModel_descriptor,
        new java.lang.String[] { "ScriptPath", "FuncName", "Config", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}