package org.color;

public class FinalKeyword {
    public static void main(String[] args) {
        final int BIRTHDAY = 11;
        //BIRTHDAY = 14
        // the above brings as error as you can not reassign any other parameters within the method

        //common practice to make a final method be in CAPS

        System.out.println(BIRTHDAY);

    }
}
