/*
 * Alfred Thomas Cecil
 * 11/13/19
 * A program that creates a copy of and compares two octagons
 */
import java.lang.*;
public class chapter_13_11 {
	public static void main(String[] args) {
		double side = 8.0;
		Octagon octagon = new Octagon(side);
		Octagon copy = octagon.clone();
		if (octagon.compareTo(copy) == 1) {
		System.out.print("These Octagons are different.");
		}
		else {
			System.out.print("These Octagons are the same.");
		}
	}
	
}

abstract class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;

	  /** Construct a default geometric object */
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with color and filled value */
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }

	  /** Return color */
	  public String getColor() {
	    return color;
	  }

	  /** Set a new color */
	  public void setColor(String color) {
	    this.color = color;
	  }

	  /** Return filled. Since filled is boolean,
	   *  the get method is named isFilled */
	  public boolean isFilled() {
	    return filled;
	  }

	  /** Set a new filled */
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  /** Get dateCreated */
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  @Override
	  public String toString() {
	    return /*"created on " + dateCreated + */"\n\tcolor: " + color +
	      " and filled: " + filled;
	  }

	  /** Abstract method getArea */
	  public abstract double getArea();{
		  
	  }

	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();{
	}

	
	

}	
	
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	double side = 0.0;
	
	public Octagon(){
		this.side = 8;
	}
		
	public Octagon(double side){
		this.side = side;
	}
	
	@Override
	public double getArea(){
		return (2+(4/Math.sqrt(2))) * side * side;
	}
	
	@Override
	public double getPerimeter(){
		return side * 8;
	}
	
	public int compareTo(Octagon copy) {
		if (getArea() > copy.getArea())
			return 1;
		else if (getArea() < copy.getArea())
			return -1;
		else 
			return 0;
	}
	
	public Octagon clone() {
		try {
			return (Octagon)super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
	
	
	