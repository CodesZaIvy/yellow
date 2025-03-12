package org.color;

import java.util.Scanner;

public class Question3 {
    // Write a program that accepts a student's grades (a number between 0 -100) and 
    //prints whether the student has passed or failed
    //Assume passing is 50

    public static void main(String[] args) {
        int grade; 
        Scanner sc = new Scanner(System.in);

        System.out.println("My grade is :");
        grade = sc.nextInt();

        if (grade>= 50){
            System.out.println("You have passed");

        }else{
            System.out.println("You have failed");
        }

        sc.close();
    }

    

    
    
}
