package com.db.never_use_switch;

public enum MailCodes {
    WellcomeCode(1, new WelcomeMailGenerator()),
    DoNotResponseCode(2, new DoNotResponseMailGenerator());

    int code;
    MailGenerator generator;

    MailCodes(int code, MailGenerator generator){
        this.code = code;
        this.generator = generator;
    }


    public static MailGenerator findGeneratorByCode(int code){
        for (MailCodes mc : values()){
            if (mc.code == code){
                return mc.generator;
            } else {
                throw new RuntimeException("Code " + code + " does not exist.");
            }
        }
        return null;
    }
}
