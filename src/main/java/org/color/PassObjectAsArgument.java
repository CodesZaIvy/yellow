package org.color;

public class PassObjectAsArgument {
    public static void main(String[] args) {


        // Used when one wants to share an object with a method so the method can use or modify it

        Library lib = new Library();

        Book book1 = new Book("Kite Runner");
        Book book2 = new Book("A Thousand Splendid Nights");

        lib.shelve(book1);
        lib.shelve(book2);


    }

}


