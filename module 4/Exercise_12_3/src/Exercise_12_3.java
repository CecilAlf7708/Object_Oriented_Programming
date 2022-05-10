import java.util.Scanner;


public class Exercise_12_3 {
	public static void main(String[] args) {
		int[] array = new int[100];
		Scanner input = new Scanner(System.in);
		int index;
		for(int x = 0;x < array.length;x++) {
			array[x] = (int)(Math.random() * 100);
		}
		System.out.print("Please enter an index number: ");
		index = input.nextInt();
		try {
		System.out.println(array[index]);
	}
		catch(ArrayIndexOutOfBoundsException ex){
		System.out.print("index is out of bounds");
	}
	}
	
	
}
