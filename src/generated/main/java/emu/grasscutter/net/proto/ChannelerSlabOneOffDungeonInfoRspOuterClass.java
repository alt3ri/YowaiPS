// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelerSlabOneOffDungeonInfoRsp.proto

package emu.grasscutter.net.proto;

public final class ChannelerSlabOneOffDungeonInfoRspOuterClass {
  private ChannelerSlabOneOffDungeonInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelerSlabOneOffDungeonInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannelerSlabOneOffDungeonInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @return A list containing the schemeBuffIdList.
     */
    java.util.List<java.lang.Integer> getSchemeBuffIdListList();
    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @return The count of schemeBuffIdList.
     */
    int getSchemeBuffIdListCount();
    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The schemeBuffIdList at the given index.
     */
    int getSchemeBuffIdList(int index);

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 8270;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code ChannelerSlabOneOffDungeonInfoRsp}
   */
  public static final class ChannelerSlabOneOffDungeonInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChannelerSlabOneOffDungeonInfoRsp)
      ChannelerSlabOneOffDungeonInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannelerSlabOneOffDungeonInfoRsp.newBuilder() to construct.
    private ChannelerSlabOneOffDungeonInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannelerSlabOneOffDungeonInfoRsp() {
      schemeBuffIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannelerSlabOneOffDungeonInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannelerSlabOneOffDungeonInfoRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                schemeBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              schemeBuffIdList_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                schemeBuffIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                schemeBuffIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          schemeBuffIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.class, emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.Builder.class);
    }

    public static final int SCHEME_BUFF_ID_LIST_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList schemeBuffIdList_;
    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @return A list containing the schemeBuffIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSchemeBuffIdListList() {
      return schemeBuffIdList_;
    }
    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @return The count of schemeBuffIdList.
     */
    public int getSchemeBuffIdListCount() {
      return schemeBuffIdList_.size();
    }
    /**
     * <code>repeated uint32 scheme_buff_id_list = 10;</code>
     * @param index The index of the element to return.
     * @return The schemeBuffIdList at the given index.
     */
    public int getSchemeBuffIdList(int index) {
      return schemeBuffIdList_.getInt(index);
    }
    private int schemeBuffIdListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      getSerializedSize();
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (getSchemeBuffIdListList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(schemeBuffIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < schemeBuffIdList_.size(); i++) {
        output.writeUInt32NoTag(schemeBuffIdList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < schemeBuffIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(schemeBuffIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSchemeBuffIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        schemeBuffIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp other = (emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp) obj;

      if (!getSchemeBuffIdListList()
          .equals(other.getSchemeBuffIdListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getSchemeBuffIdListCount() > 0) {
        hash = (37 * hash) + SCHEME_BUFF_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSchemeBuffIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp prototype) {
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
     *   CMD_ID = 8270;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code ChannelerSlabOneOffDungeonInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannelerSlabOneOffDungeonInfoRsp)
        emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.class, emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.newBuilder()
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
        schemeBuffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp build() {
        emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp buildPartial() {
        emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp result = new emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          schemeBuffIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.schemeBuffIdList_ = schemeBuffIdList_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp other) {
        if (other == emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp.getDefaultInstance()) return this;
        if (!other.schemeBuffIdList_.isEmpty()) {
          if (schemeBuffIdList_.isEmpty()) {
            schemeBuffIdList_ = other.schemeBuffIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSchemeBuffIdListIsMutable();
            schemeBuffIdList_.addAll(other.schemeBuffIdList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList schemeBuffIdList_ = emptyIntList();
      private void ensureSchemeBuffIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          schemeBuffIdList_ = mutableCopy(schemeBuffIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @return A list containing the schemeBuffIdList.
       */
      public java.util.List<java.lang.Integer>
          getSchemeBuffIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(schemeBuffIdList_) : schemeBuffIdList_;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @return The count of schemeBuffIdList.
       */
      public int getSchemeBuffIdListCount() {
        return schemeBuffIdList_.size();
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @param index The index of the element to return.
       * @return The schemeBuffIdList at the given index.
       */
      public int getSchemeBuffIdList(int index) {
        return schemeBuffIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @param index The index to set the value at.
       * @param value The schemeBuffIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSchemeBuffIdList(
          int index, int value) {
        ensureSchemeBuffIdListIsMutable();
        schemeBuffIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @param value The schemeBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSchemeBuffIdList(int value) {
        ensureSchemeBuffIdListIsMutable();
        schemeBuffIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @param values The schemeBuffIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSchemeBuffIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSchemeBuffIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schemeBuffIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scheme_buff_id_list = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSchemeBuffIdList() {
        schemeBuffIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChannelerSlabOneOffDungeonInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:ChannelerSlabOneOffDungeonInfoRsp)
    private static final emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp();
    }

    public static emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabOneOffDungeonInfoRsp>() {
      @java.lang.Override
      public ChannelerSlabOneOffDungeonInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannelerSlabOneOffDungeonInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannelerSlabOneOffDungeonInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChannelerSlabOneOffDungeonInfoRspOuterClass.ChannelerSlabOneOffDungeonInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannelerSlabOneOffDungeonInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'ChannelerSlabOneOffDungeonInfoRsp.prot" +
      "o\"Q\n!ChannelerSlabOneOffDungeonInfoRsp\022\033" +
      "\n\023scheme_buff_id_list\030\n \003(\r\022\017\n\007retcode\030\005" +
      " \001(\005B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannelerSlabOneOffDungeonInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannelerSlabOneOffDungeonInfoRsp_descriptor,
        new java.lang.String[] { "SchemeBuffIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
