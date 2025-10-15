// Copyright (c) 2021, NVIDIA CORPORATION & AFFILIATES. All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
//  * Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
//  * Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
//  * Neither the name of NVIDIA CORPORATION nor the names of its
//    contributors may be used to endorse or promote products derived
//    from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS ``AS IS'' AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
// PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
// CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
// EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
// PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
// PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY
// OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package triton.client.examples;

import com.google.common.collect.Lists;
import triton.client.InferInput;
import triton.client.InferRequestedOutput;
import triton.client.InferResult;
import triton.client.InferenceServerClient;
import triton.client.pojo.DataType;

import java.util.Arrays;
import java.util.List;

public class Densenet1OnnxTest {
  public static void main(String[] args) throws Exception
  {
    // Create the data for the input tensor.
    InferInput input0 = new InferInput("x", new long[] { 3, 224, 224 }, DataType.FP32);
    float[] input0_data = new float[1 * 3 * 224 * 224]; // 150528个元素
    // 初始化数据，例如用0填充或加载真实图像数据
    Arrays.fill(input0_data, 0.0f);
    input0.setData(input0_data, false);

    List<InferInput> inputs = Lists.newArrayList(input0);
//    List<InferRequestedOutput> outputs =
//            Lists.newArrayList(new InferRequestedOutput("fc6_1", true));

    InferenceServerClient client =
            new InferenceServerClient("192.168.61.76:8000", 5000, 5000);
//    InferResult result =
//            client.infer("densenet_onnx", inputs, outputs);

    InferResult result =
            client.infer("densenet_onnx1", inputs, null);

    // Get the output arrays from the results and verify
    List<String> output0 = result.getOutputs();

    System.exit(0);
  }
}
