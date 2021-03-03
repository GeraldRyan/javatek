package MonsterGame;

public class FireMonster extends Monster {
  String name;

  FireMonster(String name) {
    super(name);
    this.name = name;
    System.out.printf("It was a FireMonster\n");
  }

  final public void attack() {
    System.out.printf("We've been attacked by %s the Fire Monster! Fight Fire with Fire!!!\n//========>\n", this.name);
  }

  public static void main(String[] args) {
    FireMonster fred = new FireMonster("fred");
    fred.attack();

    Monster marty = new Monster("Marty"); // Cannot instantiate type Moster
    marty.attack();
  }

}