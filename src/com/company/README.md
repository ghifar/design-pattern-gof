## Creational
Used to construct objects such that they can be decoupled from their implementing system.

#### Abstract factory
To support the new type of objects will require changing the AbstractFactory class and all of its subclasses.
- The client is independent of how we create and compose the objects in the system
- The system consists of multiple families of objects, and these families are designed to be used together
- We need a run-time value to construct a particular dependency While the pattern is great when creating predefined objects, adding the new ones might be challenging.


#### Factory Method
define an interface or abstract class for creating an object
but let the subclasses decide which class to instantiate
 ex: wrapper class, like Integer.valueOf()


#### Prototype 
cloneable

#### Singleton
Ensures that only one instance of a class is allowed within a system

## Structural
Used to form large object structures between many disparate objects.

#### Adapter
Adapter pattern works as a bridge between two incompatible interfaces.

A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop

#### Bridge
To decouple ABSTRACTION from its implementation so that the two can vary independently.

(*To sparate out responsibilities into different ABSTRACT classes)

#### Composite
The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way.

It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.

We can break the pattern down into:

1. component – is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
2. leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.
3. composite – has leaf elements. It implements the base component methods and defines the child-related operations.
4. client – has access to the composition elements by using the base component object.

### Decorator
A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically.
 
 A Decorator provides an enhanced interface to the original object.
 
### Facade
Supplies a single interface to a set of interfaces within a system.

Facade pattern is often needed when there is a large number of interdependent classes or because parts of the code are unavailable. It is used as a camouflage to cover the complexities of a large system and therefore provides a simple interface to the client. 
In other words, it is a wrapper class used to hide the implementation details.
 
It decouples a client implementation from the complex subsystem. Thanks to this, we can make changes to the existing subsystem and don't affect a client.

### Flyweight
Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found
 
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

### Proxy
The Proxy pattern allows us to create an intermediary that acts as an interface to another resource, while also hiding the underlying complexity of the component.

when to use the Proxy pattern:

- When we want a simplified version of a complex or heavy object. In this case, we may represent it with a skeleton object which loads the original object on demand, also called as lazy initialization. This is known as the Virtual Proxy
- When the original object is present in different address space, and we want to represent it locally. We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding, decoding, etc., while the client accesses it as it was present in their local address space. This is called the Remote Proxy
- When we want to add a layer of security to the original underlying object to provide controlled access based on access rights of the client. This is called Protection Proxy
