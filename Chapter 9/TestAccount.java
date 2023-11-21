import java.util.*;

class TestAccount {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println("The balance in the account is " + account1.getBalance() + ". The monthly interest is " + account1.getMonthlyInterestRate(account1.annualInterestRate) + ". The account was created on " + account1.dateCreated + ".");
	}
	static class Account{
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
}