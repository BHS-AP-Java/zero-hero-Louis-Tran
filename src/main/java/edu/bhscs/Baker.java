package edu.bhscs;

public class Baker {
  String name;

  public Baker(String name) {
    this.name = name;
    System.out.println(name + " hired as a baker.");
  }

  public String bakeCake(Cake cake) {
    return name + " baked a " + cake.getLayers() + "-layer " + cake.getFlavor() + " cake.";
  }
}
