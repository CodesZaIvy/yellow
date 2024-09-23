package org.color;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        // Exceptions are events that disrupt the normal flow of a program's execution.
        // They are used to handle errors and other exceptional events in a controlled manner.
        // Use try...catch
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide: ");
            //Store it
            int x = scanner.nextInt();


            System.out.println("Enter a whole number to divide by : ");

            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result is: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a number !!!");
        }
        catch (Exception e) {

            System.out.println("There is something wrong with your input  ");
        }
        finally {
            scanner.close();

        }
        }
        }



