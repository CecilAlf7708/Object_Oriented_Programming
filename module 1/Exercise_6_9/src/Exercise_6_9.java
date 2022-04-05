
public class Exercise_6_9 {
	public static void main(String[]args) {
		double foot = 1.0;
		double meter = 20.0;
		int row = 0;
		System.out.println("Feet  Meters   Meters   Feet");
		double[][] array = {
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
				{0.0,0.0,0.0,0.0},
		};
				for(int x = 0;x < 10;x++) {
					array[row][0] = foot;
					array[row][1] = footToMeter(foot);
					array[row][2] = meter;
					array[row][3] = meterToFoot(meter);
					foot++;
					meter = meter + 5;
					row++;
				}
		for(int r = 0;r < array.length;r++) {
			for(int c = 0;c < array[r].length;c++) {
				if(c == 1 || c == 3) {
					System.out.printf("%4.3f   ", array[r][c]);
				}
				else {
				System.out.print(array[r][c] + "   ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static double footToMeter(double foot) {
		double meterF = 0.305;
			meterF = foot * 0.305;
			return meterF;
		
		
	}
	
	public static double meterToFoot(double meter) {
		double footM = 3.279;
		footM = meter * 3.279;
		return footM;
	}
}
