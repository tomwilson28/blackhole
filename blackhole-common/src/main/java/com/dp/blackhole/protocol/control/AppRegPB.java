// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppReg.proto

package com.dp.blackhole.protocol.control;

public final class AppRegPB {
  private AppRegPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class AppReg extends
      com.google.protobuf.GeneratedMessage {
    // Use AppReg.newBuilder() to construct.
    private AppReg() {
      initFields();
    }
    private AppReg(boolean noInit) {}
    
    private static final AppReg defaultInstance;
    public static AppReg getDefaultInstance() {
      return defaultInstance;
    }
    
    public AppReg getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.AppRegPB.internal_static_blackhole_AppReg_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.AppRegPB.internal_static_blackhole_AppReg_fieldAccessorTable;
    }
    
    // required string source = 1;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private boolean hasSource;
    private java.lang.String source_ = "";
    public boolean hasSource() { return hasSource; }
    public java.lang.String getSource() { return source_; }
    
    // required string topic = 2;
    public static final int TOPIC_FIELD_NUMBER = 2;
    private boolean hasTopic;
    private java.lang.String topic_ = "";
    public boolean hasTopic() { return hasTopic; }
    public java.lang.String getTopic() { return topic_; }
    
    // required int64 reg_ts = 3;
    public static final int REG_TS_FIELD_NUMBER = 3;
    private boolean hasRegTs;
    private long regTs_ = 0L;
    public boolean hasRegTs() { return hasRegTs; }
    public long getRegTs() { return regTs_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasSource) return false;
      if (!hasTopic) return false;
      if (!hasRegTs) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasSource()) {
        output.writeString(1, getSource());
      }
      if (hasTopic()) {
        output.writeString(2, getTopic());
      }
      if (hasRegTs()) {
        output.writeInt64(3, getRegTs());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasSource()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSource());
      }
      if (hasTopic()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTopic());
      }
      if (hasRegTs()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, getRegTs());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AppRegPB.AppReg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.AppRegPB.AppReg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dp.blackhole.protocol.control.AppRegPB.AppReg result;
      
      // Construct using com.dp.blackhole.protocol.control.AppRegPB.AppReg.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dp.blackhole.protocol.control.AppRegPB.AppReg();
        return builder;
      }
      
      protected com.dp.blackhole.protocol.control.AppRegPB.AppReg internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dp.blackhole.protocol.control.AppRegPB.AppReg();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.AppRegPB.AppReg.getDescriptor();
      }
      
      public com.dp.blackhole.protocol.control.AppRegPB.AppReg getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.AppRegPB.AppReg.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dp.blackhole.protocol.control.AppRegPB.AppReg build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dp.blackhole.protocol.control.AppRegPB.AppReg buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dp.blackhole.protocol.control.AppRegPB.AppReg buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.dp.blackhole.protocol.control.AppRegPB.AppReg returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.AppRegPB.AppReg) {
          return mergeFrom((com.dp.blackhole.protocol.control.AppRegPB.AppReg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dp.blackhole.protocol.control.AppRegPB.AppReg other) {
        if (other == com.dp.blackhole.protocol.control.AppRegPB.AppReg.getDefaultInstance()) return this;
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasTopic()) {
          setTopic(other.getTopic());
        }
        if (other.hasRegTs()) {
          setRegTs(other.getRegTs());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setSource(input.readString());
              break;
            }
            case 18: {
              setTopic(input.readString());
              break;
            }
            case 24: {
              setRegTs(input.readInt64());
              break;
            }
          }
        }
      }
      
      
      // required string source = 1;
      public boolean hasSource() {
        return result.hasSource();
      }
      public java.lang.String getSource() {
        return result.getSource();
      }
      public Builder setSource(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasSource = true;
        result.source_ = value;
        return this;
      }
      public Builder clearSource() {
        result.hasSource = false;
        result.source_ = getDefaultInstance().getSource();
        return this;
      }
      
      // required string topic = 2;
      public boolean hasTopic() {
        return result.hasTopic();
      }
      public java.lang.String getTopic() {
        return result.getTopic();
      }
      public Builder setTopic(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTopic = true;
        result.topic_ = value;
        return this;
      }
      public Builder clearTopic() {
        result.hasTopic = false;
        result.topic_ = getDefaultInstance().getTopic();
        return this;
      }
      
      // required int64 reg_ts = 3;
      public boolean hasRegTs() {
        return result.hasRegTs();
      }
      public long getRegTs() {
        return result.getRegTs();
      }
      public Builder setRegTs(long value) {
        result.hasRegTs = true;
        result.regTs_ = value;
        return this;
      }
      public Builder clearRegTs() {
        result.hasRegTs = false;
        result.regTs_ = 0L;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:blackhole.AppReg)
    }
    
    static {
      defaultInstance = new AppReg(true);
      com.dp.blackhole.protocol.control.AppRegPB.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:blackhole.AppReg)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_AppReg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_AppReg_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014AppReg.proto\022\tblackhole\"7\n\006AppReg\022\016\n\006s" +
      "ource\030\001 \002(\t\022\r\n\005topic\030\002 \002(\t\022\016\n\006reg_ts\030\003 \002" +
      "(\003B-\n!com.dp.blackhole.protocol.controlB" +
      "\010AppRegPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_AppReg_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_AppReg_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_AppReg_descriptor,
              new java.lang.String[] { "Source", "Topic", "RegTs", },
              com.dp.blackhole.protocol.control.AppRegPB.AppReg.class,
              com.dp.blackhole.protocol.control.AppRegPB.AppReg.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
