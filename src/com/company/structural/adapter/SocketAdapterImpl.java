package com.company.structural.adapter;

public class SocketAdapterImpl implements SocketAdapter {
    //Composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get20Volt() {
        Volt v = socket.getVolt();
        return v;
    }

    @Override
    public Volt get30Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 30);
    }

    @Override
    public Volt get40Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
