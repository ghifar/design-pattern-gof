package com.company.creational.abstractfactory;

//1
public interface AbstractFactory<T> {
    T create(String animalType);
}

