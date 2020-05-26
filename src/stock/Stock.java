package stock;

import java.io.Serializable;
import java.util.Scanner;

import exception.MdateFormatException;

public abstract class Stock implements StockInput, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3878637441937093546L;
	protected StockKind kind = StockKind.Industrial;
	protected int number;
	protected String name;
	protected String mdate;
	protected String edate;
	
	public Stock () {
	}
	
	public Stock (StockKind Kind) {
		this.kind = kind;
	}
	
	public Stock(int number, String name, String mdate, String edate) {
		this.number = number;
		this.name = name;
		this.mdate = mdate;
		this.edate = edate;
	}
	
	public Stock(StockKind kind, int number, String name, String mdate, String edate) {
		this.kind = kind;
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

	public void setMdate(String mdate) throws MdateFormatException {
		if (!mdate.contains("day") && !mdate.equals("")) {
			throw new MdateFormatException();
		}
		
		this.mdate = mdate;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	public abstract void printInfo(); 
	
	public void setStockNumber(Scanner input) {
		System.out.print("Stock Number:");
		int number = input.nextInt();
		this.setNumber(number);
	}
	public void setStockName(Scanner input) {
		System.out.print("Stock Name:");
		String name = input.next();
		this.setName(name);
	}
	public void setStockMdate(Scanner input) {
		String madte = "";
		while (!mdate.contains("day")) {
		System.out.print("Stock Manufacturing Date:");
		String mdate = input.next();
		try {
			this.setMdate(mdate);
		} catch (MdateFormatException e) {
			System.out.println("Incorrect Mdate Format. Put the date that contains ");
			e.printStackTrace();
		}
		}
	}
	public void setStockEdate(Scanner input) {
		System.out.print("Stock Expiration Date:");
		String edate = input.next();
		this.setEdate(edate);
	}
	
	public String getKindString() {
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
			skind = "Meat";
			break;
		default:	
		}
		return skind;
			
	}	
}

	
