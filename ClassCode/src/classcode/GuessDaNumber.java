package classcode;

import java.util.Scanner;

public class GuessDaNumber {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100);
		// System.out.println(answer);
		int guess = -1;
		Scanner input = new Scanner(System.in);
		while (guess != answer) {
			System.out.println("Guess the number");
			guess = input.nextInt();
			System.out.println(guess);
			if (guess > answer) {
				System.out.println("You guessed too big");
			} else if (guess < answer) {
				System.out.println("Guess Bigger");
			}
		}
		System.out.println("You got it bud");

	}

}
