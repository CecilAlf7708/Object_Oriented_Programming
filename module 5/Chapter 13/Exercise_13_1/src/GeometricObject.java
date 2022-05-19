public abstract class GeometricObject{
	String color = "white";
	boolean filled;
	double area;
	double perimeter;
	
	protected GeometricObject() {
		
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	String getColor(){
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	boolean isFilled() {
		return filled;
	}
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Color: " + color + "\nFilled: " + filled;
	}
	
	public abstract double getArea();
		
	
	
	
	public abstract double getPerimeter();
		
	
}