package org.color;

public class Vehicle {
   int maxSpeed = 120;

}
class Car extends Vehicle{
        int maxSpeed = 100;

    void display() {
        System.out.println(super.maxSpeed);
        //prints the Vehicle instead of the Car
        System.out.println(maxSpeed);
        //Prints out the car speed
    }

}
class Main{
    public static void main(String[] args) {
        //Make Object Car
        Car car = new Car();
        car.display();


    }


    }


