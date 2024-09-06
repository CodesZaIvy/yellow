package org.color;

public class ToString {
    public static void main(String[] args) {

        Table table = new Table();
       /*
        System.out.println(table.color);
        System.out.println(table.height);
        System.out.println(table.material);
        System.out.println(table.purpose);
        System.out.println(table.shape);
        */
        // shows where the table is in the computers memory
        System.out.println(table.toString());

    }
}
