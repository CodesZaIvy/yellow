package org.color;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        //Nested loops are used when you need to perform repetitive tasks within repetitive tasks.
        // They're particularly useful for working with multi-dimensional data structures or when you need to combine multiple sets of data.


        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = " ";

        System.out.println("Enter number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns");
        columns = scanner.nextInt();

        System.out.println("Enter symbol to use ");
        symbol = scanner.next();

            //inner loop
        for(int i=1;i<=rows; i++){
            //move cursor down to the next row to display next row of characters
            System.out.println();
                //nested loop
            for(int j=1 ;j<=columns;j++){
                //Use a print not a println statement
                System.out.print(symbol);

            }

        }


    }
}