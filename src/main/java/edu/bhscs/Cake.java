package edu.bhscs;

public class Cake {
  // The fields or properties
  String flavor;
  int slices = 8;
  int layers;

  // Constructor
  public Cake(String flavor, int layers) {
    this.flavor = flavor;
    this.layers = layers;
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

  int getSlices() {
    return slices;
  }

  double getPrice() {
    return layers * 5.0;
  }
}
