/*
 * Alfred Thomas Cecil
 * A program that creates an array of 100 random integers
 * 10/29/19
 */
import java.util.Scanner;
public class Chapter_12_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int [] array = new int [100];
		for(int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random() * 101);
		}
		System.out.println("Please enter an index number between 0-99 to search: ");
		num = input.nextInt();
		try {
			System.out.println(array[num]);
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("Sorry that index does not exist.");
		}
		
	}
}
