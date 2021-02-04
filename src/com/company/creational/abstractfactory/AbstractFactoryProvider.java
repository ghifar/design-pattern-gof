package com.company.creational.abstractfactory;
//5
public class AbstractFactoryProvider {
    public static AbstractFactory getFactory(String type) {
        if (type.equals("animal")) return new AnimalFactory();
        return null;
    }
}
