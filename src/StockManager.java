import java.util.ArrayList;
import java.util.Scanner;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;

	StockManager(Scanner input){
		this.input = input;

	}

	public void addStock() {
		Stock stock = new Stock();
		System.out.print("Stock Number:");
		stock.number = input.nextInt();
		System.out.print("Stock Name:");
		stock.name = input.next();
		System.out.print("Stock Manufacturing Date:");
		stock.mdate = input.next();
		System.out.print("Stock Expiration Date:");
		stock.edate = input.next();
		stocks.add(stock);

	}

	public void deleteStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<stocks.size(); i++) {
			if (stocks.get(i).number == stocknumber ) {
				index = i;
				break;

			}
		}

		if (index >= 0) {
			stocks.remove(index);
			System.out.println("the stock" + stocknumber + "is deleted");

		}
		else {
			System.out.println("the stock has not been registered");
			return;
		}

	}

	public void editStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		for (int i = 0; i<stocks.size(); i++) {
			Stock stock = stocks.get(i);
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
						stock.name = input.next();
					}
					else if (num == 3) {
						System.out.print("Stock Manufacturing Date:");
						stock.mdate = input.next();
					}
					else if (num == 4) {
						System.out.print("Stock Expiration Date:");
						stock.edate = input.next();
					}
					else {
						continue;
					}// if
				}// while
				break;
			}// if
		}// for
	}

	public void viewStocks() {
		//		System.out.print("Stock Number:");
		//		int stocknumber = input.nextInt();
		for (int i = 0; i<stocks.size(); i++) {
			stocks.get(i).printInfo();

		}
	}
	
}


