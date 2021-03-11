package Dogs;

import java.lang.reflect.Field;

public class MyDog {
	static String homeAddress = "Lake Nokomis";
	String breed, name, color, birthYear;
	int age;
	boolean isAsleep = false;

	public MyDog(String breed, String name, String color, int age) {
		super();
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public MyDog(String breed, String name, String color, String birthYear) {
		super();
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.isAsleep = false;
		this.age = 2020 - Integer.parseInt(birthYear);
	}

	public void walk() {
		System.out.println(this.name + " is walking");
	}

	public void eat() {
		System.out.println(this.name + " is eating food");
	}

	public void sleep() {
		this.isAsleep = true;
		System.out.println(this.name + " is sleeping peacefully after a long walk");
	}

	public void wakeUp() {
		this.isAsleep = false;
		System.out.println(this.name + " has woken up");
	}

	public void pet() {
		System.out.println(this.name + " wags his tail");
	}

	public String toString() {
		return "My dog " + this.name + " is such a good dog";
	}

	public void info() throws IllegalArgumentException, IllegalAccessException {
		System.out.println("\nInfo about " + this.name + ": ");
		for (Field instanceVariable : this.getClass().getDeclaredFields()) {
			if (instanceVariable.getName() != "isAsleep") {
				System.out.println(instanceVariable.getName() + " " + instanceVariable.get(this));
			}
		}
		System.out.println();
	}

	public void move(String dest) {
		MyDog.homeAddress = dest;
		System.out.println(this.name + " has moved to " + MyDog.homeAddress + "!!");
	}
		
	public static boolean checkupNeeded(MyDog d) {
		if ((d.age - 1) % 3 == 0) {
			System.out.println("Checkup is needed" + d.name);
			return true;
		}
		System.out.println("No checkup is needed today for " + d.name);
		return false;
	}
	
	public void addMethod(String name) {
		// use reflection library
		// have the method print hello world new method
		
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		MyDog spot = new MyDog("pug", "snapper", "grey", 34);
		spot.walk();
		spot.sleep();
		spot.wakeUp();
		spot.pet();
		spot.info();
		System.out.println(spot);
		MyDog goldie = new MyDog("Golden Retriever", "Goldie", "gold", 1);
		goldie.eat();
		goldie.sleep();
		goldie.info();
		
		System.out.println("-----------------New Methods-------------------");
		MyDog napoleon = new MyDog("Min Pin", "napoleon", "brown", "2005");
		MyDog bear = new MyDog("supertinydog", "bear", "brown", "2015");
		napoleon.info();
		System.out.println("Napoleon's home address is " + napoleon.homeAddress);
		napoleon.move("Cedar Avenue");
		System.out.println("Bear's home address is " + bear.homeAddress);
		bear.move("Bear Avenue");
		System.out.println("Napoleon's home address is " + napoleon.homeAddress);
		bear.checkupNeeded(bear);
		
	}

}
