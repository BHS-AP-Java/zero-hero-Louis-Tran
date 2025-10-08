package edu.bhscs;

import java.util.Scanner;

public class Player {
  // PROPERTIES AND FIELDS
  Scanner scanner = new Scanner(System.in);
  String name;

  // CONSTRUCTOR
  public Player(String name) {
    this.name = name;
  }

  // METHODS
  String giveAnswer(String question) {
    System.out.println(question);
    return scanner.nextLine();
  }
}
