package com.myApp;
import java.util.Map;

public class ApiGatewayResponse {
    private final int statusCode;
    private final Map<String, ?> body;

    public ApiGatewayResponse(int statusCode, Map<String, ?> body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, ?> getBody() {
        return body;
    }
}