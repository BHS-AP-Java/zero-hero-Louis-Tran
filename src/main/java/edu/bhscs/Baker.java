package edu.bhscs;

public class Baker {
  String name;
  Store workplace;

  public Baker(String name, Store workplace) {
    this.name = name;
    this.workplace = workplace;
    System.out.println(name + " hired as a baker at " + workplace.location + "!");
  }

  public String bakeCake(Cake cake) {
    return name + " baked a " + cake.getLayers() + "-layer " + cake.getFlavor() + " cake.";
  }
}
