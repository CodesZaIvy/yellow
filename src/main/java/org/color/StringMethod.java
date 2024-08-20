package org.color;

public class StringMethod {
    public static void main(String[] args) {
            //A string is a reference data type used to store one or more characters
            String confused = "Curtain";
                //Check if the name provided is the name the string has
                //boolean confused = name.equals("Curtain");

                //Check length of the string provided
                //int result = confused.length();

                // Check which letter of Curtain falls at index six - starts with 0
                //char result= confused.charAt(6);

                //Check the index of the letter n on the string
                //int result = confused.indexOf("n");

                // Check if the Variable is blank or not
                //boolean result = confused.isBlank();

                // Check if the Variable is empty or not
                //boolean result = confused.isEmpty();

                //Change the variable value to upper case
                //String result = confused.toUpperCase();

                //Change the variable value to lower case
                //String result = confused.toLowerCase();

                //Remove all the extra space in next to a variable
                //String result = confused.trim();

                //Replace a character {C to M}
                String result = confused.replace('C','M');




            System.out.println(result);
        }

    }


