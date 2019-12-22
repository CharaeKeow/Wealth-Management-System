package controller.validator;

import model.BankAccount;
import model.Car;
import model.House;
import model.Land;
import model.Motorcycle;

//Validate if input is a negative value. If yes, throw new InvalidValueException,
//which will tell user that their input is invalid.
public class Validator {

	/*Validate Car constructor's marketValue. Ensure that
	 * the value is positive integer
	 * */
	public static void validate(String field, Car car) throws InvalidValueException {
		
		if (car.calculateMonetaryValue() < 0) {
			throw new InvalidValueException(field);			
		}				
	}

	/*Validate Motorcycle constructor's marketValue. Ensure that
	 * the value is positive integer
	 * */
	public static void validate(String field, Motorcycle motorcycle) throws InvalidValueException {
		
		if (motorcycle.calculateMonetaryValue() < 0) {
			throw new InvalidValueException(field);
		}		
	}
	
	/*Validate BankAccount constructor's interestRate and balance.
	 * Ensure that the value is positive integer
	 * */
	public static void validate(BankAccount bankAccount) throws InvalidValueException {
		
		if (bankAccount.getInterestRate() < 0 && bankAccount.getBalance() < 0) {
			throw new InvalidValueException("Interest rate and balance");
		} else if (bankAccount.getInterestRate() < 0) {
			throw new InvalidValueException("Interest rate");
		} else if (bankAccount.getBalance() < 0) {
			throw new InvalidValueException("Balance");
		}
		
	}
	
	/*Validate BankAccount constructor's interestRate and balance.
	 * Ensure that the value is positive integer
	 * */
	public static void validate(Land land) throws InvalidValueException {
		
		if (land.getArea() < 0 && land.getPricePerM2() < 0) {
			throw new InvalidValueException("Area and price per meter square");
		} else if (land.getArea() < 0) {
			throw new InvalidValueException("Area");
		} else if (land.getPricePerM2() < 0) {
			throw new InvalidValueException("Price per meter square");
		}
		
	}	
	
	public static void validate(House house) throws InvalidValueException {
		
	if (house.getMarketValue() < 0) {
		throw new InvalidValueException("Market value");
	}
		
	}
}
