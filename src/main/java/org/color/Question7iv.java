package org.color;

import java.util.Scanner;

public class Question7iv {

    //Write a program that checks 
    //if the user entered a single word or a phrase (contains a space).

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text :");


        String text = sc.nextLine();

        if(text.toLowerCase().contains(" ")){
            System.out.println("This is a phrase");
        }else{
            System.out.println("This is a word");
        }

        sc.close();
    }

    // did this on my own yeey!!
    
}
