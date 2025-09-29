package edu.bhscs;

public class Customer {
  String name;
  Cake order;

  public Customer(String name, Cake order) {
    this.name = name;
    this.order = order;
    System.out.println("Hi, my name is " + name + ", and I'm here to buy a cake!");
  }

  String purchaseCake(Cake cake) {
    this.order = cake;
    return name
        + " would like to buy a "
        + cake.getLayers()
        + "-layered "
        + cake.getFlavor()
        + " cake, please.";
  }

  String consumeCake(Cake cake, int slices) {
    if (cake.slices - slices >= 0) {
      cake.slices -= slices;
    } else if (cake.slices == 0) {

    } else {
      return "Oh no! There are not enough slices left for " + name + " to eat!";
    }
    return "Yum! I love "
        + cake.getFlavor()
        + " cake! "
        + name
        + " now has "
        + cake.getSlices()
        + " slices left.";
  }
}
