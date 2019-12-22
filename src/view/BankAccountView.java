package view;

import java.util.Scanner;

import controller.manager.BankAccountManager;
import controller.validator.InvalidValueException;
import controller.validator.Validator;
import model.BankAccount;

public class BankAccountView extends View {

	void displayOption() {
		System.out.println("\nManage Bank Account");
		System.out.println("===================");
		System.out.println("1. Add Bank Account");
		System.out.println("2. Display Bank Account");
		System.out.println("3. Display monetary value");
		System.out.println("4. Back to main menu\n");
	}

	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			
			System.out.println("1. Add Bank Account");
			System.out.println("===================");
			
			scanner.nextLine();
			
			System.out.println("Account No: ");
			String accountNo = scanner.nextLine();
			
			System.out.println("Bank Name: ");
			String bankName = scanner.nextLine();
			
			System.out.println("Balance: ");
			double balance = scanner.nextDouble();
			
			System.out.println("Interest Rate: ");
			double interestRate = scanner.nextDouble();
			
			BankAccount bankAccount = null;
			
			try {
				Validator.validate(bankAccount = new BankAccount(accountNo, bankName, balance, interestRate));
				
				if (BankAccountManager.addBankAccount(bankAccount) != 0) {
					System.out.println("Successfully added a new bank account.");
				} else {
					System.out.println("Operation unsuccessful!");
				}
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());				
			}
			
			
		} else if (choice == 2) {
			System.out.println("Display Bank Account");
			System.out.println("====================");
			
			BankAccountManager.displayBankAccounts();
		} else if (choice == 3) {
			System.out.println("Monetary Value");
			
			try {
				BankAccountManager.displayMonetaryValue();
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
			
		} else if (choice == 4) {
			System.out.println("Withdraw money");	

			scanner.nextLine();
			
			System.out.println("Enter the account number");			
			String accountNo = scanner.nextLine();
			
			System.out.println("Enter the value you wish to withdraw: ");
			double amount = scanner.nextDouble();
			
			BankAccountManager.withdrawMoney(accountNo, amount);
			
		} else if (choice == 5) {
			System.out.println("Deposit money");	

			scanner.nextLine();
			
			System.out.println("Enter the account number");			
			String accountNo = scanner.nextLine();
			
			System.out.println("Enter the value you wish to deposit: ");
			double amount = scanner.nextDouble();
			
			BankAccountManager.depositMoney(accountNo, amount);

		}
		displayOption();
	}

}
