// Author: Evie Welch
// date: 21/01/23

class SavingsAccount extends Account {
	SavingsAccount(){}
	SavingsAccount(int id, double amount){
		super(id, amount);
	}
	@Override
	public void withdraw(double amount){
		double newBalance = this.getBalance() - amount;
		if(newBalance > 0){
			this.setBalance(newBalance);
		} else {
			System.out.printf("Account: %d has insufficient funds to complete this transaction", this.getId());
		}
	}
	@Override
	public String toString(){
		return "Savings Account, " + super.toString();
	}
}