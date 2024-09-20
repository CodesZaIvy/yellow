package org.color;

import java.util.Scanner;

public class DynamicProgramming {
    public static void main(String[] args) {


        // Polymorphism = many forms
        // dynamic = after compilation(During Runtime)
        Scanner scanner = new Scanner(System.in);
        Phone phone;


        System.out.println("Which phone do you fancy:");
        System.out.println("(1 = Mobile Phone) or (2 = LandLine Phone) ");
         int choice = scanner.nextInt();

         if (choice==1) {
             phone = new LandLinePhone();
             phone.TransmitVoice();
         }
        else if (choice==2) {
            phone = new MobilePhone();
            phone.TransmitVoice();
        }
        else{
            phone = new Phone();
            phone.TransmitVoice();
             System.out.println("Invalid Choice");
         }
    }
}