package model;

import controller.validator.InvalidValueException;

public class Car extends Vehicle implements Asset {
	
	public Car(String plateNo, String model, double marketValue) throws InvalidValueException {
		super(plateNo, model, marketValue);
	}
	
	@Override
	public double calculateMonetaryValue() throws InvalidValueException {
		return this.getMarketValue();
	}

}
