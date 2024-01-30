package abstractClass;

public class Triangle extends ShapeForm {

	private double length;
	private double hight;
	private double width;


	public Triangle(int xCore, int yCore, double length, double hight, double width) {
		super(xCore, yCore);
		this.length = length;
		this.hight = hight;
		this.width = width;			
	}


	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Calculate the circumference from Triangle
	 * @param length
	 * @param hight
	 * @return circumferance
	 */
	public double calculateCircumference(double length, double hight) {
		return this.length + this.hight + this.width;
	}
	
	/**
	 * Calculate the area from Triangle
	 * @param length
	 * @param hight
	 * @return area
	 */
	public double calculateArea(double length, double hight) {
		return (this.length * this.hight) / 2;
	}
	
	public String toString() {
		return "Triangle area: " + this.calculateArea + " circumference: " + this.calculateCircumference;
	}
}
