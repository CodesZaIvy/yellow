package org.color;

import java.util.Random;

public class OverloadingMethods1 {
    public static void main(String[] args) {
      int result =  addNumbers(6,8,6);
        double result1=  addNumbers(5.0,7.6,23.0);
        System.out.println(result);
        System.out.println(result1);

        addNumbers();
    }
    public static int addNumbers(int a,int b){
        return a + b;
    }
    public static int addNumbers(int a,int b,int y){
        return a + b + y ;
    }
    public static double addNumbers(double t,double u,double v){
        return  t + u + v;
    }
    public static void addNumbers(){
        //class in java that helps us generate random numbers
        Random t = new Random();
        System.out.println(t.nextInt(600) + t.nextInt(100));
    }




}
