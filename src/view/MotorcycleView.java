package view;

import java.util.Scanner;

import controller.manager.MotorcycleManager;
import controller.validator.InvalidValueException;
import controller.validator.Validator;
import model.Motorcycle;

public class MotorcycleView extends View {

	@Override
	void displayOption() {
		System.out.println("\nManage Motorcycle");
		System.out.println("=================");
		System.out.println("1. Add Motorcycle");
		System.out.println("2. Display Motorcycle");
		System.out.println("3. Calculate Monetary value");	
		System.out.println("4. Back to main menu\n");
	}

	@Override
	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			System.out.println("1. Add Motorcycle");
			System.out.println("=================");
			
			scanner.nextLine();
			
			System.out.println("Plate No: ");
			String plateNo = scanner.nextLine();
			
			System.out.println("Model: ");
			String model = scanner.nextLine(); 
			
			System.out.println("Market Value");
			double marketValue = scanner.nextDouble();
			
			Motorcycle motorcycle = null;
			
			try {
				Validator.validate("Market value", motorcycle = new Motorcycle(plateNo, model, marketValue));
				
				if (MotorcycleManager.addMotorcycle(motorcycle) != 0) {
					System.out.println("Successfully added a new motorcycle");
				} else {
					System.out.println("Operation unsuccessful!");
				}
				
			} catch (InvalidValueException e) {
				System.out.println(e.getMessage());
			}
			
			
		} else if (choice == 2) {
			System.out.println("Display Motorcycle: ");
			System.out.println("===================");
			
			MotorcycleManager.displayMotorcycles();
		} else if (choice == 3) {
			try {
				MotorcycleManager.displayMonetaryValue();
			} catch (InvalidValueException e) {
				e.getMessage();
			}
		}
		displayOption();
	}
}
