// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LeoReport.proto

package com.dp.blackhole.protocol.control;

public final class LeoReportPB {
  private LeoReportPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LeoReportOrBuilder
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

    // required string candidate = 2;
    /**
     * <code>required string candidate = 2;</code>
     */
    boolean hasCandidate();
    /**
     * <code>required string candidate = 2;</code>
     */
    java.lang.String getCandidate();
    /**
     * <code>required string candidate = 2;</code>
     */
    com.google.protobuf.ByteString
        getCandidateBytes();

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
  }
  /**
   * Protobuf type {@code blackhole.LeoReport}
   */
  public static final class LeoReport extends
      com.google.protobuf.GeneratedMessage
      implements LeoReportOrBuilder {
    // Use LeoReport.newBuilder() to construct.
    private LeoReport(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LeoReport(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LeoReport defaultInstance;
    public static LeoReport getDefaultInstance() {
      return defaultInstance;
    }

    public LeoReport getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LeoReport(
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
              candidate_ = input.readBytes();
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
      return com.dp.blackhole.protocol.control.LeoReportPB.internal_static_blackhole_LeoReport_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.LeoReportPB.internal_static_blackhole_LeoReport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.class, com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.Builder.class);
    }

    public static com.google.protobuf.Parser<LeoReport> PARSER =
        new com.google.protobuf.AbstractParser<LeoReport>() {
      public LeoReport parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LeoReport(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LeoReport> getParserForType() {
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

    // required string candidate = 2;
    public static final int CANDIDATE_FIELD_NUMBER = 2;
    private java.lang.Object candidate_;
    /**
     * <code>required string candidate = 2;</code>
     */
    public boolean hasCandidate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string candidate = 2;</code>
     */
    public java.lang.String getCandidate() {
      java.lang.Object ref = candidate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          candidate_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string candidate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCandidateBytes() {
      java.lang.Object ref = candidate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidate_ = b;
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

    private void initFields() {
      entropy_ = 0;
      candidate_ = "";
      topic_ = "";
      partition_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasEntropy()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCandidate()) {
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
        output.writeBytes(2, getCandidateBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getTopicBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getPartitionBytes());
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
          .computeBytesSize(2, getCandidateBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getTopicBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getPartitionBytes());
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

    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.LeoReportPB.LeoReport prototype) {
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
     * Protobuf type {@code blackhole.LeoReport}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.LeoReportPB.LeoReportOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.LeoReportPB.internal_static_blackhole_LeoReport_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.LeoReportPB.internal_static_blackhole_LeoReport_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.class, com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.Builder.class);
      }

      // Construct using com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.newBuilder()
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
        candidate_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        topic_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        partition_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.LeoReportPB.internal_static_blackhole_LeoReport_descriptor;
      }

      public com.dp.blackhole.protocol.control.LeoReportPB.LeoReport getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.LeoReportPB.LeoReport build() {
        com.dp.blackhole.protocol.control.LeoReportPB.LeoReport result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.LeoReportPB.LeoReport buildPartial() {
        com.dp.blackhole.protocol.control.LeoReportPB.LeoReport result = new com.dp.blackhole.protocol.control.LeoReportPB.LeoReport(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.entropy_ = entropy_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.candidate_ = candidate_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.topic_ = topic_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.partition_ = partition_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.LeoReportPB.LeoReport) {
          return mergeFrom((com.dp.blackhole.protocol.control.LeoReportPB.LeoReport)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.LeoReportPB.LeoReport other) {
        if (other == com.dp.blackhole.protocol.control.LeoReportPB.LeoReport.getDefaultInstance()) return this;
        if (other.hasEntropy()) {
          setEntropy(other.getEntropy());
        }
        if (other.hasCandidate()) {
          bitField0_ |= 0x00000002;
          candidate_ = other.candidate_;
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
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasEntropy()) {
          
          return false;
        }
        if (!hasCandidate()) {
          
          return false;
        }
        if (!hasTopic()) {
          
          return false;
        }
        if (!hasPartition()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.LeoReportPB.LeoReport parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.LeoReportPB.LeoReport) e.getUnfinishedMessage();
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

      // required string candidate = 2;
      private java.lang.Object candidate_ = "";
      /**
       * <code>required string candidate = 2;</code>
       */
      public boolean hasCandidate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string candidate = 2;</code>
       */
      public java.lang.String getCandidate() {
        java.lang.Object ref = candidate_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          candidate_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string candidate = 2;</code>
       */
      public com.google.protobuf.ByteString
          getCandidateBytes() {
        java.lang.Object ref = candidate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          candidate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string candidate = 2;</code>
       */
      public Builder setCandidate(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        candidate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string candidate = 2;</code>
       */
      public Builder clearCandidate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        candidate_ = getDefaultInstance().getCandidate();
        onChanged();
        return this;
      }
      /**
       * <code>required string candidate = 2;</code>
       */
      public Builder setCandidateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        candidate_ = value;
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

      // @@protoc_insertion_point(builder_scope:blackhole.LeoReport)
    }

    static {
      defaultInstance = new LeoReport(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.LeoReport)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_LeoReport_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_LeoReport_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017LeoReport.proto\022\tblackhole\"Q\n\tLeoRepor" +
      "t\022\017\n\007entropy\030\001 \002(\005\022\021\n\tcandidate\030\002 \002(\t\022\r\n" +
      "\005topic\030\003 \002(\t\022\021\n\tpartition\030\004 \002(\tB0\n!com.d" +
      "p.blackhole.protocol.controlB\013LeoReportP" +
      "B"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_LeoReport_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_LeoReport_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_LeoReport_descriptor,
              new java.lang.String[] { "Entropy", "Candidate", "Topic", "Partition", });
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
