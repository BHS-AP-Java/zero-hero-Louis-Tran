package edu.bhscs;

public class Burger {
  // properties
  boolean isEaten = false;
  int layers;

  // constructor
  public Burger(int layers) {
    this.layers = layers;
  }

  // methods

  public String beEaten() {
    if (!isEaten) {
      isEaten = true;
      return "Nom nom nom!";
    } else {
      return "Aw man! This burger is already eaten.";
    }
  }

  public void draw() {

    if (!isEaten) {
      System.out.println("  _________");
      System.out.println(" /         \\");
      System.out.println("|  ~~~~~~~  |");
      for (int i = 0; i < layers; i++) {
        System.out.println("|  =======  |");
        System.out.println("|  ~~~~~~~  |");
      }
      System.out.println(" \\_________/");
    } else {
      System.out.println("  _________");
      System.out.println(" /         \\");
      System.out.println("|           |");
      System.out.println("|   EATEN   |");
      System.out.println("|           |");
      System.out.println(" \\_________/");
    }
  }
}
