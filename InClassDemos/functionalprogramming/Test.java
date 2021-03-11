package functionalprogramming;

public class Test {
	
	
	public static void main(String[] args) {
		InterfaceGeneric<Integer> nums = new InterfaceGeneric<Integer>() {
			@Override
			public Integer compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return o1;
				}
				else {
					return o2;
				}
			}
		};	
		
		int max = nums.compare(13, 9);
		System.out.println(max);
		
	}
}

