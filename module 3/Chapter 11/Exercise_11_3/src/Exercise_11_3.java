import java.text.NumberFormat;

public class Exercise_11_3 {
	public static void main(String[] args) {
	Account account = new Account(1122, 20000.0, 0.045);
	System.out.println(account.getBalance());
	CheckingAccount cAccount = new CheckingAccount(account.getBalance());
	
	cAccount.setCBalance(account.getBalance());
	System.out.println(cAccount.cBalance);
	//cAccount.getCBalance();
	SavingsAccount sAccount = new SavingsAccount(account.getBalance());
	sAccount.setSBalance(account.getBalance());
	account.setBalance(account.withdraw(account.getBalance()));
	account.setBalance(account.deposit(account.getBalance()));
	//sAccount.setSBalance(account.getBalance());
	
	System.out.printf("Balance total: %4.2f\nChecking Balance: %4.2f\nSavings Balance: %4.2f\nMonthly Interest: %4.2f\nDate Created: ",account.getBalance(), cAccount.getCBalance(),  sAccount.getSBalance(), account.getMonthlyInterest());
	System.out.println(account.getDateCreated());
	System.out.println(account.toString());
	System.out.println(cAccount.toString());
	System.out.println(sAccount.toString());
	}
}


	class CheckingAccount extends Account{
		double cBalance;
		CheckingAccount(double newCBalance){
			cBalance = newCBalance;
		}
		double getCBalance(){
			return cBalance;
		}
		
		void setCBalance(double newCBalance){
			double finalBalance;
			finalBalance = newCBalance * .25;
			cBalance = finalBalance;
		}
		
		@Override
		public String toString() {
			NumberFormat format = NumberFormat.getCurrencyInstance();
			return "Your Checking balance is: "+format.format(cBalance)+" and may be overdrawn by: "+format.format(500.00);
		}
	}
	
	
		
		
	
	
	


class SavingsAccount extends Account{
		double sBalance;
		SavingsAccount(double newSBalance){
			sBalance = newSBalance;
		}
		
		double getSBalance() {
			return sBalance;
		}
		
		void setSBalance(double newSBalance) {
			double finalBalance;
			finalBalance = newSBalance * .75;
			sBalance = finalBalance;
		}
		
		@Override
		public String toString() {
			NumberFormat format = NumberFormat.getCurrencyInstance();
			return "Your Savings balance is: "+format.format(sBalance)+" and may not be overdrawn";
		}
}

