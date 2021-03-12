package chain_methods_example;

import java.util.Arrays;
import java.util.List;

public class Calc {
	int sum = 0;
	int numA = 0;
	int numB = 0;
	int result = 0;

	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(3, 4, 3);
		Calc c = new Calc();
		c.performSum(num).displaySum();
	}

	public Calc performSum(List<Integer> iList) {
		this.sum = iList.stream().mapToInt(Integer::intValue).sum();
		return this;
	}

	public Calc numberTOPerformOn(int numA, int numB) {
		this.numA = numA;
		this.numB = numB;
		return this;
	}

	public Calc operation(String opcode) {
		switch (opcode) {
		case "+":
			this.result = this.numA + this.numB;
			break;
		case "-":
			break;
		case "*":
			break;
		case "/":
			break;
		default:
			System.out.println("Some error occurred");
		}
		return this;
	}

	public void displaySum() {
		System.out.println("Sum of values is: " + sum);
	}
}
