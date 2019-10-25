/*
 * Alfred Thomas Cecil
 * A program that creates a bank account with a savings and checking account 
 * 10/17/19
 */
public class Chapter_11_3{
	public static void main(String[] args) {
		checkingAccount checkingAccount = new checkingAccount(3, 4000);
		checkingAccount.withdraw(5000);
		savingsAccount savingsAccount = new savingsAccount(6, 6000);
		savingsAccount.withdraw(7000);
		System.out.println(checkingAccount.toString());
		System.out.println(savingsAccount.toString());
	}
}

class Account{

	private java.util.Date dateCreated;
	private int id;
	private double balance;
	private double annualInterestRate = 0.0;

	public Account(){
		this.id = 0;
		this.balance = 0.0;
		dateCreated = new java.util.Date();
	}

	public Account(int id,double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double  getMonthlyInterest() {
		return balance * annualInterestRate / 12;
	}

	public double withdraw(double withdraw) {
		return balance -= withdraw;

	}

	public double deposit(double deposit) {
		return balance += deposit;

	}

}

class checkingAccount extends Account{
	private double overDraft = 500;
	checkingAccount(){
	}

	checkingAccount(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	@Override
	public double withdraw(double withdraw) {
		if(overDraft < withdraw) {
			System.out.println("Sorry, there is not enough for the requested amount");    
		}
		else {
			this.setBalance(this.getBalance() - withdraw);
			return (this.getBalance());
		}
		return this.getBalance();

	}
	
	
	@Override
	public String toString() {
		return "checkingAccount \n\tAccount ID " + this.getId() + "\n\tBalance " + this.getBalance();
	}

}
class savingsAccount extends Account{
	savingsAccount(){
	}
	savingsAccount(int id ,double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	
	public double withdraw(double withdraw) {
		if(this.getBalance() < withdraw) {
			System.out.println("Sorry, there is not enough for the requested amount");    
		}
		else {
			this.setBalance(this.getBalance() - withdraw);
			return (this.getBalance());
		}
		return this.getBalance();

	}
	
	@Override
	public String toString() {
		return "savingsAccount \n\tAccount ID " + this.getId() + "\n\tBalance " + this.getBalance();        
	}
}

