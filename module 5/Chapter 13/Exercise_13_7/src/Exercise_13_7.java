
public class Exercise_13_7{
	public static void main(String[] args) {
		GeometricObject[] triangles = {new Triangle(13, 9, 18),new Triangle(9,12,9),new Triangle(3,4,3),new Triangle(22,46,33),new Triangle(5,5,5)};
		for(int x = 0;x < triangles.length;x++) {
			if(triangles[x] instanceof Colorable) {
				((Colorable)triangles[x]).howToColor();
				((GeometricObject)triangles[x]).isFilled();
				((Triangle)triangles[x]).getArea();
				System.out.print("Triangle " + (x+1) + " " +(Triangle)triangles[x]);
			}
			
			
			
		}
		
		
		
		
	}
}
