package classcode;

import java.nio.file.Path;
import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		int amount = 75; 
		double rate = 0.0875;
		double tax = Math.round(amount * rate);
		
		System.out.println(tax);

	}
	
}
