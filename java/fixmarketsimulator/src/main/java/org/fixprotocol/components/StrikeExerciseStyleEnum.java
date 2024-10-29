// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

/**
 * Protobuf enum {@code Common.StrikeExerciseStyleEnum}
 */
public enum StrikeExerciseStyleEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STRIKE_EXERCISE_STYLE_UNSPECIFIED = 0;</code>
   */
  STRIKE_EXERCISE_STYLE_UNSPECIFIED(0),
  /**
   * <code>STRIKE_EXERCISE_STYLE_AMERICAN = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  STRIKE_EXERCISE_STYLE_AMERICAN(1),
  /**
   * <code>STRIKE_EXERCISE_STYLE_BERMUDA = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  STRIKE_EXERCISE_STYLE_BERMUDA(2),
  /**
   * <code>STRIKE_EXERCISE_STYLE_EUROPEAN = 3 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  STRIKE_EXERCISE_STYLE_EUROPEAN(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STRIKE_EXERCISE_STYLE_UNSPECIFIED = 0;</code>
   */
  public static final int STRIKE_EXERCISE_STYLE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>STRIKE_EXERCISE_STYLE_AMERICAN = 1 [(.fix.enum_value) = "1", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int STRIKE_EXERCISE_STYLE_AMERICAN_VALUE = 1;
  /**
   * <code>STRIKE_EXERCISE_STYLE_BERMUDA = 2 [(.fix.enum_value) = "2", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int STRIKE_EXERCISE_STYLE_BERMUDA_VALUE = 2;
  /**
   * <code>STRIKE_EXERCISE_STYLE_EUROPEAN = 3 [(.fix.enum_value) = "0", (.fix.enum_added) = VERSION_FIX_5_0, (.fix.enum_added_ep) = 52];</code>
   */
  public static final int STRIKE_EXERCISE_STYLE_EUROPEAN_VALUE = 3;


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
  public static StrikeExerciseStyleEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StrikeExerciseStyleEnum forNumber(int value) {
    switch (value) {
      case 0: return STRIKE_EXERCISE_STYLE_UNSPECIFIED;
      case 1: return STRIKE_EXERCISE_STYLE_AMERICAN;
      case 2: return STRIKE_EXERCISE_STYLE_BERMUDA;
      case 3: return STRIKE_EXERCISE_STYLE_EUROPEAN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StrikeExerciseStyleEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StrikeExerciseStyleEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StrikeExerciseStyleEnum>() {
          public StrikeExerciseStyleEnum findValueByNumber(int number) {
            return StrikeExerciseStyleEnum.forNumber(number);
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
    return org.fixprotocol.components.Common.getDescriptor().getEnumTypes().get(154);
  }

  private static final StrikeExerciseStyleEnum[] VALUES = values();

  public static StrikeExerciseStyleEnum valueOf(
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

  private StrikeExerciseStyleEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Common.StrikeExerciseStyleEnum)
}

