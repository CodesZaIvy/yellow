package org.color;

public class Switch {
    public static void main(String[] args) {
        // can be used when you find yourself using a lot of (If-else) statements
        //used as a control flow statement that allows a variable to be tested for equality against a list of values.
        String month = "February";

        switch (month) {
            case "January" :
                System.out.println("January is here");
                //breaks are needed to enable each statement to be printed on its on if the right one is found
            break;
            case "February" :
                System.out.println("February is here");
                break;
            case "March" :
                System.out.println("March is here");
                break;
            case "April" :
                System.out.println("April is here");
                break;
            case "May" :
                System.out.println("May is here");
                break;
            case "June" :
                System.out.println("June is here");
                break;
            case "July" :
                System.out.println("July is here");
                break;
            case "August" :
                System.out.println("August is here");
                break;
            case "September" :
                System.out.println("September is here");
                break;
            case "October" :
                System.out.println("October is here");
                break;
            case "November" :
                System.out.println("November is here");
                break;
            case "December" :
                System.out.println("December is here");
                break;
                //Default is needed just in case an option that isn't available can be mitigated
            default:
                System.out.println("That is no month,honey");
            break;








        }

    }
}
