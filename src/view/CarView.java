package view;

import java.util.Scanner;

import controller.manager.CarManager;
import controller.validator.InvalidValueException;
import controller.validator.Validator;
import model.Car;

public class CarView extends View {

	@Override
	void displayOption() {
		System.out.println("\nManage Car");
		System.out.println("============");
		System.out.println("1. Add Car");
		System.out.println("2. Display Car");
		System.out.println("3. Display monetary value for all cars");
		System.out.println("4. Back to main menu\n");		
	}

	@Override
	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {			
			//Vector<Exception> exceptions = new Vector<>(); 	//exceptions store
			//int size= exceptions.size();
			
			System.out.println("1. Add Car");
			System.out.println("==========");
			
			scanner.nextLine();
			
			System.out.println("Plate No: ");
			String plateNo = scanner.nextLine();
			
			System.out.println("Model: ");
			String model = scanner.nextLine(); 
			
			System.out.println("Market Value");
			double marketValue = scanner.nextDouble();
			
			Car car = null;
			
			try {
				Validator.validate("Market value", car = new Car(plateNo, model, marketValue));		
				
				if (CarManager.addCar(car) != 0) {
					System.out.println("Successfully added a new car");
				} else {
					System.out.println("Operation unsuccessful!");
				}
			} catch (InvalidValueException e) {
				//exceptions.add(e);
				System.out.println(e.getMessage());
			}
			
		} else if (choice == 2) {
			CarManager.displayCars();
		} else if (choice == 3) {
			try {
				CarManager.displayMonetaryValue();
			} catch (InvalidValueException e) {
				e.getMessage();
			}
		}
		displayOption();
	}

}
