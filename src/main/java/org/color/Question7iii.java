package org.color;

import java.util.Scanner;

public class Question7iii {

    public static void main(String[] args) {

        // Write a program that checks if a sentence contains the word "Java".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence :");

        String sentence = sc.nextLine();

        if((sentence.toLowerCase().contains("java"))){
            System.out.println("Your sentence talks about Java");
            

        }else{
            System.out.println("your sentence doesn't talk about Java");
        }
        sc.close();
    }
    
}
