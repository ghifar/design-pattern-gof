package com.company.structural.facade;

// As the facade class
public class FacadePattern {
    private Shape circle;
    private Shape rectangle;

    public FacadePattern() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
