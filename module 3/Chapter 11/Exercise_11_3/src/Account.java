import java.text.NumberFormat;
import java.util.Date;

public class Account{
	public int id = 0;
	public double balance = 0;
	public double aIR = 0;
	private Date dateCreated = new java.util.Date();
	public double cBalance = 0;
	public double sBalance = 0;
	
	Account(){
		
	}
	
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
	@Override
	public String toString() {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		return "Your Account total is: "+ format.format(balance);
	}
}