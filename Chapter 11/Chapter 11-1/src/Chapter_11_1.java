/*
 * Alfred Thomas Cecil
 * 11/23/19
 * A program the creates a Triangle class that extends a GeometricObject
 */
import java.util.Scanner;
public class Chapter_11_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal length for your triangle on side 1: ");                               
		double side1 = input.nextDouble();
		System.out.println("Side 2: ");
		double side2 = input.nextDouble();
		System.out.println("And side 3: ");
		double side3 = input.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		input.nextLine();
		
		System.out.println("Please choose a color to use: ");    
		String color = input.nextLine();
		triangle.setColor(color);
		
		System.out.println("Enter a value to fill the triangle with your color: ");
		boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		
		System.out.println(triangle);
	}
}


class Triangle extends GeometricObject{
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
}
class GeometricObject{
	
	String color;
	boolean filled;
	
	GeometricObject() {
		
	}
	
	GeometricObject(String color , boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString() {
		return "\n\tColor: " + color + "\n\t Filled: " + filled;
	}
}	


