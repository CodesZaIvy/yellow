package org.color;

import java.util.ArrayList;

public class ArrayList_2D {
    public static void main(String[] args) {
     //   used to represent structures like matrices or grids.
        // Imagine you have a big box with many small boxes inside it.
        // Each small box has its own little compartments to store different things
        // This big box is like a 2D Array List in Java.
        ArrayList<ArrayList<String>> groceries = new ArrayList<>();



        ArrayList<String> vegList = new ArrayList<>();
        vegList.add("Potatoes");
        vegList.add("Tomatoes");
        vegList.add("Avocados");
        vegList.add("Spinach");
        vegList.add("Onions");
        vegList.add("Garlic");

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Cookies");
        bakeryList.add("Bread");
        bakeryList.add("Hamburger");
        bakeryList.add("Chapati");
        bakeryList.add("Buns");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Milk");
        drinkList.add("Juice");
        drinkList.add("Energy Drink");
        drinkList.add("Coffee");


        groceries.add(bakeryList);
        groceries.add(vegList);
        groceries.add(drinkList);
        System.out.println(groceries.get(1).get(2));

            // to get potatoes
        //System.out.println(vegList.get(0));


    }
}
