// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NoAvailableNode.proto

package com.dp.blackhole.protocol.control;

public final class NoAvailableNodePB {
  private NoAvailableNodePB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface NoAvailableNodeOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string app_name = 1;
    /**
     * <code>required string app_name = 1;</code>
     */
    boolean hasAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    java.lang.String getAppName();
    /**
     * <code>required string app_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getAppNameBytes();
  }
  /**
   * Protobuf type {@code blackhole.NoAvailableNode}
   */
  public static final class NoAvailableNode extends
      com.google.protobuf.GeneratedMessage
      implements NoAvailableNodeOrBuilder {
    // Use NoAvailableNode.newBuilder() to construct.
    private NoAvailableNode(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private NoAvailableNode(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final NoAvailableNode defaultInstance;
    public static NoAvailableNode getDefaultInstance() {
      return defaultInstance;
    }

    public NoAvailableNode getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private NoAvailableNode(
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
              appName_ = input.readBytes();
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
      return com.dp.blackhole.protocol.control.NoAvailableNodePB.internal_static_blackhole_NoAvailableNode_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.NoAvailableNodePB.internal_static_blackhole_NoAvailableNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.class, com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.Builder.class);
    }

    public static com.google.protobuf.Parser<NoAvailableNode> PARSER =
        new com.google.protobuf.AbstractParser<NoAvailableNode>() {
      public NoAvailableNode parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NoAvailableNode(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<NoAvailableNode> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string app_name = 1;
    public static final int APP_NAME_FIELD_NUMBER = 1;
    private java.lang.Object appName_;
    /**
     * <code>required string app_name = 1;</code>
     */
    public boolean hasAppName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          appName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string app_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      appName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasAppName()) {
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
        output.writeBytes(1, getAppNameBytes());
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
          .computeBytesSize(1, getAppNameBytes());
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

    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode prototype) {
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
     * Protobuf type {@code blackhole.NoAvailableNode}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.NoAvailableNodePB.internal_static_blackhole_NoAvailableNode_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.NoAvailableNodePB.internal_static_blackhole_NoAvailableNode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.class, com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.Builder.class);
      }

      // Construct using com.dp.blackhole.common.gen.NoAvailableNodePB.NoAvailableNode.newBuilder()
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
        appName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.NoAvailableNodePB.internal_static_blackhole_NoAvailableNode_descriptor;
      }

      public com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.getDefaultInstance();
      }

      public com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode build() {
        com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode buildPartial() {
        com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode result = new com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.appName_ = appName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode) {
          return mergeFrom((com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode other) {
        if (other == com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode.getDefaultInstance()) return this;
        if (other.hasAppName()) {
          bitField0_ |= 0x00000001;
          appName_ = other.appName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAppName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dp.blackhole.protocol.control.NoAvailableNodePB.NoAvailableNode) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string app_name = 1;
      private java.lang.Object appName_ = "";
      /**
       * <code>required string app_name = 1;</code>
       */
      public boolean hasAppName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public java.lang.String getAppName() {
        java.lang.Object ref = appName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          appName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getAppNameBytes() {
        java.lang.Object ref = appName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder clearAppName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        appName_ = getDefaultInstance().getAppName();
        onChanged();
        return this;
      }
      /**
       * <code>required string app_name = 1;</code>
       */
      public Builder setAppNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        appName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:blackhole.NoAvailableNode)
    }

    static {
      defaultInstance = new NoAvailableNode(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:blackhole.NoAvailableNode)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_NoAvailableNode_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_NoAvailableNode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025NoAvailableNode.proto\022\tblackhole\"#\n\017No" +
      "AvailableNode\022\020\n\010app_name\030\001 \002(\tB0\n\033com.d" +
      "p.blackhole.common.genB\021NoAvailableNodeP" +
      "B"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_NoAvailableNode_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_NoAvailableNode_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_NoAvailableNode_descriptor,
              new java.lang.String[] { "AppName", });
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