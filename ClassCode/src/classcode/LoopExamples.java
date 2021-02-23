package classcode;

import java.nio.file.Path;
import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputSec = sc.nextInt();
		
		int min, sec; 
		
		min = inputSec / 60;
		sec = inputSec % 60;
		System.out.println(min + "min and " + sec + " sec");
	}
	
}
