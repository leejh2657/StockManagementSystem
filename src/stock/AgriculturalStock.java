package stock;

import java.util.Scanner;

public class AgriculturalStock extends Stock {
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
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Does it has an Expiration Date? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Stock Expiration Date:");
				String edate = input.next();
				this.setEdate(edate);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEdate("");
				break;
			}
			else {

			}
		}
	}

}
