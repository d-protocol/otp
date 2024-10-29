// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface NestedPartiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.NestedParties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nested_party_id = 1 [(.fix.tag) = 524, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The nestedPartyId.
   */
  java.lang.String getNestedPartyId();
  /**
   * <code>string nested_party_id = 1 [(.fix.tag) = 524, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The bytes for nestedPartyId.
   */
  com.google.protobuf.ByteString
      getNestedPartyIdBytes();

  /**
   * <code>.Common.NestedPartyIDSourceEnum nested_party_id_source = 2 [(.fix.tag) = 525, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The enum numeric value on the wire for nestedPartyIdSource.
   */
  int getNestedPartyIdSourceValue();
  /**
   * <code>.Common.NestedPartyIDSourceEnum nested_party_id_source = 2 [(.fix.tag) = 525, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The nestedPartyIdSource.
   */
  org.fixprotocol.components.NestedPartyIDSourceEnum getNestedPartyIdSource();

  /**
   * <code>.Common.NestedPartyRoleEnum nested_party_role = 3 [(.fix.tag) = 538, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The enum numeric value on the wire for nestedPartyRole.
   */
  int getNestedPartyRoleValue();
  /**
   * <code>.Common.NestedPartyRoleEnum nested_party_role = 3 [(.fix.tag) = 538, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_4_3];</code>
   * @return The nestedPartyRole.
   */
  org.fixprotocol.components.NestedPartyRoleEnum getNestedPartyRole();

  /**
   * <code>repeated .Common.NstdPtysSubGrp nstd_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<org.fixprotocol.components.NstdPtysSubGrp> 
      getNstdPtysSubGrpList();
  /**
   * <code>repeated .Common.NstdPtysSubGrp nstd_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NstdPtysSubGrp getNstdPtysSubGrp(int index);
  /**
   * <code>repeated .Common.NstdPtysSubGrp nstd_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  int getNstdPtysSubGrpCount();
  /**
   * <code>repeated .Common.NstdPtysSubGrp nstd_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  java.util.List<? extends org.fixprotocol.components.NstdPtysSubGrpOrBuilder> 
      getNstdPtysSubGrpOrBuilderList();
  /**
   * <code>repeated .Common.NstdPtysSubGrp nstd_ptys_sub_grp = 4 [(.fix.field_added) = VERSION_FIX_4_4];</code>
   */
  org.fixprotocol.components.NstdPtysSubGrpOrBuilder getNstdPtysSubGrpOrBuilder(
      int index);
}
