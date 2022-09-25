package com.rew.grpc;

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
    comments = "Source: syndicate.proto")
public final class JoinSyndicateGrpc {

  private JoinSyndicateGrpc() {}

  public static final String SERVICE_NAME = "JoinSyndicate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.Member,
      com.rew.grpc.Syndicate.Position> getJoinsynMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "joinsyn",
      requestType = com.rew.grpc.Syndicate.Member.class,
      responseType = com.rew.grpc.Syndicate.Position.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.Member,
      com.rew.grpc.Syndicate.Position> getJoinsynMethod() {
    io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.Member, com.rew.grpc.Syndicate.Position> getJoinsynMethod;
    if ((getJoinsynMethod = JoinSyndicateGrpc.getJoinsynMethod) == null) {
      synchronized (JoinSyndicateGrpc.class) {
        if ((getJoinsynMethod = JoinSyndicateGrpc.getJoinsynMethod) == null) {
          JoinSyndicateGrpc.getJoinsynMethod = getJoinsynMethod = 
              io.grpc.MethodDescriptor.<com.rew.grpc.Syndicate.Member, com.rew.grpc.Syndicate.Position>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "JoinSyndicate", "joinsyn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rew.grpc.Syndicate.Member.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rew.grpc.Syndicate.Position.getDefaultInstance()))
                  .setSchemaDescriptor(new JoinSyndicateMethodDescriptorSupplier("joinsyn"))
                  .build();
          }
        }
     }
     return getJoinsynMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.FileData,
      com.rew.grpc.Syndicate.FileRes> getSendfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendfile",
      requestType = com.rew.grpc.Syndicate.FileData.class,
      responseType = com.rew.grpc.Syndicate.FileRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.FileData,
      com.rew.grpc.Syndicate.FileRes> getSendfileMethod() {
    io.grpc.MethodDescriptor<com.rew.grpc.Syndicate.FileData, com.rew.grpc.Syndicate.FileRes> getSendfileMethod;
    if ((getSendfileMethod = JoinSyndicateGrpc.getSendfileMethod) == null) {
      synchronized (JoinSyndicateGrpc.class) {
        if ((getSendfileMethod = JoinSyndicateGrpc.getSendfileMethod) == null) {
          JoinSyndicateGrpc.getSendfileMethod = getSendfileMethod = 
              io.grpc.MethodDescriptor.<com.rew.grpc.Syndicate.FileData, com.rew.grpc.Syndicate.FileRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "JoinSyndicate", "sendfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rew.grpc.Syndicate.FileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rew.grpc.Syndicate.FileRes.getDefaultInstance()))
                  .setSchemaDescriptor(new JoinSyndicateMethodDescriptorSupplier("sendfile"))
                  .build();
          }
        }
     }
     return getSendfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JoinSyndicateStub newStub(io.grpc.Channel channel) {
    return new JoinSyndicateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JoinSyndicateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JoinSyndicateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JoinSyndicateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JoinSyndicateFutureStub(channel);
  }

  /**
   */
  public static abstract class JoinSyndicateImplBase implements io.grpc.BindableService {

    /**
     */
    public void joinsyn(com.rew.grpc.Syndicate.Member request,
        io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.Position> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinsynMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.FileData> sendfile(
        io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.FileRes> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJoinsynMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.rew.grpc.Syndicate.Member,
                com.rew.grpc.Syndicate.Position>(
                  this, METHODID_JOINSYN)))
          .addMethod(
            getSendfileMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.rew.grpc.Syndicate.FileData,
                com.rew.grpc.Syndicate.FileRes>(
                  this, METHODID_SENDFILE)))
          .build();
    }
  }

  /**
   */
  public static final class JoinSyndicateStub extends io.grpc.stub.AbstractStub<JoinSyndicateStub> {
    private JoinSyndicateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JoinSyndicateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JoinSyndicateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JoinSyndicateStub(channel, callOptions);
    }

    /**
     */
    public void joinsyn(com.rew.grpc.Syndicate.Member request,
        io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.Position> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinsynMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.FileData> sendfile(
        io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.FileRes> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendfileMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class JoinSyndicateBlockingStub extends io.grpc.stub.AbstractStub<JoinSyndicateBlockingStub> {
    private JoinSyndicateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JoinSyndicateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JoinSyndicateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JoinSyndicateBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rew.grpc.Syndicate.Position joinsyn(com.rew.grpc.Syndicate.Member request) {
      return blockingUnaryCall(
          getChannel(), getJoinsynMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JoinSyndicateFutureStub extends io.grpc.stub.AbstractStub<JoinSyndicateFutureStub> {
    private JoinSyndicateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JoinSyndicateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JoinSyndicateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JoinSyndicateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rew.grpc.Syndicate.Position> joinsyn(
        com.rew.grpc.Syndicate.Member request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinsynMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOINSYN = 0;
  private static final int METHODID_SENDFILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JoinSyndicateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JoinSyndicateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOINSYN:
          serviceImpl.joinsyn((com.rew.grpc.Syndicate.Member) request,
              (io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.Position>) responseObserver);
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
        case METHODID_SENDFILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendfile(
              (io.grpc.stub.StreamObserver<com.rew.grpc.Syndicate.FileRes>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JoinSyndicateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JoinSyndicateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rew.grpc.Syndicate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JoinSyndicate");
    }
  }

  private static final class JoinSyndicateFileDescriptorSupplier
      extends JoinSyndicateBaseDescriptorSupplier {
    JoinSyndicateFileDescriptorSupplier() {}
  }

  private static final class JoinSyndicateMethodDescriptorSupplier
      extends JoinSyndicateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JoinSyndicateMethodDescriptorSupplier(String methodName) {
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
      synchronized (JoinSyndicateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JoinSyndicateFileDescriptorSupplier())
              .addMethod(getJoinsynMethod())
              .addMethod(getSendfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
