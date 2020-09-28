package programming_basics;

import java.util.Scanner;

public class charity_campaign {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int campaign_days=Integer.parseInt(scanner.nextLine());
		int bakers_number=Integer.parseInt(scanner.nextLine());
		int cakes_number=Integer.parseInt(scanner.nextLine());
		int waffles_number=Integer.parseInt(scanner.nextLine());
		int pancakes_number=Integer.parseInt(scanner.nextLine());
		
		double total_cake_price=cakes_number*45;
		double total_waffles_price=waffles_number*5.80;
		double total_pancakes_price=pancakes_number*3.20;
		
		double day_profit_one=total_cake_price+total_pancakes_price+
				total_waffles_price;
		double day_profit_all=day_profit_one*bakers_number;
		
		
		double total_price=day_profit_all*campaign_days;
		double total_earnings=total_price-(total_price*0.125);
		System.out.printf("%.2f",total_earnings);
	}

}
