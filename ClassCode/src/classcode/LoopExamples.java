package classcode;

import java.nio.file.Path;
import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in fahrenheit");
		double f = sc.nextDouble();
		double c = (5.0/9) * (f -32);
		System.out.println(f + " fahrenheit is " + c + "celsius");
		sc.close();
		// int inputSec = sc.nextInt();
		
		// int min, sec; 
		
		// min = inputSec / 60;
		// sec = inputSec % 60;
		// System.out.println(min + "min and " + sec + " sec");
	}
	
}
