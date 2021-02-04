package com.company.creational.abstractfactory;
//4
public class Duck  implements Animal{

        @Override
        public String makeSound() {
            return "Quackkkk";
        }

        @Override
        public String getAnimal() {
            return "Duck";
        }
}
