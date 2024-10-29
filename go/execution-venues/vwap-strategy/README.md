# vwap-strategy

This service implements the [execution venue](https://github.com/ettec/open-trading-platform/blob/master/protobuf/services/executionvenue.proto) service api.  The vwap-strategy is a trading strategy that splits a given order into child orders based upon historical trading volume in order to achieve the volume weighted average trade price within a given time interval.  This service is also intended as an example of how to build a trading strategy on the OTP platform.  The service can be scaled by increasing the statefulsets replica count.