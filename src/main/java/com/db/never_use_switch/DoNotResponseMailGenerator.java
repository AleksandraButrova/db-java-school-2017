package com.db.never_use_switch;

public class DoNotResponseMailGenerator implements MailGenerator {
    @Override
    public void generateMail(ClientData clientData) {
        System.out.println("Do not response mail was generated");
    }
}
