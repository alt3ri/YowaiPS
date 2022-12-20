// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerEnterLevelReq.proto

package emu.grasscutter.net.proto;

public final class TowerEnterLevelReqOuterClass {
  private TowerEnterLevelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerEnterLevelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerEnterLevelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 enter_point_id = 3;</code>
     * @return The enterPointId.
     */
    int getEnterPointId();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2427;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   *   IS_ALLOW_CLIENT = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code TowerEnterLevelReq}
   */
  public static final class TowerEnterLevelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerEnterLevelReq)
      TowerEnterLevelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerEnterLevelReq.newBuilder() to construct.
    private TowerEnterLevelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerEnterLevelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerEnterLevelReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerEnterLevelReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 24: {

              enterPointId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.class, emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.Builder.class);
    }

    public static final int ENTER_POINT_ID_FIELD_NUMBER = 3;
    private int enterPointId_;
    /**
     * <code>uint32 enter_point_id = 3;</code>
     * @return The enterPointId.
     */
    @java.lang.Override
    public int getEnterPointId() {
      return enterPointId_;
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
      if (enterPointId_ != 0) {
        output.writeUInt32(3, enterPointId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (enterPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, enterPointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq other = (emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq) obj;

      if (getEnterPointId()
          != other.getEnterPointId()) return false;
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
      hash = (37 * hash) + ENTER_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEnterPointId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq prototype) {
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 2427;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     *   IS_ALLOW_CLIENT = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code TowerEnterLevelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerEnterLevelReq)
        emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.class, emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.newBuilder()
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
        enterPointId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.internal_static_TowerEnterLevelReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq build() {
        emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq buildPartial() {
        emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq result = new emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq(this);
        result.enterPointId_ = enterPointId_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq) {
          return mergeFrom((emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq other) {
        if (other == emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq.getDefaultInstance()) return this;
        if (other.getEnterPointId() != 0) {
          setEnterPointId(other.getEnterPointId());
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
        emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterPointId_ ;
      /**
       * <code>uint32 enter_point_id = 3;</code>
       * @return The enterPointId.
       */
      @java.lang.Override
      public int getEnterPointId() {
        return enterPointId_;
      }
      /**
       * <code>uint32 enter_point_id = 3;</code>
       * @param value The enterPointId to set.
       * @return This builder for chaining.
       */
      public Builder setEnterPointId(int value) {
        
        enterPointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 enter_point_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterPointId() {
        
        enterPointId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerEnterLevelReq)
    }

    // @@protoc_insertion_point(class_scope:TowerEnterLevelReq)
    private static final emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq();
    }

    public static emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerEnterLevelReq>
        PARSER = new com.google.protobuf.AbstractParser<TowerEnterLevelReq>() {
      @java.lang.Override
      public TowerEnterLevelReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerEnterLevelReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerEnterLevelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerEnterLevelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerEnterLevelReqOuterClass.TowerEnterLevelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerEnterLevelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerEnterLevelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030TowerEnterLevelReq.proto\",\n\022TowerEnter" +
      "LevelReq\022\026\n\016enter_point_id\030\003 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerEnterLevelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerEnterLevelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerEnterLevelReq_descriptor,
        new java.lang.String[] { "EnterPointId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
