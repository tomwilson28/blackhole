// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LogNotFound.proto

package com.dp.blackhole.protocol.control;

public final class LogNotFoundPB {
  private LogNotFoundPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LogNotFoundOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string topic = 1;
    /**
     * <code>optional string topic = 1;</code>
     */
    boolean hasTopic();
    /**
     * <code>optional string topic = 1;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>optional string topic = 1;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    // optional string file = 2;
    /**
     * <code>optional string file = 2;</code>
     */
    boolean hasFile();
    /**
     * <code>optional string file = 2;</code>
     */
    java.lang.String getFile();
    /**
     * <code>optional string file = 2;</code>
     */
    com.google.protobuf.ByteString
        getFileBytes();

    // optional int64 ts = 3;
    /**
     * <code>optional int64 ts = 3;</code>
     */
    boolean hasTs();
    /**
     * <code>optional int64 ts = 3;</code>
     */
    long getTs();

    // optional string instanceId = 4;
    /**
     * <code>optional string instanceId = 4;</code>
     */
    boolean hasInstanceId();
    /**
     * <code>optional string instanceId = 4;</code>
     */
    java.lang.String getInstanceId();
    /**
     * <code>optional string instanceId = 4;</code>
     */
    com.google.protobuf.ByteString
        getInstanceIdBytes();
  }
  /**
   * Protobuf type {@code blackhole.LogNotFound}
   */
  public static final class LogNotFound extends
      com.google.protobuf.GeneratedMessage
      implements LogNotFoundOrBuilder {
    // Use LogNotFound.newBuilder() to construct.
    private LogNotFound(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LogNotFound(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LogNotFound defaultInstance;
    public static LogNotFound getDefaultInstance() {
      return defaultInstance;
    }

    public LogNotFound getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LogNotFound(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              topic_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              file_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              ts_ = input.readInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              instanceId_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.LogNotFoundPB.internal_static_blackhole_LogNotFound_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.LogNotFoundPB.internal_static_blackhole_LogNotFound_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.class, com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.Builder.class);
    }

    public static com.google.protobuf.Parser<LogNotFound> PARSER =
        new com.google.protobuf.AbstractParser<LogNotFound>() {
      public LogNotFound parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogNotFound(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LogNotFound> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string topic = 1;
    public static final int TOPIC_FIELD_NUMBER = 1;
    private java.lang.Object topic_;
    /**
     * <code>optional string topic = 1;</code>
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string topic = 1;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          topic_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string topic = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string file = 2;
    public static final int FILE_FIELD_NUMBER = 2;
    private java.lang.Object file_;
    /**
     * <code>optional string file = 2;</code>
     */
    public boolean hasFile() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string file = 2;</code>
     */
    public java.lang.String getFile() {
      java.lang.Object ref = file_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          file_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string file = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFileBytes() {
      java.lang.Object ref = file_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        file_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional int64 ts = 3;
    public static final int TS_FIELD_NUMBER = 3;
    private long ts_;
    /**
     * <code>optional int64 ts = 3;</code>
     */
    public boolean hasTs() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 ts = 3;</code>
     */
    public long getTs() {
      return ts_;
    }

    // optional string instanceId = 4;
    public static final int INSTANCEID_FIELD_NUMBER = 4;
    private java.lang.Object instanceId_;
    /**
     * <code>optional string instanceId = 4;</code>
     */
    public boolean hasInstanceId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string instanceId = 4;</code>
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          instanceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string instanceId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      topic_ = "";
      file_ = "";
      ts_ = 0L;
      instanceId_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getFileBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, ts_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getInstanceIdBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getTopicBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFileBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, ts_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getInstanceIdBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code blackhole.LogNotFound}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFoundOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.LogNotFoundPB.internal_static_blackhole_LogNotFound_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.LogNotFoundPB.internal_static_blackhole_LogNotFound_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.class, com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        file_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        ts_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        instanceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.LogNotFoundPB.internal_static_blackhole_LogNotFound_descriptor;
      }

      public com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound build() {
        com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound buildPartial() {
        com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound result = new com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.file_ = file_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ts_ = ts_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.instanceId_ = instanceId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound) {
          return mergeFrom((com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound other) {
        if (other == com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound.getDefaultInstance()) return this;
        if (other.hasTopic()) {
          bitField0_ |= 0x00000001;
          topic_ = other.topic_;
          onChanged();
        }
        if (other.hasFile()) {
          bitField0_ |= 0x00000002;
          file_ = other.file_;
          onChanged();
        }
        if (other.hasTs()) {
          setTs(other.getTs());
        }
        if (other.hasInstanceId()) {
          bitField0_ |= 0x00000008;
          instanceId_ = other.instanceId_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.LogNotFoundPB.LogNotFound) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string topic = 1;
      private java.lang.Object topic_ = "";
      /**
       * <code>optional string topic = 1;</code>
       */
      public boolean hasTopic() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string topic = 1;</code>
       */
      public java.lang.String getTopic() {
        java.lang.Object ref = topic_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          topic_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string topic = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTopicBytes() {
        java.lang.Object ref = topic_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          topic_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string topic = 1;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string topic = 1;</code>
       */
      public Builder clearTopic() {
        bitField0_ = (bitField0_ & ~0x00000001);
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>optional string topic = 1;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        topic_ = value;
        onChanged();
        return this;
      }

      // optional string file = 2;
      private java.lang.Object file_ = "";
      /**
       * <code>optional string file = 2;</code>
       */
      public boolean hasFile() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string file = 2;</code>
       */
      public java.lang.String getFile() {
        java.lang.Object ref = file_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          file_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string file = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFileBytes() {
        java.lang.Object ref = file_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          file_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string file = 2;</code>
       */
      public Builder setFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        file_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string file = 2;</code>
       */
      public Builder clearFile() {
        bitField0_ = (bitField0_ & ~0x00000002);
        file_ = getDefaultInstance().getFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string file = 2;</code>
       */
      public Builder setFileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        file_ = value;
        onChanged();
        return this;
      }

      // optional int64 ts = 3;
      private long ts_ ;
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public boolean hasTs() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public long getTs() {
        return ts_;
      }
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public Builder setTs(long value) {
        bitField0_ |= 0x00000004;
        ts_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 ts = 3;</code>
       */
      public Builder clearTs() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ts_ = 0L;
        onChanged();
        return this;
      }

      // optional string instanceId = 4;
      private java.lang.Object instanceId_ = "";
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public boolean hasInstanceId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public java.lang.String getInstanceId() {
        java.lang.Object ref = instanceId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          instanceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public com.google.protobuf.ByteString
          getInstanceIdBytes() {
        java.lang.Object ref = instanceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          instanceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public Builder setInstanceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        instanceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public Builder clearInstanceId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        instanceId_ = getDefaultInstance().getInstanceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string instanceId = 4;</code>
       */
      public Builder setInstanceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        instanceId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.LogNotFound)
    }

    static {
      defaultInstance = new LogNotFound(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.LogNotFound)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_LogNotFound_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_LogNotFound_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LogNotFound.proto\022\tblackhole\"J\n\013LogNot" +
      "Found\022\r\n\005topic\030\001 \001(\t\022\014\n\004file\030\002 \001(\t\022\n\n\002ts" +
      "\030\003 \001(\003\022\022\n\ninstanceId\030\004 \001(\tB2\n!com.dp.bla" +
      "ckhole.protocol.controlB\rLogNotFoundPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_LogNotFound_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_LogNotFound_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_LogNotFound_descriptor,
              new java.lang.String[] { "Topic", "File", "Ts", "InstanceId", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
