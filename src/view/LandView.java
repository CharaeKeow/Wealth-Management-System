package view;

import java.util.Scanner;

import controller.manager.LandManager;
import model.Land;

public class LandView extends View {

	void displayOption() {
		System.out.println("\nManage Land");
		System.out.println("============");
		System.out.println("1. Add Land");
		System.out.println("2. Display Land");
		System.out.println("3. Back to main menu\n");
	}

	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			System.out.println("1. Add Land");
			System.out.println("===========");
			
			scanner.nextLine();
			
			System.out.println("Area: ");
			double area = scanner.nextDouble();
			
			System.out.println("Price per meter square: ");
			double pricePerM2 = scanner.nextDouble();
			
			Land land = new Land(area, pricePerM2);
			
			if (LandManager.addLand(land) != 0) {
				System.out.println("Successfully added a new land.");
			} else {
				System.out.println("Unsuccessful operation.");
			}
		} else if (choice == 2) {
			System.out.println("Display lands: ");
			System.out.println("==============");
			
			LandManager.displayLands();
		}
		displayOption();
	}
	
}
