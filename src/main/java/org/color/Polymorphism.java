package org.color;

public class Polymorphism {
    public static void main(String[] args) {

        // Is the ability of an object to identify as more than one data type
        Lorry lorry = new Lorry();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

// Created an array for storage
        // If you are to store objects in an array , and they are all different object type then you have to find the common denominator

        Machine[] racers = {lorry, bicycle, boat};

       /* lorry.go();
        bicycle.go();
        boat .go();

        */
        for(Machine x : racers){
            x.go();

        }

    }

}
