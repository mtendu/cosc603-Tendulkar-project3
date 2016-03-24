package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	private double diffX, diffY;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		diffX = p2.x - p1.x;
		diffY = p2.y - p1.y;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		
		return Math.abs(diffX * diffY);
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
	}
	
	
}
