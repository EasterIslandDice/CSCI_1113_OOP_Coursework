import java.util.*;

class Untitled {
	public static void main(String[] args) {
		//generate data
		Scanner input = new Scanner(System.in);
		int id;
		int menu = 0;
		
		Account[] accounts = new Account[10];
			for (int i = 0; i < 10; i++){
				accounts[i] = new Account(i, 100);}
		
		System.out.println("Welcome to the ATM!");
		System.out.println("Please enter your Account ID");
		id = input.nextInt();
		
		if (id < 0 || id > 9){
			id = incorrectId(id);}
		
		while(id > 0 && id < 10){
			menuDisplay();
			int choice = input.nextInt();
			
			if (choice == 4) {
				System.out.println("Please enter your Account ID");
				id = input.nextInt();
				
				if (id < 0 || id > 9){
					id = incorrectId(id);}
			}
			performAction(id, choice, accounts);
		}
	}
	
	public static int incorrectId(int id){
		while (id < 0 || id > 9){
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a valid ID.");
			id = input.nextInt();}
		return id;}

	public static void menuDisplay(){
		System.out.println("Main Menu");
		System.out.println("Please make a selection.");
		System.out.println("1: Check Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
	}
	public static void performAction(int id, int choice, Account[] accounts){
		Scanner input = new Scanner(System.in);
		
		switch(choice){
			case 1:
			System.out.println("The current balance is " + accounts[id].getBalance());
			break;
			
			case 2:
			System.out.println("Please enter amount to withdraw.");
			accounts[id].withdraw(input.nextDouble());
			break;
			
			case 3:
			System.out.println("Please enter amount to deposit.");
			accounts[id].deposit(input.nextDouble());
			break;
			
			default:
			break;
		}
	}
}


	class Account{
		private int id = 0;
		private double balance = 0.0;
		private double annualInterestRate = 0.0;
		private java.util.Date dateCreated;
		
		Account(){
			dateCreated = new java.util.Date();
		}
		Account(int id, double balance) {
			this();
			this.id = id;
			this.balance = balance;
		}
		int getId(){
			return this.id;
		}
		void setId(int newId){
			this.id = newId;
		}
		double getBalance(){
			return this.balance;
		}
		void setBalance(double newBalance){
			this.balance = newBalance;
		}
		double getAnnualInterestRate(){
			return this.annualInterestRate;
		}
		void setAnnualInterestRate(double newAnnualInterestRate){
			this.annualInterestRate = newAnnualInterestRate;
		}
		String getDate(){
			return this.dateCreated.toString();
		}
		double getMonthlyInterestRate(double annualInterestRate){
			double monthlyInterestRate = (annualInterestRate/100) / 12;
			return monthlyInterestRate;
		}
		double getMonthlyInterest(double balance, double monthlyInterestRate){
			double monthlyInterest = balance * monthlyInterestRate;
			return monthlyInterest;
		}
		void withdraw(double amount){
			this.balance -= amount;
			
		}
		void deposit(double amount){
			this.balance += amount;
			
		}
	}