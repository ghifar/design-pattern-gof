package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//As flyweight pattern. look at the static field
public class ShapeFactory {
    private static final Map<String, Object> circleMap = new HashMap<>();


    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("\t\tCreating circle of color: " + color);
        }
        return circle;
    }
}
