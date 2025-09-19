package edu.bhscs;

public class Cake {
  String flavor;
  int layers;

  public Cake(String flavor, int layers) {
    this.flavor = flavor;
    this.layers = layers;
    System.out.println();
  }

  String getFlavor() {
    return flavor;
  }

  int getLayers() {
    return layers;
  }
}
