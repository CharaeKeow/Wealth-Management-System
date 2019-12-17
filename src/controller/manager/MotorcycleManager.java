package controller.manager;

import java.util.Vector;
import model.Motorcycle;

public class MotorcycleManager {
	private static Vector<Motorcycle> motorcycles = new Vector<>(); //store house
	
	public static int addMotorcycle(Motorcycle motorcycle) {
		int status = 0;
		
		motorcycles.add(motorcycle);
		
		return status;
	}
	
	public static void displayMotorcycles() {
		for (Motorcycle motorcycle : motorcycles) {
			displayMotorcycle(motorcycle);
		}
	}
	
	public static void displayMotorcycle(Motorcycle motorcycle) {
		System.out.println("\nPlate No: " + motorcycle.getPlateNo());
		System.out.println("Model: " + motorcycle.getModel());
		System.out.println("Market Value: " + motorcycle.getMarketValue());
		System.out.println("Monetary value: " + motorcycle.calculateMonetaryValue());
	}
}
