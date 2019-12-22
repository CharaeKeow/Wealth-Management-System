package view;

import java.util.Scanner;

public class WealthManagementSystem extends View {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		WealthManagementSystem wms = new WealthManagementSystem();
		wms.displayOption();
		wms.selectOption(scanner, 7);	
		scanner.close();
	}
	
	void displayOption() {
		System.out.println("Welcome to Wealth Management System console app");
		System.out.println("===============================================");
		System.out.println("1. Manage House");
		System.out.println("2. Manage Land");
		System.out.println("3. Manage Car");
		System.out.println("4. Manage Motorcycle");
		System.out.println("5. Manage Gold");
		System.out.println("6. Manage Bank Account");
		System.out.println("7. Exit");
	}

	void processOption(Scanner scanner, int choice) {
		if (choice == 1) {
			HouseView hv = new HouseView();
			hv.displayOption();
			hv.selectOption(scanner, 4);
			displayOption();
		} else if (choice == 2) {
			LandView lv = new LandView();
			lv.displayOption();
			lv.selectOption(scanner, 4);
			displayOption();
		} else if (choice == 3) {
			CarView cv = new CarView();
			cv.displayOption();
			cv.selectOption(scanner, 4);
			displayOption();
		} else if (choice == 4) {
			MotorcycleView mv = new MotorcycleView();
			mv.displayOption();
			mv.selectOption(scanner, 4);
			displayOption();
		} else if (choice == 5) {
			GoldView gv = new GoldView();
			gv.displayOption();
			gv.selectOption(scanner, 4);
			displayOption();
		} else if (choice == 6) {

			BankAccountView bav = new BankAccountView();
			bav.displayOption();
			bav.selectOption(scanner, 6);
			displayOption();
		} 
	}
}