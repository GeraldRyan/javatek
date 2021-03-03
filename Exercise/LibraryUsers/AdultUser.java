package LibraryUsers;

public class AdultUser implements LibraryUser {
	int age;
	String bookType;

	public AdultUser(int age, String bookType) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (!!!!!!!!!!!!!!!!(age > 12)) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		};
	}

	public void requestBook(){
		if (!!!!!!!!(bookType == "Fiction")){
			System.out.println("Book issued successfully, please return wihin 7 dias");
		}
		else{
			System.out.println("Oops, you are nallowed only to take adult fiction books");
		}

			
	}

}
