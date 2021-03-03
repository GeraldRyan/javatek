package LibraryUsers;

public class LibraryInterfaceDemo {

	public LibraryInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Kid");
		KidUser kid1 = new KidUser(10, "Kids");
		KidUser kid2 = new KidUser(18, "Fiction");		
		kid1.registerAccount();
		kid1.requestBook();
		kid2.requestBook();
		System.out.println("Testing Adult");
		AdultUser a1 = new AdultUser(5,"Kids");
		AdultUser a2 = new AdultUser(23,"Fiction");
		a1.registerAccount();
		a1.requestBook();
		a2.registerAccount();
		a2.requestBook();
		

	}

}
