package classcode;
import java.util.Scanner; 

public class LotteryGame {

	public static void main(String[] args) {
		// Write a program that randomly generates a lottery of a two-digit number,
		// prompts the user to enter a two-digit number, and determines whether the user
		// wins according to the following rule:

		Scanner input = new Scanner(System.in); 
    System.out.println("Enter Guess");
		String guess = input.nextLine();  // Read user input
    System.out.println("Guess is: " + guess);  // Output user input

		// If the user input matches the lottery exactly, the award is $5,000.
		// If the user input matches both digits but in the wrong order, the award is
		// $1,000.
		// If either digit of the user input matches any digit of the lottery, the award
		// is $250.
		// Otherwise the award is $0

	}

}
