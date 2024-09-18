package org.color;
 abstract class Novel{

    public void setStore(){
        System.out.println(" shelve me ");
    }
    // ensures that you know what the Novel needs
    public abstract void disseminate();
}
class Contemporary extends Novel{
     public void disseminate(){
         System.out.println("This Novel needs to be read");
     }

}
public class Abstraction {
    public static void main(String[] args) {
            Contemporary c = new Contemporary();

            c.setStore();
            c.disseminate();


    }
}
