// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface RelSymDerivSecUpdGrpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.RelSymDerivSecUpdGrp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Common.CorporateActionEnum corporate_action = 1 [(.fix.tag) = 292, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return A list containing the corporateAction.
   */
  java.util.List<org.fixprotocol.components.CorporateActionEnum> getCorporateActionList();
  /**
   * <code>repeated .Common.CorporateActionEnum corporate_action = 1 [(.fix.tag) = 292, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The count of corporateAction.
   */
  int getCorporateActionCount();
  /**
   * <code>repeated .Common.CorporateActionEnum corporate_action = 1 [(.fix.tag) = 292, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @param index The index of the element to return.
   * @return The corporateAction at the given index.
   */
  org.fixprotocol.components.CorporateActionEnum getCorporateAction(int index);
  /**
   * <code>repeated .Common.CorporateActionEnum corporate_action = 1 [(.fix.tag) = 292, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return A list containing the enum numeric values on the wire for corporateAction.
   */
  java.util.List<java.lang.Integer>
  getCorporateActionValueList();
  /**
   * <code>repeated .Common.CorporateActionEnum corporate_action = 1 [(.fix.tag) = 292, (.fix.type) = DATATYPE_MULTIPLE_CHAR_VALUE, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of corporateAction at the given index.
   */
  int getCorporateActionValue(int index);

  /**
   * <code>string currency = 2 [(.fix.tag) = 15, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 2 [(.fix.tag) = 15, (.fix.type) = DATATYPE_CURRENCY, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string encoded_text = 3 [(.fix.tag) = 355, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The encodedText.
   */
  java.lang.String getEncodedText();
  /**
   * <code>string encoded_text = 3 [(.fix.tag) = 355, (.fix.type) = DATATYPE_DATA, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for encodedText.
   */
  com.google.protobuf.ByteString
      getEncodedTextBytes();

  /**
   * <code>sfixed64 encoded_text_len = 4 [(.fix.tag) = 354, (.fix.type) = DATATYPE_LENGTH, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The encodedTextLen.
   */
  long getEncodedTextLen();

  /**
   * <code>repeated .Common.InstrmtLegGrp instrmt_leg_grp = 5 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<org.fixprotocol.components.InstrmtLegGrp> 
      getInstrmtLegGrpList();
  /**
   * <code>repeated .Common.InstrmtLegGrp instrmt_leg_grp = 5 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.InstrmtLegGrp getInstrmtLegGrp(int index);
  /**
   * <code>repeated .Common.InstrmtLegGrp instrmt_leg_grp = 5 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  int getInstrmtLegGrpCount();
  /**
   * <code>repeated .Common.InstrmtLegGrp instrmt_leg_grp = 5 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  java.util.List<? extends org.fixprotocol.components.InstrmtLegGrpOrBuilder> 
      getInstrmtLegGrpOrBuilderList();
  /**
   * <code>repeated .Common.InstrmtLegGrp instrmt_leg_grp = 5 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.InstrmtLegGrpOrBuilder getInstrmtLegGrpOrBuilder(
      int index);

  /**
   * <code>.Common.Instrument instrument = 6 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the instrument field is set.
   */
  boolean hasInstrument();
  /**
   * <code>.Common.Instrument instrument = 6 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The instrument.
   */
  org.fixprotocol.components.Instrument getInstrument();
  /**
   * <code>.Common.Instrument instrument = 6 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.InstrumentOrBuilder getInstrumentOrBuilder();

  /**
   * <code>.Common.InstrumentExtension instrument_extension = 7 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the instrumentExtension field is set.
   */
  boolean hasInstrumentExtension();
  /**
   * <code>.Common.InstrumentExtension instrument_extension = 7 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The instrumentExtension.
   */
  org.fixprotocol.components.InstrumentExtension getInstrumentExtension();
  /**
   * <code>.Common.InstrumentExtension instrument_extension = 7 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.InstrumentExtensionOrBuilder getInstrumentExtensionOrBuilder();

  /**
   * <code>.Common.ListUpdateActionEnum list_update_action = 8 [(.fix.tag) = 1324, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The enum numeric value on the wire for listUpdateAction.
   */
  int getListUpdateActionValue();
  /**
   * <code>.Common.ListUpdateActionEnum list_update_action = 8 [(.fix.tag) = 1324, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The listUpdateAction.
   */
  org.fixprotocol.components.ListUpdateActionEnum getListUpdateAction();

  /**
   * <code>.Common.SecondaryPriceLimits secondary_price_limits = 9 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return Whether the secondaryPriceLimits field is set.
   */
  boolean hasSecondaryPriceLimits();
  /**
   * <code>.Common.SecondaryPriceLimits secondary_price_limits = 9 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The secondaryPriceLimits.
   */
  org.fixprotocol.components.SecondaryPriceLimits getSecondaryPriceLimits();
  /**
   * <code>.Common.SecondaryPriceLimits secondary_price_limits = 9 [(.fix.field_added) = VERSION_FIX_5_0];</code>
   */
  org.fixprotocol.components.SecondaryPriceLimitsOrBuilder getSecondaryPriceLimitsOrBuilder();

  /**
   * <code>string text = 10 [(.fix.tag) = 58, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 10 [(.fix.tag) = 58, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0];</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>.fix.Timestamp rel_sym_transact_time = 11 [(.fix.tag) = 1504, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   * @return Whether the relSymTransactTime field is set.
   */
  boolean hasRelSymTransactTime();
  /**
   * <code>.fix.Timestamp rel_sym_transact_time = 11 [(.fix.tag) = 1504, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   * @return The relSymTransactTime.
   */
  org.fixprotocol.components.Fix.Timestamp getRelSymTransactTime();
  /**
   * <code>.fix.Timestamp rel_sym_transact_time = 11 [(.fix.tag) = 1504, (.fix.type) = DATATYPE_UTC_TIMESTAMP, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 94];</code>
   */
  org.fixprotocol.components.Fix.TimestampOrBuilder getRelSymTransactTimeOrBuilder();
}
