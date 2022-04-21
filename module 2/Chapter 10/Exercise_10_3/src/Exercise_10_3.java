
public class Exercise_10_3 {
	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(3);
		char[] cValue = {'6', '3', '1'};
		System.out.println(myInteger.isEven(myInteger.getValue()));
		System.out.println(myInteger.isOdd(myInteger.getValue()));
		System.out.println(myInteger.isPrime(myInteger.getValue()));
		System.out.println(myInteger.parseInt(cValue));
		System.out.println(myInteger.parseInt("5772"));
		System.out.println(myInteger.isEven());
		System.out.println(myInteger.isOdd());
		System.out.println(myInteger.isPrime());
		System.out.println(myInteger.isEven(myInteger));
		System.out.println(myInteger.isOdd(myInteger));
		System.out.println(myInteger.isPrime(myInteger));
	}
}



class MyInteger {
	private int value;
	String sValue = "";
	char[] cValue;
	
	
	
	MyInteger(int value){
		this.value = value;
	}
	
	int getValue() {
		return value;
	}
	
	boolean isEven(){
		return isEven(value);
	}
	
	boolean isOdd(){
		return isOdd(value);
		
	}
		
	boolean isPrime() {
		return isPrime(value);
		
	}
	
	static boolean isEven(int value){
		if(value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isOdd(int value){
		if(value % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
		
	static boolean isPrime(int value) {
		boolean notPrime = false;
		for(int x = 2;x <= value / 2;x++) {
			if (value % x == 0) {
				notPrime = true;
				break;
			}
		}
		if(notPrime != true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isEven(MyInteger O){
		return isEven(O.getValue());
		
	}
	
	static boolean isOdd(MyInteger O){
		return isOdd(O.getValue());
		
	}
		
	static boolean isPrime(MyInteger O) {
		return isPrime(O.getValue());
		
	}
	
	boolean equals(int value){
		if(value == value) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean equals(MyInteger O) {
		return equals(O.getValue());
	}
	
	static int parseInt(char[] cValue) {
		 String c = "";
		 for(int x = 0;x < cValue.length;x++) {
			 c = c + cValue[x];
		 }
		 int stringC = Integer.parseInt(c);
		 return stringC;
	}
	
	static int parseInt(String sValue) {
		int stringV = Integer.parseInt(sValue);
		return stringV;
	}
	
	
}


