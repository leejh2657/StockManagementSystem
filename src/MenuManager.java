import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("*** Stock Management System Menu ***");
			System.out.println(" 1. Add Stock");
			System.out.println(" 2. Delete Stock"); 
			System.out.println(" 3. Edit Stock"); 
			System.out.println(" 4. View Stock"); 
			System.out.println(" 5. Show a menu"); 
			System.out.println(" 6. Exit"); 
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				addStock();
			}
			else if (num == 2) {
				deleteStock();
			}
			else if (num == 3) {
				editStock();
			}
			else if (num == 4) {
				viewStock();
			}
			else {
				continue;
			}
		}

    }
	
	public static void addStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
		System.out.print("Stock Name:");
		String stockname = input.nextLine();
		System.out.print("Stock Manufacturing Date:");
		String stockMdate = input.nextLine();
		System.out.print("Stock Expiration Date:");
		String stockNdate = input.nextLine();
		System.out.print(stocknumber);
		System.out.print(stocknumber);
		
	}
	
	public static void deleteStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
	}
	
	public static void editStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
	}
	
	public static void viewStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock Number:");
		int stocknumber = input.nextInt();
	}
}

