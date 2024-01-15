package com.myApp;

public class ApiGatewayResponse {
    private String body;
    private int statusCode;

    public ApiGatewayResponse(String body, int statusCode) {
        this.body = body;
        this.statusCode = statusCode;
    }

    public String getBody() {
        return body;
    }

    public int getStatusCode() {
        return statusCode;
    }
}