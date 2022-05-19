class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	public double side;
	
	Octagon(){
		
	}
	
	Octagon(double side){
		this.side = side;
		
	}
	@Override
	public Object clone() {
		try {
		return super.clone();
		}
		
		catch(CloneNotSupportedException ex) {
			return "Clone fail";
		}
	}	
	
	@Override
	public int compareTo(Octagon o) {
		if(area > o.area) {
			return 1;
		}
		else if(area < o.area) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
	double getside() {
		return side;
	}
	
	void setSide() {
		this.side = side;
	}
	
	public double getArea() {
		area = (2 + (4 / Math.pow(2,0.5)) * side * side);
		return area;
	}
	
	
}
