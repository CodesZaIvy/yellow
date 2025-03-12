package org.color;

import java.util.Scanner;

public class Question7i {
    public static void main(String[] args) {

        /*
         Write a program that checks 
         if a given letter is a consonant (any letter that is NOT a vowel)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character :");

        String character = sc.nextLine().toLowerCase();

        if("aeiou".contains(character)){
            System.out.println(character + "  This is a vowel");
        }else if("bsdfghjklmnpqrstvwxyz".contains(character)){

        
        System.out.println(character + "  This is a consonant");
        }
        else{
            System.out.println(character + "  is not a letter");
        }
        sc.close();
    }
     

    
    
}
