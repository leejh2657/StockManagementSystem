package stock;

import java.util.Scanner;

public interface StockInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setMdate(String mdate);
	
	public void setEdate(String edate);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setStockNumber(Scanner input);
	
	public void setStockName(Scanner input);
	
	public void setStockMdate(Scanner input);
	
	public void setStockEdate(Scanner input);

}
