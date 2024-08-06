package org.color;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        //Mostly used for game development,testing ,random sampling and simulations

        Random random = new Random();
        // pseudo random number
        // to limit the number have the number in the bracket
        //int t = random.nextInt(9) + 1;
        //double t = random.nextDouble();
        boolean t = random.nextBoolean();
        System.out.println(t);

    }
}
