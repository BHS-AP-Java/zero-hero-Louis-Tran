package edu.bhscs;

public class Main {
    public static void main(String[] args) {
        Baker Bob = new Baker(new Player("Bob"), "Bob");
        Bob.takeJob(new Store("Bothell", "Bob's Bakery"));
        Customer Alice = new Customer("Alice", 25);
        Bob.takeOrder(10, Alice);
        Alice.eatCake();

    }

}
