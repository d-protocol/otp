// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface DiscretionInstructionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.DiscretionInstructions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.DiscretionInstEnum discretion_inst = 1 [(.fix.tag) = 388, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionInst.
   */
  int getDiscretionInstValue();
  /**
   * <code>.Common.DiscretionInstEnum discretion_inst = 1 [(.fix.tag) = 388, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionInst.
   */
  org.fixprotocol.components.DiscretionInstEnum getDiscretionInst();

  /**
   * <code>.Common.DiscretionLimitTypeEnum discretion_limit_type = 2 [(.fix.tag) = 843, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionLimitType.
   */
  int getDiscretionLimitTypeValue();
  /**
   * <code>.Common.DiscretionLimitTypeEnum discretion_limit_type = 2 [(.fix.tag) = 843, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionLimitType.
   */
  org.fixprotocol.components.DiscretionLimitTypeEnum getDiscretionLimitType();

  /**
   * <code>.Common.DiscretionMoveTypeEnum discretion_move_type = 3 [(.fix.tag) = 841, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionMoveType.
   */
  int getDiscretionMoveTypeValue();
  /**
   * <code>.Common.DiscretionMoveTypeEnum discretion_move_type = 3 [(.fix.tag) = 841, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionMoveType.
   */
  org.fixprotocol.components.DiscretionMoveTypeEnum getDiscretionMoveType();

  /**
   * <code>.Common.DiscretionOffsetTypeEnum discretion_offset_type = 4 [(.fix.tag) = 842, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionOffsetType.
   */
  int getDiscretionOffsetTypeValue();
  /**
   * <code>.Common.DiscretionOffsetTypeEnum discretion_offset_type = 4 [(.fix.tag) = 842, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionOffsetType.
   */
  org.fixprotocol.components.DiscretionOffsetTypeEnum getDiscretionOffsetType();

  /**
   * <code>.fix.Decimal64 discretion_offset_value = 5 [(.fix.tag) = 389, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return Whether the discretionOffsetValue field is set.
   */
  boolean hasDiscretionOffsetValue();
  /**
   * <code>.fix.Decimal64 discretion_offset_value = 5 [(.fix.tag) = 389, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionOffsetValue.
   */
  org.fixprotocol.components.Fix.Decimal64 getDiscretionOffsetValue();
  /**
   * <code>.fix.Decimal64 discretion_offset_value = 5 [(.fix.tag) = 389, (.fix.type) = DATATYPE_FLOAT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getDiscretionOffsetValueOrBuilder();

  /**
   * <code>.Common.DiscretionRoundDirectionEnum discretion_round_direction = 6 [(.fix.tag) = 844, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionRoundDirection.
   */
  int getDiscretionRoundDirectionValue();
  /**
   * <code>.Common.DiscretionRoundDirectionEnum discretion_round_direction = 6 [(.fix.tag) = 844, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionRoundDirection.
   */
  org.fixprotocol.components.DiscretionRoundDirectionEnum getDiscretionRoundDirection();

  /**
   * <code>.Common.DiscretionScopeEnum discretion_scope = 7 [(.fix.tag) = 846, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for discretionScope.
   */
  int getDiscretionScopeValue();
  /**
   * <code>.Common.DiscretionScopeEnum discretion_scope = 7 [(.fix.tag) = 846, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The discretionScope.
   */
  org.fixprotocol.components.DiscretionScopeEnum getDiscretionScope();
}