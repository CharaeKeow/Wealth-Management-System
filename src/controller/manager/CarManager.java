package controller.manager;

import java.util.Vector;

import model.Car;

public class CarManager {
	private static Vector<Car> cars = new Vector<>(); //store house
	
	public int addCar(Car car) {
		int status = 0;
		
		cars.add(car);
		
		return status;
	}
	
	public void displayCars() {
		for (Car car : cars) {
			displayCar(car);
		}
	}
	
	public void displayCar(Car car) {
		System.out.println("\nPlate No: " + car.getPlateNo());
		System.out.println("Model: " + car.getModel());
		System.out.println("Market Value: " + car.getMarketValue());
		System.out.println("Monetary value: " + car.calculateMonetaryValue());
		
	}
}
