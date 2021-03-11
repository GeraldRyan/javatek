package Bank;

public class Account extends Bank {
	double balance;

	public Account(String branchLocation) {
		super(branchLocation);  
		this.balance = 0; 
	}

	public void checkBalance() {
		System.out.printf("The current balance is\n\t $%f\n", this.balance);
	}

	public static void main(String[] args) {
		Account myAcct = new Account("Bank of England");
		myAcct.checkBalance();
		
	}

}
