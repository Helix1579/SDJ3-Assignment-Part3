package com.SDJ3.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: House.proto")
public final class SlaughterHouseGrpc {

  private SlaughterHouseGrpc() {}

  public static final String SERVICE_NAME = "SlaughterHouse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest,
      com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataAllAnimals",
      requestType = com.SDJ3.protobuf.House.GetDataRequest.class,
      responseType = com.SDJ3.protobuf.House.GetDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest,
      com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllAnimalsMethod() {
    io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest, com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllAnimalsMethod;
    if ((getGetDataAllAnimalsMethod = SlaughterHouseGrpc.getGetDataAllAnimalsMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetDataAllAnimalsMethod = SlaughterHouseGrpc.getGetDataAllAnimalsMethod) == null) {
          SlaughterHouseGrpc.getGetDataAllAnimalsMethod = getGetDataAllAnimalsMethod =
              io.grpc.MethodDescriptor.<com.SDJ3.protobuf.House.GetDataRequest, com.SDJ3.protobuf.House.GetDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataAllAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SDJ3.protobuf.House.GetDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SDJ3.protobuf.House.GetDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetDataAllAnimals"))
              .build();
        }
      }
    }
    return getGetDataAllAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest,
      com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataAllProducts",
      requestType = com.SDJ3.protobuf.House.GetDataRequest.class,
      responseType = com.SDJ3.protobuf.House.GetDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest,
      com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllProductsMethod() {
    io.grpc.MethodDescriptor<com.SDJ3.protobuf.House.GetDataRequest, com.SDJ3.protobuf.House.GetDataResponse> getGetDataAllProductsMethod;
    if ((getGetDataAllProductsMethod = SlaughterHouseGrpc.getGetDataAllProductsMethod) == null) {
      synchronized (SlaughterHouseGrpc.class) {
        if ((getGetDataAllProductsMethod = SlaughterHouseGrpc.getGetDataAllProductsMethod) == null) {
          SlaughterHouseGrpc.getGetDataAllProductsMethod = getGetDataAllProductsMethod =
              io.grpc.MethodDescriptor.<com.SDJ3.protobuf.House.GetDataRequest, com.SDJ3.protobuf.House.GetDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SDJ3.protobuf.House.GetDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.SDJ3.protobuf.House.GetDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SlaughterHouseMethodDescriptorSupplier("GetDataAllProducts"))
              .build();
        }
      }
    }
    return getGetDataAllProductsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SlaughterHouseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseStub>() {
        @java.lang.Override
        public SlaughterHouseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseStub(channel, callOptions);
        }
      };
    return SlaughterHouseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SlaughterHouseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseBlockingStub>() {
        @java.lang.Override
        public SlaughterHouseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseBlockingStub(channel, callOptions);
        }
      };
    return SlaughterHouseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SlaughterHouseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SlaughterHouseFutureStub>() {
        @java.lang.Override
        public SlaughterHouseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SlaughterHouseFutureStub(channel, callOptions);
        }
      };
    return SlaughterHouseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SlaughterHouseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDataAllAnimals(com.SDJ3.protobuf.House.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataAllAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void getDataAllProducts(com.SDJ3.protobuf.House.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataAllProductsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDataAllAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.SDJ3.protobuf.House.GetDataRequest,
                com.SDJ3.protobuf.House.GetDataResponse>(
                  this, METHODID_GET_DATA_ALL_ANIMALS)))
          .addMethod(
            getGetDataAllProductsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.SDJ3.protobuf.House.GetDataRequest,
                com.SDJ3.protobuf.House.GetDataResponse>(
                  this, METHODID_GET_DATA_ALL_PRODUCTS)))
          .build();
    }
  }

  /**
   */
  public static final class SlaughterHouseStub extends io.grpc.stub.AbstractAsyncStub<SlaughterHouseStub> {
    private SlaughterHouseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseStub(channel, callOptions);
    }

    /**
     */
    public void getDataAllAnimals(com.SDJ3.protobuf.House.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataAllAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDataAllProducts(com.SDJ3.protobuf.House.GetDataRequest request,
        io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataAllProductsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SlaughterHouseBlockingStub extends io.grpc.stub.AbstractBlockingStub<SlaughterHouseBlockingStub> {
    private SlaughterHouseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.SDJ3.protobuf.House.GetDataResponse getDataAllAnimals(com.SDJ3.protobuf.House.GetDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataAllAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.SDJ3.protobuf.House.GetDataResponse getDataAllProducts(com.SDJ3.protobuf.House.GetDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataAllProductsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SlaughterHouseFutureStub extends io.grpc.stub.AbstractFutureStub<SlaughterHouseFutureStub> {
    private SlaughterHouseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SlaughterHouseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SlaughterHouseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SDJ3.protobuf.House.GetDataResponse> getDataAllAnimals(
        com.SDJ3.protobuf.House.GetDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataAllAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.SDJ3.protobuf.House.GetDataResponse> getDataAllProducts(
        com.SDJ3.protobuf.House.GetDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataAllProductsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DATA_ALL_ANIMALS = 0;
  private static final int METHODID_GET_DATA_ALL_PRODUCTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SlaughterHouseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SlaughterHouseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DATA_ALL_ANIMALS:
          serviceImpl.getDataAllAnimals((com.SDJ3.protobuf.House.GetDataRequest) request,
              (io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse>) responseObserver);
          break;
        case METHODID_GET_DATA_ALL_PRODUCTS:
          serviceImpl.getDataAllProducts((com.SDJ3.protobuf.House.GetDataRequest) request,
              (io.grpc.stub.StreamObserver<com.SDJ3.protobuf.House.GetDataResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SlaughterHouseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.SDJ3.protobuf.House.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SlaughterHouse");
    }
  }

  private static final class SlaughterHouseFileDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier {
    SlaughterHouseFileDescriptorSupplier() {}
  }

  private static final class SlaughterHouseMethodDescriptorSupplier
      extends SlaughterHouseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SlaughterHouseMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SlaughterHouseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SlaughterHouseFileDescriptorSupplier())
              .addMethod(getGetDataAllAnimalsMethod())
              .addMethod(getGetDataAllProductsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
