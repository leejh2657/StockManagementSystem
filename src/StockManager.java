import java.util.Scanner;

public class StockManager {
	Stock stock;
	Scanner input;
	
	StockManager(Scanner input){
		this.input = input;
		
	}
	
	public void addStock() {
		stock = new Stock();
		System.out.print("Stock Number:");
		stock.number = input.nextInt();
		System.out.print("Stock Name:");
		stock.name = input.nextLine();
		System.out.print("Stock Manufacturing Date:");
		stock.mdate = input.nextLine();
		System.out.print("Stock Expiration Date:");
		stock.edate = input.nextLine();

	}
	
	public void deleteStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		if (stock == null) {
			System.out.println("the stock has not been registered");
			return;
		}
		if (stock.number == stocknumber ) {
			stock = null;
			System.out.println("the stock is deleted");
		
		}
	}
	
	public void editStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		if (stock.number == stocknumber ) {
			int num = -1;
			while (num != 5) {
				System.out.println("** Stock Info Edit Menu **");
				System.out.println(" 1. Edit Number");
				System.out.println(" 2. Edit Name"); 
				System.out.println(" 3. Edit Manufacturing Date"); 
				System.out.println(" 4. Edit Expiration Date");  
				System.out.println(" 5. Exit"); 
				System.out.println("Select one number between 1 - 5:");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Stock Number:");
					stock.number = input.nextInt();
				}
				else if (num == 2) {
					System.out.print("Stock Name:");
					stock.name = input.nextLine();
				}
				else if (num == 3) {
					System.out.print("Stock Manufacturing Date:");
					stock.mdate = input.nextLine();
				}
				else if (num == 4) {
					System.out.print("Stock Expiration Date:");
					stock.edate = input.nextLine();
				}
				else {
					continue;
				}
			}
		}
	}
	
	public void viewStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		if (stock.number == stocknumber ) {
			stock.printInfo();
		}
	}
}


