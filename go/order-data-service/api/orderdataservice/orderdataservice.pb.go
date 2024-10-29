// Code generated by protoc-gen-go. DO NOT EDIT.
// source: orderdataservice.proto

package model

import (
	"github.com/ettec/otp-common/model"
	context "context"
	fmt "fmt"
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

type SubscribeToOrdersWithRootOriginatorIdArgs struct {
	RootOriginatorId     string   `protobuf:"bytes,2,opt,name=rootOriginatorId,proto3" json:"rootOriginatorId,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *SubscribeToOrdersWithRootOriginatorIdArgs) Reset() {
	*m = SubscribeToOrdersWithRootOriginatorIdArgs{}
}
func (m *SubscribeToOrdersWithRootOriginatorIdArgs) String() string { return proto.CompactTextString(m) }
func (*SubscribeToOrdersWithRootOriginatorIdArgs) ProtoMessage()    {}
func (*SubscribeToOrdersWithRootOriginatorIdArgs) Descriptor() ([]byte, []int) {
	return fileDescriptor_11b5ede7922b2c0b, []int{0}
}

func (m *SubscribeToOrdersWithRootOriginatorIdArgs) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs.Unmarshal(m, b)
}
func (m *SubscribeToOrdersWithRootOriginatorIdArgs) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs.Marshal(b, m, deterministic)
}
func (m *SubscribeToOrdersWithRootOriginatorIdArgs) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs.Merge(m, src)
}
func (m *SubscribeToOrdersWithRootOriginatorIdArgs) XXX_Size() int {
	return xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs.Size(m)
}
func (m *SubscribeToOrdersWithRootOriginatorIdArgs) XXX_DiscardUnknown() {
	xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs.DiscardUnknown(m)
}

var xxx_messageInfo_SubscribeToOrdersWithRootOriginatorIdArgs proto.InternalMessageInfo

func (m *SubscribeToOrdersWithRootOriginatorIdArgs) GetRootOriginatorId() string {
	if m != nil {
		return m.RootOriginatorId
	}
	return ""
}

type GetOrderHistoryArgs struct {
	OrderId              string   `protobuf:"bytes,1,opt,name=orderId,proto3" json:"orderId,omitempty"`
	ToVersion            int32    `protobuf:"varint,2,opt,name=toVersion,proto3" json:"toVersion,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *GetOrderHistoryArgs) Reset()         { *m = GetOrderHistoryArgs{} }
func (m *GetOrderHistoryArgs) String() string { return proto.CompactTextString(m) }
func (*GetOrderHistoryArgs) ProtoMessage()    {}
func (*GetOrderHistoryArgs) Descriptor() ([]byte, []int) {
	return fileDescriptor_11b5ede7922b2c0b, []int{1}
}

func (m *GetOrderHistoryArgs) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetOrderHistoryArgs.Unmarshal(m, b)
}
func (m *GetOrderHistoryArgs) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetOrderHistoryArgs.Marshal(b, m, deterministic)
}
func (m *GetOrderHistoryArgs) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetOrderHistoryArgs.Merge(m, src)
}
func (m *GetOrderHistoryArgs) XXX_Size() int {
	return xxx_messageInfo_GetOrderHistoryArgs.Size(m)
}
func (m *GetOrderHistoryArgs) XXX_DiscardUnknown() {
	xxx_messageInfo_GetOrderHistoryArgs.DiscardUnknown(m)
}

var xxx_messageInfo_GetOrderHistoryArgs proto.InternalMessageInfo

func (m *GetOrderHistoryArgs) GetOrderId() string {
	if m != nil {
		return m.OrderId
	}
	return ""
}

func (m *GetOrderHistoryArgs) GetToVersion() int32 {
	if m != nil {
		return m.ToVersion
	}
	return 0
}

type OrderUpdate struct {
	Order                *model.Order     `protobuf:"bytes,1,opt,name=order,proto3" json:"order,omitempty"`
	Time                 *model.Timestamp `protobuf:"bytes,2,opt,name=time,proto3" json:"time,omitempty"`
	XXX_NoUnkeyedLiteral struct{}   `json:"-"`
	XXX_unrecognized     []byte     `json:"-"`
	XXX_sizecache        int32      `json:"-"`
}

func (m *OrderUpdate) Reset()         { *m = OrderUpdate{} }
func (m *OrderUpdate) String() string { return proto.CompactTextString(m) }
func (*OrderUpdate) ProtoMessage()    {}
func (*OrderUpdate) Descriptor() ([]byte, []int) {
	return fileDescriptor_11b5ede7922b2c0b, []int{2}
}

func (m *OrderUpdate) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OrderUpdate.Unmarshal(m, b)
}
func (m *OrderUpdate) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OrderUpdate.Marshal(b, m, deterministic)
}
func (m *OrderUpdate) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OrderUpdate.Merge(m, src)
}
func (m *OrderUpdate) XXX_Size() int {
	return xxx_messageInfo_OrderUpdate.Size(m)
}
func (m *OrderUpdate) XXX_DiscardUnknown() {
	xxx_messageInfo_OrderUpdate.DiscardUnknown(m)
}

var xxx_messageInfo_OrderUpdate proto.InternalMessageInfo

func (m *OrderUpdate) GetOrder() *model.Order {
	if m != nil {
		return m.Order
	}
	return nil
}

func (m *OrderUpdate) GetTime() *model.Timestamp {
	if m != nil {
		return m.Time
	}
	return nil
}

type OrderHistory struct {
	Updates              []*OrderUpdate `protobuf:"bytes,1,rep,name=updates,proto3" json:"updates,omitempty"`
	XXX_NoUnkeyedLiteral struct{}       `json:"-"`
	XXX_unrecognized     []byte         `json:"-"`
	XXX_sizecache        int32          `json:"-"`
}

func (m *OrderHistory) Reset()         { *m = OrderHistory{} }
func (m *OrderHistory) String() string { return proto.CompactTextString(m) }
func (*OrderHistory) ProtoMessage()    {}
func (*OrderHistory) Descriptor() ([]byte, []int) {
	return fileDescriptor_11b5ede7922b2c0b, []int{3}
}

func (m *OrderHistory) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_OrderHistory.Unmarshal(m, b)
}
func (m *OrderHistory) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_OrderHistory.Marshal(b, m, deterministic)
}
func (m *OrderHistory) XXX_Merge(src proto.Message) {
	xxx_messageInfo_OrderHistory.Merge(m, src)
}
func (m *OrderHistory) XXX_Size() int {
	return xxx_messageInfo_OrderHistory.Size(m)
}
func (m *OrderHistory) XXX_DiscardUnknown() {
	xxx_messageInfo_OrderHistory.DiscardUnknown(m)
}

var xxx_messageInfo_OrderHistory proto.InternalMessageInfo

func (m *OrderHistory) GetUpdates() []*OrderUpdate {
	if m != nil {
		return m.Updates
	}
	return nil
}

func init() {
	proto.RegisterType((*SubscribeToOrdersWithRootOriginatorIdArgs)(nil), "orderdataservice.SubscribeToOrdersWithRootOriginatorIdArgs")
	proto.RegisterType((*GetOrderHistoryArgs)(nil), "orderdataservice.GetOrderHistoryArgs")
	proto.RegisterType((*OrderUpdate)(nil), "orderdataservice.OrderUpdate")
	proto.RegisterType((*OrderHistory)(nil), "orderdataservice.OrderHistory")
}

func init() { proto.RegisterFile("orderdataservice.proto", fileDescriptor_11b5ede7922b2c0b) }

var fileDescriptor_11b5ede7922b2c0b = []byte{
	// 326 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x8c, 0x52, 0x5f, 0x4b, 0x3a, 0x41,
	0x14, 0x75, 0x7f, 0xbf, 0x4c, 0xbc, 0x2b, 0xb4, 0x4d, 0x10, 0xcb, 0x52, 0x21, 0x43, 0x82, 0xf5,
	0xb0, 0xc4, 0xf6, 0xd0, 0x43, 0x4f, 0x45, 0x60, 0x3e, 0x84, 0xb0, 0x5a, 0x82, 0x6f, 0xa3, 0x3b,
	0xd8, 0x40, 0xeb, 0x95, 0x99, 0xab, 0xd0, 0x17, 0xee, 0x73, 0x44, 0x77, 0x95, 0xcc, 0x2d, 0xf0,
	0x71, 0xce, 0x39, 0xf7, 0x9c, 0xfb, 0x67, 0xe0, 0x18, 0x6d, 0xa6, 0x6d, 0xa6, 0x48, 0x39, 0x6d,
	0x97, 0x66, 0xa2, 0xe3, 0xb9, 0x45, 0x42, 0x11, 0x6c, 0xe3, 0xd1, 0x61, 0x8e, 0x99, 0x7e, 0x9b,
	0x60, 0x9e, 0xe3, 0xac, 0x10, 0x45, 0x3e, 0x8b, 0x8a, 0x87, 0x1c, 0xc2, 0x45, 0x7f, 0x31, 0x76,
	0x13, 0x6b, 0xc6, 0x7a, 0x80, 0xbd, 0x2f, 0xc6, 0x0d, 0x0d, 0xbd, 0xa6, 0x88, 0xd4, 0xb3, 0x66,
	0x6a, 0x66, 0x8a, 0xd0, 0x76, 0xb3, 0x3b, 0x3b, 0x75, 0xe2, 0x12, 0x02, 0xbb, 0x85, 0x87, 0xff,
	0x9a, 0x5e, 0xbb, 0x9e, 0x96, 0x70, 0xf9, 0x04, 0x47, 0x1d, 0x4d, 0x6c, 0xf8, 0x68, 0x1c, 0xa1,
	0x7d, 0x67, 0x8b, 0x10, 0x6a, 0x1c, 0xdf, 0xcd, 0x42, 0x8f, 0x2b, 0xd7, 0x4f, 0x71, 0x02, 0x75,
	0xc2, 0x17, 0x6d, 0x9d, 0xc1, 0x19, 0xbb, 0x56, 0xd3, 0x6f, 0x40, 0x0e, 0xc1, 0x67, 0xaf, 0xe7,
	0x79, 0xa6, 0x48, 0x0b, 0x09, 0x55, 0xae, 0x63, 0x13, 0x3f, 0x69, 0xc4, 0x3c, 0x66, 0xcc, 0x92,
	0xb4, 0xa0, 0xc4, 0x39, 0xec, 0x91, 0xc9, 0x35, 0x7b, 0xf9, 0x49, 0xb0, 0x92, 0x0c, 0x4c, 0xae,
	0x1d, 0xa9, 0x7c, 0x9e, 0x32, 0x2b, 0x3b, 0xd0, 0xd8, 0x6c, 0x52, 0xdc, 0x40, 0x6d, 0xc1, 0x19,
	0x2e, 0xf4, 0x9a, 0xff, 0xdb, 0x7e, 0x72, 0x1a, 0x97, 0x96, 0xbd, 0xd1, 0x49, 0xba, 0x56, 0x27,
	0x1f, 0x1e, 0x04, 0x4c, 0x3c, 0x28, 0x52, 0xfd, 0x42, 0x29, 0x96, 0xd0, 0xda, 0x69, 0xbd, 0xe2,
	0xb6, 0x9c, 0xb2, 0xf3, 0x5d, 0xa2, 0x1f, 0xe3, 0xcb, 0xca, 0x95, 0x27, 0x46, 0x70, 0xb0, 0xb5,
	0x7d, 0xd1, 0x2a, 0x27, 0xfc, 0x72, 0xa0, 0xe8, 0xec, 0x8f, 0x71, 0x57, 0x1a, 0x59, 0xb9, 0xaf,
	0x8d, 0xaa, 0x1c, 0x37, 0xde, 0xe7, 0x2f, 0x74, 0xfd, 0x19, 0x00, 0x00, 0xff, 0xff, 0x10, 0x66,
	0xe0, 0x2a, 0x8e, 0x02, 0x00, 0x00,
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// OrderDataServiceClient is the client API for OrderDataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type OrderDataServiceClient interface {
	SubscribeToOrdersWithRootOriginatorId(ctx context.Context, in *SubscribeToOrdersWithRootOriginatorIdArgs, opts ...grpc.CallOption) (OrderDataService_SubscribeToOrdersWithRootOriginatorIdClient, error)
	GetOrderHistory(ctx context.Context, in *GetOrderHistoryArgs, opts ...grpc.CallOption) (*OrderHistory, error)
}

type orderDataServiceClient struct {
	cc *grpc.ClientConn
}

func NewOrderDataServiceClient(cc *grpc.ClientConn) OrderDataServiceClient {
	return &orderDataServiceClient{cc}
}

func (c *orderDataServiceClient) SubscribeToOrdersWithRootOriginatorId(ctx context.Context, in *SubscribeToOrdersWithRootOriginatorIdArgs, opts ...grpc.CallOption) (OrderDataService_SubscribeToOrdersWithRootOriginatorIdClient, error) {
	stream, err := c.cc.NewStream(ctx, &_OrderDataService_serviceDesc.Streams[0], "/orderdataservice.OrderDataService/SubscribeToOrdersWithRootOriginatorId", opts...)
	if err != nil {
		return nil, err
	}
	x := &orderDataServiceSubscribeToOrdersWithRootOriginatorIdClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type OrderDataService_SubscribeToOrdersWithRootOriginatorIdClient interface {
	Recv() (*model.Order, error)
	grpc.ClientStream
}

type orderDataServiceSubscribeToOrdersWithRootOriginatorIdClient struct {
	grpc.ClientStream
}

func (x *orderDataServiceSubscribeToOrdersWithRootOriginatorIdClient) Recv() (*model.Order, error) {
	m := new(model.Order)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *orderDataServiceClient) GetOrderHistory(ctx context.Context, in *GetOrderHistoryArgs, opts ...grpc.CallOption) (*OrderHistory, error) {
	out := new(OrderHistory)
	err := c.cc.Invoke(ctx, "/orderdataservice.OrderDataService/GetOrderHistory", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// OrderDataServiceServer is the server API for OrderDataService service.
type OrderDataServiceServer interface {
	SubscribeToOrdersWithRootOriginatorId(*SubscribeToOrdersWithRootOriginatorIdArgs, OrderDataService_SubscribeToOrdersWithRootOriginatorIdServer) error
	GetOrderHistory(context.Context, *GetOrderHistoryArgs) (*OrderHistory, error)
}

// UnimplementedOrderDataServiceServer can be embedded to have forward compatible implementations.
type UnimplementedOrderDataServiceServer struct {
}

func (*UnimplementedOrderDataServiceServer) SubscribeToOrdersWithRootOriginatorId(req *SubscribeToOrdersWithRootOriginatorIdArgs, srv OrderDataService_SubscribeToOrdersWithRootOriginatorIdServer) error {
	return status.Errorf(codes.Unimplemented, "method SubscribeToOrdersWithRootOriginatorId not implemented")
}
func (*UnimplementedOrderDataServiceServer) GetOrderHistory(ctx context.Context, req *GetOrderHistoryArgs) (*OrderHistory, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetOrderHistory not implemented")
}

func RegisterOrderDataServiceServer(s *grpc.Server, srv OrderDataServiceServer) {
	s.RegisterService(&_OrderDataService_serviceDesc, srv)
}

func _OrderDataService_SubscribeToOrdersWithRootOriginatorId_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(SubscribeToOrdersWithRootOriginatorIdArgs)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(OrderDataServiceServer).SubscribeToOrdersWithRootOriginatorId(m, &orderDataServiceSubscribeToOrdersWithRootOriginatorIdServer{stream})
}

type OrderDataService_SubscribeToOrdersWithRootOriginatorIdServer interface {
	Send(*model.Order) error
	grpc.ServerStream
}

type orderDataServiceSubscribeToOrdersWithRootOriginatorIdServer struct {
	grpc.ServerStream
}

func (x *orderDataServiceSubscribeToOrdersWithRootOriginatorIdServer) Send(m *model.Order) error {
	return x.ServerStream.SendMsg(m)
}

func _OrderDataService_GetOrderHistory_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetOrderHistoryArgs)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(OrderDataServiceServer).GetOrderHistory(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/orderdataservice.OrderDataService/GetOrderHistory",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(OrderDataServiceServer).GetOrderHistory(ctx, req.(*GetOrderHistoryArgs))
	}
	return interceptor(ctx, in, info, handler)
}

var _OrderDataService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "orderdataservice.OrderDataService",
	HandlerType: (*OrderDataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetOrderHistory",
			Handler:    _OrderDataService_GetOrderHistory_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "SubscribeToOrdersWithRootOriginatorId",
			Handler:       _OrderDataService_SubscribeToOrdersWithRootOriginatorId_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "orderdataservice.proto",
}
