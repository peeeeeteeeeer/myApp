package com.myApp;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class GreetingLambda implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

    @Override
    public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
        // Extracting information from the API Gateway input
        String httpMethod = (String) input.get("httpMethod");
        String path = (String) input.get("path");

        // Handling different HTTP methods
        if ("GET".equals(httpMethod)) {
            // Responding to a GET request
            Map<String, String> responseBody = new HashMap<>();
            responseBody.put("message", "Hello! You requested the resource at " + path);

            return new ApiGatewayResponse(200, responseBody);
        } else {
            // Responding with an error for unsupported methods
            Map<String, String> responseBody = new HashMap<>();
            responseBody.put("error", "Method " + httpMethod + " not supported");

            return new ApiGatewayResponse(405, responseBody);
        }
    }
}