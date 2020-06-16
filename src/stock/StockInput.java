package stock;

import java.util.Scanner;

import exception.MdateFormatException;

public interface StockInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public String getName();
	
	public void setName(String name);
	
	public String getMdate();
	
	public void setMdate(String mdate) throws MdateFormatException;
	
	public String getEdate();
	
	public void setEdate(String edate);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setStockNumber(Scanner input);
	
	public void setStockName(Scanner input);
	
	public void setStockMdate(Scanner input);
	
	public void setStockEdate(Scanner input);

}
