package edu.bhscs;

public class Store {
  //FIELDS AND PROPERTIES
  String location;
  String name;

  //CONSTRUCTOR
  public Store(String location, String name) {
    this.location = location;
    this.name = name;
    System.out.println(name + " is now open at " + location);

  }

  //METHODS
  String getName(){
    return this.name;
  }
  String getLocation(){
    return this.location;
  }
}
