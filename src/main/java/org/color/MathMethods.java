package org.color;

public class MathMethods {
    public static void main(String[] args) {

        double height = 3.15;
        double width = 10;

        //display the bigger number
        double maximum = Math.max(height,width);
        // display number without the (-) sign
        double absolute =Math.abs(width);
        //display square root
        double squarer = Math.sqrt(width);
        // display round about to the nearest whole number
        double round = Math.round(height);
        // display round up to the next whole number
        double ceiling = Math.ceil(height);
        //// display round up to the previous whole number
        double floor = Math.floor(height);

        System.out.println(maximum);
        System.out.println(absolute);
        System.out.println(squarer);
        System.out.println(round);
        System.out.println(ceiling);
        System.out.println(floor);
    }

}
