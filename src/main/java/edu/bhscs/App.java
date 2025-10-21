package edu.bhscs;

public class App {
  public static void main(String[] args) {

    Player user = new Player("Usario P. Player");

    String name = user.giveAnswer("What is your name?");
    int age = user.giveInt("How old are you?");

    Flour f = new Flour(5, "all-purpose");
    new Cake("chocolate",3, f).draw();
  }

  public static void date_10_21() {
    System.out.println("Today's work");
  }
}
