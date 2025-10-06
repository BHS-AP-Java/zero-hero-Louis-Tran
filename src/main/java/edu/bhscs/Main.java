// Louis Tran
// P2
// Zero Hero
// 9/12/25

/*
 * DESCRIPTION:
 * The goal of my bakesale is:
 *  1. For a baker to make a cake
 *  2. bake it at a bakery
 *  3. sell it to a customer
 *  4. and donate the money to the PTSA
 *
 * INPUT: We don't know about input yet
 * OUTPUT: Some cool words in the command line terminal thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

import java.util.Scanner;

public class Main {
  public static final char A = 'a';
  public static float A_FLOAT_NAME = 3.14f;

  // My main class is fixed, therefore it is static
  public static void main(String[] args) {
    /*Store Bothell = new Store("Bothell");
    Baker Bob = new Baker("Bob", Bothell);
    Customer Steve = new Customer("Steve", new Cake("chocolate", 3));
    System.out.println(Steve.purchaseCake(Steve.order));
    System.out.println(Bothell.sellCake(Steve.order.getPrice()));
    System.out.println(Bob.bakeCake(Steve.order));
    System.out.println(Steve.consumeCake(Steve.order, 8));*/

    Scanner s = new Scanner(System.in);
    System.out.println("What can we do with a scanner?");
    System.out.println("What is your favorite color?");
    String color = s.next();
    System.out.println("Your favorite color is " + color + "!");

    System.out.println("I don't know, but I'm done now.");

    s.close();
  }
}
