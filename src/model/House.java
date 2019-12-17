package model;

public class House extends Property implements Asset {

	private int numOfFloors;
	private String address;
	private double marketValue;
	
	public House(double area, int numOfFloors, String address, double marketValue) {
		super(area);
		this.setAddress(address);
		this.setMarketValue(marketValue);
		this.setNumOfFloors(numOfFloors);
	}

	public double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}
	
	//monetary value = marketValue
	public double calculateMonetaryValue() {
		return marketValue;
	}

}
