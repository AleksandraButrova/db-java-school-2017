package com.db.http_codes;

public class HttpServiceImpl implements HttpService {
    @Override
    public void handleHttpCode(int code) {
        HttpStatusType.getTypeByCode(code).getHandler().handle();
    }
}
