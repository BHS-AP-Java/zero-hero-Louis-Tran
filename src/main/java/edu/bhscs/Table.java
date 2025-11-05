package edu.bhscs;

// Properties
public class Table {
  int legs;
  int width;
  int height;

  // Constructor
  public Table(int legs, int width, int height) {
    this.legs = legs;
    this.width = width;
    this.height = height;
    }

  // Methods

  void setLegs(int legs) {
    this.legs = legs;
  }
  void setWidth(int width) {
    this.width = width;
  }
  void draw() {
    // There are 8 spaces at the start of the cake, with 55 characters
    /*int cakeWidth = 55;
    int widthFiller = (cakeWidth - this.width) / 2;


    // Draw top of table
    for (int i = 0; i < widthFiller ; i++) {
      widthGap += " ";
    }
    */
    String widthGap = "";
    for (int i = 0; i < this.width; i++) {
      widthGap += "=";
    }
    System.out.println(widthGap);
    // Draw legs of table
    int legGaps = (this.width /this.legs);

    String tableLegs = "";

    for(int i=0; i<this.legs;i++){
      if(i==0){
        //first leg
        for(int j=0; j<((legGaps/2)-1);j++){
          tableLegs+=" ";
        }
      } else {
        for(int j=0; j<legGaps;j++){
          tableLegs+=" ";
        }
      }
      tableLegs+="|";
    }

    for(int i=0; i<(this.height-1);i++){
      System.out.println(tableLegs);
    }
   }

   void draw(int offset) {
     // There are 8 spaces at the start of the cake, with 55 characters

      int cakeWidth = 55; int widthFiller = (cakeWidth - this.width) / 2;
      // Draw top of table
      String fillerGap = "";
        for(int i = 0; i < widthFiller ; i++){
          fillerGap += " "; }
      System.out.print(fillerGap);


    String widthGap = "";
    for (int i = 0; i < this.width; i++) {
       widthGap += "=";
     }
     System.out.println(widthGap);
     // Draw legs of table
     int legGaps = (this.width / this.legs);

     String tableLegs = "";

     for (int i = 0; i < this.legs; i++) {
       if (i == 0) {
         // first leg
         for (int j = 0; j < ((legGaps / 2) - 1); j++) {
           tableLegs += " ";
         }
       } else {
         for (int j = 0; j < legGaps; j++) {
           tableLegs += " ";
         }
       }
       tableLegs += "|";
     }

     for (int i = 0; i < (this.height - 1); i++) {
       System.out.print(fillerGap);
       System.out.println(tableLegs);
     }
   }
  }
