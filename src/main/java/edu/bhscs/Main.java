package edu.bhscs;

public class Main {
    public static void main(String[] args) {
        Baker Bob = new Baker(new Player("Bob"), "Bob");
        Bob.takeJob(new Store("Bothell", "Bob's Bakery"));

        Bob.takeOrder(10, new Customer("Alice", 25));
        System.out.println(Bob.cash);

    }

}
