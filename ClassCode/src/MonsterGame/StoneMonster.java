package MonsterGame;

public class StoneMonster extends Monster {
  String name;

  StoneMonster(String name) {
    super("");
    this.name = name;
    System.out.printf("It was a Stonemonster\n");
  }

  final public void attack() {
    System.out.printf("We've been attacked by %s the Stone Monster! He's throwing stones at us!!!\n", this.name);
    System.out.println("|+++++++++++|");
    System.out.println("|+++++++++++|");
    System.out.println("|+++++++++++|");
    System.out.println("|    +++    |");
    System.out.println("|    +++    |");
    System.out.println("|+++++++++++|");
    System.out.println("|+++++++++++|");
    System.out.println("|    +++    |");
    System.out.println("|    +++    |");
    System.out.println("|+++++++++++|");
    System.out.println("|+++++++++++|");
    System.out.println("|+++++++++++|");

  }

  public static void main(String[] args) {
    StoneMonster sam = new StoneMonster("Sam");
    sam.attack();

    Monster marty = new Monster("Marty"); // Cannot instantiate type Moster
    marty.attack();
  }

}
