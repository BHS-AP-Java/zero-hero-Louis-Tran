package edu.bhscs;

import java.util.Scanner;

public class Player {
  // PROPERTIES AND FIELDS
  Scanner scanner = new Scanner(System.in);
  String name;
  int accompplishments = 0;

  // CONSTRUCTOR
  public Player(String name) {
    this.name = name;
  }

  // METHODS
  String giveAnswer(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }

  public void accomplish(int amount) {
    this.accompplishments += amount;
  }
}
