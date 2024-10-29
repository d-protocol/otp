// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface ComplexEventsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.ComplexEvents)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Common.ComplexEventDates complex_event_dates = 1 [(.fix.field_added) = VERSION_FIX_5_0SP1];</code>
   */
  java.util.List<org.fixprotocol.components.ComplexEventDates> 
      getComplexEventDatesList();
  /**
   * <code>repeated .Common.ComplexEventDates complex_event_dates = 1 [(.fix.field_added) = VERSION_FIX_5_0SP1];</code>
   */
  org.fixprotocol.components.ComplexEventDates getComplexEventDates(int index);
  /**
   * <code>repeated .Common.ComplexEventDates complex_event_dates = 1 [(.fix.field_added) = VERSION_FIX_5_0SP1];</code>
   */
  int getComplexEventDatesCount();
  /**
   * <code>repeated .Common.ComplexEventDates complex_event_dates = 1 [(.fix.field_added) = VERSION_FIX_5_0SP1];</code>
   */
  java.util.List<? extends org.fixprotocol.components.ComplexEventDatesOrBuilder> 
      getComplexEventDatesOrBuilderList();
  /**
   * <code>repeated .Common.ComplexEventDates complex_event_dates = 1 [(.fix.field_added) = VERSION_FIX_5_0SP1];</code>
   */
  org.fixprotocol.components.ComplexEventDatesOrBuilder getComplexEventDatesOrBuilder(
      int index);

  /**
   * <code>.Common.ComplexEventConditionEnum complex_event_condition = 2 [(.fix.tag) = 1490, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The enum numeric value on the wire for complexEventCondition.
   */
  int getComplexEventConditionValue();
  /**
   * <code>.Common.ComplexEventConditionEnum complex_event_condition = 2 [(.fix.tag) = 1490, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventCondition.
   */
  org.fixprotocol.components.ComplexEventConditionEnum getComplexEventCondition();

  /**
   * <code>.fix.Decimal64 complex_event_price = 3 [(.fix.tag) = 1486, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return Whether the complexEventPrice field is set.
   */
  boolean hasComplexEventPrice();
  /**
   * <code>.fix.Decimal64 complex_event_price = 3 [(.fix.tag) = 1486, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventPrice.
   */
  org.fixprotocol.components.Fix.Decimal64 getComplexEventPrice();
  /**
   * <code>.fix.Decimal64 complex_event_price = 3 [(.fix.tag) = 1486, (.fix.type) = DATATYPE_PRICE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getComplexEventPriceOrBuilder();

  /**
   * <code>.Common.ComplexEventPriceBoundaryMethodEnum complex_event_price_boundary_method = 4 [(.fix.tag) = 1487, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The enum numeric value on the wire for complexEventPriceBoundaryMethod.
   */
  int getComplexEventPriceBoundaryMethodValue();
  /**
   * <code>.Common.ComplexEventPriceBoundaryMethodEnum complex_event_price_boundary_method = 4 [(.fix.tag) = 1487, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventPriceBoundaryMethod.
   */
  org.fixprotocol.components.ComplexEventPriceBoundaryMethodEnum getComplexEventPriceBoundaryMethod();

  /**
   * <code>.fix.Decimal64 complex_event_price_boundary_precision = 5 [(.fix.tag) = 1488, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return Whether the complexEventPriceBoundaryPrecision field is set.
   */
  boolean hasComplexEventPriceBoundaryPrecision();
  /**
   * <code>.fix.Decimal64 complex_event_price_boundary_precision = 5 [(.fix.tag) = 1488, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventPriceBoundaryPrecision.
   */
  org.fixprotocol.components.Fix.Decimal64 getComplexEventPriceBoundaryPrecision();
  /**
   * <code>.fix.Decimal64 complex_event_price_boundary_precision = 5 [(.fix.tag) = 1488, (.fix.type) = DATATYPE_PERCENTAGE, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getComplexEventPriceBoundaryPrecisionOrBuilder();

  /**
   * <code>.Common.ComplexEventPriceTimeTypeEnum complex_event_price_time_type = 6 [(.fix.tag) = 1489, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The enum numeric value on the wire for complexEventPriceTimeType.
   */
  int getComplexEventPriceTimeTypeValue();
  /**
   * <code>.Common.ComplexEventPriceTimeTypeEnum complex_event_price_time_type = 6 [(.fix.tag) = 1489, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventPriceTimeType.
   */
  org.fixprotocol.components.ComplexEventPriceTimeTypeEnum getComplexEventPriceTimeType();

  /**
   * <code>.Common.ComplexEventTypeEnum complex_event_type = 7 [(.fix.tag) = 1484, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The enum numeric value on the wire for complexEventType.
   */
  int getComplexEventTypeValue();
  /**
   * <code>.Common.ComplexEventTypeEnum complex_event_type = 7 [(.fix.tag) = 1484, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexEventType.
   */
  org.fixprotocol.components.ComplexEventTypeEnum getComplexEventType();

  /**
   * <code>.fix.Decimal64 complex_opt_payout_amount = 8 [(.fix.tag) = 1485, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return Whether the complexOptPayoutAmount field is set.
   */
  boolean hasComplexOptPayoutAmount();
  /**
   * <code>.fix.Decimal64 complex_opt_payout_amount = 8 [(.fix.tag) = 1485, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   * @return The complexOptPayoutAmount.
   */
  org.fixprotocol.components.Fix.Decimal64 getComplexOptPayoutAmount();
  /**
   * <code>.fix.Decimal64 complex_opt_payout_amount = 8 [(.fix.tag) = 1485, (.fix.type) = DATATYPE_AMT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 92];</code>
   */
  org.fixprotocol.components.Fix.Decimal64OrBuilder getComplexOptPayoutAmountOrBuilder();
}
