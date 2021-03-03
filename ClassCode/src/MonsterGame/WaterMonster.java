package MonsterGame;

public class WaterMonster extends Monster {
  String name;

  WaterMonster(String name) {
    super(name);
    this.name = name;
    System.out.println("It was a WaterMonster\n");
  }

  final public void attack() {
    System.out.printf("We've been attacked by %s the Water Monster! This could get slippery!!!\n//========>\n\n", this.name);


  }

  public static void main(String[] args) {
    WaterMonster willy = new WaterMonster("Willy");
    willy.attack();

    Monster marty = new Monster("Marty"); // Cannot instantiate type Moster
    marty.attack();
  }

}