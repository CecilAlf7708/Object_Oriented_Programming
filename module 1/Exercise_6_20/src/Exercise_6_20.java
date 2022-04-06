import java.util.Scanner;


public class Exercise_6_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print("Please enter a String: ");
		s = input.nextLine();
		int length = 0;
		for(int x = 0;x < s.length();x++) {
			length++;
		}
		System.out.print("\'" + s + "\' is " + length + " characters long\nThere are " + countLetters(s) + " letters in \'" + s + "\'");
	}
	public static int countLetters(String s) {
		char c;
		int letters = 0;
		for(int x = 0;x < s.length();x++) {
			c = s.charAt(x);
			if(c >= 'A' && c <= 'z' && c != '[' && c != '\\' && c != ']' && c != '^' && c != '-' && c != '\'' ) {
				letters++;
			}
		}
		return letters;
	}
}
