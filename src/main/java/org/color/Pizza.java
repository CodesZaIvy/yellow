package org.color;

public class Pizza {
    // Used with Overloaded Constructor
    String crust;
    String sauce;
    String toppings;
    String cheese;
    // this pizza constructor only takes one argument, a
    Pizza(String crust){
        this.crust = crust;

    }
    Pizza(String crust, String sauce){
        this.sauce = sauce;
        this.crust = crust;

    }
    Pizza(String crust, String sauce, String cheese){
        this.cheese = cheese;
        this.sauce = sauce;
        this.crust = crust;

    }
    Pizza(String crust, String sauce, String toppings,String cheese){
        this.cheese = cheese;
        this.sauce = sauce;
        this.toppings = toppings;
        this.crust = crust;


    }


}
