package model;

import controller.validator.InvalidValueException;

public class BankAccount extends Saving implements Asset {
	
	private String accountNo;
	private String bankName;
	private double balance;
	private double interestRate;
	
	public BankAccount(String accountNo, String bankName, double balance, double interestRate) throws InvalidValueException {
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double calculateMonetaryValue() throws InvalidValueException {		
		return balance * (1 + interestRate);
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;		
	}

	@Override
	public void withdraw(double amount) {
		if (this.balance > amount) {
			this.balance -= amount;	
			System.out.println("Withdraw successful. The new balance is: " + this.getBalance());
		} else {
			System.out.println("Insufficient balance. Cannot withdraw money.");
		}		
	}

}
