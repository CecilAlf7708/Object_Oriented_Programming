import java.util.Date;
import java.util.Scanner;

public class Exercise_10_7 {
	public static void main(String[] args) {
	//Account account = new Account(1122, 20000.0, 0.045);
	double [] accountArray = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0};
	int eId;
	int choice;
	double idBalance;
	double eWithdraw = 0.0;
	double eDeposit = 0.0;
	double fWithdraw = 0.0;
	double fDeposit = 0.0;
	int loop = 1;
	Scanner input = new Scanner(System.in);
	
	
	do {		
		System.out.print("Please enter an ID: ");
		eId = input.nextInt();
		if(eId < 0 || eId > 9) {
			do {
				System.out.print("I'm sorry, that is an invalid ID, please enter a valid ID: ");
				eId = input.nextInt();
			}
			while(eId < 0 || eId > 9);
		}
		idBalance = accountArray[eId];
		
		Account account = new Account(eId, idBalance);
		
		
		do {
		System.out.print("What would you like to do?\nMain Menu\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Sign out");
		choice = input.nextInt();
		if(choice < 1 || choice > 4) {
			do {
			System.out.print("I'm sorry, that is an invalid input, please enter a valid input: ");
			choice = input.nextInt();
			}
			while(choice < 1 || choice > 4);
		}
		if(choice == 1) {
			System.out.print("The Account #" + account.getId(eId) + " has ");
			System.out.printf("%4.2f\n", account.getBalance(idBalance));
			
		}
		
		else if(choice == 2) {
			System.out.print("How much do you wish to take?: ");
			eWithdraw = input.nextDouble();
			if(eWithdraw > idBalance) {
				do {
					System.out.print("Amount excceds account balance, please enter a reduced amount: ");
					eWithdraw = input.nextDouble();
				}
				while(eWithdraw < idBalance);
			}
			fWithdraw = account.balanceWithdraw(idBalance,eWithdraw);
			idBalance = fWithdraw;
			
		}
		
		else if(choice == 3) {
			System.out.print("How much do you wish to deposit?: ");
			eDeposit = input.nextDouble();
			fDeposit = account.balanceDeposit(idBalance,eDeposit);
			idBalance = fDeposit;
			
			
		}
		
		else if(choice == 4) {
			accountArray[eId] = idBalance;
			System.out.println("Thank you #" + eId + " for your patronage");
			choice++;
		}
		
		
		}
		while(choice != 5);
		}	
	while(loop != 0);
	}
}

class Account{
	private int id = 0;
	private double balance = 0;
	double deposit = 0;
	double withdraw = 0;
	//private double aIR = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account(int newId, double newBalance/* double newAIR*/){
		id = newId;
		balance = newBalance;
		//aIR = newAIR;
	}
	
	int getId(int id){
		return id;
	}
	
	void setId(int newId){
		
		id = newId;
		
	}
	
	double getBalance(double balance) {
		return balance;
	}
	
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	/*double getAIR(double aIR) {
		return aIR;
	}
	
	void setAIR(double newAIR) {
		aIR = newAIR;
	}*/
	
	String getDateCreated(){
		return dateCreated.toString();
	}
	
	/*double getMonthlyInterestRate(){
		return aIR / 12;
	}
	
	double getMonthlyInterest() {
		return balance * (aIR / 12);
	}*/
	double balanceWithdraw(double balance,double withdraw) {
		return balance - withdraw;
	}
	
	double balanceDeposit(double balance, double deposit) {
		return balance + deposit;
	}
	
}




