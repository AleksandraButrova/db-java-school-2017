package com.db.never_use_switch;

/**
 * Created by Evegeny on 24/08/2017.
 */
public class MailSender {
    public void sendMail(MailInfo mailInfo){
        try {
            MailCodes.findGeneratorByCode(mailInfo.getMailCode()).generateMail(mailInfo.getClientData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
