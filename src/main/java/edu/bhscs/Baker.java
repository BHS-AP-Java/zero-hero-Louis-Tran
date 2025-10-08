package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  String name;
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;
  int skills=0;

  // CONSTRUCTOR
  Baker(Player p, String name) {
    this.p = p;
    this.name = name;
  }

  // METHODS
  void takeOrder(int price, Customer c) {
    cash += c.pay(price);
    c.takeCake(bakeCake());
  }

  Cake bakeCake() {
    String answer = this.p.giveAnswer("what cake do you you want?");
    int timeToBake=(10-this.skills)*1000;
    try{
      Thread.sleep(timeToBake);
      System.out.println("Baked a " + answer + " cake.");
      learn(1);
      return new Cake(answer, this.f);
    } catch (InterruptedException e) {
      e.printStackTrace();
      System.out.println("Something went wrong while baking the cake.");
      return null;
    }
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if (doYouWantToWorkHere.equals("y")) {
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at " + bakery.getName());
    }
  }

  public void learn(int amount){
    if(this.skills+amount<10){
      this.skills += amount;
    }
  }
}
