package q3;

import java.util.ArrayList;

public class ArrayOfProds {

	public ArrayOfProds() {
		// TODO Auto-generated constructor stub
	}

	int[] input0Array = { 8, 10, 2 };
//			output: [20, 16, 80] // by calculating: [10*2, 8*2, 8*10]

	int[] inputArray = { 2, 7, 3, 4 };
//			outputArray = [84, 24, 56, 42} // by calculating: [7*3*4, 2*3*4, 2*7*4, 2*7*3]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	
	
//	public static int[] (int[] intarray) {
//		int[] rvalue;
//		int prod = 1;
//		for (int i =0; i<intarray.length; i++) {
//			prod *= intarray[i];
//		}
//		ArrayList<Integer> returnList= new ArrayList<Integer>();
//		for (int j = 0; j<intarray.length; j++) {
//			returnList.add(prod/)
//		}
//		
//		return 
//	}

	
	
	
	
	
	
	
	
	public static ArrayList<Integer> array_of_prods(int[] array) {
		ArrayList<Integer> ari = new ArrayList<Integer>();
		int runningProd = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					runningProd *= array[j];
				}
			}
			ari.add(runningProd);
		}
		Integer[] unboxed = ari.toArray(Integer[ari.size()]);
		return ari;
	}
}

//
//Array of Array Products
//Given a Array of integers arr, you're asked to calculate for each index i,
//the product of all integers except the integer at that index (i.e. except arr[i]).
//Implement a method arrOfArrproducts that takes an Array of integers
//and returns an Array of the products.
//
//Examples:
//
//input:  arr = [8, 10, 2]
//output: [20, 16, 80] // by calculating: [10*2, 8*2, 8*10]
//
//input:  arr = [2, 7, 3, 4]
//output: [84, 24, 56, 42] // by calculating: [7*3*4, 2*3*4, 2*7*4, 2*7*3]