/*Alfred Thomas Cecil
 * 5/7/19
 * A program that displays the width, height, area, and perimeter of two rectangles
 */

public class ChapterNineOne {
	public static void main(String[] args) {
		Rectangle rectangle1 = new  Rectangle(4,40);
		System.out.println("For this rectangle,the width and height are "+rectangle1.width+" and "+rectangle1.height+", and the area is "+rectangle1.getArea()+" and the perimeter is "+rectangle1.getPerimeter());

		Rectangle rectangle2 = new  Rectangle(3.5,35.9);
		System.out.println("For this rectangle,the width and height are "+rectangle2.width+" and "+rectangle2.height+", and the area is "+rectangle2.getArea()+" and the perimeter is "+rectangle2.getPerimeter());
	}
}

class Rectangle {
	double width;
	double height;
	
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return width + width + height + height;
	}
}
