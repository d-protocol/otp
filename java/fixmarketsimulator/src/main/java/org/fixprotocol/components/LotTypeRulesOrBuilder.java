// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface LotTypeRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.LotTypeRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for lotType.
   */
  int getLotTypeValue();
  /**
   * <code>.Common.LotTypeEnum lot_type = 1 [(.fix.tag) = 1093, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The lotType.
   */
  org.fixprotocol.components.LotTypeEnum getLotType();

  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the minLotSize field is set.
   */
  boolean hasMinLotSize();
  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The minLotSize.
   */
  org.fixprotocol.components.Fix.Decimal64 getMinLotSize();
  /**
   * <code>.fix.Decimal64 min_lot_size = 2 [(.fix.tag) = 1231, (.fix.type) = DATATYPE_QTY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getMinLotSizeOrBuilder();
}
