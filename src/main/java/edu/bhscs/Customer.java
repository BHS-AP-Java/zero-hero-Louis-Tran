package edu.bhscs;

public class Customer {
  // PROPERTIES AND FIELDS
  String name;
  int cash;
  Cake cake;

  // CONSTRUCTOR
  Customer(String name, int cash) {
    this.name = name;
    this.cash = cash;
  }

  // METHODS
  int pay(int price) {
    this.cash -= price;
    return price;
  }

  void takeCake(Cake c) {
    this.cake = c;
    System.out.println("Yum! I love " + c.getFlavor() + " cake!");
  }

  void eatCake() {
    if (this.cake != null && this.cake.slices > 0) {
      this.cake.slices--;
      System.out.println("Mmm! That was delicious!");
      System.out.println(this.cake.slices + " slices left.");
    } else {
      System.out.println("No cake to eat!");
    }
  }
}
