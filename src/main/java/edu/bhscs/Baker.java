package edu.bhscs;

public class Baker {
  // PROPERTIES AND FIELDS
  String name;
  Player p;
  Flour f;
  Store placeOfWork;
  int cash;

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
    return new Cake(answer, this.f);
  }

  void takeJob(Store bakery) {
    String doYouWantToWorkHere = this.p.giveAnswer("Do you want to work at " + bakery.getName());
    if(doYouWantToWorkHere.equals("y")){
      this.placeOfWork = bakery;
      System.out.println(this.name + " now works at "+ bakery.getName() );
    }
  }
}
