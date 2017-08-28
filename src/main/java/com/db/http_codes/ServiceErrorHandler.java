package com.db.http_codes;

public class ServiceErrorHandler implements HttpCodeHandler{
    @Override
    public void handle() {
        System.out.println("ServiceErrorHandler");
    }
}
