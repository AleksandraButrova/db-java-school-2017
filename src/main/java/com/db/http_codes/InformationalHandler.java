package com.db.http_codes;

public class InformationalHandler implements HttpCodeHandler{
    @Override
    public void handle() {
        System.out.println("InformationalHandler");
    }
}
