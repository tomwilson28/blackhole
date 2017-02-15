// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TransitionToFollower.proto

package com.dp.blackhole.protocol.control;

public final class TransitionToFollowerPB {
  private TransitionToFollowerPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TransitionToFollowerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 entropy = 1;
    /**
     * <code>required int32 entropy = 1;</code>
     */
    boolean hasEntropy();
    /**
     * <code>required int32 entropy = 1;</code>
     */
    int getEntropy();

    // required string brokerLeader = 2;
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    boolean hasBrokerLeader();
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    java.lang.String getBrokerLeader();
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    com.google.protobuf.ByteString
        getBrokerLeaderBytes();

    // required string topic = 3;
    /**
     * <code>required string topic = 3;</code>
     */
    boolean hasTopic();
    /**
     * <code>required string topic = 3;</code>
     */
    java.lang.String getTopic();
    /**
     * <code>required string topic = 3;</code>
     */
    com.google.protobuf.ByteString
        getTopicBytes();

    // required string partition = 4;
    /**
     * <code>required string partition = 4;</code>
     */
    boolean hasPartition();
    /**
     * <code>required string partition = 4;</code>
     */
    java.lang.String getPartition();
    /**
     * <code>required string partition = 4;</code>
     */
    com.google.protobuf.ByteString
        getPartitionBytes();

    // required int32 brokerPort = 5;
    /**
     * <code>required int32 brokerPort = 5;</code>
     */
    boolean hasBrokerPort();
    /**
     * <code>required int32 brokerPort = 5;</code>
     */
    int getBrokerPort();

    // optional int64 offset = 6;
    /**
     * <code>optional int64 offset = 6;</code>
     */
    boolean hasOffset();
    /**
     * <code>optional int64 offset = 6;</code>
     */
    long getOffset();
  }
  /**
   * Protobuf type {@code blackhole.TransitionToFollower}
   */
  public static final class TransitionToFollower extends
      com.google.protobuf.GeneratedMessage
      implements TransitionToFollowerOrBuilder {
    // Use TransitionToFollower.newBuilder() to construct.
    private TransitionToFollower(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TransitionToFollower(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TransitionToFollower defaultInstance;
    public static TransitionToFollower getDefaultInstance() {
      return defaultInstance;
    }

    public TransitionToFollower getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TransitionToFollower(
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
            case 8: {
              bitField0_ |= 0x00000001;
              entropy_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              brokerLeader_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              topic_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              partition_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              brokerPort_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              offset_ = input.readInt64();
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
      return com.dp.blackhole.protocol.control.TransitionToFollowerPB.internal_static_blackhole_TransitionToFollower_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.TransitionToFollowerPB.internal_static_blackhole_TransitionToFollower_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.class, com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.Builder.class);
    }

    public static com.google.protobuf.Parser<TransitionToFollower> PARSER =
        new com.google.protobuf.AbstractParser<TransitionToFollower>() {
      public TransitionToFollower parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransitionToFollower(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TransitionToFollower> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 entropy = 1;
    public static final int ENTROPY_FIELD_NUMBER = 1;
    private int entropy_;
    /**
     * <code>required int32 entropy = 1;</code>
     */
    public boolean hasEntropy() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 entropy = 1;</code>
     */
    public int getEntropy() {
      return entropy_;
    }

    // required string brokerLeader = 2;
    public static final int BROKERLEADER_FIELD_NUMBER = 2;
    private java.lang.Object brokerLeader_;
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    public boolean hasBrokerLeader() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    public java.lang.String getBrokerLeader() {
      java.lang.Object ref = brokerLeader_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          brokerLeader_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string brokerLeader = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBrokerLeaderBytes() {
      java.lang.Object ref = brokerLeader_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        brokerLeader_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string topic = 3;
    public static final int TOPIC_FIELD_NUMBER = 3;
    private java.lang.Object topic_;
    /**
     * <code>required string topic = 3;</code>
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string topic = 3;</code>
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
     * <code>required string topic = 3;</code>
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

    // required string partition = 4;
    public static final int PARTITION_FIELD_NUMBER = 4;
    private java.lang.Object partition_;
    /**
     * <code>required string partition = 4;</code>
     */
    public boolean hasPartition() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string partition = 4;</code>
     */
    public java.lang.String getPartition() {
      java.lang.Object ref = partition_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          partition_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string partition = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPartitionBytes() {
      java.lang.Object ref = partition_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partition_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 brokerPort = 5;
    public static final int BROKERPORT_FIELD_NUMBER = 5;
    private int brokerPort_;
    /**
     * <code>required int32 brokerPort = 5;</code>
     */
    public boolean hasBrokerPort() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 brokerPort = 5;</code>
     */
    public int getBrokerPort() {
      return brokerPort_;
    }

    // optional int64 offset = 6;
    public static final int OFFSET_FIELD_NUMBER = 6;
    private long offset_;
    /**
     * <code>optional int64 offset = 6;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int64 offset = 6;</code>
     */
    public long getOffset() {
      return offset_;
    }

    private void initFields() {
      entropy_ = 0;
      brokerLeader_ = "";
      topic_ = "";
      partition_ = "";
      brokerPort_ = 0;
      offset_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasEntropy()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBrokerLeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTopic()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPartition()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBrokerPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, entropy_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBrokerLeaderBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTopicBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPartitionBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, brokerPort_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, offset_);
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
          .computeInt32Size(1, entropy_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBrokerLeaderBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTopicBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPartitionBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, brokerPort_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, offset_);
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

    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower prototype) {
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
     * Protobuf type {@code blackhole.TransitionToFollower}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollowerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.TransitionToFollowerPB.internal_static_blackhole_TransitionToFollower_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.TransitionToFollowerPB.internal_static_blackhole_TransitionToFollower_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.class, com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.newBuilder()
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
        entropy_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        brokerLeader_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        partition_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        brokerPort_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        offset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.TransitionToFollowerPB.internal_static_blackhole_TransitionToFollower_descriptor;
      }

      public com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower build() {
        com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower buildPartial() {
        com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower result = new com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.entropy_ = entropy_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.brokerLeader_ = brokerLeader_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.partition_ = partition_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.brokerPort_ = brokerPort_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.offset_ = offset_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower) {
          return mergeFrom((com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower other) {
        if (other == com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower.getDefaultInstance()) return this;
        if (other.hasEntropy()) {
          setEntropy(other.getEntropy());
        }
        if (other.hasBrokerLeader()) {
          bitField0_ |= 0x00000002;
          brokerLeader_ = other.brokerLeader_;
          onChanged();
        }
        if (other.hasTopic()) {
          bitField0_ |= 0x00000004;
          topic_ = other.topic_;
          onChanged();
        }
        if (other.hasPartition()) {
          bitField0_ |= 0x00000008;
          partition_ = other.partition_;
          onChanged();
        }
        if (other.hasBrokerPort()) {
          setBrokerPort(other.getBrokerPort());
        }
        if (other.hasOffset()) {
          setOffset(other.getOffset());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasEntropy()) {
          
          return false;
        }
        if (!hasBrokerLeader()) {
          
          return false;
        }
        if (!hasTopic()) {
          
          return false;
        }
        if (!hasPartition()) {
          
          return false;
        }
        if (!hasBrokerPort()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.TransitionToFollowerPB.TransitionToFollower) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 entropy = 1;
      private int entropy_ ;
      /**
       * <code>required int32 entropy = 1;</code>
       */
      public boolean hasEntropy() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 entropy = 1;</code>
       */
      public int getEntropy() {
        return entropy_;
      }
      /**
       * <code>required int32 entropy = 1;</code>
       */
      public Builder setEntropy(int value) {
        bitField0_ |= 0x00000001;
        entropy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 entropy = 1;</code>
       */
      public Builder clearEntropy() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entropy_ = 0;
        onChanged();
        return this;
      }

      // required string brokerLeader = 2;
      private java.lang.Object brokerLeader_ = "";
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public boolean hasBrokerLeader() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public java.lang.String getBrokerLeader() {
        java.lang.Object ref = brokerLeader_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          brokerLeader_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBrokerLeaderBytes() {
        java.lang.Object ref = brokerLeader_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          brokerLeader_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public Builder setBrokerLeader(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        brokerLeader_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public Builder clearBrokerLeader() {
        bitField0_ = (bitField0_ & ~0x00000002);
        brokerLeader_ = getDefaultInstance().getBrokerLeader();
        onChanged();
        return this;
      }
      /**
       * <code>required string brokerLeader = 2;</code>
       */
      public Builder setBrokerLeaderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        brokerLeader_ = value;
        onChanged();
        return this;
      }

      // required string topic = 3;
      private java.lang.Object topic_ = "";
      /**
       * <code>required string topic = 3;</code>
       */
      public boolean hasTopic() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string topic = 3;</code>
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
       * <code>required string topic = 3;</code>
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
       * <code>required string topic = 3;</code>
       */
      public Builder setTopic(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        topic_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 3;</code>
       */
      public Builder clearTopic() {
        bitField0_ = (bitField0_ & ~0x00000004);
        topic_ = getDefaultInstance().getTopic();
        onChanged();
        return this;
      }
      /**
       * <code>required string topic = 3;</code>
       */
      public Builder setTopicBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        topic_ = value;
        onChanged();
        return this;
      }

      // required string partition = 4;
      private java.lang.Object partition_ = "";
      /**
       * <code>required string partition = 4;</code>
       */
      public boolean hasPartition() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string partition = 4;</code>
       */
      public java.lang.String getPartition() {
        java.lang.Object ref = partition_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          partition_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string partition = 4;</code>
       */
      public com.google.protobuf.ByteString
          getPartitionBytes() {
        java.lang.Object ref = partition_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          partition_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string partition = 4;</code>
       */
      public Builder setPartition(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        partition_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string partition = 4;</code>
       */
      public Builder clearPartition() {
        bitField0_ = (bitField0_ & ~0x00000008);
        partition_ = getDefaultInstance().getPartition();
        onChanged();
        return this;
      }
      /**
       * <code>required string partition = 4;</code>
       */
      public Builder setPartitionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        partition_ = value;
        onChanged();
        return this;
      }

      // required int32 brokerPort = 5;
      private int brokerPort_ ;
      /**
       * <code>required int32 brokerPort = 5;</code>
       */
      public boolean hasBrokerPort() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 brokerPort = 5;</code>
       */
      public int getBrokerPort() {
        return brokerPort_;
      }
      /**
       * <code>required int32 brokerPort = 5;</code>
       */
      public Builder setBrokerPort(int value) {
        bitField0_ |= 0x00000010;
        brokerPort_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 brokerPort = 5;</code>
       */
      public Builder clearBrokerPort() {
        bitField0_ = (bitField0_ & ~0x00000010);
        brokerPort_ = 0;
        onChanged();
        return this;
      }

      // optional int64 offset = 6;
      private long offset_ ;
      /**
       * <code>optional int64 offset = 6;</code>
       */
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int64 offset = 6;</code>
       */
      public long getOffset() {
        return offset_;
      }
      /**
       * <code>optional int64 offset = 6;</code>
       */
      public Builder setOffset(long value) {
        bitField0_ |= 0x00000020;
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 offset = 6;</code>
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000020);
        offset_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.TransitionToFollower)
    }

    static {
      defaultInstance = new TransitionToFollower(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.TransitionToFollower)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_TransitionToFollower_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_TransitionToFollower_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TransitionToFollower.proto\022\tblackhole\"" +
      "\203\001\n\024TransitionToFollower\022\017\n\007entropy\030\001 \002(" +
      "\005\022\024\n\014brokerLeader\030\002 \002(\t\022\r\n\005topic\030\003 \002(\t\022\021" +
      "\n\tpartition\030\004 \002(\t\022\022\n\nbrokerPort\030\005 \002(\005\022\016\n" +
      "\006offset\030\006 \001(\003B;\n!com.dp.blackhole.protoc" +
      "ol.controlB\026TransitionToFollowerPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_TransitionToFollower_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_TransitionToFollower_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_TransitionToFollower_descriptor,
              new java.lang.String[] { "Entropy", "BrokerLeader", "Topic", "Partition", "BrokerPort", "Offset", });
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