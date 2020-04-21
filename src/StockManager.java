import java.util.ArrayList;
import java.util.Scanner;

import stock.AgriculturalStock;
import stock.Stock;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;

	StockManager(Scanner input){
		this.input = input;

	}

	public void addStock() {
		int kind = 0;
		Stock stock;
		while (kind != 1 && kind != 2) {
			System.out.print("Select Stock Kind:");
			System.out.print("1 for Industrial Stock:");
			System.out.print("2 for Agricultural Stock:");
			System.out.print(" Select num for Stock Kind between 1 and 2:");
		    kind = input.nextInt();
			if (kind ==1) {
				stock = new Stock ();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else if (kind ==2) {
				stock = new AgriculturalStock ();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
				//
			}
			else {
				System.out.print("Select num for Stock Kind between 1 and 2:");
			}
		}
	}

	public void deleteStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<stocks.size(); i++) {
			if (stocks.get(i).getNumber() == stocknumber ) {
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
			if (stock.getNumber() == stocknumber ) {
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
						int number = input.nextInt();
						stock.setNumber(number);
					}
					else if (num == 2) {
						System.out.print("Stock Name:");
						String name = input.next();
						stock.setName(name);
					}
					else if (num == 3) {
						System.out.print("Stock Manufacturing Date:");
						String mdate = input.next();
						stock.setMdate(mdate);
					}
					else if (num == 4) {
						System.out.print("Stock Expiration Date:");
						String edate = input.next();
						stock.setEdate(edate);
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
		System.out.println("# of registered stocks:" + stocks.size());
		for (int i = 0; i<stocks.size(); i++) {
			stocks.get(i).printInfo();

		}
	}
	
}


