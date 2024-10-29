// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package org.fixprotocol.components;

public interface TargetPartiesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Common.TargetParties)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyId.
   */
  java.lang.String getTargetPartyId();
  /**
   * <code>string target_party_id = 1 [(.fix.tag) = 1462, (.fix.type) = DATATYPE_STRING, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The bytes for targetPartyId.
   */
  com.google.protobuf.ByteString
      getTargetPartyIdBytes();

  /**
   * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The enum numeric value on the wire for targetPartyIdSource.
   */
  int getTargetPartyIdSourceValue();
  /**
   * <code>.Common.TargetPartyIDSourceEnum target_party_id_source = 2 [(.fix.tag) = 1463, (.fix.type) = DATATYPE_CHAR, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyIdSource.
   */
  org.fixprotocol.components.TargetPartyIDSourceEnum getTargetPartyIdSource();

  /**
   * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The enum numeric value on the wire for targetPartyRole.
   */
  int getTargetPartyRoleValue();
  /**
   * <code>.Common.TargetPartyRoleEnum target_party_role = 3 [(.fix.tag) = 1464, (.fix.type) = DATATYPE_INT, (.fix.field_added) = VERSION_FIX_5_0SP1, (.fix.field_added_ep) = 85];</code>
   * @return The targetPartyRole.
   */
  org.fixprotocol.components.TargetPartyRoleEnum getTargetPartyRole();
}