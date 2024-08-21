package org.color;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {


        //An ArrayList is a flexible and resizable box (or container) in Java that can hold a list of items (like your toys).
        // Elements can be added and removed after compilation phase
        // Store reference data types


        ArrayList<String> scarfs = new ArrayList<String>();
        scarfs.add("Silk");
        scarfs.add("Wool");
        scarfs.add("Cotton");
        scarfs.add("Chiffon");


        //using set to replace Silk with Linen in index 0
        scarfs.set(0, "Linen");
        //Remove cotton
        scarfs.remove(2);
        //To clear
        //scarfs.clear();
        //Access a specific scarf
        String firstScarf = scarfs.get(0);
        System.out.println("My first scarf is: " + firstScarf);
        System.out.println("-------------------");
        //Using get

        for(int i=0; i<scarfs.size() ;i++){
            System.out.println(scarfs.get(i));
        }
        }
    }