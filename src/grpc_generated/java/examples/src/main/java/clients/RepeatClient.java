package clients;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.google.common.util.concurrent.ListenableFuture;
import inference.GRPCInferenceServiceGrpc;
import inference.GrpcService;
import inference.GrpcService.ModelInferRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.ServerCallStreamObserver;

public class RepeatClient {
    static class UserData {
        public final BlockingQueue<Object> completedRequests = new LinkedBlockingQueue<>();
    }

//    static void callback(UserData userData, InferResult result, Exception error) {
//        if (error != null) {
//            userData.completedRequests.offer(error);
//        } else {
//            userData.completedRequests.offer(result);
//        }
//    }

    public static void main(String[] args) {
        // This client sends a single request to the model with the
        // following tensor data. In compliance with the behavior
        // of repeat_int32 model, it will expect the 4 responses
        // with output: [4], [2], [0] and [1] respectively.
        String modelName = "repeat_int32";
        String model_version = "";

        int[] inValue = {4, 2, 0, 1};
        int[] delayValue = {1, 2, 3, 4};
        int waitValue = 5;

        List<ModelInferRequest.InferInputTensor> inputs = new ArrayList<>();
        List<ModelInferRequest.InferRequestedOutputTensor> outputs = new ArrayList<>();
        UserData userData = new UserData();

        try {
            // Create gRPC channel and stub
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8001)
                    .usePlaintext()
                    .build();

            GRPCInferenceServiceGrpc.GRPCInferenceServiceStub asyncStub =
                    GRPCInferenceServiceGrpc.newStub(channel);

            // check server is live
            GrpcService.ServerLiveRequest serverLiveRequest = GrpcService.ServerLiveRequest.getDefaultInstance();
            asyncStub.serverLive(serverLiveRequest, null);

            // Generate the request
            ModelInferRequest.Builder request = ModelInferRequest.newBuilder();
            request.setModelName(modelName);
            request.setModelVersion(model_version);

            // Set up inputs
            // Note: Java Triton client API may vary - this is conceptual representation
            ModelInferRequest.InferInputTensor input1 = ModelInferRequest.InferInputTensor.newBuilder()
                    .setName("IN")
                    .setDatatype("INT32")
                    .addShape(inValue.length)
                    .build();

            ModelInferRequest.InferInputTensor input2 = ModelInferRequest.InferInputTensor.newBuilder()
                    .setName("DELAY")
                    .setDatatype("UINT32")
                    .addShape(delayValue.length)
                    .build();

            ModelInferRequest.InferInputTensor input3 = ModelInferRequest.InferInputTensor.newBuilder()
                    .setName("WAIT")
                    .setDatatype("UINT32")
                    .addShape(1)
                    .build();

            inputs.add(input1);
            inputs.add(input2);
            inputs.add(input3);
            request.addInputs(0, input1);
            request.addInputs(1, input2);
            request.addInputs(2, input3);

            // Set up outputs
            ModelInferRequest.InferRequestedOutputTensor output1 = ModelInferRequest.InferRequestedOutputTensor.newBuilder()
                    .setName("OUT")
                    .build();

            ModelInferRequest.InferRequestedOutputTensor output2 = ModelInferRequest.InferRequestedOutputTensor.newBuilder()
                    .setName("IDX")
                    .build();

            outputs.add(output1);
            outputs.add(output2);
            request.addOutputs(0, output1);
            request.addOutputs(1, output2);

            ServerCallStreamObserver<GrpcService.ModelStreamInferResponse> observer = asyncStub.modelStreamInfer(null);
            asyncStub.modelStreamInfer();

            // Start stream
            // Note: Actual streaming implementation would require setting up
            // proper bidirectional streaming with StreamObserver

            // Set input data
            // Note: Data setting methods would depend on actual Java client API

            String requestId = "0";

            // Send inference request
            // Note: Actual implementation would use asyncStub.ModelInferStream()
            // with appropriate StreamObserver setup

            // Retrieve results
            int recvCount = 0;
            int expectedCount = inValue.length;
            Map<String, List<Map.Entry<Integer, Object>>> resultDict = new HashMap<>();

            while (recvCount < expectedCount) {
                Object dataItem = userData.completedRequests.take();

                if (dataItem instanceof Exception) {
                    throw (Exception) dataItem;
                } else {
                    // Extract response ID - conceptual representation
                    // Actual implementation depends on Java client API
                    String thisId = extractResponseId(dataItem);

                    if (!resultDict.containsKey(thisId)) {
                        resultDict.put(thisId, new ArrayList<>());
                    }

                    resultDict.get(thisId).add(new AbstractMap.SimpleEntry<>(recvCount, dataItem));
                    recvCount++;
                }
            }

            // Validate results
            List<Map.Entry<Integer, Object>> resultList = resultDict.get(requestId);
            if (resultList.size() != inValue.length) {
                System.err.println(String.format(
                        "expected %d many responses for request id %s, got %d",
                        inValue.length, requestId, resultList.size()));
                System.exit(1);
            }

            for (int i = 0; i < resultList.size(); i++) {
                int expectedData = inValue[i];
                // Extract actual data - conceptual representation
                int actualData = extractOutputData(resultList.get(i).getValue(), "OUT");

                if (expectedData != actualData) {
                    System.err.println(String.format(
                            "incorrect data: expected %d, got %d",
                            expectedData, actualData));
                    System.exit(1);
                }
            }

            System.out.println("PASS: repeat_int32");
            System.exit(0);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    // Helper methods - conceptual representations as actual implementation
// depends on the specific Java Triton client API
    private static String extractResponseId(Object dataItem) {
        // Implementation depends on actual API
        return "0"; // Placeholder
    }

    private static int extractOutputData(Object result, String outputName) {
        // Implementation depends on actual API
        return 0; // Placeholder
    }
}
