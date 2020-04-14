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
			stock = null;
			System.out.println("the stock to be edited" + stocknumber);
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


