package com.db.http_codes;

public class RedirectionHandler implements HttpCodeHandler{
    @Override
    public void handle() {
        System.out.println("RedirectionHandler");
    }
}
