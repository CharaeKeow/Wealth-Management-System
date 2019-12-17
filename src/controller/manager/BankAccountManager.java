package controller.manager;

import java.util.Vector;

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
		System.out.println("Monetary value: " + bankAccount.calculateMonetaryValue());
	}
}
