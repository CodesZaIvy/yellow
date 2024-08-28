package org.color;

public class PrintF {
    public static void main(String[] args) {
        // printf => used for formatted output

        boolean myBoolean = true;
        char myChar = 'k';
        String myString = "hers";
        int myInt = 6;
        double myDouble = 10.0;
        //System.out.printf("I am %d years old on September 11 ,2024");

        //{CONVERSION CHARACTERS}
        // \n to move to the next line


        System.out.printf("%b \n",myBoolean);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);


//Width
  // minimum number of characters to be written as output
        // to limit te number our a number in the middle of the conversion character
        // ie %s to %10s or to reduce %-10s
        //System.out.printf("Hello %-10s",myString);

// precision
        // sets number of digits of precision when outputting floating -point values
        // %.2 f instead of just %f reduces the number of decimal numbers to 2
        System.out.printf("You have won %.2f dollars ",myDouble);
// flags
        // are special characters that you can include in the format specifier to modify the output in specific ways.
        // Flags allow you to control things like alignment, padding, signs for numbers, and more.
         /*
        - => left justify
        + => show operational sign of plus or minus (42 & -42)
        0  => pads output with zeros instead of spaces
        ' => to add as thousands separator in large numbers

         */
        System.out.printf("|%-10s|%n", "Left");
        System.out.printf("%+d%n", 42);
        System.out.printf("%+d%n", -42);
        System.out.printf("%05d%n", 42);
        System.out.printf("%,d%n", 1000000);




    }


}
