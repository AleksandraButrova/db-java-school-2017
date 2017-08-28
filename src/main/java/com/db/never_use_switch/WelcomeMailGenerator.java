package com.db.never_use_switch;

public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public void generateMail(ClientData clientData) {
        System.out.println("Welcome mail was generated");
    }
}
