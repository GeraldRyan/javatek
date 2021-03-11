package Bank;

import java.util.Scanner;

public class Checking extends Account {

	public Checking(String branchLocation) {
		super(branchLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkBalance() {
		System.out.println("==Checking Account==");
		super.checkBalance();
	}

	public void deposit(double amt) {
		this.balance += amt;

	}

	public void widthdrawl(double amt) {
		if (this.balance > amt) {
			this.balance -= amt;
			System.out.printf("$%f widhdrawn from the checking account\n");
		}
		else {
			System.out.printf();
		}
	}

	public String toString() {
		return "This information is private";
	}

	public static void main(String[] args) {
		Checking myChecking = new Checking("Bank of Canada");
		Scanner reader = new Scanner(System.in);
		System.out.println(myChecking);
		myChecking.checkBalance();
		myChecking.deposit(5000);
		myChecking.checkBalance();
		Integer choice = 0;
		while (choice != 7) {
			choice = reader.nextInt();
			switch (choice) {
			case 1:
				myChecking.checkBalance();
//			case 2:
//				myChecking.deposit();
//			case 3:
//				myChecking.deposit();
			}

		}
		System.out.println("You have been logged out..");
	}

}