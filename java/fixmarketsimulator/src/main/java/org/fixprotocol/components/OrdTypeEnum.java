// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.OrdTypeEnum}
 */
public enum OrdTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ORD_TYPE_UNSPECIFIED = 0;</code>
   */
  ORD_TYPE_UNSPECIFIED(0),
  /**
   * <code>ORD_TYPE_LIMIT = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_LIMIT(1),
  /**
   * <code>ORD_TYPE_LIMIT_ON_CLOSE = 2 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_LIMIT_ON_CLOSE(2),
  /**
   * <code>ORD_TYPE_LIMIT_OR_BETTER = 3 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_4];</code>
   */
  ORD_TYPE_LIMIT_OR_BETTER(3),
  /**
   * <code>ORD_TYPE_LIMIT_WITH_OR_WITHOUT = 4 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_LIMIT_WITH_OR_WITHOUT(4),
  /**
   * <code>ORD_TYPE_MARKET = 5 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_MARKET(5),
  /**
   * <code>ORD_TYPE_MARKET_ON_CLOSE = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_MARKET_ON_CLOSE(6),
  /**
   * <code>ORD_TYPE_ON_BASIS = 7 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_ON_BASIS(7),
  /**
   * <code>ORD_TYPE_ON_CLOSE = 8 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_ON_CLOSE(8),
  /**
   * <code>ORD_TYPE_STOP = 9 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_STOP(9),
  /**
   * <code>ORD_TYPE_STOP_LIMIT = 10 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_STOP_LIMIT(10),
  /**
   * <code>ORD_TYPE_WITH_OR_WITHOUT = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  ORD_TYPE_WITH_OR_WITHOUT(11),
  /**
   * <code>ORD_TYPE_PEGGED = 12 [(.fix.enum_value) = "P", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  ORD_TYPE_PEGGED(12),
  /**
   * <code>ORD_TYPE_FOREX_MARKET = 13 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_0, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_FOREX_MARKET(13),
  /**
   * <code>ORD_TYPE_PREVIOUSLY_INDICATED = 14 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_4_0];</code>
   */
  ORD_TYPE_PREVIOUSLY_INDICATED(14),
  /**
   * <code>ORD_TYPE_PREVIOUSLY_QUOTED = 15 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_0];</code>
   */
  ORD_TYPE_PREVIOUSLY_QUOTED(15),
  /**
   * <code>ORD_TYPE_FOREX_LIMIT = 16 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_4_1, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_FOREX_LIMIT(16),
  /**
   * <code>ORD_TYPE_FOREX_PREVIOUSLY_QUOTED = 17 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_1, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_FOREX_PREVIOUSLY_QUOTED(17),
  /**
   * <code>ORD_TYPE_FOREX_SWAP = 18 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  ORD_TYPE_FOREX_SWAP(18),
  /**
   * <code>ORD_TYPE_FUNARI = 19 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  ORD_TYPE_FUNARI(19),
  /**
   * <code>ORD_TYPE_MARKET_IF_TOUCHED = 20 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_MARKET_IF_TOUCHED(20),
  /**
   * <code>ORD_TYPE_MARKET_WITH_LEFT_OVER_AS_LIMIT = 21 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_MARKET_WITH_LEFT_OVER_AS_LIMIT(21),
  /**
   * <code>ORD_TYPE_NEXT_FUND_VALUATION_POINT = 22 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_NEXT_FUND_VALUATION_POINT(22),
  /**
   * <code>ORD_TYPE_PREVIOUS_FUND_VALUATION_POINT = 23 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  ORD_TYPE_PREVIOUS_FUND_VALUATION_POINT(23),
  /**
   * <code>ORD_TYPE_COUNTER_ORDER_SELECTION = 24 [(.fix.enum_value) = "Q", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  ORD_TYPE_COUNTER_ORDER_SELECTION(24),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ORD_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ORD_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ORD_TYPE_LIMIT = 1 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_LIMIT_VALUE = 1;
  /**
   * <code>ORD_TYPE_LIMIT_ON_CLOSE = 2 [(.fix.enum_value) = "B", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_LIMIT_ON_CLOSE_VALUE = 2;
  /**
   * <code>ORD_TYPE_LIMIT_OR_BETTER = 3 [(.fix.enum_value) = "7", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_4];</code>
   */
  public static final int ORD_TYPE_LIMIT_OR_BETTER_VALUE = 3;
  /**
   * <code>ORD_TYPE_LIMIT_WITH_OR_WITHOUT = 4 [(.fix.enum_value) = "8", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_LIMIT_WITH_OR_WITHOUT_VALUE = 4;
  /**
   * <code>ORD_TYPE_MARKET = 5 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_MARKET_VALUE = 5;
  /**
   * <code>ORD_TYPE_MARKET_ON_CLOSE = 6 [(.fix.enum_value) = "5", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_MARKET_ON_CLOSE_VALUE = 6;
  /**
   * <code>ORD_TYPE_ON_BASIS = 7 [(.fix.enum_value) = "9", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_ON_BASIS_VALUE = 7;
  /**
   * <code>ORD_TYPE_ON_CLOSE = 8 [(.fix.enum_value) = "A", (.fix.enum_added) = VERSION_FIX_2_7, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_ON_CLOSE_VALUE = 8;
  /**
   * <code>ORD_TYPE_STOP = 9 [(.fix.enum_value) = "3", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_STOP_VALUE = 9;
  /**
   * <code>ORD_TYPE_STOP_LIMIT = 10 [(.fix.enum_value) = "4", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_STOP_LIMIT_VALUE = 10;
  /**
   * <code>ORD_TYPE_WITH_OR_WITHOUT = 11 [(.fix.enum_value) = "6", (.fix.enum_added) = VERSION_FIX_2_7];</code>
   */
  public static final int ORD_TYPE_WITH_OR_WITHOUT_VALUE = 11;
  /**
   * <code>ORD_TYPE_PEGGED = 12 [(.fix.enum_value) = "P", (.fix.enum_added) = VERSION_FIX_3_0];</code>
   */
  public static final int ORD_TYPE_PEGGED_VALUE = 12;
  /**
   * <code>ORD_TYPE_FOREX_MARKET = 13 [(.fix.enum_value) = "C", (.fix.enum_added) = VERSION_FIX_4_0, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_FOREX_MARKET_VALUE = 13;
  /**
   * <code>ORD_TYPE_PREVIOUSLY_INDICATED = 14 [(.fix.enum_value) = "E", (.fix.enum_added) = VERSION_FIX_4_0];</code>
   */
  public static final int ORD_TYPE_PREVIOUSLY_INDICATED_VALUE = 14;
  /**
   * <code>ORD_TYPE_PREVIOUSLY_QUOTED = 15 [(.fix.enum_value) = "D", (.fix.enum_added) = VERSION_FIX_4_0];</code>
   */
  public static final int ORD_TYPE_PREVIOUSLY_QUOTED_VALUE = 15;
  /**
   * <code>ORD_TYPE_FOREX_LIMIT = 16 [(.fix.enum_value) = "F", (.fix.enum_added) = VERSION_FIX_4_1, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_FOREX_LIMIT_VALUE = 16;
  /**
   * <code>ORD_TYPE_FOREX_PREVIOUSLY_QUOTED = 17 [(.fix.enum_value) = "H", (.fix.enum_added) = VERSION_FIX_4_1, (.fix.enum_deprecated) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_FOREX_PREVIOUSLY_QUOTED_VALUE = 17;
  /**
   * <code>ORD_TYPE_FOREX_SWAP = 18 [(.fix.enum_value) = "G", (.fix.enum_added) = VERSION_FIX_4_1];</code>
   */
  public static final int ORD_TYPE_FOREX_SWAP_VALUE = 18;
  /**
   * <code>ORD_TYPE_FUNARI = 19 [(.fix.enum_value) = "I", (.fix.enum_added) = VERSION_FIX_4_2];</code>
   */
  public static final int ORD_TYPE_FUNARI_VALUE = 19;
  /**
   * <code>ORD_TYPE_MARKET_IF_TOUCHED = 20 [(.fix.enum_value) = "J", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_MARKET_IF_TOUCHED_VALUE = 20;
  /**
   * <code>ORD_TYPE_MARKET_WITH_LEFT_OVER_AS_LIMIT = 21 [(.fix.enum_value) = "K", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_MARKET_WITH_LEFT_OVER_AS_LIMIT_VALUE = 21;
  /**
   * <code>ORD_TYPE_NEXT_FUND_VALUATION_POINT = 22 [(.fix.enum_value) = "M", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_NEXT_FUND_VALUATION_POINT_VALUE = 22;
  /**
   * <code>ORD_TYPE_PREVIOUS_FUND_VALUATION_POINT = 23 [(.fix.enum_value) = "L", (.fix.enum_added) = VERSION_FIX_4_3];</code>
   */
  public static final int ORD_TYPE_PREVIOUS_FUND_VALUATION_POINT_VALUE = 23;
  /**
   * <code>ORD_TYPE_COUNTER_ORDER_SELECTION = 24 [(.fix.enum_value) = "Q", (.fix.enum_added) = VERSION_FIX_4_4, (.fix.enum_added_ep) = 22];</code>
   */
  public static final int ORD_TYPE_COUNTER_ORDER_SELECTION_VALUE = 24;


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
  public static OrdTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static OrdTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return ORD_TYPE_UNSPECIFIED;
      case 1: return ORD_TYPE_LIMIT;
      case 2: return ORD_TYPE_LIMIT_ON_CLOSE;
      case 3: return ORD_TYPE_LIMIT_OR_BETTER;
      case 4: return ORD_TYPE_LIMIT_WITH_OR_WITHOUT;
      case 5: return ORD_TYPE_MARKET;
      case 6: return ORD_TYPE_MARKET_ON_CLOSE;
      case 7: return ORD_TYPE_ON_BASIS;
      case 8: return ORD_TYPE_ON_CLOSE;
      case 9: return ORD_TYPE_STOP;
      case 10: return ORD_TYPE_STOP_LIMIT;
      case 11: return ORD_TYPE_WITH_OR_WITHOUT;
      case 12: return ORD_TYPE_PEGGED;
      case 13: return ORD_TYPE_FOREX_MARKET;
      case 14: return ORD_TYPE_PREVIOUSLY_INDICATED;
      case 15: return ORD_TYPE_PREVIOUSLY_QUOTED;
      case 16: return ORD_TYPE_FOREX_LIMIT;
      case 17: return ORD_TYPE_FOREX_PREVIOUSLY_QUOTED;
      case 18: return ORD_TYPE_FOREX_SWAP;
      case 19: return ORD_TYPE_FUNARI;
      case 20: return ORD_TYPE_MARKET_IF_TOUCHED;
      case 21: return ORD_TYPE_MARKET_WITH_LEFT_OVER_AS_LIMIT;
      case 22: return ORD_TYPE_NEXT_FUND_VALUATION_POINT;
      case 23: return ORD_TYPE_PREVIOUS_FUND_VALUATION_POINT;
      case 24: return ORD_TYPE_COUNTER_ORDER_SELECTION;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OrdTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OrdTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OrdTypeEnum>() {
          public OrdTypeEnum findValueByNumber(int number) {
            return OrdTypeEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(164);
  }

  private static final OrdTypeEnum[] VALUES = values();

  public static OrdTypeEnum valueOf(
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

  private OrdTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.OrdTypeEnum)
}

