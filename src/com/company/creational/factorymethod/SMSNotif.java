package com.company.creational.factorymethod;

public class SMSNotif implements Notification {
    @Override
    public String notifyUser() {
        return "Sends an SMS notification";
    }
}
