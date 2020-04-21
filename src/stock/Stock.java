package stock;

import java.util.Scanner;

public class Stock {

	protected StockKind kind = StockKind.Industrial;
	protected int number;
	protected String name;
	protected String mdate;
	protected String edate;
	
	public Stock () {
}
	
	public Stock(int number, String name, String mdate, String edate) {
		this.number = number;
		this.name = name;
		this.mdate = mdate;
		this.edate = edate;
	}
	
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	public void printInfo() {
		System.out.println("number:" + this.number + "name:" + this.name + "manufacturing date:" + this.mdate + "expiration date:" + this.edate);
		
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Stock Number:");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Stock Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Stock Manufacturing Date:");
		String mdate = input.next();
		this.setMdate(mdate);
		
		System.out.print("Stock Expiration Date:");
		String edate = input.next();
		this.setEdate(edate);
		
	}
}

	
