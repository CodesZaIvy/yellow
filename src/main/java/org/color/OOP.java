package org.color;

public class OOP {
    public void main(String[] args) {
        // object => an instance of a class that may/ contain attribute and methods
        // clothes,phone,scarf,charger
    colors myColors = new colors();

        System.out.println(myColors.price);
        System.out.println(myColors.quantity);
        System.out.println(myColors.size);
        System.out.println(myColors.type);
        System.out.println(myColors.price);

    }
    public static class colors{

        String color = "Blue";
        String type = "Acrylic";
        int quantity = 24;
        int size = 250;
        double price = 300.50;
        //Methods
        void displayColorInfo(){
            System.out.println("Color: " + color);
            System.out.println("Type: " + type);
            System.out.println("Quantity: " + quantity);
            System.out.println("Size: " + size + "ml");
            System.out.println("Price: " + price);
        }
        double calculateTotalCost(int quantity){

            return price * quantity;
        }






    }


}
