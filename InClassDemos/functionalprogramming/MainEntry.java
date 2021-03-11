package functionalprogramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainEntry {
/***
 * 
 */
	
	Calc add = new Calc() {
	/**
	 * 
	 */
		@Override
		public float compute(int[] a) {
			IntStream astream = Arrays.stream(a);
			return astream.reduce(0, (acc, v) -> acc + v);
		}
	};

	Calc subtract = new Calc() {
		@Override
		public float compute(int[] a) {
			IntStream astream = Arrays.stream(a);
			return astream.reduce(0, (acc, v) -> acc - v);
		}
	};

	Calc multiply = new Calc() {
		@Override
		public float compute(int[] a) {
			IntStream astream = Arrays.stream(a);
			return astream.reduce(1, (acc, v) -> acc * v);
		}
	};

	Calc divide = new Calc() {
		@Override
		public float compute(int[] a) {
			if (a.length > 2){throw new RuntimeException("Only input 2 numbers");} 
			return ((float)a[0]) / a[1];
		}
	};
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		MainEntry m = new MainEntry();
		int[] intarray = {1,2,3,4};
		int[] dividearray = {10,3}; // expect 3.333 divide first by second
		float sum = m.add.compute(intarray);		
		float nsum = m.subtract.compute(intarray);
		float product = m.multiply.compute(intarray);
		System.out.println(sum);
		System.out.println(nsum);
		System.out.println(product);
		float factor = m.divide.compute(dividearray);
		System.out.println(factor);
	}
	
	


}
