// Code generated by protoc-gen-go. DO NOT EDIT.
// source: meta.proto

package meta

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	descriptor "github.com/golang/protobuf/protoc-gen-go/descriptor"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type TimeUnitEnum int32

const (
	TimeUnitEnum_TIME_UNIT_UNSPECIFIED  TimeUnitEnum = 0
	TimeUnitEnum_TIME_UNIT_DAYS         TimeUnitEnum = 1
	TimeUnitEnum_TIME_UNIT_SECONDS      TimeUnitEnum = 2
	TimeUnitEnum_TIME_UNIT_MILLISECONDS TimeUnitEnum = 3
	TimeUnitEnum_TIME_UNIT_MICROSECONDS TimeUnitEnum = 4
	TimeUnitEnum_TIME_UNIT_NANOSECONDS  TimeUnitEnum = 5
	TimeUnitEnum_TIME_UNIT_PICOSECONDS  TimeUnitEnum = 6
)

var TimeUnitEnum_name = map[int32]string{
	0: "TIME_UNIT_UNSPECIFIED",
	1: "TIME_UNIT_DAYS",
	2: "TIME_UNIT_SECONDS",
	3: "TIME_UNIT_MILLISECONDS",
	4: "TIME_UNIT_MICROSECONDS",
	5: "TIME_UNIT_NANOSECONDS",
	6: "TIME_UNIT_PICOSECONDS",
}

var TimeUnitEnum_value = map[string]int32{
	"TIME_UNIT_UNSPECIFIED":  0,
	"TIME_UNIT_DAYS":         1,
	"TIME_UNIT_SECONDS":      2,
	"TIME_UNIT_MILLISECONDS": 3,
	"TIME_UNIT_MICROSECONDS": 4,
	"TIME_UNIT_NANOSECONDS":  5,
	"TIME_UNIT_PICOSECONDS":  6,
}

func (x TimeUnitEnum) String() string {
	return proto.EnumName(TimeUnitEnum_name, int32(x))
}

func (TimeUnitEnum) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_3b5ea8fe65782bcc, []int{0}
}

type Epoch int32

const (
	Epoch_EPOCH_UNSPECIFIED Epoch = 0
	Epoch_EPOCH_MIDNIGHT    Epoch = 1
	Epoch_EPOCH_UNIX        Epoch = 2
	Epoch_EPOCH_1900        Epoch = 3
	Epoch_EPOCH_2000        Epoch = 4
)

var Epoch_name = map[int32]string{
	0: "EPOCH_UNSPECIFIED",
	1: "EPOCH_MIDNIGHT",
	2: "EPOCH_UNIX",
	3: "EPOCH_1900",
	4: "EPOCH_2000",
}

var Epoch_value = map[string]int32{
	"EPOCH_UNSPECIFIED": 0,
	"EPOCH_MIDNIGHT":    1,
	"EPOCH_UNIX":        2,
	"EPOCH_1900":        3,
	"EPOCH_2000":        4,
}

func (x Epoch) String() string {
	return proto.EnumName(Epoch_name, int32(x))
}

func (Epoch) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_3b5ea8fe65782bcc, []int{1}
}

var E_TimeUnit = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*TimeUnitEnum)(nil),
	Field:         51001,
	Name:          "meta.time_unit",
	Tag:           "varint,51001,opt,name=time_unit,enum=meta.TimeUnitEnum",
	Filename:      "meta.proto",
}

var E_Epoch = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*Epoch)(nil),
	Field:         51002,
	Name:          "meta.epoch",
	Tag:           "varint,51002,opt,name=epoch,enum=meta.Epoch",
	Filename:      "meta.proto",
}

var E_Exponent = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*int32)(nil),
	Field:         51003,
	Name:          "meta.exponent",
	Tag:           "fixed32,51003,opt,name=exponent",
	Filename:      "meta.proto",
}

var E_MinLen = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*uint32)(nil),
	Field:         51004,
	Name:          "meta.min_len",
	Tag:           "fixed32,51004,opt,name=min_len",
	Filename:      "meta.proto",
}

var E_MaxLen = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*uint32)(nil),
	Field:         51005,
	Name:          "meta.max_len",
	Tag:           "fixed32,51005,opt,name=max_len",
	Filename:      "meta.proto",
}

var E_MinValue = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*int64)(nil),
	Field:         51006,
	Name:          "meta.min_value",
	Tag:           "fixed64,51006,opt,name=min_value",
	Filename:      "meta.proto",
}

var E_MaxValue = &proto.ExtensionDesc{
	ExtendedType:  (*descriptor.FieldOptions)(nil),
	ExtensionType: (*int64)(nil),
	Field:         51007,
	Name:          "meta.max_value",
	Tag:           "fixed64,51007,opt,name=max_value",
	Filename:      "meta.proto",
}

func init() {
	proto.RegisterEnum("meta.TimeUnitEnum", TimeUnitEnum_name, TimeUnitEnum_value)
	proto.RegisterEnum("meta.Epoch", Epoch_name, Epoch_value)
	proto.RegisterExtension(E_TimeUnit)
	proto.RegisterExtension(E_Epoch)
	proto.RegisterExtension(E_Exponent)
	proto.RegisterExtension(E_MinLen)
	proto.RegisterExtension(E_MaxLen)
	proto.RegisterExtension(E_MinValue)
	proto.RegisterExtension(E_MaxValue)
}

func init() { proto.RegisterFile("meta.proto", fileDescriptor_3b5ea8fe65782bcc) }

var fileDescriptor_3b5ea8fe65782bcc = []byte{
	// 429 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x93, 0xcf, 0x6e, 0xd3, 0x40,
	0x10, 0xc6, 0x49, 0xf3, 0xa7, 0xe9, 0x80, 0xc2, 0xb2, 0x52, 0x11, 0x44, 0x42, 0xea, 0xb1, 0xea,
	0xc1, 0x35, 0xe5, 0x02, 0x81, 0x4b, 0xe3, 0xb8, 0x74, 0xa5, 0xc4, 0x89, 0x1c, 0x07, 0x01, 0x17,
	0xcb, 0x71, 0xb7, 0x61, 0x25, 0xef, 0xae, 0xe5, 0xac, 0x91, 0x9f, 0x82, 0xf7, 0xe1, 0xbf, 0xc4,
	0x93, 0x21, 0xaf, 0x6b, 0x9b, 0xd2, 0x83, 0x73, 0xf3, 0xcc, 0x37, 0xbf, 0x99, 0xcf, 0x9f, 0x65,
	0x00, 0x4e, 0x55, 0x60, 0xc4, 0x89, 0x54, 0x12, 0x77, 0xf2, 0xe7, 0xe1, 0xd1, 0x46, 0xca, 0x4d,
	0x44, 0x4f, 0x75, 0x6f, 0x9d, 0x5e, 0x9f, 0x5e, 0xd1, 0x6d, 0x98, 0xb0, 0x58, 0xc9, 0xa4, 0x98,
	0x3b, 0xf9, 0xd3, 0x82, 0x07, 0x1e, 0xe3, 0x74, 0x25, 0x98, 0xb2, 0x45, 0xca, 0xf1, 0x53, 0x38,
	0xf4, 0xc8, 0xcc, 0xf6, 0x57, 0x0e, 0xf1, 0xfc, 0x95, 0xb3, 0x5c, 0xd8, 0x16, 0xb9, 0x20, 0xf6,
	0x04, 0xdd, 0xc3, 0x18, 0x06, 0xb5, 0x34, 0x39, 0xff, 0xb0, 0x44, 0x2d, 0x7c, 0x08, 0x8f, 0xea,
	0xde, 0xd2, 0xb6, 0xe6, 0xce, 0x64, 0x89, 0xf6, 0xf0, 0x10, 0x1e, 0xd7, 0xed, 0x19, 0x99, 0x4e,
	0x49, 0xa9, 0xb5, 0xff, 0xd7, 0x2c, 0x77, 0x5e, 0x6a, 0x9d, 0xdb, 0xd7, 0x9d, 0x73, 0xa7, 0x92,
	0xba, 0xb7, 0xa5, 0x05, 0xb1, 0x2a, 0xa9, 0x77, 0xb2, 0x86, 0xae, 0x1d, 0xcb, 0xf0, 0x53, 0xee,
	0xc6, 0x5e, 0xcc, 0xad, 0xcb, 0xbb, 0xc6, 0x8b, 0xf6, 0x8c, 0x4c, 0x1c, 0xf2, 0xf6, 0xd2, 0x43,
	0x2d, 0x3c, 0x00, 0x28, 0x47, 0xc9, 0x7b, 0xb4, 0x57, 0xd7, 0xcf, 0x5f, 0x99, 0x26, 0x6a, 0xd7,
	0xf5, 0x99, 0x69, 0x9a, 0xa8, 0x33, 0x5a, 0xc0, 0x81, 0x62, 0x9c, 0xfa, 0xa9, 0x60, 0x0a, 0x3f,
	0x33, 0x8a, 0x60, 0x8d, 0x32, 0x58, 0xe3, 0x82, 0xd1, 0xe8, 0x6a, 0x1e, 0x2b, 0x26, 0xc5, 0xf6,
	0xc9, 0xd7, 0x2f, 0xed, 0xa3, 0xd6, 0xf1, 0xe0, 0x0c, 0x1b, 0xfa, 0x8b, 0xfc, 0x9b, 0xaf, 0xdb,
	0x57, 0x37, 0xd5, 0x68, 0x0c, 0x5d, 0xaa, 0x5d, 0x37, 0x6c, 0xfb, 0x76, 0xb3, 0xed, 0x7e, 0xb1,
	0x4d, 0xbf, 0xa9, 0x5b, 0xa0, 0xa3, 0xd7, 0xd0, 0xa7, 0x59, 0x2c, 0x05, 0x15, 0x8d, 0xa6, 0xbe,
	0xeb, 0x35, 0x0f, 0xdd, 0x0a, 0x18, 0xbd, 0x84, 0x7d, 0xce, 0x84, 0x1f, 0x51, 0xd1, 0xc4, 0xfe,
	0xd0, 0xec, 0xbe, 0xdb, 0xe3, 0x4c, 0x4c, 0xa9, 0xd0, 0x64, 0x90, 0xed, 0x42, 0xfe, 0xac, 0xc8,
	0x20, 0xcb, 0xc9, 0x37, 0x70, 0x90, 0xdf, 0xfc, 0x1c, 0x44, 0x29, 0x6d, 0x62, 0x7f, 0x69, 0x16,
	0xb9, 0x7d, 0xce, 0xc4, 0xbb, 0x1c, 0xd0, 0x74, 0x90, 0xed, 0x46, 0xff, 0xae, 0xe8, 0x20, 0xd3,
	0xf4, 0xf8, 0x18, 0x86, 0x32, 0xd9, 0x18, 0xd7, 0x2c, 0xd3, 0x44, 0x28, 0x23, 0x23, 0x94, 0xbc,
	0x08, 0x63, 0x3b, 0xee, 0xcc, 0xa8, 0x0a, 0x3e, 0xea, 0xff, 0x66, 0xdd, 0xd3, 0x03, 0x2f, 0xfe,
	0x06, 0x00, 0x00, 0xff, 0xff, 0xf7, 0x55, 0xfe, 0xb4, 0x52, 0x03, 0x00, 0x00,
}
