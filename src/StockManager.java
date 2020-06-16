import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import stock.AgriculturalStock;
import stock.FisheryStock;
import stock.IndustrialStock;
import stock.MeatStock;
import stock.Stock;
import stock.StockInput;
import stock.StockKind;

public class StockManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2957955150063190653L;
	
	
	ArrayList<StockInput> stocks = new ArrayList<StockInput>();
	transient Scanner input;

	StockManager(Scanner input){
		this.input = input;

	}
	
	public void setScanner(Scanner input) {
        this.input = input;
    }

	public void addStock() {
		int kind = 0;
		StockInput stockInput;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			try {
				System.out.println("Select Stock Kind:");
				System.out.println("1 for Industrial Stock:");
				System.out.println("2 for Agricultural Stock:");
				System.out.println("3 for Fishery Stock:");
				System.out.println("4 for Meat Stock:");
				System.out.println(" Select num 1, 2, 3 or 4 for Stock Kind:");
				kind = input.nextInt();
				if (kind ==1) {
					stockInput = new IndustrialStock (StockKind.Industrial);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				}
				else if (kind ==2) {
					stockInput = new AgriculturalStock (StockKind.Agriculture);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
					//
				}
				else if (kind ==3) {
					stockInput = new FisheryStock (StockKind.Fishery);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				}
				else if (kind ==4) {
					stockInput = new MeatStock (StockKind.Meat);
					stockInput.getUserInput(input);
					stocks.add(stockInput);
					break;
				}
				else {
					System.out.print("Select num for Stock Kind between 1, 2, 3 and 4:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}



	public void deleteStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		int index = findIndex(stocknumber);
		removefromStocks(index, stocknumber);
	}
	
	public int findIndex(int stocknumber) {
		int index = -1;
		for (int i = 0; i<stocks.size(); i++) {
			if (stocks.get(i).getNumber() == stocknumber ) {
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public int removefromStocks(int index,int stocknumber) {
		if (index >= 0) {
			stocks.remove(index);
			System.out.println("the stock" + stocknumber + "is deleted");
			return 1;
		}
		else {
			System.out.println("the stock has not been registered");
			return -1;
		}
		
	}

	public void editStock() {
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		for (int i = 0; i<stocks.size(); i++) {
			StockInput stock = stocks.get(i);
			if (stock.getNumber() == stocknumber ) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						stock.setStockNumber(input);
						break;
					case 2:
						stock.setStockName(input);
						break;
					case 3:
						stock.setStockMdate(input);
						break;
					case 4:
						stock.setStockEdate(input);
						break;
					default:
						continue;
					}
				}// while
				break;
			}// if
		}// for
	}

	public void viewStocks() {
		System.out.println("# of registered stocks:" + stocks.size());
		for (int i = 0; i<stocks.size(); i++) {
			stocks.get(i).printInfo();

		}
	}
	
	public int size() {
		return stocks.size();
	}
	
	public StockInput get(int index) {
		return (Stock) stocks.get(index);
	}
		
	
	
	public void showEditMenu() {
		System.out.println("** Stock Info Edit Menu **");
		System.out.println(" 1. Edit Number");
		System.out.println(" 2. Edit Name"); 
		System.out.println(" 3. Edit Manufacturing Date"); 
		System.out.println(" 4. Edit Expiration Date");  
		System.out.println(" 5. Exit"); 
		System.out.println("Select one number between 1 - 5:");
		
	} 
	
}


