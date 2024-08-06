package org.color;

public class IfStatement {
    public static void main(String[] args) {
        double height = 140.88;
        if (height >= (213.36)) {
            System.out.println("Too tall ,sorry");
            //else if to check one than more conditions
        } else if (height >= 182.88) {
            System.out.println("You are her ideal height! ");
        } else if (height <= 152.4) {
            System.out.println("You are a pygmy");
        } else {
            System.out.println("You are not in her good books");
        }
    }
    }

