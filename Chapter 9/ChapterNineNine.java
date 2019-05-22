/* Alfred Thomas Cecil
 * 5/22/19
 * A program that displays the area and perimeter of polygons.
 */

public class ChapterNineNine {
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon(6,4);
		RegularPolygon polygon2 = new RegularPolygon(10,4,5.6,7.8);
		System.out.printf("For polygon 1, the area is %.1f\n",polygon1.getArea());
		System.out.printf("For polygon 1, the perimeter is %.1f\n",polygon1.getPerimeter());
		System.out.printf("For polygon 2, the area is %.1f\n",polygon2.getArea());
		System.out.printf("For polygon 2, the perimeter is %.1f\n",polygon2.getPerimeter());
		
	}
}
	
class RegularPolygon {
		private int n;
		private double side;
		private double x;
		private double y;
		
		
	public RegularPolygon() {
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
		
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = n;
		this.x = 0;
		this.y = 0;
	}
		
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
		
	public int getN() {
		return n;
	}
		
	public void setN(int n) {
		this.n = n;
	}
		
	public double getSide() {
		return side;
	}
		
	public void setSide(double side) {
		this.side = side;
	}
			
	public double getX() {
		return x;
	}	
		
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
		
	public void setY(double y) {
		this.y = y;
	}
		
	double getArea() {
		return (n * (Math.pow(side,2))) / (4 * Math.tan(Math.PI / n));
	}
		
	double getPerimeter(){
		return side * n;
	}
		
}
