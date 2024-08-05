package org.color;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double height;
        double width;
        double hypotenuse;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Side width: ");
        width = scanner.nextDouble();
        System.out.println("Enter Side height: ");
        height = scanner.nextDouble();

        hypotenuse = Math.sqrt((width*width)+(height*height));

        System.out.println("The hypotenuse is : "+ hypotenuse);


        scanner.close();

    }
}
