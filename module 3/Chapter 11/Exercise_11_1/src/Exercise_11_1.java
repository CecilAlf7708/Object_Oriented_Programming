import java.util.Date;


public class Exercise_11_1 {
	public static void main(String[] args) {
		GeometricObject gObject = new GeometricObject();
		Triangle triangle = new Triangle(5.0, 4.0, 3.0);
		triangle.setSide1(triangle.getSide1());
		System.out.println("Date: " + gObject.getDateCreated());
		System.out.println(gObject.toString());
		System.out.println(triangle.toString());
		System.out.println("Triangle area: " + triangle.getArea());
		System.out.println("Triangle perimeter: " + triangle.getPerimeter());
	}
}

class GeometricObject{
	java.util.Date date = new java.util.Date();
	GeometricObject(){
		
	}
	
	String getDateCreated(){
		return date.toString();
	}
	@Override
	public String toString(){
		return "Test";
	}
}

class Triangle extends GeometricObject{
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	double perimeter = 0;
	double area = 0; 
	double s = 0;
	
	
	
	Triangle(){
		
	}
	
	Triangle(double newSide1, double newSide2, double newSide3){
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	
	double getSide1(){
		return side1;
	}
	void setSide1(double newSide1) {
		side1 = newSide1;
	}
	double getSide2() {
		return side2;
	}
	void setSide2(double newSide2) {
		side2 = newSide2;
	}
	double getSide3(){
		return side3;
	}
	void setSide3(double newSide3) {
		side3 = newSide3;
	}
	double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	double getArea() {
		s = (side1 + side2 + side3) / 2;
		area = s * ((s - side1)*(s - side2)*(s - side3));
		return area;
		
	}
	@Override
	public String toString() {
		return "Triangle: side1 = "+side1+", side2 = "+side2+", side3 = "+side3;
	}
	
	
	
	
	
}
