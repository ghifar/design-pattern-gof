package com.company.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("\t Connecting to real image " + fileName);
    }

    @Override
    public void display() {
        System.out.println("\t Displaying " + fileName);
    }
}
