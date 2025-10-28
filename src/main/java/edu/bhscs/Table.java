package edu.bhscs;

// Properties
public class Table {
  int legs;
  int width;

  // Constructor
  public Table(int legs, int width) {
    this.legs = legs;
    this.width = width;
    System.out.println(
        "A table with " + legs + " legs and " + width + " inches wide has been created.");
  }

  // Methods
  void draw() {
    int cakeWidth = 62;
    int widthFiller = (cakeWidth - this.width) / 2;

    String widthGap = "";
    // Draw top of table
    for (int i = 0; i < widthFiller; i++) {
      widthGap += " ";
    }

    for (int i = 0; i < this.width; i++) {
      widthGap += "=";
    }

    for (int i = 0; i < widthFiller; i++) {
      widthGap += " ";
    }

    System.out.println(widthGap);
    // Draw legs of table
    int legsFiller = (this.width / this.legs);
    String legsGap = "";
    for (int i = 0; i < widthFiller; i++) {
      legsGap += " ";
    }
    for (int i = 0; i < this.legs; i++) {
      for (int j = 0; j < legsFiller; j++) {
        if (j == 0) {
          legsGap += " |";
        } else {
          legsGap += " ";
        }
      }
    }
    System.out.println(legsGap);
    System.out.println(legsGap);
  }
}
