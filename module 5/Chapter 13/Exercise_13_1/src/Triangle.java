class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		
	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double getside1() {
		return side1;
	}
	
	void setSide1() {
		this.side1 = side1;
	}
	double getside2() {
		return side2;
	}
	
	void setSide2() {
		this.side2 = side2;
	}
	double getside3() {
		return side3;
	}
	
	void setSide3() {
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s *((s - side1) * (s - side2) * (s - side3)));
		return area;
	}
	public double getPerimeter() {
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
}
