package abstractClass;

public class Rectangle extends ShapeForm{
	
	private double length;
	private double width;
	
	
	public Rectangle(int xCore, int yCore, double length, double width) {
		super(xCore, yCore);
		this.length = length;
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Calculate the circumference from Rectangle
	 * @param length
	 * @param width
	 * @return circumference
	 */
	public double calculateCircumference(double length, double width) {
		return 2 * (this.length + this.width);
	}
	
	/**
	 * Calculate the circumference from Rectangle
	 * @param length
	 * @param width
	 * @return area
	 */
	public double calculateArea(double length, double width) {
		return this.length * this.width;
	}
	
	public String toString() {
		return "Rectangle area: " + this.calculateArea + " circumference: " + this.calculateCircumference;
	}
}
