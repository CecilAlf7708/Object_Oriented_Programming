public abstract class GeometricObject{
	String color;
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
		int s = (int)((Math.random()) * 2);
		//System.out.println("S " + s);
		if(s == 1) {
			filled = false;
		}
		else {
			filled = true;
		}
		return filled;
	}
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Color: " + color + " Filled: " + filled + " " + "Area: " +area +"\n";
	}
	
	public abstract void howToColor();
	
	
	public abstract double getArea();
		
	
	public abstract double getPerimeter();
		
	
}