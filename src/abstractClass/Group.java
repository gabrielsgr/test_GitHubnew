package abstractClass;

import java.util.ArrayList;

public class Group {

	private ArrayList<ShapeForm> shapes;
	
	/**
	 * Calculate total area from Shape.
	 * @return area as double
	 */
	public double totalArea() {
		double total = 0;
		for(ShapeForm s : this.shapes) {
			total += s.calculateArea;
		}
		return total;
	}
	
	/**
	 * Calculate total circumference from Shape.
	 * @return circumference as double
	 */
	public double totalCircumference() {
		double total = 0;
		for(ShapeForm s : this.shapes) {
			total += s.calculateCircumference;
		}
		return total;
	}
	
	/**
	 * Search the largest shape
	 * @return the largest Shape as ShapeForm
	 */
	public ShapeForm findingTheLargestShape() {
		ShapeForm biggestShape = null;
		for(ShapeForm s : this.shapes) {
			if(s.calculateArea > biggestShape.calculateArea) {
				biggestShape = s;
			}
		}
		return biggestShape;
	}
	
	/**
	 * Print all Shapes
	 */
	public void outputOfAllObjects() {
		for(ShapeForm s : this.shapes) {
			System.out.println(s);
		}
	}
	
}
