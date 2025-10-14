// Student name: Louis Tran
// P2
// Student ID: 2035426
// Project name: Bakesale project

/*
 *
 */

package edu.bhscs;

public class Main {
  public static void main(String[] args) {
    // Create a player
    Player p = new Player("Louis Tran");
    Store bakery = new Store("Bothell", "Sweet Treats Bakery");
    Baker bob = new Baker(p, "Bob");
    bob.takeJob(bakery);
    Customer alice = new Customer("Alice", 50);
    bob.takeOrder(20, alice);
    alice.cake.draw();
    alice.eatCake();
  }
}
