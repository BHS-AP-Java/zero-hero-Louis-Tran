// Louis Tran
// P2
// Zero Hero
// 9/12/25

/*
 * DESCRIPTION: Whatever Mr. Reiber says
 * INPUT: We don't know about input yet
 * OUTPUT: Some cool words in the command line terminal thing
 * EDGE CASE: They are all edge cases at the moment
 */

package edu.bhscs;

public class Main {
  public static final char A = 'a';
  public static float A_FLOAT_NAME = 3.14f;

  public static void main(String[] args) {
    Baker Bob = new Baker("Bob");
    Customer Steve = new Customer("Steve", new Cake("chocolate", 3));
    System.out.println(Steve.purchaseCake(Steve.order));
    System.out.println(Bob.bakeCake(Steve.order));
    System.out.println(Steve.consumeCake(Steve.order));
  }

  public static String pushup(String[] args) {
    return "sweat";
  }
}
