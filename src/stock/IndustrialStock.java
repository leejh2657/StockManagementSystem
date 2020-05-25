package stock;

import java.util.Scanner;

public class IndustrialStock extends Stock {
	
	public IndustrialStock (StockKind Kind) {
		this.kind = kind;
	}
	
	public void getUserInput(Scanner input) {
	
		setStockNumber(input);
		setStockName(input); 
		setStockMdate(input); 
		setStockEdate(input);
		
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "number:" + this.number + "name:" + this.name + "manufacturing date:" + this.mdate + "expiration date:" + this.edate);
		
	}

}
