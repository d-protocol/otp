// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf type {@code Common.ExecInstRules}
 */
public  final class ExecInstRules extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Common.ExecInstRules)
    ExecInstRulesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecInstRules.newBuilder() to construct.
  private ExecInstRules(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecInstRules() {
    execInstValue_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecInstRules();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecInstRules(
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

            execInstValue_ = rawValue;
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
    return org.fixprotocol.components.Common.internal_static_Common_ExecInstRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.fixprotocol.components.Common.internal_static_Common_ExecInstRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.fixprotocol.components.ExecInstRules.class, org.fixprotocol.components.ExecInstRules.Builder.class);
  }

  public static final int EXEC_INST_VALUE_FIELD_NUMBER = 1;
  private int execInstValue_;
  /**
   * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for execInstValue.
   */
  public int getExecInstValueValue() {
    return execInstValue_;
  }
  /**
   * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The execInstValue.
   */
  public org.fixprotocol.components.ExecInstValueEnum getExecInstValue() {
    @SuppressWarnings("deprecation")
    org.fixprotocol.components.ExecInstValueEnum result = org.fixprotocol.components.ExecInstValueEnum.valueOf(execInstValue_);
    return result == null ? org.fixprotocol.components.ExecInstValueEnum.UNRECOGNIZED : result;
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
    if (execInstValue_ != org.fixprotocol.components.ExecInstValueEnum.EXEC_INST_VALUE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, execInstValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (execInstValue_ != org.fixprotocol.components.ExecInstValueEnum.EXEC_INST_VALUE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, execInstValue_);
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
    if (!(obj instanceof org.fixprotocol.components.ExecInstRules)) {
      return super.equals(obj);
    }
    org.fixprotocol.components.ExecInstRules other = (org.fixprotocol.components.ExecInstRules) obj;

    if (execInstValue_ != other.execInstValue_) return false;
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
    hash = (37 * hash) + EXEC_INST_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + execInstValue_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.fixprotocol.components.ExecInstRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.ExecInstRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.ExecInstRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.fixprotocol.components.ExecInstRules parseFrom(
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
  public static Builder newBuilder(org.fixprotocol.components.ExecInstRules prototype) {
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
   * Protobuf type {@code Common.ExecInstRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Common.ExecInstRules)
      org.fixprotocol.components.ExecInstRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.fixprotocol.components.Common.internal_static_Common_ExecInstRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.fixprotocol.components.Common.internal_static_Common_ExecInstRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.fixprotocol.components.ExecInstRules.class, org.fixprotocol.components.ExecInstRules.Builder.class);
    }

    // Construct using org.fixprotocol.components.ExecInstRules.newBuilder()
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
      execInstValue_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.fixprotocol.components.Common.internal_static_Common_ExecInstRules_descriptor;
    }

    @java.lang.Override
    public org.fixprotocol.components.ExecInstRules getDefaultInstanceForType() {
      return org.fixprotocol.components.ExecInstRules.getDefaultInstance();
    }

    @java.lang.Override
    public org.fixprotocol.components.ExecInstRules build() {
      org.fixprotocol.components.ExecInstRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.fixprotocol.components.ExecInstRules buildPartial() {
      org.fixprotocol.components.ExecInstRules result = new org.fixprotocol.components.ExecInstRules(this);
      result.execInstValue_ = execInstValue_;
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
      if (other instanceof org.fixprotocol.components.ExecInstRules) {
        return mergeFrom((org.fixprotocol.components.ExecInstRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.fixprotocol.components.ExecInstRules other) {
      if (other == org.fixprotocol.components.ExecInstRules.getDefaultInstance()) return this;
      if (other.execInstValue_ != 0) {
        setExecInstValueValue(other.getExecInstValueValue());
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
      org.fixprotocol.components.ExecInstRules parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.fixprotocol.components.ExecInstRules) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int execInstValue_ = 0;
    /**
     * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The enum numeric value on the wire for execInstValue.
     */
    public int getExecInstValueValue() {
      return execInstValue_;
    }
    /**
     * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The enum numeric value on the wire for execInstValue to set.
     * @return This builder for chaining.
     */
    public Builder setExecInstValueValue(int value) {
      execInstValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return The execInstValue.
     */
    public org.fixprotocol.components.ExecInstValueEnum getExecInstValue() {
      @SuppressWarnings("deprecation")
      org.fixprotocol.components.ExecInstValueEnum result = org.fixprotocol.components.ExecInstValueEnum.valueOf(execInstValue_);
      return result == null ? org.fixprotocol.components.ExecInstValueEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @param value The execInstValue to set.
     * @return This builder for chaining.
     */
    public Builder setExecInstValue(org.fixprotocol.components.ExecInstValueEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      execInstValue_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Common.ExecInstValueEnum exec_inst_value = 1 [(.fix.tag) = 1308, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
     * @return This builder for chaining.
     */
    public Builder clearExecInstValue() {
      
      execInstValue_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Common.ExecInstRules)
  }

  // @@protoc_insertion_point(class_scope:Common.ExecInstRules)
  private static final org.fixprotocol.components.ExecInstRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.fixprotocol.components.ExecInstRules();
  }

  public static org.fixprotocol.components.ExecInstRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecInstRules>
      PARSER = new com.google.protobuf.AbstractParser<ExecInstRules>() {
    @java.lang.Override
    public ExecInstRules parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecInstRules(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecInstRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecInstRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.fixprotocol.components.ExecInstRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

