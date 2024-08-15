package org.color;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // && -> (AND) both conditions must be true
        // || -> (OR) either condition must be true
        // ! -> (NOT) reverses boolean value of condition
        int kilometre = 10;

        // Using AND
/*
        if (kilometre > 30) {
           // System.out.println("You beat the daily target");
       // } else if (kilometre >= 20 && kilometre <= 30) {
            // both conditions must be true for this
            System.out.println("You ran enough for the day");
        } else {
            System.out.println("Kindly, run a few more kilometres");
        }
    }
*/

        // Using OR

       /*

       Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing Karura Trail.Press w or W to quit  ");
        String response = scanner.next();

        if(response.equals("w") ||response.equals("W")) {
            System.out.println("Quitting Karura Trail game");
        }
        else{
                System.out.println("You are still playing Karura Trail");
            }
        */

            //Using NOT
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing Karura Trail.Press w or W to quit  ");
        String response = scanner.next();
            //precede the symbol on the if statements
        if(!response.equals("w") && !response.equals("W")) {
            System.out.println("You are still playing Karura Trail");
        }
        else{
            System.out.println("Quitting Karura Trail game");

        }


        }
    }
