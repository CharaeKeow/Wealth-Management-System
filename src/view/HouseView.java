package view;

import java.util.Scanner;

import controller.manager.HouseManager;
import controller.validator.InvalidValueException;
import controller.validator.Validator;
import model.House;

public class HouseView extends View {

	void displayOption() {
		System.out.println("\nManage House");
		System.out.println("==============");
		System.out.println("1. Add House");
		System.out.println("2. Display House");
		System.out.println("3. Display monetary value");
		System.out.println("4. Back to main menu\n");
	}
	
	void processOption(Scanner scanner, int choice) {	
		if (choice == 1) {
			
			System.out.println("Add House");
			System.out.println("===========");
			
			//Var for constructor
			//The placeholder will also be catch in the catch block
			double area = -1; //invalid: placeholder
			int numOfFloors = -1; //invalid: placeholder
			String address = "";
			double marketValue = -1;
			
			scanner.nextLine();
						
			System.out.println("Area: ");
			area = scanner.nextDouble();
			
			System.out.println("Number of floors: ");
			numOfFloors = scanner.nextInt();
			
			scanner.nextLine();
			
			System.out.println("Address: ");
			address = scanner.nextLine();
			
			System.out.println("Market Value: ");
			marketValue = scanner.nextDouble();
			
			//Pass the value into the constructor, create new object
			House house = null;
			
			try {
				
				Validator.validate(house = new House(area, numOfFloors, address, marketValue));
				
				if (HouseManager.addHouse(house) != 0) {
					System.out.println("Successfully added a new house");
				} else {
					System.out.println("Unsuccessful operation.");
				}
				
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
			
		} else if (choice == 2) {
			System.out.println("Display House: ");
			System.out.println("==============");
			
			HouseManager.displayHouses();
		} else if (choice == 3) {
			System.out.println("Monetary value");
			
			try {
				HouseManager.displayMonetaryValue();
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
		}
		displayOption();
	}
}
