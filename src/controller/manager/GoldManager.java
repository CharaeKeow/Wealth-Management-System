package controller.manager;

import java.util.Vector;

import model.Gold;

public class GoldManager {
	private static Vector<Gold> golds = new Vector<>();
	
	public static int addGold(Gold gold) {
		int status = 0;
		int size = golds.size();
		golds.add(gold);
		
		if (golds.size() > size) { //add succeed
			status++; //status != 0
		}
		
		return status;
	}
	
	public static Vector<Gold> displayGolds() {
		for (Gold gold : golds) {
			displayGold(gold);
		}
		return golds;
	}
	
	public static void displayGold(Gold gold) {
		System.out.println("\nKarat: " + gold.getKarat());
		System.out.println("Weight: " + gold.getWeight());
		System.out.println("Price: " + gold.getPrice());
		System.out.println("Monetary value: " + gold.calculateMonetaryValue());
	}
}
