package org.color;

import java.util.Arrays;
import java.util.Scanner;

public class Question7v {

    // Write a program that checks 
    //if a sentence mentions a day of the week (Monday–Sunday).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Text:");
        String text = sc.nextLine().toLowerCase();


          // List of days
          String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

          // Check if any day is in the text
          
          boolean containsDay = Arrays.stream(days).anyMatch(text::contains);

        //if(("monday tuesday wednesday thursday friday saturday").contains(text)){
        if (containsDay){
                    System.out.println(text + " " + "mentions day of the week" );
        
                }else{
                    System.out.println(text +" doesnt mention any day of the week");
                }
                sc.close();
            }
        
           
    
}
