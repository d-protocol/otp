// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DerivativePutOrCallEnum}
 */
public enum DerivativePutOrCallEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DERIVATIVE_PUT_OR_CALL_UNSPECIFIED = 0;</code>
   */
  DERIVATIVE_PUT_OR_CALL_UNSPECIFIED(0),
  /**
   * <code>DERIVATIVE_PUT_OR_CALL_CALL = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  DERIVATIVE_PUT_OR_CALL_CALL(1),
  /**
   * <code>DERIVATIVE_PUT_OR_CALL_PUT = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  DERIVATIVE_PUT_OR_CALL_PUT(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DERIVATIVE_PUT_OR_CALL_UNSPECIFIED = 0;</code>
   */
  public static final int DERIVATIVE_PUT_OR_CALL_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DERIVATIVE_PUT_OR_CALL_CALL = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int DERIVATIVE_PUT_OR_CALL_CALL_VALUE = 1;
  /**
   * <code>DERIVATIVE_PUT_OR_CALL_PUT = 2 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int DERIVATIVE_PUT_OR_CALL_PUT_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DerivativePutOrCallEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DerivativePutOrCallEnum forNumber(int value) {
    switch (value) {
      case 0: return DERIVATIVE_PUT_OR_CALL_UNSPECIFIED;
      case 1: return DERIVATIVE_PUT_OR_CALL_CALL;
      case 2: return DERIVATIVE_PUT_OR_CALL_PUT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DerivativePutOrCallEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DerivativePutOrCallEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DerivativePutOrCallEnum>() {
          public DerivativePutOrCallEnum findValueByNumber(int number) {
            return DerivativePutOrCallEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(189);
  }

  private static final DerivativePutOrCallEnum[] VALUES = values();

  public static DerivativePutOrCallEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DerivativePutOrCallEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DerivativePutOrCallEnum)
}

