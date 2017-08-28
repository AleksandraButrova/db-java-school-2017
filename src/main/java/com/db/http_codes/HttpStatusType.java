package com.db.http_codes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public enum HttpStatusType {
    INFORMATION(100, 199, new InformationalHandler()),
    SUCCESS(200, 299, new SuccessHandler()),
    REDIRECTION(300, 399, new RedirectionHandler()),
    CLIENT_ERROR(400, 499, new ClientErrorHandler()),
    SERVICE_ERROR(500, 599, new ServiceErrorHandler());

    int codeBegin;
    int codeEnd;
    @Getter
    @Setter
    HttpCodeHandler handler;

    HttpStatusType(int codeBegin, int codeEnd, HttpCodeHandler handler){
        this.codeBegin = codeBegin;
        this.codeEnd = codeEnd;
        this.handler = handler;
    }

    public static HttpStatusType getTypeByCode(int errorCode) {
        for (HttpStatusType type : values()) {
            if (type.codeBegin <= errorCode && errorCode <= type.codeEnd)
                return type;
        }
        throw new RuntimeException(errorCode + " not found");
    }

}


