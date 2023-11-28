import java.util.*;

class PSMRW {
	public static void main(String[] args) {
		Account account1 = new Account(1, 200.0, 4.5);
		SavingsAccount account2 = new SavingsAccount(2, 300.0, 7.5);
		CheckingAccount account3 = new CheckingAccount(3, 5000.0, 2.5, 500);
		
		System.out.println(account1.toString());
		System.out.println("\n" + account2.toString());
		System.out.println("\n" + account3.toString());
	}
}

class Account {
	int accountNumber;
	double balance;
	double annualInterestRate;
	Date dateCreated;
	
	Account (){
		
	}
	
	Account(int accountNumber, double balance, double annualInterestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	int getAccountNumber() {
		return accountNumber;
	}
	
	double getBalance() {
		return balance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	
	void deposit(int amount){
		balance += amount;
	}
	void withdraw(int amount){
		balance -= amount;
	}
	
	Date dateCreated(){
		Date date = new Date();
		return date;
	}
	public String toString(){
		return "Account Number: " + this.getAccountNumber() + "\nBalance: " + this.getBalance() + "\nAnnual Interest Rate: " + this.getAnnualInterestRate() + "\nAccount created on: " + this.dateCreated();
	}
}

class SavingsAccount extends Account{
	
	SavingsAccount(){
		
	}
	
	SavingsAccount(int accountNumber, double balance, double annualInterestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
}

class CheckingAccount extends Account{
	double overdraftProtection = 200;
	
	CheckingAccount(){
		
	}
	CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftProtection){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.overdraftProtection = overdraftProtection;
	}
	
	double getOverdraftProtection(){
		return overdraftProtection;
	}
	public String toString(){
		return super.toString() + "\nOverdraft protection: " + this.getOverdraftProtection();
	}
}
