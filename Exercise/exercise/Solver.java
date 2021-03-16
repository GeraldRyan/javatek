package exercise;

import java.util.ArrayList;
import java.util.HashMap;

public class Solver {
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

	public Solver(int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (hm.get(i)==null) {
				hm.put(data[i], i);				
			}
//			else {
//				
//			}

		}
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] test1 = { 5, 8, 3, 9, 0 }; // 8
		int[] test2 = { 5, 8, 3, 9, 0 }; // 7
		ArrayList<Integer> solution = new ArrayList<Integer>();
		int target = 8;
		Solver slv = new Solver(test1);
		for (int i = 0; i<test1.length; i++) {
			if (slv.hm.get(target-test1[i]) != null) {
				solution.add(i);
				solution.add(slv.hm.get(target-test1[i]));
				continue;
			}
		}
		System.out.println(solution);
	}

//	public int[] findTarget(int[] array, int target){
//	      for (int i = 0; i<array.length; i++) {
//	    	  if (target - array[i])== 0{
//	    		  
//	    	  }
//	      }
	      
//	  }

}
