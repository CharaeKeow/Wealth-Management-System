package controller.manager;

import java.util.Vector;

import controller.validator.InvalidValueException;
import model.BankAccount;

public class BankAccountManager {
	private static Vector<BankAccount> bankAccounts = new Vector<>();
	
	public static int addBankAccount(BankAccount bankAccount) {
		int status = 0;
		int size = bankAccounts.size();
		bankAccounts.add(bankAccount);
		
		if (bankAccounts.size() > size) { //add succeed
			status++; //status != 0
		}
		
		return status;
	}
	
	public static Vector<BankAccount> displayBankAccounts() {
		for (BankAccount bankAccount : bankAccounts) {
			displayBankAccount(bankAccount);
		}
		return bankAccounts;
	}
	
	public static void displayBankAccount(BankAccount bankAccount) {
		System.out.println("\nAccount No: " + bankAccount.getAccountNo());
		System.out.println("Bank Name: " + bankAccount.getBankName());
		System.out.println("Balance: " + bankAccount.getBalance());
		System.out.println("Interest rate: " + bankAccount.getInterestRate());
	}
	
	public static void displayMonetaryValue() throws InvalidValueException {
		
		double total = 0;
		
		for (BankAccount bankAccount : bankAccounts) {
			total += bankAccount.calculateMonetaryValue();
		}
		
		System.out.println("RM " + total);
	}
	
	public static void withdrawMoney(String accountNo, double amount) {
		
		for(BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountNo().equalsIgnoreCase(accountNo)) {
				bankAccount.withdraw(amount);
				System.out.println("Withdraw successful. The new balance is: " + bankAccount.getBalance());
			}
		}		
	}
	
	public static void depositMoney(String accountNo, double amount) {
		
		for(BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountNo().equalsIgnoreCase(accountNo)) {
				bankAccount.deposit(amount);
				System.out.println("Deposit successful. The new balance is: " + bankAccount.getBalance());
			}
		}		
	}
}
