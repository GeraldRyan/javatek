package functionalprogramming;

public class UseGeneric {
	public static void main(String[] args) {
		
		InterfaceGeneric<Float> nums = new InterfaceGeneric<Float>() {
			@Override
			public Float compare(Float o1, Float o2) {
				if (o1 > 02) {
					return o1;
				} else {
					return o2;
				}
			}
		};
		
		InterfaceGeneric<String> strgs = new InterfaceGeneric<String>() {
			@Override
			public String compare(String s1, String s2) {
				if (s1.length() > s2.length()) {
					return s1;
				}
				else {return s2;}
			}
			
		};
		
		
		
		Float max = nums.compare(-5.5F, 1.5F);
		System.out.println(max);
		String biggerstring = strgs.compare("Mary had a", "little lamb");
		System.out.println(biggerstring);
	}
}

