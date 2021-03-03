package LibraryUsers;

public class KidUser implements LibraryUser {
	int age;
	String bookType;

	public KidUser(int age, String bookType) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age < 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		else {
			System.out.println("Account registered successfully");			
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (bookType == "Kids") {
			System.out.println("Book issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
