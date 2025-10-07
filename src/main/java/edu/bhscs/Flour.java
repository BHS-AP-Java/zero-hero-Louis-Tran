package edu.bhscs;

public class Flour {
  // PROPERTIES AND FIELDS
  int quality; // 1-10 scale
  String type; // e.g. "all-purpose", "whole wheat", "gluten-free"

  // CONSTRUCTOR
  public Flour(int quality, String type) {
    this.quality = quality;
    this.type = type;
  }

  // METHODS
  int decayQuality(int amount) {
    this.quality -= amount;
    if (this.quality < 0) {
      this.quality = 0;
    }
    return this.quality;
  }
}
