package org.color;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // double height = 140.88;
        // if (height >= (213.36)) {
        //     System.out.println("Too tall ,sorry");
        //     //else if to check one than more conditions
        // } else if (height >= 182.88) {
        //     System.out.println("You are her ideal height! ");
        // } else if (height <= 152.4) {
        //     System.out.println("You are a pygmy!!");
        // } else {
        //     System.out.println("You are not in her good books");

        // }


        Scanner sc = new Scanner(System.in);
        String hoursString;
        double rate = 20.00;
        double hoursWorked;
        double regularPay;
        double overtimePay;


        // prompt for user input
        System.out.println("How many hours did you work this week? ");
         hoursWorked = sc.nextDouble();

         if(hoursWorked>40){
            regularPay = 40 * rate ;
            overtimePay = (hoursWorked - 40) * 1.5 * rate;
         }
         else{
            regularPay = hoursWorked *rate;
            overtimePay = 0.0 ;


         }
         System.out.println("Regular Pay :" + regularPay);
         System.out.println("Overtime Pay :" + overtimePay);
         System.out.println("Total Pay :" + (overtimePay+ regularPay));


         }





    
    }

