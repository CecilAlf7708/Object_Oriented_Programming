/*Alfred Thomas Cecil
 * 5/7/19
 * A program that creates a Date object and sets a time to have elapsed from milliseconds
 */

public class chapterNineThree {
	public static void main(String[] args) {
	java.util.Date date = new java.util.Date();	
	int time = 10000;
	int time2 = 100000;
	int time3 = 1000000;
	int time4 = 10000000;
	int time5 = 100000000;
	int time6 = 1000000000;
	long time7 = 10000000000l;
	long time8 = 100000000000l;
	date.setTime(time);
	System.out.println(date.toString());
	date.setTime(time2);
	System.out.println(date.toString());
	date.setTime(time3);
	System.out.println(date.toString());
	date.setTime(time4);
	System.out.println(date.toString());
	date.setTime(time5);
	System.out.println(date.toString());
	date.setTime(time6);
	System.out.println(date.toString());
	date.setTime(time7);
	System.out.println(date.toString());
	date.setTime(time8);
	System.out.println(date.toString());
	}
}



