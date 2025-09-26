package edu.bhscs;

public class Cake {
  // The fields or properties
  String flavor;
  int layers;

  // Constructor
  public Cake(String flavor, int layers) {
    this.flavor = flavor;
    this.layers = layers;
    System.out.println("A new " + flavor + " cake with " + layers + " layers has been created!");
  }

  // Methods
  String getFlavor() {
    return flavor;
  }

  int getLayers() {
    return layers;
  }

  String getDisplay() {
    return "This cake is a " + this.flavor + " cake with " + this.layers + " layers.";
  }
}
