package algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Algorithms {

	public Algorithms() {
		// TODO Auto-generated constructor stub
	}

	public static void selectionsort(int[] unsortedArray) {
//		unsortedArray.
	}

	public static void main(String[] args) {
		// 1
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		String[] my_array2 = { "Java", "Python", "PHP", "C#", "C Programming", "C++" };
		Arrays.sort(my_array1);
		System.out.println(Arrays.toString(my_array1));
		Arrays.sort(my_array2);
		System.out.println(Arrays.toString(my_array2));
		// 2
		int my_array3[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.stream(my_array3).sum());
		// 3
		System.out.println("Begin transmission");
		for (int i = 0; i< 10; i++) {
			System.out.println("----------");
		}
		System.out.println("End transmission");
		// 4 - average of array
		int numbers[] = {20,30,25,35,-16,60,-100};
		System.out.println(Arrays.stream(numbers).average());
		// 5&6 - check for specific value (and get index)
		int[] my_arrayx = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
		int i = 0;
		for (int v: my_arrayx) {
			i++;
			if (v == 1254) {System.out.println("1254 found at location: " + i);	}
		}
		// 7
		int[] rm = {25,14,56,15,36,56,77,18,29,49};
		IntStream rmstream = Arrays.stream(rm);
		rmstream = rmstream.filter(k -> k != 15);
		System.out.println(Arrays.toString(rmstream.toArray()));
		
		// 8
		int[] m = {25,14,56,15,36,56,77,18,29,48};
		int[] mnew = new int[m.length];
		int dex = 0;
		for (int l: m) {
			mnew[dex++] = l;
		}
		System.out.println("Original array " + Arrays.toString(m));
		System.out.println("Copied array   " + Arrays.toString(mnew));
			
		// 9 - insert element into array at specific position
		int el = 777, pos = 5;
		int[] mnnew = new int[m.length + 1];
		int[] cpleft = Arrays.copyOf(m, pos);
		int[] cpright = Arrays.copyOfRange(m, pos, mnnew.length-1);
		System.out.println("Left String" + Arrays.toString(cpleft));
		System.out.println("Right String" + Arrays.toString(cpright));
		// TODO combine two with val in middle
		System.arraycopy(cpleft, 0, mnnew, 0, cpleft.length);
		mnnew[5] = el;
		System.arraycopy(cpright, 0, mnnew, cpleft.length + 1, cpright.length);
		System.out.println("New array" + Arrays.toString(mnnew));
		
		// 10 max and min val of array
		Integer[] my_array = {25,14,56,15,36,56,77,18,29,48};
		Stream<Integer[]> my_intstream = Arrays.asList(my_array).stream();
		
		Integer max = my_intstream.max(Comparator.comparing(Integer::valueOf));
//				my_intstream.max();
		int min = my_intstream.min();
		System.out.println("Max is " + max + "and min is " +min);
		
		
		
		
		// 16 remove duplicate elements -->> use hash map O(1) hashmap.contains method
		int[] dups = {1,2,2,2,3,3,4,4,5,3,5,3,8,8,9,11,4,46};
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
		for (int val: dups) {
			if (!hm.containsKey(val)) {
				hm.put(val, null);
			}
		}
		Set<Integer> s = hm.keySet(); 
		System.out.println("The keyset S of the hashmap" + s);
		Object[] non_duplicates = s.toArray();  // returns object array, but how to cast to int? 
		System.out.println("Non Duplicates" + Arrays.toString(non_duplicates));
	}
}


// public static void mergeSort(int[] unsorted, int beg, int mid, int end) {
//		// get the unsorted array, get the beginning middle and end indices 
//		
//		int l = mid - beg + 1; // left is number of elements on left side
//		int r = end - mid; // right is number of elements on right side
//		
//		int LeftArray[] = new int[l];  // declaring new sub arrays
//		int RightArray[] = new int[r];
//		
//		for (int i = 0; i<l; ++i) {  
//			LeftArray[i] = unsorted[beg + i];
//		}
//		for (int j = 0; j<l; ++j) {
//			LeftArray[j] = unsorted[mid + 1 + j];
//		}
//		int i = 0, j=0;
//		
//		
//	}
