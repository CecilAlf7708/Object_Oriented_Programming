
public class ChapterTenThree {
	public static void main(String[] args) {
	MyInteger m1 = new MyInteger(11);
	MyInteger m2 = new MyInteger(5);	
	MyInteger m3 = new MyInteger(60);
	System.out.print(m1.isPrime() + " ");
	System.out.print(m1.isEven()+ " ");
	System.out.println(m1.isOdd()+ " ");
	System.out.print(m2.isPrime()+ " ");
	System.out.print(m2.isEven()+ " ");
	System.out.println(m2.isOdd()+ " ");
	System.out.print(m3.isPrime()+ " ");
	System.out.print(m3.isEven()+ " ");
	System.out.println(m3.isOdd()+ " ");
	}
}

class MyInteger {
	public int value;
	
	
	public MyInteger(int num){
		value = num;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		return isEven(value);
	}
	
	public boolean isOdd() {
		return isOdd(value);
	}
	
	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(int v1) {
		return v1%2==0;
	}

	public static boolean isOdd(int v1) {
		return v1%2==1;
	}
	
	public static boolean isPrime(int v1) {
		if((v1 == 1) || (v1 == 2)){
			return true;
		}
		for (int i = 2; i <= v1 / 2; i++) {
			if (v1 % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger o1) {
		return isEven(o1.getValue());
	}

	public static boolean isOdd(MyInteger o1) {
		return isOdd(o1.getValue());
	}
	
	public static boolean isPrime(MyInteger o1) {
		return isPrime(o1.getValue());
	}
	
	public boolean equals(int v2) {
		return value == v2;
	}
	
	public boolean equals(MyInteger o2) {
		return value == o2.getValue();
	}
	
	public static int parseInt(char[] numbers) {
		int j = 0;
		for (int i = 0; i < numbers.length; i++) {
			j = j * 10 + (numbers[i] - '0');
		}
		return j;
	}
	
	public static int parseInt(String string) {
		int k = 0;
		for (int i = 0; i < string.length(); i++) {
			k = k * 10 + (string.charAt(i) - '0');
			
		}
		return k;
	}
	
	
	


}











