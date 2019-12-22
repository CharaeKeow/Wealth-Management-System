package model;

import controller.validator.InvalidValueException;

public class Motorcycle extends Vehicle implements Asset {
	
	public Motorcycle(String plateNo, String model, double marketValue) throws InvalidValueException {
		super(plateNo, model, marketValue);
	}

	@Override
	public double calculateMonetaryValue() throws InvalidValueException {
		return this.getMarketValue();
	}	
	
}
