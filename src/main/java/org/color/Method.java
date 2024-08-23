package org.color;

public class Method {
    // this is the main method
    public static void main(String[] args) {
        String name = "Her";
        int age = 21;
        hello(name,age);


    }
    // A method in Java is like a little helper that you can ask to do a specific task for you.
    // You give the method a name, and when you need that task done, you just call its name, and it does the job.
   static void hello (String name,int age){
    System.out.println("Hello "+ name + " \n I am "+ age) ;
}


}


