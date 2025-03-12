package org.color;

import java.util.Scanner;

public class Question2 {

    //write a program that takes a number and checks whether its a positive ,a negative or zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + "is a positive number"  );

        }else if(num < 0){
            System.out.println( num + " is a negative number");
        }else{
            System.out.println(num + " is a form of a zero");
        }
        sc.close();


    }

    
}
