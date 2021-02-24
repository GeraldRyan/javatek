package classcode;
import java.util.Scanner;

public class LotteryGame {

	public static void main(String[] args) {
		// Write a program that randomly generates a lottery of a two-digit number,
		// prompts the user to enter a two-digit number, and determines whether the user
		// wins according to the following rule:

		Scanner input = new Scanner(System.in);
		String guess;
		System.out.println("Enter Guess between 0 and 100");
		while (true) {
			guess = input.nextLine(); 
			System.out.println("You guessed: " + guess);
			if (Integer.parseInt(guess, 10) > 0 && Integer.parseInt(guess, 10) < 100) {
				break;
			}
			System.out.println("Make sure it is between 0 and 100");
		}
		input.close();

		int answer = (int) (Math.random() * 100);
		System.out.println("Answer is: " + answer); 

		int guessedInt = Integer.parseInt(guess, 10); // cast guess to Int
		int bigE = (int) (guessedInt / 10); // Get big Endian first 10s digis
		int littleE = guessedInt - bigE * 10; // get little endian 1s digit
		int bigEAns = (int) (answer / 10); 
		int littleEAns = answer - bigEAns * 10;
		// DEBUG LOGS
		// System.out.println("expect 0: " + bigE); 
		// System.out.println("expect 9: " + littleE); 
		// System.out.println("expect ?: " + bigEAns); 
		// System.out.println("expect ?: " + littleEAns); 
		// DEBUG LOGS

		System.out.println("Answer " + answer); 
		
		if (guessedInt == answer) {
			System.out.println("Congratulations, you got the answer- You win the big prize of $5000");
			return;
		} 
		else if (bigE == littleEAns && littleE == bigEAns){
			System.out.println("Congrats, you got both digits correct but in the wrong order. You're getting $100");
		}
		else if (bigE == bigEAns || bigE == littleEAns || littleE == bigEAns || littleE == littleEAns) {
			System.out.println("Congrats, you guessed one right- You won $250");
			return;
		} else {
			System.out.println("Better Luck Next time");
		}
	}
}
