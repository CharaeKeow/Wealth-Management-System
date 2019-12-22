package model;

import controller.validator.InvalidValueException;

public class Land extends Property implements Asset {

	private double pricePerM2;
	
	public Land(double area, double pricePerM2) throws InvalidValueException {
		super(area);
		this.setPricePerM2(pricePerM2);
	}

	public double getPricePerM2() {
		return pricePerM2;
	}

	public void setPricePerM2(double pricePerM2) {
		this.pricePerM2 = pricePerM2;
	}
	
	public double calculateMonetaryValue() throws InvalidValueException {
		return this.getArea() * pricePerM2;
	}
}
