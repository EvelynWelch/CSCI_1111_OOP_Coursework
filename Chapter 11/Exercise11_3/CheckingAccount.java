// Author: Evie Welch
// date: 21/01/23

class CheckingAccount extends Account {
	private double overdraftLimit = 0.00;
	public CheckingAccount(){}
	public CheckingAccount(double overDraftLimit){
		super();
		this.overdraftLimit = overdraftLimit;
	}
	public CheckingAccount(int id, double balance, double limit){
		super(id, balance);
		this.overdraftLimit = limit;
	}
	public double getOverdraftLimit(){
		return this.overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit){
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void withdraw(double amount){
		double newBalance = this.getBalance() - amount;
		if(newBalance > (this.getOverdraftLimit() * -1)){
			this.setBalance(newBalance);
		} else {
			System.out.printf("Account: %d has insufficient funds to complete this transaction", this.getId());
		}
	}
	
	@Override
	public String toString(){
		String s = String.format("Checking Account, %s, overdraft limit: $%.2f", super.toString(), this.getOverdraftLimit());
		return s;
	}
}
