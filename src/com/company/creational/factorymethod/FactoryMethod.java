package com.company.creational.factorymethod;

public class FactoryMethod {
    public static Notification createNotification(String type) {

        if (type.equals("email")) {
            return new EmailNotif();
        }
        if (type.equals("sms")) {
            return new SMSNotif();
        }
        return null;
    }
}
