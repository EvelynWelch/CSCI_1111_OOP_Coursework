// Author: Evie Welch
// date: 21/01/23

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getAnnulInterestRate(){
		return this.annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (this.getAnnulInterestRate() / 100) / 12;
	}
	public double getMonthlyInterest(){
		return this.getBalance() * this.getMonthlyInterestRate();
	}
	
	public void withdraw(double amount){
		double currentBalace = this.getBalance();
		double newBalance = currentBalace - amount;
		this.setBalance(newBalance);
	}
	public void deposit(double amount){
		double currentBalance = this.getBalance();
		double newBalance = currentBalance + amount;
		this.setBalance(newBalance);
	}
	public String toString(){
		String s = String.format("Accoung id: %d, date created: %tc, balance: $%.2f", getId(), getDateCreated(), getBalance());
		return s;
	}
}
