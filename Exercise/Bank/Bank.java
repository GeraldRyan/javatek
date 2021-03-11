package Bank;

public class Bank {
	static String bankName = "Bank of America";
	public String branchLocation;

	public Bank(String branchLocation) {
		super();
		this.branchLocation = branchLocation;
	}

	public static void changeBank(String name) {
		Bank.bankName = name;
		System.out.println("Bank is now " + Bank.bankName);
	}
	public void checkLocation() {
		System.out.println("Branch location: " + this.branchLocation);
	}
	
	public void changeLocation(String newLocation) {
		String tmp = this.branchLocation;
		this.branchLocation = newLocation;
		System.out.println("The branch location is changed from " + tmp + " to " + this.branchLocation);
	}
	
	public void checkBalance() {
		System.out.println("You need to create an account to check the balance");
	}
	
	
	
	
	public static String getBankName() {
		return bankName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public static void main(String[] args) {
		Bank boa = new Bank("Hennepin");
		boa.checkLocation();
		boa.changeLocation("Minnetonka");
		boa.checkLocation();
		boa.changeBank("Royal Bank of Scotland");
		
	}
	
}
