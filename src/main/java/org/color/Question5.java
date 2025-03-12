package org.color;

import java.util.Scanner;

public class Question5 {

    /*
      
     Write a program that takes a temperature value in Celsius 
     and determines if it's "Freezing", "Cold", "Warm", or "Hot":
   - Below 0°C: Freezing
   - 0°C to 15°C: Cold
   - 16°C to 25°C: Warm
   - Above 25°C: Hot
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int temp;

        System.out.println("What temperature do you think it is in °C:");

        temp = sc.nextInt();


        if (temp > 25){

            System.out.println("Its too hot ,I need icecream");

        }else if(temp<=25 && temp>=16  ){
            

            System.out.println("I like how warm it is ");

        }else if(temp<=15 &&  temp>0){
            System.out.println("its chilly");

        }else{
            System.out.println("I'm freezing");
        }

        sc.close();
        
    }
    
}
