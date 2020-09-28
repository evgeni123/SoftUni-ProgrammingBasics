package programming_basics;

import java.util.Scanner;

public class alcohol_market {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double whiskey_price=Double.parseDouble(scanner.nextLine());
		double beer_quantity=Double.parseDouble(scanner.nextLine());
		double wine_quantity=Double.parseDouble(scanner.nextLine());
		double rakia_quantity=Double.parseDouble(scanner.nextLine());
		double whiskey_quantity=Double.parseDouble(scanner.nextLine());
		
		
		double rakia_price=whiskey_price*0.5;
		double wine_price= rakia_price*0.6;
		double beer_price=rakia_price*0.2;
		
		double total_price=(whiskey_price*whiskey_quantity)+(beer_price*beer_quantity)+
				(wine_price*wine_quantity)+(rakia_price*rakia_quantity);
		
		System.out.printf("%.2f",total_price);
	}

}
