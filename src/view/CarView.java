package view;

import java.util.Scanner;

public class CarView extends View {

	@Override
	void displayOption() {
		System.out.println("\nManage Car");
		System.out.println("==========");
		System.out.println("1. Add Car");
		System.out.println("2. Display Car");
		System.out.println("3. Back to main menu\n");		
	}

	@Override
	void processOption(Scanner scanner, int choice) {
		// TODO Auto-generated method stub
		
	}

}
