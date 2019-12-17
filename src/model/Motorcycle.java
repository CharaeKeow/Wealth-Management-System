package model;

public class Motorcycle extends Vehicle implements Asset {
	
	public Motorcycle(String plateNo, String model, double marketValue) {
		super(plateNo, model, marketValue);
	}
	
	@Override
	public double calculateMonetaryValue() {
		return this.getMarketValue();
	}

}
