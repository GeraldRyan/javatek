package functionalprogramming;

import java.util.Scanner;

public class GenericizedCalculator{
	
	// using anonymous classes
	GenericCalc<Integer> sum = (n1, n2, op) -> n1 + n2;
	GenericCalc<Integer> subtract = (n1, n2, op) -> n1 - n2;
	GenericCalc<Float> muliply = (n1, n2, op) -> n1 * n2;
	GenericCalc<Float> divide = (n1, n2, op) -> n1 / n2;
	
	// using named classes
	GenericCalc<Integer> Sum = new GenericCalc<Integer>() {
		@Override 
		public Integer compute(Integer n1, Integer n2, String op) {
			return n1+n2;
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		GenericizedCalculator calculator = new GenericizedCalculator();
		Integer i = calculator.sum.compute(5, 7, "hello world");
		GenericCalc<Integer> subtract = new GenericizedCalculator().subtract;
		System.out.println(i);
		System.out.println(subtract.compute(11,5, "bat"));

	}


}
