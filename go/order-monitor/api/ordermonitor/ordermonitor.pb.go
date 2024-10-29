// Code generated by protoc-gen-go. DO NOT EDIT.
// source: ordermonitor.proto

package ordermonitor

import (
	context "context"
	fmt "fmt"
	"github.com/ettec/otp-common/model"
	proto "github.com/golang/protobuf/proto"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
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

type CancelAllOrdersForOriginatorIdParams struct {
	OriginatorId         string   `protobuf:"bytes,1,opt,name=originatorId,proto3" json:"originatorId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CancelAllOrdersForOriginatorIdParams) Reset()         { *m = CancelAllOrdersForOriginatorIdParams{} }
func (m *CancelAllOrdersForOriginatorIdParams) String() string { return proto.CompactTextString(m) }
func (*CancelAllOrdersForOriginatorIdParams) ProtoMessage()    {}
func (*CancelAllOrdersForOriginatorIdParams) Descriptor() ([]byte, []int) {
	return fileDescriptor_c65b7020bfdcf3d2, []int{0}
}

func (m *CancelAllOrdersForOriginatorIdParams) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CancelAllOrdersForOriginatorIdParams.Unmarshal(m, b)
}
func (m *CancelAllOrdersForOriginatorIdParams) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CancelAllOrdersForOriginatorIdParams.Marshal(b, m, deterministic)
}
func (m *CancelAllOrdersForOriginatorIdParams) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CancelAllOrdersForOriginatorIdParams.Merge(m, src)
}
func (m *CancelAllOrdersForOriginatorIdParams) XXX_Size() int {
	return xxx_messageInfo_CancelAllOrdersForOriginatorIdParams.Size(m)
}
func (m *CancelAllOrdersForOriginatorIdParams) XXX_DiscardUnknown() {
	xxx_messageInfo_CancelAllOrdersForOriginatorIdParams.DiscardUnknown(m)
}

var xxx_messageInfo_CancelAllOrdersForOriginatorIdParams proto.InternalMessageInfo

func (m *CancelAllOrdersForOriginatorIdParams) GetOriginatorId() string {
	if m != nil {
		return m.OriginatorId
	}
	return ""
}

func init() {
	proto.RegisterType((*CancelAllOrdersForOriginatorIdParams)(nil), "ordermonitor.CancelAllOrdersForOriginatorIdParams")
}

func init() { proto.RegisterFile("ordermonitor.proto", fileDescriptor_c65b7020bfdcf3d2) }

var fileDescriptor_c65b7020bfdcf3d2 = []byte{
	// 159 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0xca, 0x2f, 0x4a, 0x49,
	0x2d, 0xca, 0xcd, 0xcf, 0xcb, 0x2c, 0xc9, 0x2f, 0xd2, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2,
	0x41, 0x16, 0x93, 0x12, 0xcc, 0xcd, 0x4f, 0x49, 0xcd, 0x49, 0xce, 0xcf, 0xcd, 0xcd, 0xcf, 0x83,
	0x28, 0x50, 0xf2, 0xe2, 0x52, 0x71, 0x4e, 0xcc, 0x4b, 0x4e, 0xcd, 0x71, 0xcc, 0xc9, 0xf1, 0x07,
	0xa9, 0x2d, 0x76, 0xcb, 0x2f, 0xf2, 0x2f, 0xca, 0x4c, 0xcf, 0xcc, 0x4b, 0x2c, 0xc9, 0x2f, 0xf2,
	0x4c, 0x09, 0x48, 0x2c, 0x4a, 0xcc, 0x2d, 0x16, 0x52, 0xe2, 0xe2, 0xc9, 0x47, 0x12, 0x95, 0x60,
	0x54, 0x60, 0xd4, 0xe0, 0x0c, 0x42, 0x11, 0x33, 0x2a, 0xe1, 0xe2, 0x01, 0x1b, 0xe1, 0x0b, 0xb1,
	0x4e, 0x28, 0x85, 0x4b, 0x0e, 0xbf, 0xd9, 0x42, 0x46, 0x7a, 0x28, 0x6e, 0x26, 0xc6, 0x25, 0x52,
	0x3c, 0x7a, 0x60, 0x5f, 0xe8, 0xb9, 0xe6, 0x16, 0x94, 0x54, 0x2a, 0x31, 0x24, 0xb1, 0x81, 0x3d,
	0x62, 0x0c, 0x08, 0x00, 0x00, 0xff, 0xff, 0x3f, 0x0b, 0xc4, 0xd9, 0xff, 0x00, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// OrderMonitorClient is the client API for OrderMonitor service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type OrderMonitorClient interface {
	CancelAllOrdersForOriginatorId(ctx context.Context, in *CancelAllOrdersForOriginatorIdParams, opts ...grpc.CallOption) (*model.Empty, error)
}

type orderMonitorClient struct {
	cc *grpc.ClientConn
}

func NewOrderMonitorClient(cc *grpc.ClientConn) OrderMonitorClient {
	return &orderMonitorClient{cc}
}

func (c *orderMonitorClient) CancelAllOrdersForOriginatorId(ctx context.Context, in *CancelAllOrdersForOriginatorIdParams, opts ...grpc.CallOption) (*model.Empty, error) {
	out := new(model.Empty)
	err := c.cc.Invoke(ctx, "/ordermonitor.OrderMonitor/CancelAllOrdersForOriginatorId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OrderMonitorServer is the server API for OrderMonitor service.
type OrderMonitorServer interface {
	CancelAllOrdersForOriginatorId(context.Context, *CancelAllOrdersForOriginatorIdParams) (*model.Empty, error)
}

// UnimplementedOrderMonitorServer can be embedded to have forward compatible implementations.
type UnimplementedOrderMonitorServer struct {
}

func (*UnimplementedOrderMonitorServer) CancelAllOrdersForOriginatorId(ctx context.Context, req *CancelAllOrdersForOriginatorIdParams) (*model.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CancelAllOrdersForOriginatorId not implemented")
}

func RegisterOrderMonitorServer(s *grpc.Server, srv OrderMonitorServer) {
	s.RegisterService(&_OrderMonitor_serviceDesc, srv)
}

func _OrderMonitor_CancelAllOrdersForOriginatorId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CancelAllOrdersForOriginatorIdParams)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrderMonitorServer).CancelAllOrdersForOriginatorId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/ordermonitor.OrderMonitor/CancelAllOrdersForOriginatorId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrderMonitorServer).CancelAllOrdersForOriginatorId(ctx, req.(*CancelAllOrdersForOriginatorIdParams))
	}
	return interceptor(ctx, in, info, handler)
}

var _OrderMonitor_serviceDesc = grpc.ServiceDesc{
	ServiceName: "ordermonitor.OrderMonitor",
	HandlerType: (*OrderMonitorServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CancelAllOrdersForOriginatorId",
			Handler:    _OrderMonitor_CancelAllOrdersForOriginatorId_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "ordermonitor.proto",
}
