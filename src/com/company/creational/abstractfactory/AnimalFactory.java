package com.company.creational.abstractfactory;
//2
public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if (animalType.equals("duck")) return new Duck();
        return null;
    }
}
