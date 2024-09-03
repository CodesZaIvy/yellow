package org.color;

public class Animal {
    // uses Constructor class as well as an interface
    String name;
    int age;
    String gender;
    double speed;

    Animal(String name,int age,String gender,double speed){
        this.name = name;
        this.age = age;
        this.gender =gender;
        this.speed = speed;
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println( this.name + " is drinking");
    }
}
