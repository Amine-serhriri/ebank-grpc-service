package org.sid.bankgrpcservice.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: bank.proto")
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBankAccount",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest, org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getGetBankAccountMethod;
    if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankAccountMethod = BankServiceGrpc.getGetBankAccountMethod) == null) {
          BankServiceGrpc.getGetBankAccountMethod = getGetBankAccountMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest, org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getBankAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBankAccount"))
                  .build();
          }
        }
     }
     return getGetBankAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListAccount",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest, org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> getGetListAccountMethod;
    if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetListAccountMethod = BankServiceGrpc.getGetListAccountMethod) == null) {
          BankServiceGrpc.getGetListAccountMethod = getGetListAccountMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest, org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getListAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getListAccount"))
                  .build();
          }
        }
     }
     return getGetListAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertCurrency",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> getConvertCurrencyMethod;
    if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getConvertCurrencyMethod = BankServiceGrpc.getConvertCurrencyMethod) == null) {
          BankServiceGrpc.getConvertCurrencyMethod = getConvertCurrencyMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest, org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "convertCurrency"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("convertCurrency"))
                  .build();
          }
        }
     }
     return getConvertCurrencyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStreamOfTransaction",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest,
      org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest, org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getGetStreamOfTransactionMethod;
    if ((getGetStreamOfTransactionMethod = BankServiceGrpc.getGetStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetStreamOfTransactionMethod = BankServiceGrpc.getGetStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getGetStreamOfTransactionMethod = getGetStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest, org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "getStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getGetStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStreamOfTransaction",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction, org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> getPerformStreamOfTransactionMethod;
    if ((getPerformStreamOfTransactionMethod = BankServiceGrpc.getPerformStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getPerformStreamOfTransactionMethod = BankServiceGrpc.getPerformStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getPerformStreamOfTransactionMethod = getPerformStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction, org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "performStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("performStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getPerformStreamOfTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeStreamOfTransaction",
      requestType = org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      responseType = org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
      org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod() {
    io.grpc.MethodDescriptor<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction, org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getExecuteStreamOfTransactionMethod;
    if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getExecuteStreamOfTransactionMethod = BankServiceGrpc.getExecuteStreamOfTransactionMethod) == null) {
          BankServiceGrpc.getExecuteStreamOfTransactionMethod = getExecuteStreamOfTransactionMethod = 
              io.grpc.MethodDescriptor.<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction, org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BankService", "executeStreamOfTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.bankgrpcservice.grpc.stub.Bank.Transaction.getDefaultInstance()))
                  .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("executeStreamOfTransaction"))
                  .build();
          }
        }
     }
     return getExecuteStreamOfTransactionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void getBankAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void getListAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void convertCurrency(org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertCurrencyMethod(), responseObserver);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public void getStreamOfTransaction(org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamOfTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> performStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamOfTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncUnimplementedStreamingCall(getExecuteStreamOfTransactionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest,
                org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>(
                  this, METHODID_GET_BANK_ACCOUNT)))
          .addMethod(
            getGetListAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest,
                org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse>(
                  this, METHODID_GET_LIST_ACCOUNT)))
          .addMethod(
            getConvertCurrencyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest,
                org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT_CURRENCY)))
          .addMethod(
            getGetStreamOfTransactionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest,
                org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_GET_STREAM_OF_TRANSACTION)))
          .addMethod(
            getPerformStreamOfTransactionMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
                org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>(
                  this, METHODID_PERFORM_STREAM_OF_TRANSACTION)))
          .addMethod(
            getExecuteStreamOfTransactionMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.sid.bankgrpcservice.grpc.stub.Bank.Transaction,
                org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>(
                  this, METHODID_EXECUTE_STREAM_OF_TRANSACTION)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void getBankAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void getListAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public void convertCurrency(org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public void getStreamOfTransaction(org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest request,
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamOfTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> performStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bidirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> executeStreamOfTransaction(
        io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getExecuteStreamOfTransactionMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse getBankAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse getListAccount(org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse convertCurrency(org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertCurrencyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server Streaming
     * </pre>
     */
    public java.util.Iterator<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction> getStreamOfTransaction(
        org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamOfTransactionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse> getBankAccount(
        org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse> getListAccount(
        org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary Model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse> convertCurrency(
        org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertCurrencyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK_ACCOUNT = 0;
  private static final int METHODID_GET_LIST_ACCOUNT = 1;
  private static final int METHODID_CONVERT_CURRENCY = 2;
  private static final int METHODID_GET_STREAM_OF_TRANSACTION = 3;
  private static final int METHODID_PERFORM_STREAM_OF_TRANSACTION = 4;
  private static final int METHODID_EXECUTE_STREAM_OF_TRANSACTION = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK_ACCOUNT:
          serviceImpl.getBankAccount((org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetBankAccountResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_ACCOUNT:
          serviceImpl.getListAccount((org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.GetListAccountResponse>) responseObserver);
          break;
        case METHODID_CONVERT_CURRENCY:
          serviceImpl.convertCurrency((org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_OF_TRANSACTION:
          serviceImpl.getStreamOfTransaction((org.sid.bankgrpcservice.grpc.stub.Bank.GetStreamOfTransactionRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>) responseObserver);
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
        case METHODID_PERFORM_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStreamOfTransaction(
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.PerformStreamOfTransactionsResponse>) responseObserver);
        case METHODID_EXECUTE_STREAM_OF_TRANSACTION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeStreamOfTransaction(
              (io.grpc.stub.StreamObserver<org.sid.bankgrpcservice.grpc.stub.Bank.Transaction>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.bankgrpcservice.grpc.stub.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBankAccountMethod())
              .addMethod(getGetListAccountMethod())
              .addMethod(getConvertCurrencyMethod())
              .addMethod(getGetStreamOfTransactionMethod())
              .addMethod(getPerformStreamOfTransactionMethod())
              .addMethod(getExecuteStreamOfTransactionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
