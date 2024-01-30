package abstractClass;

public class Circle extends ShapeForm {

	private double radius;
	
	
	public Circle(int xCore, int yCore, double radius) {
		super(xCore, yCore);
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculate the circumference from Circle
	 * @param length
	 * @param hight
	 * @return circumferance
	 */
	public double calculateCircumference(double radius) {
		return 2 * this.radius * Math.PI;
	}
	
	/**
	 * Calculate the circumference from Circle
	 * @param length
	 * @param hight
	 * @return area
	 */
	public double calculateArea(double radius) {
		return Math.PI * this.radius * this.radius;
	}
	
	public String toString() {
		return "Circle area: " + this.calculateArea + " circumference: " + this.calculateCircumference;
	}
}
