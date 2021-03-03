package classcode;

import java.util.Scanner;

public class CustomMathFunctions {

	public static int getMin(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	};

	public static double XingTime(double Rate, double multFactor) {
		return Math.log(multFactor) / Math.log(Rate);
	}

	public static double doublingTime(double Rate) {
		return Math.log(2) / Math.log(Rate);
	}

	public static int getGreatestCommonMultiper(int a, int b) {
		int trialAnswer = 1;
		for (int i = 1; i <= getMin(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				trialAnswer = i;
			}
		}
		return trialAnswer;
	}

	public static void FirstExercise() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Greatest common multiplier is");
		System.out.println(getGreatestCommonMultiper(a, b));
		System.out.println("Enter interest rate in 1.xx format e.g. 1.07");
		double r = input.nextDouble();
		System.out
				.println("Enter multiplication factor of base principle (e.g. 2.0 for time to double, 3.0 time to triple");
		double factor = input.nextDouble();
		System.out.printf("The time it takes to %f x your Money is %f years", factor, XingTime(r, factor));
		input.close();
	}

	public static void ArraysExercise() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two positive integers");

	}

	public static void main(String[] args) {
		// FirstExercise();
		ArrayExercisesClass.start();
		ArrayExercisesClass.whileTo100();
		System.out.println("-----------------");
		// ArrayExercisesClass.loopToTen(); // Done
		ArrayExercisesClass.printCustomLoop(1, 10, 1); // Done
		System.out.println("-----------------");
		ArrayExercisesClass.printCustomLoop(0, 100, 10); // Done
		System.out.println("-----------------");
		ArrayExercisesClass.printModsX(100, 5, 0); // Done
		System.out.println("-------Excluding all over 50-------");
		ArrayExercisesClass.printModsX(100, 5, 1); // Done
		System.out.println("-------excluding under 25 over 75-----");
		ArrayExercisesClass.printModsX(100, 5, 2); // Done
		System.out.println("-----------");
		ArrayExercisesClass.printCalendar(3); // Done
		System.out.println("-----------");
		ArrayExercisesClass.palindromePrinter(200); // Done
		System.out.println("------Printing Fibbonnacci to 50-----");
		ArrayExercisesClass.printFib(); // Done

	}

}

class ArrayExercisesClass {

	public static void start() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nYour server is running on port 3000");
	}

	public static void printCustomLoop(int from, int to, int step) {
		for (int i = from; i <= to; i += step) {
			System.out.println(i);
		}
	}

	public static void whileTo100() {
		int x = 0;
		while (true) {
			System.out.println(x * 10);
			x += 1;
			if (x > 10)
				return;
		}
	}

	public static void loopToTen() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void printModsX(int end, int mod, int question) {
		switch (question) {
			case 0:
				for (int i = 0; i < end; i++) {
					if (i % mod == 0)
						System.out.println(i);
				}
				break;
			case 1:
				for (int i = 0; i < end; i++) {
					if (i > 50)
						return;
					if (i % mod == 0)
						System.out.println(i);
				}
			case 2:
				for (int i = 0; i < end; i++) {
					if ((i % mod == 0) && (i >= 25 && i <= 75))
						System.out.println(i);
				}
		}
	}

	public static void printCalendar(int weeks) {
		for (int week = 1; week <= weeks; week++) {
			System.out.printf("Week %d\n", week);
			for (int day = 1; day <= 7; day++) {
				System.out.printf("Day %d\n", day);
			}
		}
	}

	public static void palindromePrinter(int range) {
		System.out.printf("Printing all Palindromes between 10 and %d\n", range);
		int trial = 10;
		int l, r, m;
		while (trial < range) {
			if (trial < 100) {
				l = (int) (trial / 10); // 2
				// System.out.println(l);
				r = (int) ((trial - l * 10));
				if (l == r)
					System.out.println(trial);
			} else if (trial < 1000) {
				l = (int) (trial / 100); // 2
				m = (int) ((trial - l * 100) / 10); // 3
				r = (int) ((trial - l * 100) - m * 10); // trial
				if (l == r)
					System.out.println(trial);
			}
			trial++;
		}
	}

	public static int fibbonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		return fibbonacci(n - 1) + fibbonacci(n - 2);
	}
	public static void printFib(){
		int val = 1;
		int pval = 0;
		int tmp;
		while (val < 50){
			System.out.println(val);
			tmp = val;
			val = val + pval;
			pval = tmp; 
		}
	}
}

// Write a program that creates an array of integers with a length of 3. Assign
// the values 1, 2, and 3 to the indexes. Print out each array element.

// Write a program that returns the middle element in an array. Give the
// following values to the integer array: {13, 5, 7, 68, 2} and produce the
// following output: 7

// Write a program that creates an array of String type and initializes it with
// the strings “red”, “green”, “blue” and “yellow”. Print out the array length.
// Make a copy using the clone( ) method. Use the Arrays.toString( ) method on
// the new array to verify that the original array was copied.

// Write a program that creates an integer array with 5 elements (i.e.,
// numbers). The numbers can be any integers. Print out the value at the first
// index and the last index using length - 1 as the index. Now try printing the
// value at index = length ( e.g., myArray[myArray.length ] ). Notice the type
// of exception which is produced. Now try to assign a value to the array index
// 5. You should get the same type of exception.

// Write a program where you create an integer array with a length of 5. Loop
// through the array and assign the value of the loop control variable (e.g., i)
// to the corresponding index in the array.

// Write a program where you create an integer array of 5 numbers. Loop through
// the array and assign the value of the loop control variable multiplied by 2
// to the corresponding index in the array.

// Write a program where you create an array of 5 elements. Loop through the
// array and print the value of each element, except for the middle (index 2)
// element.

// Write a program that creates a String array of 5 elements and swaps the first
// element with the middle element without creating a new array.

// Write a program to sort the following int array in ascending order: {4, 2, 9,
// 13, 1, 0}. Print the array in ascending order, print the smallest and the
// largest element of the array. The output will look like the following:
// Array in ascending order: 0, 1, 2, 4, 9, 13

// The smallest number is 0

// The biggest number is 13

// Create an array that includes an integer, 3 strings, and 1 double. Print the
// array.
