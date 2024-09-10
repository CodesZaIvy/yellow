package org.color;

public class Family {
    // Uses the Static Keyword Class
    String name;
     static int numberOfFamilyMembers;

    Family(String name){
        this.name = name;
        //Adding one to the number of family I have
        numberOfFamilyMembers++;
    }
    // apply static to a method
    static void displayFamily(){
        System.out.println("You have " + numberOfFamilyMembers +" family members");

    }

}
