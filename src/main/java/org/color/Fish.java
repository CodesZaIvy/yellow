package org.color;

public class Fish implements Prey ,Predator
{
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");

    }

    @Override
    public void flee() {
        System.out.println("This fish need to flee from the bigger fish");

    }
}
