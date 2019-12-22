package view;

import java.util.Scanner;

import controller.manager.GoldManager;
import controller.validator.InvalidValueException;
import model.Gold;

public class GoldView extends View {

	void displayOption() {
		System.out.println("\nManage Gold");
		System.out.println("============");
		System.out.println("1. Add Gold");
		System.out.println("2. Display Gold");
		System.out.println("3. Display monetary value");
		System.out.println("4. Back to main menu\n");
	}

	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			System.out.println("Add Gold");
			System.out.println("========");
			
			scanner.nextLine();
			
			System.out.println("Karat: ");
			int karat = scanner.nextInt();
			
			System.out.println("Weight: ");
			double weight = scanner.nextDouble();
			
			System.out.println("Price: ");
			double price = scanner.nextDouble();
			
			Gold gold = null;
			try {
				gold = new Gold(karat, weight, price);
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
			
			if (GoldManager.addGold(gold) != 0) {
				System.out.println("Successfully added a new gold.");
			} else {
				System.out.println("Operation unsuccessful!");
			}
			
		} else if (choice == 2) {
			System.out.println("Display Gold: ");
			System.out.println("=============");
			
			GoldManager.displayGolds();
		} else if (choice == 3) {
			System.out.println("Monetary value for gold: ");
			try {
				GoldManager.displayMonetaryValue();
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
		}
		displayOption();
	}

}
