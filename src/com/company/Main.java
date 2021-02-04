package com.company;


import com.company.creational.abstractfactory.*;
import com.company.creational.factorymethod.FactoryMethod;
import com.company.creational.factorymethod.Notification;
import com.company.creational.initialbuilder.InitialBuilder;
import com.company.creational.singleton.Singleton;
import com.company.structural.adapter.SocketAdapter;
import com.company.structural.adapter.SocketAdapterImpl;
import com.company.structural.bridge.Blue;
import com.company.structural.bridge.Shape;
import com.company.structural.bridge.Square;
import com.company.structural.composite.Department;
import com.company.structural.composite.FinancialDepartment;
import com.company.structural.composite.HeadDepartment;
import com.company.structural.composite.SalesDepartment;
import com.company.structural.decorator.BubbleLights;
import com.company.structural.decorator.ChristmasTree;
import com.company.structural.decorator.ChristmasTreeImpl;
import com.company.structural.facade.FacadePattern;
import com.company.structural.flyweight.FlyweightyPattern;
import com.company.structural.proxy.Image;
import com.company.structural.proxy.ProxyImage;

public class Main {
    public static void main(String[] args) {
        //Abstract factory
        AbstractFactory abstractFactory;
        abstractFactory = AbstractFactoryProvider.getFactory("animal");
        Animal duck = (Animal) abstractFactory.create("duck");
        sout("abstract factory", duck.makeSound());

        //Factory Method
        Notification ss = FactoryMethod.createNotification("sms");
        sout("factory method", ss.notifyUser());

        //Builder
        InitialBuilder ini = new InitialBuilder();
        ini = ini.satu("method satu").dua("method dua");
        sout("builder", ini.getParamku());

        //prototype implements cloneable

        //Singleton
        Singleton singleton = Singleton.getSingleton();
        sout("singleton", singleton.helloworld("hello world"));


        /* Structural */
        //Adapter
        //there are two way adapter approach, first,class adapter, and object adapter (same result)
        // we use object adapter (composition, see impl)
        SocketAdapter socket = new SocketAdapterImpl();
        socket.get20Volt();
        socket.get30Volt();

        //Bridge (abstraction)
        Shape shape = new Square(new Blue());
        sout("Bridge", shape.draw());

        //Composite
        // Head deptartment as a composer
        Department salesDept = new SalesDepartment(1, "sales dept");
        Department finDept = new FinancialDepartment(2, "financial dept");

        HeadDepartment headDepartment = new HeadDepartment(3, "head dept");
        headDepartment.addDept(salesDept);
        headDepartment.addDept(finDept);

        sout("Composite", "");
        headDepartment.printDepartmentName();

        //Decorator
        // TreeDecorator is the decorator
        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        sout("decorator", tree1.decorate());

        //Facade
        //almost same with composition...
        sout("Facade","");
        FacadePattern facadePattern = new FacadePattern();
        facadePattern.drawCircle();
        facadePattern.drawRectangle();

        //Flyweight
        //Shapefactory as the flyweight class
        sout("Flyweight", "");
        FlyweightyPattern.run();

        //Proxy
        Image proxyImage = new ProxyImage("Gambar.jpg");
        sout("Proxy","");
        proxyImage.display();
        proxyImage.display();


    }


    private static void sout(String designPatternType, String value) {
        System.out.println(designPatternType.toUpperCase() + " \t -> " + value);
    }
}
