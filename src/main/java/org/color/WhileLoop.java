package org.color;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        /*
         while loop -> executes a block of code as long as it's condition remains true


        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {

            {
                System.out.print("My name is :");
                name = scanner.nextLine();
            }

            System.out.println("Hi" + name);

        }

         */

        // do loop

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do {
            //executes the block of code once
            System.out.println("Enter your name:");
            name = scanner.nextLine();
            //Make the answer go to the next line
        } while (name.isBlank());
        System.out.println("Hello " +name);

    }
}








