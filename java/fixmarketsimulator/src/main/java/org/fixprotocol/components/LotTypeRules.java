// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.LotTypeRules}
 */
public  final class LotTypeRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.LotTypeRules)
    LotTypeRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LotTypeRules.newBuilder() to construct.
  private LotTypeRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LotTypeRules() {
    lotType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LotTypeRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LotTypeRules(
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
          case 8: {
            int rawValue = input.readEnum();

            lotType_ = rawValue;
            break;
          }
          case 18: {
            org.fixprotocol.components.Fix.Decimal64.Builder subBuilder = null;
            if (minLotSize_ != null) {
              subBuilder = minLotSize_.toBuilder();
            }
            minLotSize_ = input.readMessage(org.fixprotocol.components.Fix.Decimal64.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(minLotSize_);
              minLotSize_ = subBuilder.buildPartial();
            }

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
    return org.fixprotocol.components.Common.internal_static_Common_LotTypeRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_LotTypeRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.LotTypeRules.class, org.fixprotocol.components.LotTypeRules.Builder.class);
  }

  public static final int LOT_TYPE_FIELD_NUMBER = 1;
  private int lotType_;
  /**
   * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for lotType.
   */
  public int getLotTypeValue() {
    return lotType_;
  }
  /**
   * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The lotType.
   */
  public org.fixprotocol.components.LotTypeEnum getLotType() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.LotTypeEnum result = org.fixprotocol.components.LotTypeEnum.valueOf(lotType_);
    return result == null ? org.fixprotocol.components.LotTypeEnum.UNRECOGNIZED : result;
  }

  public static final int MIN_LOT_SIZE_FIELD_NUMBER = 2;
  private org.fixprotocol.components.Fix.Decimal64 minLotSize_;
  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the minLotSize field is set.
   */
  public boolean hasMinLotSize() {
    return minLotSize_ != null;
  }
  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The minLotSize.
   */
  public org.fixprotocol.components.Fix.Decimal64 getMinLotSize() {
    return minLotSize_ == null ? org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : minLotSize_;
  }
  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  public org.fixprotocol.components.Fix.Decimal64OrBuilder getMinLotSizeOrBuilder() {
    return getMinLotSize();
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
    if (lotType_ != org.fixprotocol.components.LotTypeEnum.LOT_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, lotType_);
    }
    if (minLotSize_ != null) {
      output.writeMessage(2, getMinLotSize());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lotType_ != org.fixprotocol.components.LotTypeEnum.LOT_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, lotType_);
    }
    if (minLotSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMinLotSize());
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
    if (!(obj instanceof org.fixprotocol.components.LotTypeRules)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.LotTypeRules other = (org.fixprotocol.components.LotTypeRules) obj;

    if (lotType_ != other.lotType_) return false;
    if (hasMinLotSize() != other.hasMinLotSize()) return false;
    if (hasMinLotSize()) {
      if (!getMinLotSize()
          .equals(other.getMinLotSize())) return false;
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
    hash = (37 * hash) + LOT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + lotType_;
    if (hasMinLotSize()) {
      hash = (37 * hash) + MIN_LOT_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getMinLotSize().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.LotTypeRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.LotTypeRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.LotTypeRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.LotTypeRules parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.LotTypeRules prototype) {
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
   * Protobuf type {@code Common.LotTypeRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.LotTypeRules)
      org.fixprotocol.components.LotTypeRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_LotTypeRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_LotTypeRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.LotTypeRules.class, org.fixprotocol.components.LotTypeRules.Builder.class);
    }

    // Construct using org.fixprotocol.components.LotTypeRules.newBuilder()
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
      lotType_ = 0;

      if (minLotSizeBuilder_ == null) {
        minLotSize_ = null;
      } else {
        minLotSize_ = null;
        minLotSizeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_LotTypeRules_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.LotTypeRules getDefaultInstanceForType() {
      return org.fixprotocol.components.LotTypeRules.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.LotTypeRules build() {
      org.fixprotocol.components.LotTypeRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.LotTypeRules buildPartial() {
      org.fixprotocol.components.LotTypeRules result = new org.fixprotocol.components.LotTypeRules(this);
      result.lotType_ = lotType_;
      if (minLotSizeBuilder_ == null) {
        result.minLotSize_ = minLotSize_;
      } else {
        result.minLotSize_ = minLotSizeBuilder_.build();
      }
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
      if (other instanceof org.fixprotocol.components.LotTypeRules) {
        return mergeFrom((org.fixprotocol.components.LotTypeRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.LotTypeRules other) {
      if (other == org.fixprotocol.components.LotTypeRules.getDefaultInstance()) return this;
      if (other.lotType_ != 0) {
        setLotTypeValue(other.getLotTypeValue());
      }
      if (other.hasMinLotSize()) {
        mergeMinLotSize(other.getMinLotSize());
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
      org.fixprotocol.components.LotTypeRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.LotTypeRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int lotType_ = 0;
    /**
     * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The enum numeric value on the wire for lotType.
     */
    public int getLotTypeValue() {
      return lotType_;
    }
    /**
     * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The enum numeric value on the wire for lotType to set.
     * @return This builder for chaining.
     */
    public Builder setLotTypeValue(int value) {
      lotType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The lotType.
     */
    public org.fixprotocol.components.LotTypeEnum getLotType() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.LotTypeEnum result = org.fixprotocol.components.LotTypeEnum.valueOf(lotType_);
      return result == null ? org.fixprotocol.components.LotTypeEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The lotType to set.
     * @return This builder for chaining.
     */
    public Builder setLotType(org.fixprotocol.components.LotTypeEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lotType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return This builder for chaining.
     */
    public Builder clearLotType() {
      
      lotType_ = 0;
      onChanged();
      return this;
    }

    private org.fixprotocol.components.Fix.Decimal64 minLotSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder> minLotSizeBuilder_;
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return Whether the minLotSize field is set.
     */
    public boolean hasMinLotSize() {
      return minLotSizeBuilder_ != null || minLotSize_ != null;
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The minLotSize.
     */
    public org.fixprotocol.components.Fix.Decimal64 getMinLotSize() {
      if (minLotSizeBuilder_ == null) {
        return minLotSize_ == null ? org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : minLotSize_;
      } else {
        return minLotSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMinLotSize(org.fixprotocol.components.Fix.Decimal64 value) {
      if (minLotSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minLotSize_ = value;
        onChanged();
      } else {
        minLotSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder setMinLotSize(
        org.fixprotocol.components.Fix.Decimal64.Builder builderForValue) {
      if (minLotSizeBuilder_ == null) {
        minLotSize_ = builderForValue.build();
        onChanged();
      } else {
        minLotSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder mergeMinLotSize(org.fixprotocol.components.Fix.Decimal64 value) {
      if (minLotSizeBuilder_ == null) {
        if (minLotSize_ != null) {
          minLotSize_ =
            org.fixprotocol.components.Fix.Decimal64.newBuilder(minLotSize_).mergeFrom(value).buildPartial();
        } else {
          minLotSize_ = value;
        }
        onChanged();
      } else {
        minLotSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public Builder clearMinLotSize() {
      if (minLotSizeBuilder_ == null) {
        minLotSize_ = null;
        onChanged();
      } else {
        minLotSize_ = null;
        minLotSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public org.fixprotocol.components.Fix.Decimal64.Builder getMinLotSizeBuilder() {
      
      onChanged();
      return getMinLotSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    public org.fixprotocol.components.Fix.Decimal64OrBuilder getMinLotSizeOrBuilder() {
      if (minLotSizeBuilder_ != null) {
        return minLotSizeBuilder_.getMessageOrBuilder();
      } else {
        return minLotSize_ == null ?
            org.fixprotocol.components.Fix.Decimal64.getDefaultInstance() : minLotSize_;
      }
    }
    /**
     * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder> 
        getMinLotSizeFieldBuilder() {
      if (minLotSizeBuilder_ == null) {
        minLotSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.fixprotocol.components.Fix.Decimal64, org.fixprotocol.components.Fix.Decimal64.Builder, org.fixprotocol.components.Fix.Decimal64OrBuilder>(
                getMinLotSize(),
                getParentForChildren(),
                isClean());
        minLotSize_ = null;
      }
      return minLotSizeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Common.LotTypeRules)
  }

  // @@protoc_insertion_point(class_scope:Common.LotTypeRules)
  private static final org.fixprotocol.components.LotTypeRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.LotTypeRules();
  }

  public static org.fixprotocol.components.LotTypeRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LotTypeRules>
      PARSER = new com.google.protobuf.AbstractParser<LotTypeRules>() {
    @java.lang.Override
    public LotTypeRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LotTypeRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LotTypeRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LotTypeRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.LotTypeRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

