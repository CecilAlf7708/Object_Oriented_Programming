import java.util.Scanner;


public class Exercise_6_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print("Enter a password: ");
		s = input.next();
		boolean v = isValid(s);
		if(v == true) {
			System.out.println("This password is valid");
		}
		else {
			System.out.println("This password is invalid");
		}
	}
	
	public static boolean isValid(String s) {
		boolean valid = true;
		char c;
		int count = 0;
		int numCount = 0;
		for(int x =0;x < s.length();x++) {
			c = s.charAt(x);
			if((c >='!' && c <= '/') || (c >= ':' && c <= '@') || (c >= '[' && c <= '\'') || c >= '{' && c <= '~') {
				valid = false;
			}
			if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <='z')) {
				count++;
			}
			if(c >= '0' && c <= '9') {
				count++;
				numCount++;
			}
			
		}
		if(count < 8 || numCount < 2 || valid == false) {
				valid = false;
			}
			else {
				valid = true;
			}
		return valid;
	}
}
