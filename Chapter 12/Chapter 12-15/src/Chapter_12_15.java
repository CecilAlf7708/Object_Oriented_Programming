/*
 * Alfred Thomas Cecil
 * 10/31/19
 * A program that creates a text file of 100 random integers
 */
//import java.io.* = everything in io class
// remember ArrayList
import java.util.ArrayList;
public class Chapter_12_15 {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("12-15.txt");
		try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
			for (int i = 0; i < 100; i++) {
				int num = (int)(Math.random() * 101);
				output.print(num + " ");
			}
		}
		java.util.Scanner input = new java.util.Scanner(file);
		ArrayList<Integer> printout = new ArrayList<>();
		while (input.hasNext()) {
			int count = input.nextInt();
			printout.add(count);
		}
		for (int i = 0;i < printout.size(); i++){ 
			int currentMin = printout.get(i);
			int currentMinIndex = i;
			
			for(int j = i + 1;j < printout.size();j++){
				if (currentMin > printout.get(j)){
					currentMin = printout.get(j);
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i){
				//printout[currentMinIndex] = printout[i]; <- for normal arrays only
				printout.set(currentMinIndex, printout.get(i));
				printout.set(i, currentMin);
			}
		
		
		}
		for(int i = 0; i < printout.size(); i++) {
			System.out.print(printout.get(i) + " ");
		}
		
	}
}


