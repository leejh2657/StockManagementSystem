package stock;

import java.util.Scanner;

public class MeatStock extends Stock {
	protected String origin;
	protected String part;

	public MeatStock (StockKind Kind) {
		this.kind = kind;
	}

	public void getUserInput(Scanner input) {
		System.out.print("Stock Number:");
		int number = input.nextInt();
		this.setNumber(number);

		System.out.print("Stock Name:");
		String name = input.next();
		this.setName(name);

		System.out.print("Stock Catching Date:");
		String mdate = input.next();
		this.setMdate(mdate);

		System.out.print("Stock Expiration Date:");
		String edate = input.next();
		this.setEdate(edate);

		System.out.print("The Country of Origin:");
		String origin = input.next();
		this.setEdate(origin);

		System.out.print("Meat Part:");
		String part = input.next();
		this.setEdate(part);


	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Industrial:
			skind = "Ind";
			break;
		case Agriculture:
			skind = "Agri";
			break;
		case Fishery:
			skind = "Fish";
			break;
		case Meat:
			skind = "meat";
			break;
		default:

		}
		System.out.println("kind:" + skind + "number:" + this.number + "name:" + this.name + "catching date:" + this.mdate + "expiration date:" + this.edate + "  the country of origin:" + this.origin + "Meat Part:" + this.part );

	}

}

