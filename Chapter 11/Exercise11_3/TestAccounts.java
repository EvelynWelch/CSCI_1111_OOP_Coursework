// Author: Evie Welch
// date: 21/01/23

class TestAccounts {
	public static void main(String[] args) {
		Account account = new Account(1, 1000.00);
		CheckingAccount checkingAccount = new CheckingAccount(2, 1500.00, 50.00);
		SavingsAccount savingsAccount = new SavingsAccount(3, 2000.00);
		
		System.out.println(account.toString());
		System.out.println(checkingAccount.toString());
		System.out.println(savingsAccount.toString());
	}
}