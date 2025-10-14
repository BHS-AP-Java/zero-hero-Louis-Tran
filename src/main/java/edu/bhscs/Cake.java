package edu.bhscs;

public class Cake {
  // PROPERTIES AND FIELDS
  String flavor;
  Flour flour;
  int layers;
  int slices = 8;

  // CONSTRUCTOR
  public Cake(String flavor, int layers, Flour f) {
    this.flavor = flavor;
    this.layers = layers;
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

  // Draws a 3D ASCII art of a cake based on the number of layers
  void draw() {
    System.out.println("   _______");
    System.out.println("  /       \\");
    System.out.println(" /         \\");
    for (int i = 0; i < this.layers; i++) {

      System.out.println("|           |");
      System.out.println("|###########|");
    }
    System.out.println(" \\         /");
    System.out.println("  \\_______/");
  }
}
