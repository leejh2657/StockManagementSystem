package stock;

import java.util.Scanner;

public class AgriculturalStock extends Stock {
	
	public AgriculturalStock (StockKind Kind) {
		this.kind = kind;
	}
	
	
	
	public void getUserInput(Scanner input) {
		setStockNumber(input);
		setStockName(input); 
		setStockMdate(input); 
		setStockEdatewithYN(input);
		
		
		
	}
	
	public void setStockEdatewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Does it has an Expiration Date? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setStockEdate(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print("Stock Selling period:");
				String edate = input.next();
				this.setEdate(edate);
				break;
			} 
			else {

			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "number:" + this.number + "name:" + this.name + "manufacturing date:" + this.mdate + "expiration date:" + this.edate);
		
	}
}
