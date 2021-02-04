package com.company.structural.adapter;

//Original socket
public class Socket {
    public Volt getVolt() {
        return new Volt(20);
    }
}
