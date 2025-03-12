package org.color;

import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] args) {
        //Write a program that takes a number as input and 
        //checks whether it is even or odd using an if-else statement

        Scanner sc = new Scanner(System.in);
        int evenNumber ;


        System.out.println("Enter Number : ");
        evenNumber = sc.nextInt();
        
       

        if(evenNumber%2==0){
            System.out.println("this is an even number");

        }else{
            System.out.println("it is an odd number");
        }

        sc.close();

    }
}
