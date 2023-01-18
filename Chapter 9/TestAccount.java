// author: Evie Welch
// date: 18/01/23

class TestAccount {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000.00);
		account.setAnnualInterestRate(4.5);
		account.withdraw(2500.00);
		account.deposit(3000.00);
		
		System.out.printf("Balance: %.2f %n", account.getBalance());
		System.out.printf("Monthly interest: %.2f %n", account.getMonthlyInterest());
		System.out.printf("Date: %s", account.getDateCreated().toString());
	}
}