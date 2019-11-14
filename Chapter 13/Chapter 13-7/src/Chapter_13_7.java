/*
 * Alfred Thomas Cecil
 * 11/13/19
 * A program based off of 13-1 using an interface to fill triangles with color
 */
import java.util.Scanner;
public class Chapter_13_7 {
	public static void main(String[] args) {
		GeometricObject[] objectArray = {new Triangle(5.5, 4.3, 7.1),new Triangle(7.9,5.6,8.0),new Triangle(4.4,3.2,1.6),new Triangle(5.5,2.2,4.4),new Triangle(4.5,6.4,5.7)};
		System.out.println("The area for each triangle is: ");
		for (int i = 0; i < objectArray.length; i++) {
			System.out.print(objectArray[i].getArea() + " ");
			if(objectArray[i] instanceof Colorable) {
				((Colorable)objectArray[i]).howToColor();
			}
		}
	}
}


class Triangle extends GeometricObject implements Colorable{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math .sqrt(s *(s - side1)* (s - side2)* (s - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: \n\tSide 1: " + this.side1 + "\n\tSide 2: " +  
		this.side2 + "\n\tSide3: " + this.side3 + "\n\tArea: " + this.getArea()
		+ "\n\tPerimeter: " + this.getPerimeter() + "\n" + super.toString();
	}
	@Override
	public void howToColor() {
		System.out.print("Color all sides. ");
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
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}

interface Colorable{
	
	public abstract void howToColor();
}









