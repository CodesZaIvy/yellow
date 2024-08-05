package org.color;

public class Expression {
    public static void main(String[] args) {
        //expression -> Operands and Operators
        //Operands -> Values ,Variables, Numbers, Quantity
        //Operators -> + _ * / %

        //int fruits = 12;
        //Add One Fruit
        // fruits = fruits + 1;
        //Multiply Fruits By 2
        //fruits = fruits * 2;
        //Divide fruits by 2
        //fruits = fruits / 2;

        //modulus fruits by 5(Gives the reminder when division happens)
        //fruits = fruits % 5;
        //(This will give a number as an Integer and not a decimal)

        /*if a decimal  is included then
                change the variable to double
                and include the double before your modulus sign
 */
        double fruits = 12;
        fruits = (double) fruits % 5;

        //Using Increment Operator
        //fruits++;
        //Acts the same way as fruits + 1;

        //And Decrement Operator
        //fruits--;
        //Acts as fruits - 1;

        System.out.println(fruits);

    }
}
