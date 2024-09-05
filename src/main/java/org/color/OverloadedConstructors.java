package org.color;

public class OverloadedConstructors {
    public static void main(String[] args) {

       // Pizza pizza = new Pizza("Thin crispy Crust","Tomato and pesto ","mushrooms and bell peppers","mozzarella and cheddar");
        // Contains all arguments

        Pizza pizza = new Pizza("Thin crispy Crust");
        System.out.println("Ingredients for a perfect pizza:  ");
        System.out.println(pizza.crust);
        System.out.println(pizza.sauce);
        System.out.println(pizza.toppings);
        System.out.println(pizza.cheese);
        }



}




