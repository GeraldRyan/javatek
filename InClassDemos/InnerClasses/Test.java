package InnerClasses;

public class Test {
	public static void main(String[] args) {
		Days day = Days.FRIDAY;
		System.out.println(day);
		System.out.println(day instanceof Days);
	}
	
	Test t = new Test();
	Test.InnerTest inner = new t.InnerTest();
	
	
	public class InnerTest{
		public void hello() {
			System.out.println("Hello from inner class");
		}
	}
	
	
	enum Days {	
		SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3),
		THURSDAY(4), FRIDAY(5), SATURDAY(6);
		private final int day;
		private Days(int day) {
			this.day = day;
		}
	}
}