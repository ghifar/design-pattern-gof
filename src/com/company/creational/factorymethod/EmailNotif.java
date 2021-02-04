package com.company.creational.factorymethod;

public class EmailNotif implements Notification {
    @Override
    public String notifyUser() {
        return "Sends an Email notif";
    }
}
