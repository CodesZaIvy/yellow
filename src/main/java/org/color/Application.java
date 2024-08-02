
package org.color;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    //Using boolean and integer variables with scanner.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Do you like art? (true/false)");
    boolean answer = scanner.nextBoolean();
    scanner.nextLine();
    System.out.println("How many artists do you know ?");
    int number = scanner.nextInt();
    //added this scanner line below to clear the scanner for this question to be answered.
    scanner.nextLine();
    System.out.println("Who is your favourite artist at the moment?");
    String name = scanner.nextLine();

    System.out.println( answer);
    System.out.println("I know " + number + " artists");
    System.out.println(name);

  }
}
