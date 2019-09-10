/*Alfred Thomas Cecil
 * 5/10/2019
 * A program that creates a bank account and displays the balance, 
 * monthly interest, and date it was created.
 */
import java.util.Scanner;
public class ChapterTenSeven {
	public static void main(String[] args) {
		//Account balance1 = new Account(1122,20000);
		Account[] accountArray;
		
		accountArray = createAccountArray();
		
		printAccountArray(accountArray);
		
		//System.out.printf("Starting balance: $%.2f\n",balance1.getBalance());
		//System.out.printf("Balance after withdrawal: $%.2f\n" ,balance1.withdraw(2500));
		//balance1.deposit(3000);
		
		//System.out.printf("$%.2f\n"
	}

	public static Account[] createAccountArray() {
		Account[] accountArray = new Account[10];
		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Account(i,100.00);
		}
	
		return accountArray;
	}

	public static void printAccountArray(Account[] accountArray) {
		Scanner input = new Scanner(System.in);
		int infinite = 0;
		int choice = 0;
		while(infinite < 1) {
			System.out.print("Please enter an account ID: ");
			int ID = input.nextInt(); 
			 int withdrawATM = 0;
			 int depositATM = 0;
		
			while ((ID < 0) || (ID > 9)){
				System.out.print("I'm sorry that account does not exist, please enter an existing ID: ");
				ID = input.nextInt();
			}
			accountArray[ID].getBalance();
			System.out.println("Welcome number " + ID + " what would you like to do? Please enter an option:");
			System.out.println("Main Menu");
			System.out.println("1: Check your current Balance");
			System.out.println("2: Withdraw money from your Account");
			System.out.println("3: Deposit money into your Account");
			System.out.println("4: Sign out of this machine");
			choice = input.nextInt();
			if(choice != 4) {
			while(choice != 4) {
			
					for (int i = 0; i < 1; i++) {
						if(choice == 1) {
							System.out.printf("Your current Balance is: %.2f\n", accountArray[ID].getBalance());
							System.out.println("Main Menu");
							System.out.println("1: Check your current Balance");
							System.out.println("2: Withdraw money from your Account");
							System.out.println("3: Deposit money into your Account");
							System.out.println("4: Sign out of this machine");
							choice = input.nextInt();
						}
						if (choice == 2) {
							System.out.print("How much would you like to remove? ");
							withdrawATM = input.nextInt();
							accountArray[ID].withdraw(withdrawATM);
							System.out.println("Main Menu");
							System.out.println("1: Check your current Balance");
							System.out.println("2: Withdraw money from your Account");
							System.out.println("3: Deposit money into your Account");
							System.out.println("4: Sign out of this machine");
							choice = input.nextInt();
						}
						if (choice == 3) {
							System.out.print("How much would you like to add? ");
							depositATM = input.nextInt();
							accountArray[ID].deposit(depositATM);
							System.out.println("Main Menu");
							System.out.println("1: Check your current Balance");
							System.out.println("2: Withdraw money from your Account");
							System.out.println("3: Deposit money into your Account");
							System.out.println("4: Sign out of this machine");
							choice = input.nextInt();
						}
						
					}
				}
			}
		
		
		
		
		}
	}
}

class Account{
	
	private int id;
	private double balance;
	
	
	/*public Account(){
		this.id = 0;
		this.balance = 0.0;
		
	}*/
	
	public Account(int id,double balance){
		this.id = id;
		this.balance = balance;	
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double withdraw(double withdraw) {
		return balance -= withdraw;
	}
	
	public double deposit(double deposit) {
		 return balance += deposit;
		
	}
}
