package org.color;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

        // A for-each loop is a way to go through each item in a collection (like a box of pasties) one by one,
        // so you can do something with each item (like give it to a friend).
        // is more readable but less flexible
           //String[] pastries = {"Cookies","Bread","Buns"};

        ArrayList<String> pastries = new ArrayList<String>();
        pastries.add("cookies");
        pastries.add("bread");
        pastries.add("buns");


    for(String i : pastries){
        System.out.println(i);





    }
}
}
