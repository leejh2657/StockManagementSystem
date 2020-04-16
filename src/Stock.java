
public class Stock {
	
	int number;
	String name;
	String mdate;
	String edate;
	
	public Stock () {
}
	
	public Stock(int number, String name, String mdate, String edate) {
		this.number = number;
		this.name = name;
		this.mdate = mdate;
		this.edate = edate;
	}
	
	public void printInfo() {
		System.out.println("number:" + this.number + "name:" + this.name + "manufacturing date:" + this.mdate + "expiration date:" + this.edate);
		
	}
}

	
