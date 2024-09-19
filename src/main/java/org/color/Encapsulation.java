package org.color;

public class Encapsulation {
    public static void main(String[] args) {
     Computer comp = new Computer("Dell","XPS 13",2021);

        comp.setYear(2013) ;
        comp.setMake("Hp") ;
        comp.setModel("Asus");

        System.out.println(comp.getMake());
        System.out.println(comp.getModel());
        System.out.println(comp.getYear());





    }


}
