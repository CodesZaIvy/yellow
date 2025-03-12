package org.color;

import java.util.Scanner;

public class Question7 {

    // Write a program that accepts a character and 
    //checks whether it is a vowel (a, e, i, o, u) or a consonant using an `if-else` statement.
  
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String character;

    System.out.println("Enter  a character :");
    character = sc.nextLine().toLowerCase();
    
    //The .contains() method checks for substring presence.
    
    if ("aeiou".contains(character)){
        System.out.println(character + "  is a vowel");

   }else{
    System.out.println(character + " is a Consonant");
   }

  sc.close(); 
  }
}
