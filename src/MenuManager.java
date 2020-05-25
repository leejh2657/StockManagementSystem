import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StockManager stockManager = new StockManager(input);

		selectMenu(input, stockManager);
	}

	public static void selectMenu(Scanner input, StockManager stockManager ) {
		int num = -1;
		while (num != 5) {
			try { 
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					stockManager.addStock();
					break;
				case 2:
					stockManager.deleteStock();
					break;
				case 3:
					stockManager.editStock();
					break;
				case 4:
					stockManager.viewStocks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;					

			}
		}
	}


	public static void showMenu() { 
		System.out.println("*** Stock Management System Menu ***");
		System.out.println(" 1. Add Stock");
		System.out.println(" 2. Delete Stock"); 
		System.out.println(" 3. Edit Stock"); 
		System.out.println(" 4. View Stocks");  
		System.out.println(" 5. Exit"); 
		System.out.println("Select one number between 1 - 5:");
	}
}





