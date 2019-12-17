package model;

public class Car extends Vehicle implements Asset {
	
	public Car(String plateNo, String model, double marketValue) {
		super(plateNo, model, marketValue);
	}
	
	@Override
	public double calculateMonetaryValue() {
		return this.getMarketValue();
	}

}
