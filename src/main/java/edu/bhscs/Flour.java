package edu.bhscs;

public class Flour {
  // The fields or properties
  String type;
  int weight; // in grams
  int price; // in dollars
  int quality; // rating from 1 to 10

  // Constructor
  public Flour(String type, int weight, int price, int quality) {
    this.type = type;
    this.weight = weight;
    this.price = price;
    this.quality = quality;
  }
  public Flour(String type, int weight) {
    this.type = type; 
    this.weight = weight;
  }

  // Methods
  String getType() {
    return type;
  }

  int getWeight() {
    return weight;
  }

  String getDisplay() {
    return "This flour is " + this.type + " and weighs " + this.weight + " grams.";
  }

}
