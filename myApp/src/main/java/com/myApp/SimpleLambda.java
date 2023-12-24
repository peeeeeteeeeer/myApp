package com.myApp;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class SimpleLambda implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();

        // Log the request for debugging purposes
        System.out.println("Received request: " + input.toString());

        // Your logic to handle the GET request and generate a response
        String responseBody = "Hello from Lambda!";
        int statusCode = 200;

        // Set the response properties
        responseEvent.setStatusCode(statusCode);
        responseEvent.setBody(responseBody);

        return responseEvent;
    }
}