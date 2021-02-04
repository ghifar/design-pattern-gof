package com.company.structural.proxy;

//as the proxy pattern. will use it to access real image. through proxyImage
// display method will reaccess through this proxyImage if Realimage already accessed before.
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filaName;

    public ProxyImage(String filaName) {
        this.filaName = filaName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filaName);
        }
        realImage.display();
    }
}
