
public class Stock {
	
	int number;
	String name;
	String mdate;
	String edate;
	static int numStockRegistered = 0;
	
	public Stock () {
		numStockRegistered++;
}
	
	public Stock(int number, String name, String mdate, String edate) {
		this.number = number;
		this.name = name;
		this.mdate = mdate;
		this.edate = edate;
		numStockRegistered++;
	}
	
	public void printInfo() {
		System.out.println("number:" + this.number + "name:" + this.name + "manufacturing date:" + this.mdate + "expiration date:" + this.edate);
		
	}
}

	
