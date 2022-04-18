import java.util.Date;

public class Exercise_9_7 {
	public static void main(String[] args) {
	Account account = new Account(1122, 20000.0, 0.045);
	account.setBalance(account.withdraw(account.getBalance()));
	account.setBalance(account.deposit(account.getBalance()));
	System.out.printf("Balance: %4.2f\nMonthly Interest: %4.2f\nDate Created: ",account.getBalance(), account.getMonthlyInterest());
	System.out.print(account.getDateCreated());
	
	}
}

class Account{
	private int id = 0;
	private double balance = 0;
	private double aIR = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account(int newId, double newBalance, double newAIR){
		id = newId;
		balance = newBalance;
		aIR = newAIR;
	}
	
	int getId(int id){
		return id;
	}
	
	void setId(int newId){
		id = newId;
		
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	double getAIR(double aIR) {
		return aIR;
	}
	
	void setAIR(double newAIR) {
		aIR = newAIR;
	}
	
	String getDateCreated(){
		return dateCreated.toString();
	}
	
	double getMonthlyInterestRate(){
		return aIR / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (aIR / 12);
	}
	double withdraw(double balance) {
		return balance - 2500;
	}
	
	double deposit(double balance) {
		return balance + 3000;
	}
	
}




