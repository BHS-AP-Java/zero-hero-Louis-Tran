package edu.bhscs;

public class Store {
  // These are properties or fields and they are things a class has
  String location;
  Cake inventory;
  Double funds = 0.0;

  // Constructor
  public Store(String location) {
    this.location = location;
    System.out.println("A new bakery has opened at " + location + "!");
  }

  // methods

  String displayInventory() {
    return this.inventory.getDisplay();
  }

  String sellCake(double price) {
    this.funds += price;
    return location + " store sold a cake for $" + price;
  }

  Double getFunds() {
    return funds;
  }

  String donateFunds(int amount) {
    return "Donated $" + amount + " to the PTSA!";
  }
}
