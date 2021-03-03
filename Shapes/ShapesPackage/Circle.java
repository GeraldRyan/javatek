/**
 * 
 */
package ShapesPackage;


public class Circle extends Shape {
private double radius;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter() {
		return 2*Math.PI * this.radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
