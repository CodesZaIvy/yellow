package org.color;

public class Hero extends Person {
    String power;

    // Create a constructor
    Hero(String name, double height, String power) {
        // Assign all to all our superheroes
        super(name, height);
        // Using super cancels out the two this's below adding them to the super class person is recommended
        //this.name = name;
        //this.height = height;
        this.power = power;

    }

    public String toString() {
        return
                super.toString() + this.power;
    }
}