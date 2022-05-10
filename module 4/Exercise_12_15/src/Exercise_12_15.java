import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Exercise_12_15{
	public static void main(String[] args) throws Exception{
		int[] array = new int[100];
		for(int x = 0;x < array.length;x++) {
			array[x] = (int)(Math.random() * 101);
		}
		Arrays.sort(array);
		
		
		
			
		try {
			File myFile = new File("Ex12_15.txt");
		PrintWriter output = new PrintWriter(myFile);
		Scanner input = new Scanner(myFile);
			if(myFile.exists()) {
				System.out.println("file exists");
			}
			for(int x = 0;x<array.length;x++) {
				output.print(array[x] + " ");
			}
			output.close();
			
			while(input.hasNext()) {
				int y = input.nextInt();
				System.out.print(y + " ");
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.print("caught");
		}
		
		
	}

}
