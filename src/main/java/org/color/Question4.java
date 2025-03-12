package org.color;

import java.util.Scanner;

public class Question4 {

    /* 
     Write a program that takes an age as input and classifies the person as 
     "Child", "Teenager", "Adult", or "Senior" based on the following ranges:

   - 0-12: Child
   - 13-19: Teenager
   - 20-64: Adult
   - 65 and above: Senior
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age ;

        System.out.println("How old are you?  ");
        age = sc.nextInt();

        if(age>=65){
            System.out.println("I am a senior citizen");

        }else if(age>20 && age<64){
            System.out.println("I am a grown adult");

        
        }else if(age> 13 && age< 19){
            System.out.println("I am a teenager");

        } else{
            System.out.println("I am a child");
        }

        sc.close();
    }
    
}
