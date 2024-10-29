// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface InstrumentPartiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.InstrumentParties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string instrument_party_id = 1 [(.fix.tag) = 1019, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The instrumentPartyId.
   */
  java.lang.String getInstrumentPartyId();
  /**
   * <code>string instrument_party_id = 1 [(.fix.tag) = 1019, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The bytes for instrumentPartyId.
   */
  com.google.protobuf.ByteString
      getInstrumentPartyIdBytes();

  /**
   * <code>.Common.InstrumentPartyIDSourceEnum instrument_party_id_source = 2 [(.fix.tag) = 1050, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for instrumentPartyIdSource.
   */
  int getInstrumentPartyIdSourceValue();
  /**
   * <code>.Common.InstrumentPartyIDSourceEnum instrument_party_id_source = 2 [(.fix.tag) = 1050, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The instrumentPartyIdSource.
   */
  org.fixprotocol.components.InstrumentPartyIDSourceEnum getInstrumentPartyIdSource();

  /**
   * <code>.Common.InstrumentPartyRoleEnum instrument_party_role = 3 [(.fix.tag) = 1051, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The enum numeric value on the wire for instrumentPartyRole.
   */
  int getInstrumentPartyRoleValue();
  /**
   * <code>.Common.InstrumentPartyRoleEnum instrument_party_role = 3 [(.fix.tag) = 1051, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_4];</code>
   * @return The instrumentPartyRole.
   */
  org.fixprotocol.components.InstrumentPartyRoleEnum getInstrumentPartyRole();

  /**
   * <code>repeated .Common.InstrumentPtysSubGrp instrument_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.InstrumentPtysSubGrp> 
      getInstrumentPtysSubGrpList();
  /**
   * <code>repeated .Common.InstrumentPtysSubGrp instrument_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.InstrumentPtysSubGrp getInstrumentPtysSubGrp(int index);
  /**
   * <code>repeated .Common.InstrumentPtysSubGrp instrument_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getInstrumentPtysSubGrpCount();
  /**
   * <code>repeated .Common.InstrumentPtysSubGrp instrument_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.InstrumentPtysSubGrpOrBuilder> 
      getInstrumentPtysSubGrpOrBuilderList();
  /**
   * <code>repeated .Common.InstrumentPtysSubGrp instrument_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.InstrumentPtysSubGrpOrBuilder getInstrumentPtysSubGrpOrBuilder(
      int index);
}
