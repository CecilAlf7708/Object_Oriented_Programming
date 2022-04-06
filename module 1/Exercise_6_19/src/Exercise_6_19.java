import java.util.Scanner;


public class Exercise_6_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1;
		double side2;
		double side3;
		boolean v;
		System.out.print("Please enter a number for each side: ");
		side1 = input.nextDouble();
		//System.out.print("Please enter a number for the second side: ");
		side2 = input.nextDouble();
		//System.out.print("Please enter a number for the last side: ");
		side3 = input.nextDouble();
		v = isValid(side1, side2, side3);
		if(v == true) {
			System.out.print("Side1: " + side1 + "\nSide2: " + side2 + "\nSide3: " + side3 + "\n");
			System.out.printf("The area of this triangle is%4.1f", area(side1, side2, side3));
		}
		else {
			System.out.println("This triangle is invalid");
		}
		
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		boolean valid;
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			valid = true;
		}
		else {
			valid = false;
		}
		return valid;
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s*((s - side1)*(s - side2)*(s - side3)), 0.5);
		return area;
	}
	
	
}
