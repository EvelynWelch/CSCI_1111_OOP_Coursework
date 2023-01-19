// author: Evie Welch
// date: 19/01/23

import java.util.Scanner;

class AtmMachine {
	/** makes n Accounts with a balance of balance */
	public static Account[] accountFactory(int n, double balance){
		Account[] accounts = new Account[n];
		for(int i = 0; i < n; i++){
			accounts[i] = new Account(i, balance);
		}
		return accounts;
	}
	/** returns account[id] */
	public static Account getAccountById(int id, Account[] accounts){
		Account account;
		if(accounts.length -1 < id){
			account = null;
		} else {
			account = accounts[id];
		}
		return account; // does this return null?
	}
	/** returns account.getBalance() */
	public static double viewBalance(Account account){
		return account.getBalance();
	}
	/** adds 'amount' to 'account.balance' returns the new balance */
	public static double deposit(Account account, double amount){
		account.deposit(amount);
		return account.getBalance();
	}
	/** subtracts 'amount' from 'account.balance'  returns the new balance */
	public static double withdraw(Account account, double amount){
		account.withdraw(amount);
		return account.getBalance();
	}
	/** creates an Account[] of 10, and allows the user to interface with the accounts */
	public static void controlLoop(){
		// 1 view balance
		// 2 withdraw
		// 3 deposit
		// 4 'exit' // enter an id
	
		Account[] accounts = accountFactory(10, 100.00);
		Scanner input = new Scanner(System.in);
		int control = 4;
		Account currentAccount = null;
		while(true){
			if(control == 4){ // exit account
				// unselect account
				if(currentAccount != null){
					currentAccount = null;
				}
				// get new account
				System.out.print("Enter account id: ");
				int id = input.nextInt();
				currentAccount = getAccountById(id, accounts);
				if(currentAccount == null){
					System.out.printf("'Account: %d' not found, enter a valid account id.", id);
					System.out.println("");
					control = 4;
				} else {
					control = 0;
				}				
//				System.out.println("got account");
//				System.out.println(currentAccount.getId());
				
			} else if(control == 1){ // view balance
				System.out.printf("Current balance: $%.2f %n", currentAccount.getBalance());
				control = 0;
			} else if(control == 2){ // withdraw
				System.out.printf("Withdraw from Account: %d %n", currentAccount.getId());
				System.out.printf("Current balance: $%.2f %n",currentAccount.getBalance());
				System.out.print("Enter withdraw amount: ");
				double amount = input.nextDouble();
				double newBalance = withdraw(currentAccount, amount);
				System.out.printf("Account balance: $%.2f %n", newBalance);
				control = 0;
			} else if(control == 3){ // deposit
				System.out.printf("Deposit into Account: %d %n", currentAccount.getId());
				System.out.print("Enter deposit amount: ");
				double amount = input.nextDouble();
				double newBalance = deposit(currentAccount, amount);
				System.out.printf("Account balance: $%.2f %n", newBalance);
				control = 0;
			} else if(control == 0){ // choose option for selected account
				System.out.println("");
				System.out.println("Select option:");
				System.out.println("1) View balance.");
				System.out.println("2) Withdraw.");
				System.out.println("3) Deposit.");
				System.out.println("4) Exit.");
				System.out.print(": ");
				control = input.nextInt();
				System.out.println("");
			}
		}
	}
	
	public static void main(String[] args) {
		controlLoop();
	}
}