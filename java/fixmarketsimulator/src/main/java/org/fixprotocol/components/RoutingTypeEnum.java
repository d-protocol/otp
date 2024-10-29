// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.RoutingTypeEnum}
 */
public enum RoutingTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ROUTING_TYPE_UNSPECIFIED = 0;</code>
   */
  ROUTING_TYPE_UNSPECIFIED(0),
  /**
   * <code>ROUTING_TYPE_BLOCK_FIRM = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  ROUTING_TYPE_BLOCK_FIRM(1),
  /**
   * <code>ROUTING_TYPE_BLOCK_LIST = 2 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  ROUTING_TYPE_BLOCK_LIST(2),
  /**
   * <code>ROUTING_TYPE_TARGET_FIRM = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  ROUTING_TYPE_TARGET_FIRM(3),
  /**
   * <code>ROUTING_TYPE_TARGET_LIST = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  ROUTING_TYPE_TARGET_LIST(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ROUTING_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ROUTING_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ROUTING_TYPE_BLOCK_FIRM = 1 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int ROUTING_TYPE_BLOCK_FIRM_VALUE = 1;
  /**
   * <code>ROUTING_TYPE_BLOCK_LIST = 2 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int ROUTING_TYPE_BLOCK_LIST_VALUE = 2;
  /**
   * <code>ROUTING_TYPE_TARGET_FIRM = 3 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int ROUTING_TYPE_TARGET_FIRM_VALUE = 3;
  /**
   * <code>ROUTING_TYPE_TARGET_LIST = 4 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int ROUTING_TYPE_TARGET_LIST_VALUE = 4;


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
  public static RoutingTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RoutingTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return ROUTING_TYPE_UNSPECIFIED;
      case 1: return ROUTING_TYPE_BLOCK_FIRM;
      case 2: return ROUTING_TYPE_BLOCK_LIST;
      case 3: return ROUTING_TYPE_TARGET_FIRM;
      case 4: return ROUTING_TYPE_TARGET_LIST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RoutingTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RoutingTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RoutingTypeEnum>() {
          public RoutingTypeEnum findValueByNumber(int number) {
            return RoutingTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(110);
  }

  private static final RoutingTypeEnum[] VALUES = values();

  public static RoutingTypeEnum valueOf(
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

  private RoutingTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.RoutingTypeEnum)
}

