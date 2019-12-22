package controller.manager;

import java.util.Vector;

import controller.validator.InvalidValueException;
import model.Motorcycle;

public class MotorcycleManager {
	private static Vector<Motorcycle> motorcycles = new Vector<>(); //store house
	
	public static int addMotorcycle(Motorcycle motorcycle) {
		int status = 0;
		
		int size = motorcycles.size();		
		
		motorcycles.add(motorcycle);
		
		if (motorcycles.size() > size) {
			status++;
		}
		
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
		//System.out.println("Monetary value: " + motorcycle.calculateMonetaryValue());
	}

	public static void displayMonetaryValue() throws InvalidValueException {
		double total = 0;
		for (Motorcycle motorcycle : motorcycles) {
			total += motorcycle.calculateMonetaryValue();
		} 
		System.out.println(total);
	}
}
