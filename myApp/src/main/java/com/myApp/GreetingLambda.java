package com.myApp;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingLambda implements RequestHandler<ApiGatewayRequest, ApiGatewayResponse> {

    @Override
    public ApiGatewayResponse handleRequest(ApiGatewayRequest input, Context context) {
        String name = input.getQueryStringParameters().getOrDefault("name", "Guest");
        String greeting = "Hello, " + name + "!";

        return new ApiGatewayResponse(greeting, 200);
    }
}