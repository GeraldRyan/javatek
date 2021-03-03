package oop_example_substitute;

public class TestCircle {

	public TestCircle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Circle c = new Circle(2.0);
		System.out.println(c);
		System.out.println("Area of the circle is " + c.getArea());
		Cylinder cy = new Cylinder(2.2, 1.1);
		Circle cycirc = new Cylinder(2.2, 1.1);
		System.out.println(cy);
		System.out.println(cycirc.getArea());
		Cylinder cyflat = new Cylinder(0, 1.1);
		System.out.println("Area of flat cylinder is " + cyflat.getArea());
		System.out.println("Volume of flat cylinder is " + cyflat.getVolume());
	}

}
