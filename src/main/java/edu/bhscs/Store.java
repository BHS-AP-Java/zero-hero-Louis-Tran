package edu.bhscs;

public class Store {
  // These are properties or fields and they are things a class has
  String location;
  String appearance;
  Cake inventory;

  // Constructor
  public Store(String location, String appearance) {
    this.location = location;
    this.appearance = appearance;
    System.out.println("A new bakery has opened at " + location + "!");
  }

  // methods

  String displayInventory() {
    return this.inventory.getDisplay();
  }
}
