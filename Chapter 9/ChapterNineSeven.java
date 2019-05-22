/*Alfred Thomas Cecil
 * 5/10/2019
 * A program that creates a bank account and displays the balance, 
 * monthly interest, and date it was created.
 */
public class ChapterNineSeven {
	public static void main(String[] args) {
		Account balance1 = new Account(1122,20000);
		balance1.setAnnualInterestRate(.045);
		System.out.printf("Starting balance: $%.2f\n",balance1.getBalance());
		System.out.printf("Balance after withdrawal: $%.2f\n" ,balance1.withdraw(2500));
		balance1.deposit(3000);
		
		System.out.printf("$%.2f\n",balance1.getBalance());
		System.out.printf("The monthly interest is: $%.2f\n" , balance1.getMonthlyInterest());
		System.out.println("The date this account was created: " + balance1.getDateCreated());
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