package edu.bhscs;

public class Cake {
  // PROPERTIES AND FIELDS
  String flavor;
  Flour flour;
  int layers;
  int slices = 8;

  // CONSTRUCTOR
  public Cake(String flavor, Flour f) {
    this.flavor = flavor;
    this.flour = f;
  }

  // METHODS
  String getFlavor() {
    return this.flavor;
  }

  int getLayers() {
    return this.layers;
  }

  int getSlices() {
    return this.slices;
  }
}
