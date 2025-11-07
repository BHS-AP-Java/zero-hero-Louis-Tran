package edu.bhscs;

public class App {
  public static void main(String[] args) {
    System.out.print("   ");
    System.out.println("Hello World!");
  }

  public static void date_10_21() {
    System.out.println("Today's work");
  }

  public static void date10_27() {
    Player user = new Player("Usario P. Player");
    Baker bob = new Baker(user, "Bob");
    Table t = new Table(4, 55, 3);
    Customer suzzie = new Customer("Suzzie", 100);
    Cake bDay = bob.bakeCake(suzzie);
    bDay.draw(t);
  }
}
