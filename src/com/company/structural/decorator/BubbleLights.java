package com.company.structural.decorator;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithBuble();
    }

    private String decorateWithBuble() {
        return " with bubble light";
    }
}
