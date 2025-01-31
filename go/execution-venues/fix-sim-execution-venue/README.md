# fix-sim-execution-venue

This service implements the [Execution Venue API](https://github.com/d-protocol/otp/blob/master/protobuf/services/executionvenue.proto)  to be used to submit, modify and cancel orders.    It is responsible for reconciling and managing order state and publishing updates to the Kafka order store.   It talks to the simulator using a p2p FIX connection.  It can be easily scaled by increasing the  statefulsets replica count, the [order router](https://github.com/d-protocol/otp/blob/master/go/execution-venues/order-router/README.md) will automatically partition the flow across the available execution venues for the given market based upon the order's listing id.  The out of the box configuration of OTP runs with 2 execution venues per market (market simulator).

