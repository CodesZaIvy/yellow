package org.color;

public class Constructor {
    public static void main(String[] args) {


        // Initialize Objects: Constructors are used to set up new objects with their starting values.
        // Make Sure the Object is Ready: When you create a new object, the constructor ensures all parts of the object are ready to be used.

        Animal animal = new Animal("Petty", 2, "female", 48.0);
        Animal animal1 = new Animal("Price", 4, "male", 96.0);
                animal1 .eat();
                animal.eat();
                animal1 .drink();
                animal.drink();
        //System.out.println(animal1.name)  ;
        System.out.println(animal1.name)  ;
    }

    }

