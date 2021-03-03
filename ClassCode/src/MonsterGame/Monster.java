package MonsterGame;

public class Monster {
  public String name;

  Monster(String name) {
    // this.name = name; Does not seem to work
    System.out.println("A MONSTER was just born");
  }

  public static void main(String[] args) {

  }

  String getName() {
    return this.name;
  }

  void attack(){
    System.out.println("It looks like a generic!\n \"(#$*&&@!!! I don't know how to attack\" you hear him screech");
  };

}


