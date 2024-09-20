package org.color;

public class Encapsulation {
    public static void main(String[] args) {
     Computer comp = new Computer("Dell","XPS 13",2021);
     Computer comp1 = new Computer("Hp","Spectre x360",2022);

            comp1.copy(comp);

        System.out.println(comp);
        System.out.println(comp1);
        System.out.println();
        System.out.println(comp.getMake());
        System.out.println(comp.getModel());
        System.out.println(comp.getYear());
        System.out.println();
        System.out.println(comp1.getMake());
        System.out.println(comp1.getModel());
        System.out.println(comp1.getYear());





    }


}
