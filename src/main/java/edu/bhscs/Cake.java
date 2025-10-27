package edu.bhscs;

public class Cake {
  // PROPERTIES AND FIELDS
  String flavor;
  Flour flour;
  int layers;
  int slices = 8;
  int price;

  // CONSTRUCTOR
  public Cake(String flavor, int layers, Flour f) {
    this.flavor = flavor;
    this.layers = layers;
    this.flour = f;
    this.price = layers * 10;
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
    System.out.println("                              ________");
    System.out.println("              __....----''''''        ```````----....__");
    System.out.println("         _-'''                                         ```-_");
    System.out.println("       .'" + colorCake("frosting", 51) + "`.");
    for (int i = 0; i < this.layers; i++) {
      System.out.println("       |`-_" + colorCake(this.flavor, 47) + "_-'|");
      System.out.println("       |   ```--....____                     ____....--'''   |");
      System.out.println("       |                `````-----------'''''                |");
      if (i == this.layers - 1) {
        System.out.println("        `-_" + colorCake(this.flavor, 47) + "_-'");
        System.out.println("           ```--....____                     ____....--'''");
        System.out.println("                        `````-----------'''''");
      }
    }
  }

  void draw(Table t){
    this.draw();
    t.draw();
  }

  String colorCake(String middle, int gapLength) {
    int filling = (gapLength - middle.length()) / 2;
    String gap = "";
    for (int i = 0; i < filling; i++) {
      gap += " ";
    }
    gap += middle;
    for (int i = 0; i < filling; i++) {
      gap += " ";
    }
    if (middle.length() % 2 == 0) {
      gap += " ";
    }
    return gap;
  }

  String flavorSubstring() {
    if (this.flavor.length() < 11) {
      int smallGap = (11 - this.flavor.length()) / 2;
      String smallFlavor = "";
      for (int i = 0; i < smallGap; i++) {
        smallFlavor += " ";
      }
      smallFlavor += this.flavor;
      for (int i = 0; i < smallGap; i++) {
        smallFlavor += " ";
      }
      if (this.flavor.length() % 2 == 0) {
        smallFlavor += " ";
      }
      return smallFlavor;

    } else {
      return this.flavor.substring(0, 11);
    }
  }
}
