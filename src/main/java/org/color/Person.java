package org.color;

public class Person {
    String name;
    double height;
    // Create a constructor
    Person(String name ,double height){
        this.name = name;
        this.height = height;

    }
    public String toString(){
        return
                this.name + "\n" + this.height + "\n";
    }
}
