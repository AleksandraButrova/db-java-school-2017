package com.db.http_codes;

public class SuccessHandler implements HttpCodeHandler{
    @Override
    public void handle() {
        System.out.println("SuccessHandler");
    }
}
