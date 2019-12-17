package controller.manager;

import java.util.Vector;
import model.House;

public class HouseManager { 
	private static Vector<House> houses = new Vector<>(); //store house
	
	public static int addHouse(House house) {
		int status = 0;
		int size = houses.size();
		houses.add(house);
		
		if (houses.size() > size) {
			status++;
		}
		
		return status;
	}
	
	public static void displayHouses() {
		for (House house : houses) {
			displayHouse(house);
		}
	}
	
	public  static void displayHouse(House house) {
		System.out.println("\nArea: " + house.getArea());
		System.out.println("Numbe of floors: " + house.getNumOfFloors());
		System.out.println("Address: " + house.getAddress());
		System.out.println("Market Value: " + house.getMarketValue());
		System.out.println("Monetary value: " + house.calculateMonetaryValue());
	}
}