package controller.manager;

import java.util.Vector;

import controller.validator.InvalidValueException;
import model.Car;

public class CarManager {
	private static Vector<Car> cars = new Vector<>(); //store car
	
	public static int addCar(Car car) {
		int status = 0;
		int size = cars.size();
		
		cars.add(car);
		
		if (cars.size() > size) {
			status++;
		}
				
		return status;
	}
	
	public static void displayCars() {
		for (Car car : cars) {
			displayCar(car);
		}
	}
	
	public static void displayCar(Car car){
		System.out.println("\nPlate No: " + car.getPlateNo());
		System.out.println("Model: " + car.getModel());
		System.out.println("Market Value: " + car.getMarketValue());	
	}
	
	public static void displayMonetaryValue() throws InvalidValueException {
		double total = 0;
		
		for (Car car : cars) {
			total += car.calculateMonetaryValue();
		}
		
		System.out.println(total);
	}
}
