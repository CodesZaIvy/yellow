package org.color;

import java.util.Scanner;

public class Question6 {

    //Write a program that takes a year as input and checks whether 
    //it's a leap year or not using an `if-else` statement.
    //A year is a leap year if it is divisible by 4, but not divisible by 100 
    //unless it is also divisible by 400.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.println("The year is :");

        year = sc.nextInt();

        //if(year/4 &&(!year/100)){

        /*
         📌 Modulus (%) helps check if a number is exactly divisible by another number.
         📌 Division (/) just gives the quotient and doesn't tell if there's a remainder left.
         use the modulus operator (%) to check divisibility not /
         */
     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0 )){
        System.out.println( year +" is a leap year ");

        }else{
            System.out.println(year + " not a leap year");
        }
        sc.close();
     }
    
    }
    

