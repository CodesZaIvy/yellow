package org.color;

public class Table {
    // Uses toString class
    String shape = "Circle";
    String material = "Wood";
    String color = "Black";
    String purpose = "coffee";
    int height =  65;


    public String toString(){
        String herString = shape + "\n"+ material + "\n" + color + "\n" + purpose + "\n" + height ;
        return herString;
    }




}
