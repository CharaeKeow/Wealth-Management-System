package model;

public class Gold extends Saving implements Asset {
	
	private int karat;
	private double weight;
	private double price;
	
	public Gold(int karat, double weight, double price) {
		this.karat = karat;
		this.price = price;
		this.weight = weight;
	}
	
	public int getKarat() {
		return karat;
	}

	public void setKarat(int karat) {
		this.karat = karat;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*Monetary value of gold: weight * price / gram
	 * 1 karat is 0.2 g, so the formula below should be right
	 * or my Math is really sucks
	 * */
	public double calculateMonetaryValue() {
		return weight * (price / (karat * 5) );
	}
}
