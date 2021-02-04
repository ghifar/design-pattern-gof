package com.company.creational.singleton;

public class Singleton {

    public String helloworld(String value){
        return value;
    }

    public final static Singleton getSingleton(){
        return new Singleton();
    }


}
