package inference;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *&#64;&#64;
 *&#64;&#64;.. cpp:var:: service InferenceService
 *&#64;&#64;
 *&#64;&#64;   Inference Server GRPC endpoints.
 *&#64;&#64;
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: grpc_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GRPCInferenceServiceGrpc {

  private GRPCInferenceServiceGrpc() {}

  public static final String SERVICE_NAME = "inference.GRPCInferenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcService.ServerLiveRequest,
      GrpcService.ServerLiveResponse> getServerLiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerLive",
      requestType = GrpcService.ServerLiveRequest.class,
      responseType = GrpcService.ServerLiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ServerLiveRequest,
      GrpcService.ServerLiveResponse> getServerLiveMethod() {
    io.grpc.MethodDescriptor<GrpcService.ServerLiveRequest, GrpcService.ServerLiveResponse> getServerLiveMethod;
    if ((getServerLiveMethod = GRPCInferenceServiceGrpc.getServerLiveMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getServerLiveMethod = GRPCInferenceServiceGrpc.getServerLiveMethod) == null) {
          GRPCInferenceServiceGrpc.getServerLiveMethod = getServerLiveMethod =
              io.grpc.MethodDescriptor.<GrpcService.ServerLiveRequest, GrpcService.ServerLiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerLive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerLiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerLiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ServerLive"))
              .build();
        }
      }
    }
    return getServerLiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ServerReadyRequest,
      GrpcService.ServerReadyResponse> getServerReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerReady",
      requestType = GrpcService.ServerReadyRequest.class,
      responseType = GrpcService.ServerReadyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ServerReadyRequest,
      GrpcService.ServerReadyResponse> getServerReadyMethod() {
    io.grpc.MethodDescriptor<GrpcService.ServerReadyRequest, GrpcService.ServerReadyResponse> getServerReadyMethod;
    if ((getServerReadyMethod = GRPCInferenceServiceGrpc.getServerReadyMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getServerReadyMethod = GRPCInferenceServiceGrpc.getServerReadyMethod) == null) {
          GRPCInferenceServiceGrpc.getServerReadyMethod = getServerReadyMethod =
              io.grpc.MethodDescriptor.<GrpcService.ServerReadyRequest, GrpcService.ServerReadyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerReady"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerReadyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerReadyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ServerReady"))
              .build();
        }
      }
    }
    return getServerReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelReadyRequest,
      GrpcService.ModelReadyResponse> getModelReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelReady",
      requestType = GrpcService.ModelReadyRequest.class,
      responseType = GrpcService.ModelReadyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ModelReadyRequest,
      GrpcService.ModelReadyResponse> getModelReadyMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelReadyRequest, GrpcService.ModelReadyResponse> getModelReadyMethod;
    if ((getModelReadyMethod = GRPCInferenceServiceGrpc.getModelReadyMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelReadyMethod = GRPCInferenceServiceGrpc.getModelReadyMethod) == null) {
          GRPCInferenceServiceGrpc.getModelReadyMethod = getModelReadyMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelReadyRequest, GrpcService.ModelReadyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelReady"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelReadyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelReadyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelReady"))
              .build();
        }
      }
    }
    return getModelReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ServerMetadataRequest,
      GrpcService.ServerMetadataResponse> getServerMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerMetadata",
      requestType = GrpcService.ServerMetadataRequest.class,
      responseType = GrpcService.ServerMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ServerMetadataRequest,
      GrpcService.ServerMetadataResponse> getServerMetadataMethod() {
    io.grpc.MethodDescriptor<GrpcService.ServerMetadataRequest, GrpcService.ServerMetadataResponse> getServerMetadataMethod;
    if ((getServerMetadataMethod = GRPCInferenceServiceGrpc.getServerMetadataMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getServerMetadataMethod = GRPCInferenceServiceGrpc.getServerMetadataMethod) == null) {
          GRPCInferenceServiceGrpc.getServerMetadataMethod = getServerMetadataMethod =
              io.grpc.MethodDescriptor.<GrpcService.ServerMetadataRequest, GrpcService.ServerMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ServerMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ServerMetadata"))
              .build();
        }
      }
    }
    return getServerMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelMetadataRequest,
      GrpcService.ModelMetadataResponse> getModelMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelMetadata",
      requestType = GrpcService.ModelMetadataRequest.class,
      responseType = GrpcService.ModelMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ModelMetadataRequest,
      GrpcService.ModelMetadataResponse> getModelMetadataMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelMetadataRequest, GrpcService.ModelMetadataResponse> getModelMetadataMethod;
    if ((getModelMetadataMethod = GRPCInferenceServiceGrpc.getModelMetadataMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelMetadataMethod = GRPCInferenceServiceGrpc.getModelMetadataMethod) == null) {
          GRPCInferenceServiceGrpc.getModelMetadataMethod = getModelMetadataMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelMetadataRequest, GrpcService.ModelMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelMetadataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelMetadata"))
              .build();
        }
      }
    }
    return getModelMetadataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelInferRequest,
      GrpcService.ModelInferResponse> getModelInferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelInfer",
      requestType = GrpcService.ModelInferRequest.class,
      responseType = GrpcService.ModelInferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ModelInferRequest,
      GrpcService.ModelInferResponse> getModelInferMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelInferRequest, GrpcService.ModelInferResponse> getModelInferMethod;
    if ((getModelInferMethod = GRPCInferenceServiceGrpc.getModelInferMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelInferMethod = GRPCInferenceServiceGrpc.getModelInferMethod) == null) {
          GRPCInferenceServiceGrpc.getModelInferMethod = getModelInferMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelInferRequest, GrpcService.ModelInferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelInfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelInferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelInferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelInfer"))
              .build();
        }
      }
    }
    return getModelInferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelInferRequest,
      GrpcService.ModelStreamInferResponse> getModelStreamInferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelStreamInfer",
      requestType = GrpcService.ModelInferRequest.class,
      responseType = GrpcService.ModelStreamInferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcService.ModelInferRequest,
      GrpcService.ModelStreamInferResponse> getModelStreamInferMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelInferRequest, GrpcService.ModelStreamInferResponse> getModelStreamInferMethod;
    if ((getModelStreamInferMethod = GRPCInferenceServiceGrpc.getModelStreamInferMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelStreamInferMethod = GRPCInferenceServiceGrpc.getModelStreamInferMethod) == null) {
          GRPCInferenceServiceGrpc.getModelStreamInferMethod = getModelStreamInferMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelInferRequest, GrpcService.ModelStreamInferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelStreamInfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelInferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelStreamInferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelStreamInfer"))
              .build();
        }
      }
    }
    return getModelStreamInferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelConfigRequest,
      GrpcService.ModelConfigResponse> getModelConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelConfig",
      requestType = GrpcService.ModelConfigRequest.class,
      responseType = GrpcService.ModelConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ModelConfigRequest,
      GrpcService.ModelConfigResponse> getModelConfigMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelConfigRequest, GrpcService.ModelConfigResponse> getModelConfigMethod;
    if ((getModelConfigMethod = GRPCInferenceServiceGrpc.getModelConfigMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelConfigMethod = GRPCInferenceServiceGrpc.getModelConfigMethod) == null) {
          GRPCInferenceServiceGrpc.getModelConfigMethod = getModelConfigMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelConfigRequest, GrpcService.ModelConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelConfigResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelConfig"))
              .build();
        }
      }
    }
    return getModelConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.ModelStatisticsRequest,
      GrpcService.ModelStatisticsResponse> getModelStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelStatistics",
      requestType = GrpcService.ModelStatisticsRequest.class,
      responseType = GrpcService.ModelStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.ModelStatisticsRequest,
      GrpcService.ModelStatisticsResponse> getModelStatisticsMethod() {
    io.grpc.MethodDescriptor<GrpcService.ModelStatisticsRequest, GrpcService.ModelStatisticsResponse> getModelStatisticsMethod;
    if ((getModelStatisticsMethod = GRPCInferenceServiceGrpc.getModelStatisticsMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getModelStatisticsMethod = GRPCInferenceServiceGrpc.getModelStatisticsMethod) == null) {
          GRPCInferenceServiceGrpc.getModelStatisticsMethod = getModelStatisticsMethod =
              io.grpc.MethodDescriptor.<GrpcService.ModelStatisticsRequest, GrpcService.ModelStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.ModelStatisticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("ModelStatistics"))
              .build();
        }
      }
    }
    return getModelStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.RepositoryIndexRequest,
      GrpcService.RepositoryIndexResponse> getRepositoryIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepositoryIndex",
      requestType = GrpcService.RepositoryIndexRequest.class,
      responseType = GrpcService.RepositoryIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.RepositoryIndexRequest,
      GrpcService.RepositoryIndexResponse> getRepositoryIndexMethod() {
    io.grpc.MethodDescriptor<GrpcService.RepositoryIndexRequest, GrpcService.RepositoryIndexResponse> getRepositoryIndexMethod;
    if ((getRepositoryIndexMethod = GRPCInferenceServiceGrpc.getRepositoryIndexMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getRepositoryIndexMethod = GRPCInferenceServiceGrpc.getRepositoryIndexMethod) == null) {
          GRPCInferenceServiceGrpc.getRepositoryIndexMethod = getRepositoryIndexMethod =
              io.grpc.MethodDescriptor.<GrpcService.RepositoryIndexRequest, GrpcService.RepositoryIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepositoryIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("RepositoryIndex"))
              .build();
        }
      }
    }
    return getRepositoryIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.RepositoryModelLoadRequest,
      GrpcService.RepositoryModelLoadResponse> getRepositoryModelLoadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepositoryModelLoad",
      requestType = GrpcService.RepositoryModelLoadRequest.class,
      responseType = GrpcService.RepositoryModelLoadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.RepositoryModelLoadRequest,
      GrpcService.RepositoryModelLoadResponse> getRepositoryModelLoadMethod() {
    io.grpc.MethodDescriptor<GrpcService.RepositoryModelLoadRequest, GrpcService.RepositoryModelLoadResponse> getRepositoryModelLoadMethod;
    if ((getRepositoryModelLoadMethod = GRPCInferenceServiceGrpc.getRepositoryModelLoadMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getRepositoryModelLoadMethod = GRPCInferenceServiceGrpc.getRepositoryModelLoadMethod) == null) {
          GRPCInferenceServiceGrpc.getRepositoryModelLoadMethod = getRepositoryModelLoadMethod =
              io.grpc.MethodDescriptor.<GrpcService.RepositoryModelLoadRequest, GrpcService.RepositoryModelLoadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepositoryModelLoad"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryModelLoadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryModelLoadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("RepositoryModelLoad"))
              .build();
        }
      }
    }
    return getRepositoryModelLoadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.RepositoryModelUnloadRequest,
      GrpcService.RepositoryModelUnloadResponse> getRepositoryModelUnloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepositoryModelUnload",
      requestType = GrpcService.RepositoryModelUnloadRequest.class,
      responseType = GrpcService.RepositoryModelUnloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.RepositoryModelUnloadRequest,
      GrpcService.RepositoryModelUnloadResponse> getRepositoryModelUnloadMethod() {
    io.grpc.MethodDescriptor<GrpcService.RepositoryModelUnloadRequest, GrpcService.RepositoryModelUnloadResponse> getRepositoryModelUnloadMethod;
    if ((getRepositoryModelUnloadMethod = GRPCInferenceServiceGrpc.getRepositoryModelUnloadMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getRepositoryModelUnloadMethod = GRPCInferenceServiceGrpc.getRepositoryModelUnloadMethod) == null) {
          GRPCInferenceServiceGrpc.getRepositoryModelUnloadMethod = getRepositoryModelUnloadMethod =
              io.grpc.MethodDescriptor.<GrpcService.RepositoryModelUnloadRequest, GrpcService.RepositoryModelUnloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepositoryModelUnload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryModelUnloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.RepositoryModelUnloadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("RepositoryModelUnload"))
              .build();
        }
      }
    }
    return getRepositoryModelUnloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryStatusRequest,
      GrpcService.SystemSharedMemoryStatusResponse> getSystemSharedMemoryStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SystemSharedMemoryStatus",
      requestType = GrpcService.SystemSharedMemoryStatusRequest.class,
      responseType = GrpcService.SystemSharedMemoryStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryStatusRequest,
      GrpcService.SystemSharedMemoryStatusResponse> getSystemSharedMemoryStatusMethod() {
    io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryStatusRequest, GrpcService.SystemSharedMemoryStatusResponse> getSystemSharedMemoryStatusMethod;
    if ((getSystemSharedMemoryStatusMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryStatusMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getSystemSharedMemoryStatusMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryStatusMethod) == null) {
          GRPCInferenceServiceGrpc.getSystemSharedMemoryStatusMethod = getSystemSharedMemoryStatusMethod =
              io.grpc.MethodDescriptor.<GrpcService.SystemSharedMemoryStatusRequest, GrpcService.SystemSharedMemoryStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SystemSharedMemoryStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("SystemSharedMemoryStatus"))
              .build();
        }
      }
    }
    return getSystemSharedMemoryStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryRegisterRequest,
      GrpcService.SystemSharedMemoryRegisterResponse> getSystemSharedMemoryRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SystemSharedMemoryRegister",
      requestType = GrpcService.SystemSharedMemoryRegisterRequest.class,
      responseType = GrpcService.SystemSharedMemoryRegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryRegisterRequest,
      GrpcService.SystemSharedMemoryRegisterResponse> getSystemSharedMemoryRegisterMethod() {
    io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryRegisterRequest, GrpcService.SystemSharedMemoryRegisterResponse> getSystemSharedMemoryRegisterMethod;
    if ((getSystemSharedMemoryRegisterMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryRegisterMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getSystemSharedMemoryRegisterMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryRegisterMethod) == null) {
          GRPCInferenceServiceGrpc.getSystemSharedMemoryRegisterMethod = getSystemSharedMemoryRegisterMethod =
              io.grpc.MethodDescriptor.<GrpcService.SystemSharedMemoryRegisterRequest, GrpcService.SystemSharedMemoryRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SystemSharedMemoryRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryRegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("SystemSharedMemoryRegister"))
              .build();
        }
      }
    }
    return getSystemSharedMemoryRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryUnregisterRequest,
      GrpcService.SystemSharedMemoryUnregisterResponse> getSystemSharedMemoryUnregisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SystemSharedMemoryUnregister",
      requestType = GrpcService.SystemSharedMemoryUnregisterRequest.class,
      responseType = GrpcService.SystemSharedMemoryUnregisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryUnregisterRequest,
      GrpcService.SystemSharedMemoryUnregisterResponse> getSystemSharedMemoryUnregisterMethod() {
    io.grpc.MethodDescriptor<GrpcService.SystemSharedMemoryUnregisterRequest, GrpcService.SystemSharedMemoryUnregisterResponse> getSystemSharedMemoryUnregisterMethod;
    if ((getSystemSharedMemoryUnregisterMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryUnregisterMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getSystemSharedMemoryUnregisterMethod = GRPCInferenceServiceGrpc.getSystemSharedMemoryUnregisterMethod) == null) {
          GRPCInferenceServiceGrpc.getSystemSharedMemoryUnregisterMethod = getSystemSharedMemoryUnregisterMethod =
              io.grpc.MethodDescriptor.<GrpcService.SystemSharedMemoryUnregisterRequest, GrpcService.SystemSharedMemoryUnregisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SystemSharedMemoryUnregister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryUnregisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.SystemSharedMemoryUnregisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("SystemSharedMemoryUnregister"))
              .build();
        }
      }
    }
    return getSystemSharedMemoryUnregisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryStatusRequest,
      GrpcService.CudaSharedMemoryStatusResponse> getCudaSharedMemoryStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CudaSharedMemoryStatus",
      requestType = GrpcService.CudaSharedMemoryStatusRequest.class,
      responseType = GrpcService.CudaSharedMemoryStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryStatusRequest,
      GrpcService.CudaSharedMemoryStatusResponse> getCudaSharedMemoryStatusMethod() {
    io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryStatusRequest, GrpcService.CudaSharedMemoryStatusResponse> getCudaSharedMemoryStatusMethod;
    if ((getCudaSharedMemoryStatusMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryStatusMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getCudaSharedMemoryStatusMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryStatusMethod) == null) {
          GRPCInferenceServiceGrpc.getCudaSharedMemoryStatusMethod = getCudaSharedMemoryStatusMethod =
              io.grpc.MethodDescriptor.<GrpcService.CudaSharedMemoryStatusRequest, GrpcService.CudaSharedMemoryStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CudaSharedMemoryStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("CudaSharedMemoryStatus"))
              .build();
        }
      }
    }
    return getCudaSharedMemoryStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryRegisterRequest,
      GrpcService.CudaSharedMemoryRegisterResponse> getCudaSharedMemoryRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CudaSharedMemoryRegister",
      requestType = GrpcService.CudaSharedMemoryRegisterRequest.class,
      responseType = GrpcService.CudaSharedMemoryRegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryRegisterRequest,
      GrpcService.CudaSharedMemoryRegisterResponse> getCudaSharedMemoryRegisterMethod() {
    io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryRegisterRequest, GrpcService.CudaSharedMemoryRegisterResponse> getCudaSharedMemoryRegisterMethod;
    if ((getCudaSharedMemoryRegisterMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryRegisterMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getCudaSharedMemoryRegisterMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryRegisterMethod) == null) {
          GRPCInferenceServiceGrpc.getCudaSharedMemoryRegisterMethod = getCudaSharedMemoryRegisterMethod =
              io.grpc.MethodDescriptor.<GrpcService.CudaSharedMemoryRegisterRequest, GrpcService.CudaSharedMemoryRegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CudaSharedMemoryRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryRegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryRegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("CudaSharedMemoryRegister"))
              .build();
        }
      }
    }
    return getCudaSharedMemoryRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryUnregisterRequest,
      GrpcService.CudaSharedMemoryUnregisterResponse> getCudaSharedMemoryUnregisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CudaSharedMemoryUnregister",
      requestType = GrpcService.CudaSharedMemoryUnregisterRequest.class,
      responseType = GrpcService.CudaSharedMemoryUnregisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryUnregisterRequest,
      GrpcService.CudaSharedMemoryUnregisterResponse> getCudaSharedMemoryUnregisterMethod() {
    io.grpc.MethodDescriptor<GrpcService.CudaSharedMemoryUnregisterRequest, GrpcService.CudaSharedMemoryUnregisterResponse> getCudaSharedMemoryUnregisterMethod;
    if ((getCudaSharedMemoryUnregisterMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryUnregisterMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getCudaSharedMemoryUnregisterMethod = GRPCInferenceServiceGrpc.getCudaSharedMemoryUnregisterMethod) == null) {
          GRPCInferenceServiceGrpc.getCudaSharedMemoryUnregisterMethod = getCudaSharedMemoryUnregisterMethod =
              io.grpc.MethodDescriptor.<GrpcService.CudaSharedMemoryUnregisterRequest, GrpcService.CudaSharedMemoryUnregisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CudaSharedMemoryUnregister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryUnregisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.CudaSharedMemoryUnregisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("CudaSharedMemoryUnregister"))
              .build();
        }
      }
    }
    return getCudaSharedMemoryUnregisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.TraceSettingRequest,
      GrpcService.TraceSettingResponse> getTraceSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TraceSetting",
      requestType = GrpcService.TraceSettingRequest.class,
      responseType = GrpcService.TraceSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.TraceSettingRequest,
      GrpcService.TraceSettingResponse> getTraceSettingMethod() {
    io.grpc.MethodDescriptor<GrpcService.TraceSettingRequest, GrpcService.TraceSettingResponse> getTraceSettingMethod;
    if ((getTraceSettingMethod = GRPCInferenceServiceGrpc.getTraceSettingMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getTraceSettingMethod = GRPCInferenceServiceGrpc.getTraceSettingMethod) == null) {
          GRPCInferenceServiceGrpc.getTraceSettingMethod = getTraceSettingMethod =
              io.grpc.MethodDescriptor.<GrpcService.TraceSettingRequest, GrpcService.TraceSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TraceSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.TraceSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.TraceSettingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("TraceSetting"))
              .build();
        }
      }
    }
    return getTraceSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcService.LogSettingsRequest,
      GrpcService.LogSettingsResponse> getLogSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogSettings",
      requestType = GrpcService.LogSettingsRequest.class,
      responseType = GrpcService.LogSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcService.LogSettingsRequest,
      GrpcService.LogSettingsResponse> getLogSettingsMethod() {
    io.grpc.MethodDescriptor<GrpcService.LogSettingsRequest, GrpcService.LogSettingsResponse> getLogSettingsMethod;
    if ((getLogSettingsMethod = GRPCInferenceServiceGrpc.getLogSettingsMethod) == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        if ((getLogSettingsMethod = GRPCInferenceServiceGrpc.getLogSettingsMethod) == null) {
          GRPCInferenceServiceGrpc.getLogSettingsMethod = getLogSettingsMethod =
              io.grpc.MethodDescriptor.<GrpcService.LogSettingsRequest, GrpcService.LogSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.LogSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcService.LogSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GRPCInferenceServiceMethodDescriptorSupplier("LogSettings"))
              .build();
        }
      }
    }
    return getLogSettingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GRPCInferenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceStub>() {
        @Override
        public GRPCInferenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCInferenceServiceStub(channel, callOptions);
        }
      };
    return GRPCInferenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GRPCInferenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceBlockingStub>() {
        @Override
        public GRPCInferenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCInferenceServiceBlockingStub(channel, callOptions);
        }
      };
    return GRPCInferenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GRPCInferenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GRPCInferenceServiceFutureStub>() {
        @Override
        public GRPCInferenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GRPCInferenceServiceFutureStub(channel, callOptions);
        }
      };
    return GRPCInferenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *&#64;&#64;
   *&#64;&#64;.. cpp:var:: service InferenceService
   *&#64;&#64;
   *&#64;&#64;   Inference Server GRPC endpoints.
   *&#64;&#64;
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerLive(ServerLiveRequest) returns
     *&#64;&#64;       (ServerLiveResponse)
     *&#64;&#64;
     *&#64;&#64;     Check liveness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    default void serverLive(GrpcService.ServerLiveRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.ServerLiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerLiveMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerReady(ServerReadyRequest) returns
     *&#64;&#64;       (ServerReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    default void serverReady(GrpcService.ServerReadyRequest request,
                             io.grpc.stub.StreamObserver<GrpcService.ServerReadyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerReadyMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelReady(ModelReadyRequest) returns
     *&#64;&#64;       (ModelReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of a model in the inference server.
     *&#64;&#64;
     * </pre>
     */
    default void modelReady(GrpcService.ModelReadyRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.ModelReadyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelReadyMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerMetadata(ServerMetadataRequest) returns
     *&#64;&#64;       (ServerMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get server metadata.
     *&#64;&#64;
     * </pre>
     */
    default void serverMetadata(GrpcService.ServerMetadataRequest request,
                                io.grpc.stub.StreamObserver<GrpcService.ServerMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelMetadata(ModelMetadataRequest) returns
     *&#64;&#64;       (ModelMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model metadata.
     *&#64;&#64;
     * </pre>
     */
    default void modelMetadata(GrpcService.ModelMetadataRequest request,
                               io.grpc.stub.StreamObserver<GrpcService.ModelMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelMetadataMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelInfer(ModelInferRequest) returns
     *&#64;&#64;       (ModelInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform inference using a specific model.
     *&#64;&#64;
     * </pre>
     */
    default void modelInfer(GrpcService.ModelInferRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.ModelInferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelInferMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStreamInfer(stream ModelInferRequest) returns
     *&#64;&#64;       (stream ModelStreamInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform streaming inference.
     *&#64;&#64;
     * </pre>
     */
    default io.grpc.stub.StreamObserver<GrpcService.ModelInferRequest> modelStreamInfer(
        io.grpc.stub.StreamObserver<GrpcService.ModelStreamInferResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getModelStreamInferMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelConfig(ModelConfigRequest) returns
     *&#64;&#64;       (ModelConfigResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model configuration.
     *&#64;&#64;
     * </pre>
     */
    default void modelConfig(GrpcService.ModelConfigRequest request,
                             io.grpc.stub.StreamObserver<GrpcService.ModelConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStatistics(
     *&#64;&#64;                     ModelStatisticsRequest)
     *&#64;&#64;                   returns (ModelStatisticsResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the cumulative inference statistics for a model.
     *&#64;&#64;
     * </pre>
     */
    default void modelStatistics(GrpcService.ModelStatisticsRequest request,
                                 io.grpc.stub.StreamObserver<GrpcService.ModelStatisticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelStatisticsMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryIndex(RepositoryIndexRequest) returns
     *&#64;&#64;       (RepositoryIndexResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the index of model repository contents.
     *&#64;&#64;
     * </pre>
     */
    default void repositoryIndex(GrpcService.RepositoryIndexRequest request,
                                 io.grpc.stub.StreamObserver<GrpcService.RepositoryIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepositoryIndexMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelLoad(RepositoryModelLoadRequest) returns
     *&#64;&#64;       (RepositoryModelLoadResponse)
     *&#64;&#64;
     *&#64;&#64;     Load or reload a model from a repository.
     *&#64;&#64;
     * </pre>
     */
    default void repositoryModelLoad(GrpcService.RepositoryModelLoadRequest request,
                                     io.grpc.stub.StreamObserver<GrpcService.RepositoryModelLoadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepositoryModelLoadMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelUnload(RepositoryModelUnloadRequest)
     *&#64;&#64;       returns (RepositoryModelUnloadResponse)
     *&#64;&#64;
     *&#64;&#64;     Unload a model.
     *&#64;&#64;
     * </pre>
     */
    default void repositoryModelUnload(GrpcService.RepositoryModelUnloadRequest request,
                                       io.grpc.stub.StreamObserver<GrpcService.RepositoryModelUnloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepositoryModelUnloadMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryStatus(
     *&#64;&#64;                     SystemSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered system-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    default void systemSharedMemoryStatus(GrpcService.SystemSharedMemoryStatusRequest request,
                                          io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSystemSharedMemoryStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryRegister(
     *&#64;&#64;                     SystemSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    default void systemSharedMemoryRegister(GrpcService.SystemSharedMemoryRegisterRequest request,
                                            io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryRegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSystemSharedMemoryRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryUnregister(
     *&#64;&#64;                     SystemSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    default void systemSharedMemoryUnregister(GrpcService.SystemSharedMemoryUnregisterRequest request,
                                              io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryUnregisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSystemSharedMemoryUnregisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryStatus(
     *&#64;&#64;                     CudaSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered CUDA-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    default void cudaSharedMemoryStatus(GrpcService.CudaSharedMemoryStatusRequest request,
                                        io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCudaSharedMemoryStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryRegister(
     *&#64;&#64;                     CudaSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    default void cudaSharedMemoryRegister(GrpcService.CudaSharedMemoryRegisterRequest request,
                                          io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryRegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCudaSharedMemoryRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryUnregister(
     *&#64;&#64;                     CudaSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    default void cudaSharedMemoryUnregister(GrpcService.CudaSharedMemoryUnregisterRequest request,
                                            io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryUnregisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCudaSharedMemoryUnregisterMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc TraceSetting(TraceSettingRequest)
     *&#64;&#64;                   returns (TraceSettingResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the trace setting of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    default void traceSetting(GrpcService.TraceSettingRequest request,
                              io.grpc.stub.StreamObserver<GrpcService.TraceSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTraceSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc LogSettings(LogSettingsRequest)
     *&#64;&#64;                   returns (LogSettingsResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the log settings of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    default void logSettings(GrpcService.LogSettingsRequest request,
                             io.grpc.stub.StreamObserver<GrpcService.LogSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogSettingsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GRPCInferenceService.
   * <pre>
   *&#64;&#64;
   *&#64;&#64;.. cpp:var:: service InferenceService
   *&#64;&#64;
   *&#64;&#64;   Inference Server GRPC endpoints.
   *&#64;&#64;
   * </pre>
   */
  public static abstract class GRPCInferenceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return GRPCInferenceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GRPCInferenceService.
   * <pre>
   *&#64;&#64;
   *&#64;&#64;.. cpp:var:: service InferenceService
   *&#64;&#64;
   *&#64;&#64;   Inference Server GRPC endpoints.
   *&#64;&#64;
   * </pre>
   */
  public static final class GRPCInferenceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GRPCInferenceServiceStub> {
    private GRPCInferenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GRPCInferenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCInferenceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerLive(ServerLiveRequest) returns
     *&#64;&#64;       (ServerLiveResponse)
     *&#64;&#64;
     *&#64;&#64;     Check liveness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public void serverLive(GrpcService.ServerLiveRequest request,
                           io.grpc.stub.StreamObserver<GrpcService.ServerLiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerLiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerReady(ServerReadyRequest) returns
     *&#64;&#64;       (ServerReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public void serverReady(GrpcService.ServerReadyRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.ServerReadyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelReady(ModelReadyRequest) returns
     *&#64;&#64;       (ModelReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of a model in the inference server.
     *&#64;&#64;
     * </pre>
     */
    public void modelReady(GrpcService.ModelReadyRequest request,
                           io.grpc.stub.StreamObserver<GrpcService.ModelReadyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerMetadata(ServerMetadataRequest) returns
     *&#64;&#64;       (ServerMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get server metadata.
     *&#64;&#64;
     * </pre>
     */
    public void serverMetadata(GrpcService.ServerMetadataRequest request,
                               io.grpc.stub.StreamObserver<GrpcService.ServerMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServerMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelMetadata(ModelMetadataRequest) returns
     *&#64;&#64;       (ModelMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model metadata.
     *&#64;&#64;
     * </pre>
     */
    public void modelMetadata(GrpcService.ModelMetadataRequest request,
                              io.grpc.stub.StreamObserver<GrpcService.ModelMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelMetadataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelInfer(ModelInferRequest) returns
     *&#64;&#64;       (ModelInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform inference using a specific model.
     *&#64;&#64;
     * </pre>
     */
    public void modelInfer(GrpcService.ModelInferRequest request,
                           io.grpc.stub.StreamObserver<GrpcService.ModelInferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelInferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStreamInfer(stream ModelInferRequest) returns
     *&#64;&#64;       (stream ModelStreamInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform streaming inference.
     *&#64;&#64;
     * </pre>
     */
    public io.grpc.stub.StreamObserver<GrpcService.ModelInferRequest> modelStreamInfer(
        io.grpc.stub.StreamObserver<GrpcService.ModelStreamInferResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getModelStreamInferMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelConfig(ModelConfigRequest) returns
     *&#64;&#64;       (ModelConfigResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model configuration.
     *&#64;&#64;
     * </pre>
     */
    public void modelConfig(GrpcService.ModelConfigRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.ModelConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStatistics(
     *&#64;&#64;                     ModelStatisticsRequest)
     *&#64;&#64;                   returns (ModelStatisticsResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the cumulative inference statistics for a model.
     *&#64;&#64;
     * </pre>
     */
    public void modelStatistics(GrpcService.ModelStatisticsRequest request,
                                io.grpc.stub.StreamObserver<GrpcService.ModelStatisticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryIndex(RepositoryIndexRequest) returns
     *&#64;&#64;       (RepositoryIndexResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the index of model repository contents.
     *&#64;&#64;
     * </pre>
     */
    public void repositoryIndex(GrpcService.RepositoryIndexRequest request,
                                io.grpc.stub.StreamObserver<GrpcService.RepositoryIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepositoryIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelLoad(RepositoryModelLoadRequest) returns
     *&#64;&#64;       (RepositoryModelLoadResponse)
     *&#64;&#64;
     *&#64;&#64;     Load or reload a model from a repository.
     *&#64;&#64;
     * </pre>
     */
    public void repositoryModelLoad(GrpcService.RepositoryModelLoadRequest request,
                                    io.grpc.stub.StreamObserver<GrpcService.RepositoryModelLoadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepositoryModelLoadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelUnload(RepositoryModelUnloadRequest)
     *&#64;&#64;       returns (RepositoryModelUnloadResponse)
     *&#64;&#64;
     *&#64;&#64;     Unload a model.
     *&#64;&#64;
     * </pre>
     */
    public void repositoryModelUnload(GrpcService.RepositoryModelUnloadRequest request,
                                      io.grpc.stub.StreamObserver<GrpcService.RepositoryModelUnloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepositoryModelUnloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryStatus(
     *&#64;&#64;                     SystemSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered system-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public void systemSharedMemoryStatus(GrpcService.SystemSharedMemoryStatusRequest request,
                                         io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSystemSharedMemoryStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryRegister(
     *&#64;&#64;                     SystemSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public void systemSharedMemoryRegister(GrpcService.SystemSharedMemoryRegisterRequest request,
                                           io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryRegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSystemSharedMemoryRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryUnregister(
     *&#64;&#64;                     SystemSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public void systemSharedMemoryUnregister(GrpcService.SystemSharedMemoryUnregisterRequest request,
                                             io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryUnregisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSystemSharedMemoryUnregisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryStatus(
     *&#64;&#64;                     CudaSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered CUDA-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public void cudaSharedMemoryStatus(GrpcService.CudaSharedMemoryStatusRequest request,
                                       io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCudaSharedMemoryStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryRegister(
     *&#64;&#64;                     CudaSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public void cudaSharedMemoryRegister(GrpcService.CudaSharedMemoryRegisterRequest request,
                                         io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryRegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCudaSharedMemoryRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryUnregister(
     *&#64;&#64;                     CudaSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public void cudaSharedMemoryUnregister(GrpcService.CudaSharedMemoryUnregisterRequest request,
                                           io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryUnregisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCudaSharedMemoryUnregisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc TraceSetting(TraceSettingRequest)
     *&#64;&#64;                   returns (TraceSettingResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the trace setting of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public void traceSetting(GrpcService.TraceSettingRequest request,
                             io.grpc.stub.StreamObserver<GrpcService.TraceSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTraceSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc LogSettings(LogSettingsRequest)
     *&#64;&#64;                   returns (LogSettingsResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the log settings of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public void logSettings(GrpcService.LogSettingsRequest request,
                            io.grpc.stub.StreamObserver<GrpcService.LogSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogSettingsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GRPCInferenceService.
   * <pre>
   *&#64;&#64;
   *&#64;&#64;.. cpp:var:: service InferenceService
   *&#64;&#64;
   *&#64;&#64;   Inference Server GRPC endpoints.
   *&#64;&#64;
   * </pre>
   */
  public static final class GRPCInferenceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GRPCInferenceServiceBlockingStub> {
    private GRPCInferenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GRPCInferenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCInferenceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerLive(ServerLiveRequest) returns
     *&#64;&#64;       (ServerLiveResponse)
     *&#64;&#64;
     *&#64;&#64;     Check liveness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ServerLiveResponse serverLive(GrpcService.ServerLiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerLiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerReady(ServerReadyRequest) returns
     *&#64;&#64;       (ServerReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ServerReadyResponse serverReady(GrpcService.ServerReadyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerReadyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelReady(ModelReadyRequest) returns
     *&#64;&#64;       (ModelReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of a model in the inference server.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ModelReadyResponse modelReady(GrpcService.ModelReadyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelReadyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerMetadata(ServerMetadataRequest) returns
     *&#64;&#64;       (ServerMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get server metadata.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ServerMetadataResponse serverMetadata(GrpcService.ServerMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServerMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelMetadata(ModelMetadataRequest) returns
     *&#64;&#64;       (ModelMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model metadata.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ModelMetadataResponse modelMetadata(GrpcService.ModelMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelMetadataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelInfer(ModelInferRequest) returns
     *&#64;&#64;       (ModelInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform inference using a specific model.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ModelInferResponse modelInfer(GrpcService.ModelInferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelInferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelConfig(ModelConfigRequest) returns
     *&#64;&#64;       (ModelConfigResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model configuration.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ModelConfigResponse modelConfig(GrpcService.ModelConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStatistics(
     *&#64;&#64;                     ModelStatisticsRequest)
     *&#64;&#64;                   returns (ModelStatisticsResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the cumulative inference statistics for a model.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.ModelStatisticsResponse modelStatistics(GrpcService.ModelStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelStatisticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryIndex(RepositoryIndexRequest) returns
     *&#64;&#64;       (RepositoryIndexResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the index of model repository contents.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.RepositoryIndexResponse repositoryIndex(GrpcService.RepositoryIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepositoryIndexMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelLoad(RepositoryModelLoadRequest) returns
     *&#64;&#64;       (RepositoryModelLoadResponse)
     *&#64;&#64;
     *&#64;&#64;     Load or reload a model from a repository.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.RepositoryModelLoadResponse repositoryModelLoad(GrpcService.RepositoryModelLoadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepositoryModelLoadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelUnload(RepositoryModelUnloadRequest)
     *&#64;&#64;       returns (RepositoryModelUnloadResponse)
     *&#64;&#64;
     *&#64;&#64;     Unload a model.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.RepositoryModelUnloadResponse repositoryModelUnload(GrpcService.RepositoryModelUnloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepositoryModelUnloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryStatus(
     *&#64;&#64;                     SystemSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered system-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.SystemSharedMemoryStatusResponse systemSharedMemoryStatus(GrpcService.SystemSharedMemoryStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSystemSharedMemoryStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryRegister(
     *&#64;&#64;                     SystemSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.SystemSharedMemoryRegisterResponse systemSharedMemoryRegister(GrpcService.SystemSharedMemoryRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSystemSharedMemoryRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryUnregister(
     *&#64;&#64;                     SystemSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.SystemSharedMemoryUnregisterResponse systemSharedMemoryUnregister(GrpcService.SystemSharedMemoryUnregisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSystemSharedMemoryUnregisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryStatus(
     *&#64;&#64;                     CudaSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered CUDA-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.CudaSharedMemoryStatusResponse cudaSharedMemoryStatus(GrpcService.CudaSharedMemoryStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCudaSharedMemoryStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryRegister(
     *&#64;&#64;                     CudaSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.CudaSharedMemoryRegisterResponse cudaSharedMemoryRegister(GrpcService.CudaSharedMemoryRegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCudaSharedMemoryRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryUnregister(
     *&#64;&#64;                     CudaSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.CudaSharedMemoryUnregisterResponse cudaSharedMemoryUnregister(GrpcService.CudaSharedMemoryUnregisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCudaSharedMemoryUnregisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc TraceSetting(TraceSettingRequest)
     *&#64;&#64;                   returns (TraceSettingResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the trace setting of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.TraceSettingResponse traceSetting(GrpcService.TraceSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTraceSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc LogSettings(LogSettingsRequest)
     *&#64;&#64;                   returns (LogSettingsResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the log settings of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public GrpcService.LogSettingsResponse logSettings(GrpcService.LogSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogSettingsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GRPCInferenceService.
   * <pre>
   *&#64;&#64;
   *&#64;&#64;.. cpp:var:: service InferenceService
   *&#64;&#64;
   *&#64;&#64;   Inference Server GRPC endpoints.
   *&#64;&#64;
   * </pre>
   */
  public static final class GRPCInferenceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GRPCInferenceServiceFutureStub> {
    private GRPCInferenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GRPCInferenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GRPCInferenceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerLive(ServerLiveRequest) returns
     *&#64;&#64;       (ServerLiveResponse)
     *&#64;&#64;
     *&#64;&#64;     Check liveness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ServerLiveResponse> serverLive(
        GrpcService.ServerLiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerLiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerReady(ServerReadyRequest) returns
     *&#64;&#64;       (ServerReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of the inference server.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ServerReadyResponse> serverReady(
        GrpcService.ServerReadyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerReadyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelReady(ModelReadyRequest) returns
     *&#64;&#64;       (ModelReadyResponse)
     *&#64;&#64;
     *&#64;&#64;     Check readiness of a model in the inference server.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ModelReadyResponse> modelReady(
        GrpcService.ModelReadyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelReadyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ServerMetadata(ServerMetadataRequest) returns
     *&#64;&#64;       (ServerMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get server metadata.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ServerMetadataResponse> serverMetadata(
        GrpcService.ServerMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServerMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelMetadata(ModelMetadataRequest) returns
     *&#64;&#64;       (ModelMetadataResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model metadata.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ModelMetadataResponse> modelMetadata(
        GrpcService.ModelMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelMetadataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelInfer(ModelInferRequest) returns
     *&#64;&#64;       (ModelInferResponse)
     *&#64;&#64;
     *&#64;&#64;     Perform inference using a specific model.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ModelInferResponse> modelInfer(
        GrpcService.ModelInferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelInferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelConfig(ModelConfigRequest) returns
     *&#64;&#64;       (ModelConfigResponse)
     *&#64;&#64;
     *&#64;&#64;     Get model configuration.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ModelConfigResponse> modelConfig(
        GrpcService.ModelConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc ModelStatistics(
     *&#64;&#64;                     ModelStatisticsRequest)
     *&#64;&#64;                   returns (ModelStatisticsResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the cumulative inference statistics for a model.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.ModelStatisticsResponse> modelStatistics(
        GrpcService.ModelStatisticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelStatisticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryIndex(RepositoryIndexRequest) returns
     *&#64;&#64;       (RepositoryIndexResponse)
     *&#64;&#64;
     *&#64;&#64;     Get the index of model repository contents.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.RepositoryIndexResponse> repositoryIndex(
        GrpcService.RepositoryIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepositoryIndexMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelLoad(RepositoryModelLoadRequest) returns
     *&#64;&#64;       (RepositoryModelLoadResponse)
     *&#64;&#64;
     *&#64;&#64;     Load or reload a model from a repository.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.RepositoryModelLoadResponse> repositoryModelLoad(
        GrpcService.RepositoryModelLoadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepositoryModelLoadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc RepositoryModelUnload(RepositoryModelUnloadRequest)
     *&#64;&#64;       returns (RepositoryModelUnloadResponse)
     *&#64;&#64;
     *&#64;&#64;     Unload a model.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.RepositoryModelUnloadResponse> repositoryModelUnload(
        GrpcService.RepositoryModelUnloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepositoryModelUnloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryStatus(
     *&#64;&#64;                     SystemSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered system-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.SystemSharedMemoryStatusResponse> systemSharedMemoryStatus(
        GrpcService.SystemSharedMemoryStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSystemSharedMemoryStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryRegister(
     *&#64;&#64;                     SystemSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.SystemSharedMemoryRegisterResponse> systemSharedMemoryRegister(
        GrpcService.SystemSharedMemoryRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSystemSharedMemoryRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc SystemSharedMemoryUnregister(
     *&#64;&#64;                     SystemSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (SystemSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a system-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.SystemSharedMemoryUnregisterResponse> systemSharedMemoryUnregister(
        GrpcService.SystemSharedMemoryUnregisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSystemSharedMemoryUnregisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryStatus(
     *&#64;&#64;                     CudaSharedMemoryStatusRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryStatusRespose)
     *&#64;&#64;
     *&#64;&#64;     Get the status of all registered CUDA-shared-memory regions.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.CudaSharedMemoryStatusResponse> cudaSharedMemoryStatus(
        GrpcService.CudaSharedMemoryStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCudaSharedMemoryStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryRegister(
     *&#64;&#64;                     CudaSharedMemoryRegisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryRegisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Register a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.CudaSharedMemoryRegisterResponse> cudaSharedMemoryRegister(
        GrpcService.CudaSharedMemoryRegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCudaSharedMemoryRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc CudaSharedMemoryUnregister(
     *&#64;&#64;                     CudaSharedMemoryUnregisterRequest)
     *&#64;&#64;                   returns (CudaSharedMemoryUnregisterResponse)
     *&#64;&#64;
     *&#64;&#64;     Unregister a CUDA-shared-memory region.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.CudaSharedMemoryUnregisterResponse> cudaSharedMemoryUnregister(
        GrpcService.CudaSharedMemoryUnregisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCudaSharedMemoryUnregisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc TraceSetting(TraceSettingRequest)
     *&#64;&#64;                   returns (TraceSettingResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the trace setting of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.TraceSettingResponse> traceSetting(
        GrpcService.TraceSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTraceSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;&#64;  .. cpp:var:: rpc LogSettings(LogSettingsRequest)
     *&#64;&#64;                   returns (LogSettingsResponse)
     *&#64;&#64;
     *&#64;&#64;     Update and get the log settings of the Triton server.
     *&#64;&#64;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcService.LogSettingsResponse> logSettings(
        GrpcService.LogSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogSettingsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVER_LIVE = 0;
  private static final int METHODID_SERVER_READY = 1;
  private static final int METHODID_MODEL_READY = 2;
  private static final int METHODID_SERVER_METADATA = 3;
  private static final int METHODID_MODEL_METADATA = 4;
  private static final int METHODID_MODEL_INFER = 5;
  private static final int METHODID_MODEL_CONFIG = 6;
  private static final int METHODID_MODEL_STATISTICS = 7;
  private static final int METHODID_REPOSITORY_INDEX = 8;
  private static final int METHODID_REPOSITORY_MODEL_LOAD = 9;
  private static final int METHODID_REPOSITORY_MODEL_UNLOAD = 10;
  private static final int METHODID_SYSTEM_SHARED_MEMORY_STATUS = 11;
  private static final int METHODID_SYSTEM_SHARED_MEMORY_REGISTER = 12;
  private static final int METHODID_SYSTEM_SHARED_MEMORY_UNREGISTER = 13;
  private static final int METHODID_CUDA_SHARED_MEMORY_STATUS = 14;
  private static final int METHODID_CUDA_SHARED_MEMORY_REGISTER = 15;
  private static final int METHODID_CUDA_SHARED_MEMORY_UNREGISTER = 16;
  private static final int METHODID_TRACE_SETTING = 17;
  private static final int METHODID_LOG_SETTINGS = 18;
  private static final int METHODID_MODEL_STREAM_INFER = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_LIVE:
          serviceImpl.serverLive((GrpcService.ServerLiveRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ServerLiveResponse>) responseObserver);
          break;
        case METHODID_SERVER_READY:
          serviceImpl.serverReady((GrpcService.ServerReadyRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ServerReadyResponse>) responseObserver);
          break;
        case METHODID_MODEL_READY:
          serviceImpl.modelReady((GrpcService.ModelReadyRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ModelReadyResponse>) responseObserver);
          break;
        case METHODID_SERVER_METADATA:
          serviceImpl.serverMetadata((GrpcService.ServerMetadataRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ServerMetadataResponse>) responseObserver);
          break;
        case METHODID_MODEL_METADATA:
          serviceImpl.modelMetadata((GrpcService.ModelMetadataRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ModelMetadataResponse>) responseObserver);
          break;
        case METHODID_MODEL_INFER:
          serviceImpl.modelInfer((GrpcService.ModelInferRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ModelInferResponse>) responseObserver);
          break;
        case METHODID_MODEL_CONFIG:
          serviceImpl.modelConfig((GrpcService.ModelConfigRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ModelConfigResponse>) responseObserver);
          break;
        case METHODID_MODEL_STATISTICS:
          serviceImpl.modelStatistics((GrpcService.ModelStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.ModelStatisticsResponse>) responseObserver);
          break;
        case METHODID_REPOSITORY_INDEX:
          serviceImpl.repositoryIndex((GrpcService.RepositoryIndexRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.RepositoryIndexResponse>) responseObserver);
          break;
        case METHODID_REPOSITORY_MODEL_LOAD:
          serviceImpl.repositoryModelLoad((GrpcService.RepositoryModelLoadRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.RepositoryModelLoadResponse>) responseObserver);
          break;
        case METHODID_REPOSITORY_MODEL_UNLOAD:
          serviceImpl.repositoryModelUnload((GrpcService.RepositoryModelUnloadRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.RepositoryModelUnloadResponse>) responseObserver);
          break;
        case METHODID_SYSTEM_SHARED_MEMORY_STATUS:
          serviceImpl.systemSharedMemoryStatus((GrpcService.SystemSharedMemoryStatusRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryStatusResponse>) responseObserver);
          break;
        case METHODID_SYSTEM_SHARED_MEMORY_REGISTER:
          serviceImpl.systemSharedMemoryRegister((GrpcService.SystemSharedMemoryRegisterRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryRegisterResponse>) responseObserver);
          break;
        case METHODID_SYSTEM_SHARED_MEMORY_UNREGISTER:
          serviceImpl.systemSharedMemoryUnregister((GrpcService.SystemSharedMemoryUnregisterRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.SystemSharedMemoryUnregisterResponse>) responseObserver);
          break;
        case METHODID_CUDA_SHARED_MEMORY_STATUS:
          serviceImpl.cudaSharedMemoryStatus((GrpcService.CudaSharedMemoryStatusRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryStatusResponse>) responseObserver);
          break;
        case METHODID_CUDA_SHARED_MEMORY_REGISTER:
          serviceImpl.cudaSharedMemoryRegister((GrpcService.CudaSharedMemoryRegisterRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryRegisterResponse>) responseObserver);
          break;
        case METHODID_CUDA_SHARED_MEMORY_UNREGISTER:
          serviceImpl.cudaSharedMemoryUnregister((GrpcService.CudaSharedMemoryUnregisterRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.CudaSharedMemoryUnregisterResponse>) responseObserver);
          break;
        case METHODID_TRACE_SETTING:
          serviceImpl.traceSetting((GrpcService.TraceSettingRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.TraceSettingResponse>) responseObserver);
          break;
        case METHODID_LOG_SETTINGS:
          serviceImpl.logSettings((GrpcService.LogSettingsRequest) request,
              (io.grpc.stub.StreamObserver<GrpcService.LogSettingsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MODEL_STREAM_INFER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.modelStreamInfer(
              (io.grpc.stub.StreamObserver<GrpcService.ModelStreamInferResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getServerLiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ServerLiveRequest,
              GrpcService.ServerLiveResponse>(
                service, METHODID_SERVER_LIVE)))
        .addMethod(
          getServerReadyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ServerReadyRequest,
              GrpcService.ServerReadyResponse>(
                service, METHODID_SERVER_READY)))
        .addMethod(
          getModelReadyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ModelReadyRequest,
              GrpcService.ModelReadyResponse>(
                service, METHODID_MODEL_READY)))
        .addMethod(
          getServerMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ServerMetadataRequest,
              GrpcService.ServerMetadataResponse>(
                service, METHODID_SERVER_METADATA)))
        .addMethod(
          getModelMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ModelMetadataRequest,
              GrpcService.ModelMetadataResponse>(
                service, METHODID_MODEL_METADATA)))
        .addMethod(
          getModelInferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ModelInferRequest,
              GrpcService.ModelInferResponse>(
                service, METHODID_MODEL_INFER)))
        .addMethod(
          getModelStreamInferMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              GrpcService.ModelInferRequest,
              GrpcService.ModelStreamInferResponse>(
                service, METHODID_MODEL_STREAM_INFER)))
        .addMethod(
          getModelConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ModelConfigRequest,
              GrpcService.ModelConfigResponse>(
                service, METHODID_MODEL_CONFIG)))
        .addMethod(
          getModelStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.ModelStatisticsRequest,
              GrpcService.ModelStatisticsResponse>(
                service, METHODID_MODEL_STATISTICS)))
        .addMethod(
          getRepositoryIndexMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.RepositoryIndexRequest,
              GrpcService.RepositoryIndexResponse>(
                service, METHODID_REPOSITORY_INDEX)))
        .addMethod(
          getRepositoryModelLoadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.RepositoryModelLoadRequest,
              GrpcService.RepositoryModelLoadResponse>(
                service, METHODID_REPOSITORY_MODEL_LOAD)))
        .addMethod(
          getRepositoryModelUnloadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.RepositoryModelUnloadRequest,
              GrpcService.RepositoryModelUnloadResponse>(
                service, METHODID_REPOSITORY_MODEL_UNLOAD)))
        .addMethod(
          getSystemSharedMemoryStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.SystemSharedMemoryStatusRequest,
              GrpcService.SystemSharedMemoryStatusResponse>(
                service, METHODID_SYSTEM_SHARED_MEMORY_STATUS)))
        .addMethod(
          getSystemSharedMemoryRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.SystemSharedMemoryRegisterRequest,
              GrpcService.SystemSharedMemoryRegisterResponse>(
                service, METHODID_SYSTEM_SHARED_MEMORY_REGISTER)))
        .addMethod(
          getSystemSharedMemoryUnregisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.SystemSharedMemoryUnregisterRequest,
              GrpcService.SystemSharedMemoryUnregisterResponse>(
                service, METHODID_SYSTEM_SHARED_MEMORY_UNREGISTER)))
        .addMethod(
          getCudaSharedMemoryStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.CudaSharedMemoryStatusRequest,
              GrpcService.CudaSharedMemoryStatusResponse>(
                service, METHODID_CUDA_SHARED_MEMORY_STATUS)))
        .addMethod(
          getCudaSharedMemoryRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.CudaSharedMemoryRegisterRequest,
              GrpcService.CudaSharedMemoryRegisterResponse>(
                service, METHODID_CUDA_SHARED_MEMORY_REGISTER)))
        .addMethod(
          getCudaSharedMemoryUnregisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.CudaSharedMemoryUnregisterRequest,
              GrpcService.CudaSharedMemoryUnregisterResponse>(
                service, METHODID_CUDA_SHARED_MEMORY_UNREGISTER)))
        .addMethod(
          getTraceSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.TraceSettingRequest,
              GrpcService.TraceSettingResponse>(
                service, METHODID_TRACE_SETTING)))
        .addMethod(
          getLogSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              GrpcService.LogSettingsRequest,
              GrpcService.LogSettingsResponse>(
                service, METHODID_LOG_SETTINGS)))
        .build();
  }

  private static abstract class GRPCInferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GRPCInferenceServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcService.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GRPCInferenceService");
    }
  }

  private static final class GRPCInferenceServiceFileDescriptorSupplier
      extends GRPCInferenceServiceBaseDescriptorSupplier {
    GRPCInferenceServiceFileDescriptorSupplier() {}
  }

  private static final class GRPCInferenceServiceMethodDescriptorSupplier
      extends GRPCInferenceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GRPCInferenceServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GRPCInferenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GRPCInferenceServiceFileDescriptorSupplier())
              .addMethod(getServerLiveMethod())
              .addMethod(getServerReadyMethod())
              .addMethod(getModelReadyMethod())
              .addMethod(getServerMetadataMethod())
              .addMethod(getModelMetadataMethod())
              .addMethod(getModelInferMethod())
              .addMethod(getModelStreamInferMethod())
              .addMethod(getModelConfigMethod())
              .addMethod(getModelStatisticsMethod())
              .addMethod(getRepositoryIndexMethod())
              .addMethod(getRepositoryModelLoadMethod())
              .addMethod(getRepositoryModelUnloadMethod())
              .addMethod(getSystemSharedMemoryStatusMethod())
              .addMethod(getSystemSharedMemoryRegisterMethod())
              .addMethod(getSystemSharedMemoryUnregisterMethod())
              .addMethod(getCudaSharedMemoryStatusMethod())
              .addMethod(getCudaSharedMemoryRegisterMethod())
              .addMethod(getCudaSharedMemoryUnregisterMethod())
              .addMethod(getTraceSettingMethod())
              .addMethod(getLogSettingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
