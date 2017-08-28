package com.db.http_codes;

public class ClientErrorHandler implements HttpCodeHandler{
    @Override
    public void handle() {
        System.out.println("ServiceErrorHandler");
    }
}
