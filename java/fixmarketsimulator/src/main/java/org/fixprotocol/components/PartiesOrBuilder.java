// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface PartiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.Parties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string party_id = 1 [(.fix.tag) = 448, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The partyId.
   */
  java.lang.String getPartyId();
  /**
   * <code>string party_id = 1 [(.fix.tag) = 448, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The bytes for partyId.
   */
  com.google.protobuf.ByteString
      getPartyIdBytes();

  /**
   * <code>.Common.PartyIDSourceEnum party_id_source = 2 [(.fix.tag) = 447, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The enum numeric value on the wire for partyIdSource.
   */
  int getPartyIdSourceValue();
  /**
   * <code>.Common.PartyIDSourceEnum party_id_source = 2 [(.fix.tag) = 447, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The partyIdSource.
   */
  org.fixprotocol.components.PartyIDSourceEnum getPartyIdSource();

  /**
   * <code>.Common.PartyRoleEnum party_role = 3 [(.fix.tag) = 452, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The enum numeric value on the wire for partyRole.
   */
  int getPartyRoleValue();
  /**
   * <code>.Common.PartyRoleEnum party_role = 3 [(.fix.tag) = 452, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The partyRole.
   */
  org.fixprotocol.components.PartyRoleEnum getPartyRole();

  /**
   * <code>repeated .Common.PtysSubGrp ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.PtysSubGrp> 
      getPtysSubGrpList();
  /**
   * <code>repeated .Common.PtysSubGrp ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.PtysSubGrp getPtysSubGrp(int index);
  /**
   * <code>repeated .Common.PtysSubGrp ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getPtysSubGrpCount();
  /**
   * <code>repeated .Common.PtysSubGrp ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.PtysSubGrpOrBuilder> 
      getPtysSubGrpOrBuilderList();
  /**
   * <code>repeated .Common.PtysSubGrp ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.PtysSubGrpOrBuilder getPtysSubGrpOrBuilder(
      int index);
}
