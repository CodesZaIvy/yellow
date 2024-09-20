package org.color;

public class Interfaces {

    // Uses Prey, Predator interfaces
    // Uses Fish,hawk and hare classes


    public static void main(String[] args) {
/*
Abstraction: Interfaces allow you to define methods that must be implemented by any class that implements the interface, without specifying how these methods should be implemented.

Multiple Inheritance of Type: Since Java does not support multiple inheritance with classes, interfaces provide a way to achieve multiple inheritance by allowing a class to implement multiple interfaces.

Loose Coupling: Interfaces decouple the implementation from the usage, enhancing flexibility and maintainability.

Polymorphism: Interfaces enable objects to be treated as instances of their interface types, allowing for dynamic method binding.

Design Contracts: Interfaces can serve as a contract that classes must follow, ensuring consistency across different implementations.

*/
           Hare hare = new Hare();
           hare.flee() ;

           Hawk hawk = new Hawk();
           hawk.hunt();
                // Classes can apply more than two interface
           Fish fish = new Fish() ;
           fish.flee();
           fish.hunt();
    }

}
