// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.DerivativeSymbolSfxEnum}
 */
public enum DerivativeSymbolSfxEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>DERIVATIVE_SYMBOL_SFX_UNSPECIFIED = 0;</code>
   */
  DERIVATIVE_SYMBOL_SFX_UNSPECIFIED(0),
  /**
   * <code>DERIVATIVE_SYMBOL_SFX_EUCP_WITH_LUMP_SUM_INTEREST = 1 [(.fix.enum_value) = "CD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_SYMBOL_SFX_EUCP_WITH_LUMP_SUM_INTEREST(1),
  /**
   * <code>DERIVATIVE_SYMBOL_SFX_WHEN_ISSUED = 2 [(.fix.enum_value) = "WI", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  DERIVATIVE_SYMBOL_SFX_WHEN_ISSUED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>DERIVATIVE_SYMBOL_SFX_UNSPECIFIED = 0;</code>
   */
  public static final int DERIVATIVE_SYMBOL_SFX_UNSPECIFIED_VALUE = 0;
  /**
   * <code>DERIVATIVE_SYMBOL_SFX_EUCP_WITH_LUMP_SUM_INTEREST = 1 [(.fix.enum_value) = "CD", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_SYMBOL_SFX_EUCP_WITH_LUMP_SUM_INTEREST_VALUE = 1;
  /**
   * <code>DERIVATIVE_SYMBOL_SFX_WHEN_ISSUED = 2 [(.fix.enum_value) = "WI", (.fix.enum_added) = VERSION_FIX_4_4];</code>
   */
  public static final int DERIVATIVE_SYMBOL_SFX_WHEN_ISSUED_VALUE = 2;


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
  public static DerivativeSymbolSfxEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DerivativeSymbolSfxEnum forNumber(int value) {
    switch (value) {
      case 0: return DERIVATIVE_SYMBOL_SFX_UNSPECIFIED;
      case 1: return DERIVATIVE_SYMBOL_SFX_EUCP_WITH_LUMP_SUM_INTEREST;
      case 2: return DERIVATIVE_SYMBOL_SFX_WHEN_ISSUED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DerivativeSymbolSfxEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DerivativeSymbolSfxEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DerivativeSymbolSfxEnum>() {
          public DerivativeSymbolSfxEnum findValueByNumber(int number) {
            return DerivativeSymbolSfxEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(175);
  }

  private static final DerivativeSymbolSfxEnum[] VALUES = values();

  public static DerivativeSymbolSfxEnum valueOf(
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

  private DerivativeSymbolSfxEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.DerivativeSymbolSfxEnum)
}

