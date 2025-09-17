package edu.bhscs;

public class Awesome {
  //fields/properties this is the stuff that Awesome Has!!
  String name;

  //we need to CONSTRUCT something AWESOME
  public Awesome(String name) {
    System.out.println("I am the most awesome " + name + " ever!");
    this.name = name;
  }

  //METHODS ARE ABILITIES OF THE CLASS/TYPE
  String getName(){
    return name;
  }

}
