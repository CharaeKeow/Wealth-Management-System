package controller.manager;

import java.util.Vector;

import model.Land;

public class LandManager {
private static Vector<Land> lands = new Vector<>(); //store house
	
	public static int addLand(Land land) {
		int status = 0;
		
		int size = lands.size();
		lands.add(land);
		
		if (lands.size() > size) {
			status++;
		}
		
		return status;
	}
	
	public static void displayLands() {
		for (Land land : lands) {
			displayLand(land);
		}
	}
	
	public static void displayLand(Land land) {
		System.out.println("\nPrice per meter square: " + land.getPricePerM2());
		System.out.println("Area: " + land.getArea());
		System.out.println("Monetary value: " + land.calculateMonetaryValue());
	}
}
