package edu.bhscs;

public class App {
  public static void main(String[] args) {
    int randWidth= (int)(Math.random() * (100- 20 + 1)) + 20;
    int randLegs= (int)(Math.random() * (5-0 + 1)) + 0;
    Table t = new Table(randLegs, randWidth,3);
    t.draw();
  }

  public static void date_10_21() {
    System.out.println("Today's work");
  }

  // appsc
  public static void date10_27() {
    Player user = new Player("Usario P. Player");
    Baker bob = new Baker(user, "Bob");
    Table t = new Table(3, 80,3);
    Customer suzzie = new Customer("Suzzie", 100);
    Cake bDay = bob.bakeCake(suzzie);
    bDay.draw(t);
  }
}
