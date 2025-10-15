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
    System.out.println("                              ________");
    System.out.println("              __....----''''''        ```````----....__");
    System.out.println("         _-'''                                         ```-_");
    System.out.println("       .'"+colorCake()+"`.");
    for (int i = 0; i < this.layers; i++) {
      System.out.println("       |`-_                                               _-'|");
      System.out.println("       |   ```--....____                     ____....--'''   |");
      System.out.println("       |                `````-----------'''''                |");
      if (i == this.layers - 1) {
        System.out.println("        `-_                                               _-'");
        System.out.println("           ```--....____                     ____....--'''");
        System.out.println("                        `````-----------'''''");
      }
    }
  }

  String colorCake(){
    int gapLength=51;
    int filling=(gapLength- this.flavor.length())/2;
    String gap="";
    for (int i = 0; i < filling; i++) {
      gap += " ";
    }
    gap += this.flavor;
    for (int i = 0; i < filling; i++) {
      gap += " ";
    }
    return gap;
  }
}
