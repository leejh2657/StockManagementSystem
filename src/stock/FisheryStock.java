package stock;

import java.util.Scanner;

import exception.MdateFormatException;

public class FisheryStock extends Stock {

	protected String origin;

	public FisheryStock (StockKind Kind) {
		this.kind = kind;
	}

	public void getUserInput(Scanner input) {
		setStockNumber(input);
		setStockName(input);

		System.out.print("Stock Catching Date:");
		try {
			String mdate = input.next();
			this.setMdate(mdate);

			setStockEdate(input);

			System.out.print("The Country of Origin:");
			String origin = input.next();
			this.setEdate(origin);
		}
		catch(MdateFormatException e) {
			System.out.println("Incorrect Mdate Format. Put the date that contains ");

		}


	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "number:" + this.number + "name:" + this.name + "catching date:" + this.mdate + "expiration date:" + this.edate + "the country of origin:" + this.origin);
		
	}

}
