package org.color;

public class AbstractKeyword {
    public static void main(String[] args) {
        // An abstract class cannot be instantiated (you can't create objects from it).
        // Instead, it can only be used as a superclass for other classes.
        //Bed bed = new Bed();
        Pillow pillow = new Pillow();

        pillow.horizontal();


    }
}
