package edu.bhscs;

import java.util.Scanner;

public class Player {
  // Properties
  String name;
  Scanner s;

  // Constructor
  public Player(String name) {
    this.s = new Scanner(System.in);
    System.out.println("What is your name?");
    this.name = this.s.next();
  }

  // methods

  public void answerQuestion(String question) {
    System.out.println("What is your question?");
    this.s.next();
    System.out.println("You're an idiot.");
  }
}
