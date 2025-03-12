package org.color;

import java.util.Scanner;

public class Questions7ii {

    //Write a program that checks if an input word contains any digit (0-9).
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Word :");

    String word = sc.next();

    if("123456789".chars().anyMatch(ch -> word.contains(Character.toString(ch)))){
            System.out.println("The word  contains a number");
    }else{
        System.out.println("The Word does not contain any numbers");
    }
    sc.close();
}
}