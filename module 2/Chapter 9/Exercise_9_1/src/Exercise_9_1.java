
public class Exercise_9_1 {
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle one\nWidth " + rec1.width + "\nHeight: " + rec1.height + "\nArea: " + rec1.getArea(rec1.width, rec1.height) + "\nPerimeter: " + rec1.getPerimeter(rec1.width,rec1.height)+ "\n");
		System.out.println("Rectangle two\nWidth " + rec2.width + "\nHeight: " + rec2.height + "\nArea: " + rec2.getArea(rec2.width, rec2.height) + "\nPerimeter: " + rec2.getPerimeter(rec2.width,rec2.height));
		
	}
}

class Rectangle{
	double width = 1;
	double height = 1;
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea(double width, double height) {
		double area = 0.0;
		area = width * height;
		return area;
	}
	
	double getPerimeter(double width, double height) {
		double perimeter = 0.0;
		perimeter = (width + height) * 2; 
		return perimeter;
	}
	
	void setWidth(double newWidth) {
		width = newWidth;
	}
	
	
	void setHeight(double newHeight) {
		height = newHeight;
	}

	
}