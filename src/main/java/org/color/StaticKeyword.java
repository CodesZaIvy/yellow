package org.color;

public class StaticKeyword {
    public static void main(String[] args) {
                // When using Static,it means the item belongs to the whole class not just one specific object
        Family family1 = new Family("Courage");
        Family family2 = new Family("Scooby");
        Family family3 = new Family("Dexter");
        Family family4 = new Family("Mandy");
        //System.out.println(Family.numberOfFamilyMembers);
            Family.displayFamily();


    }


}
