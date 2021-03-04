package OOPTestCLass;

public class Circle {
	private static final double PI = 3.1415926;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calAear() {
		return PI*radius*radius;
	}
	
	public double calPerimeter() {
		return 2*PI*radius;
	}
}
