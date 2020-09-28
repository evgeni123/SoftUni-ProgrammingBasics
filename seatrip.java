package programming_basics;

import java.util.Scanner;

public class seatrip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double food_money_perday=Double.parseDouble(s.nextLine());
		double souvenir_money_perday=Double.parseDouble(s.nextLine());
		double hotel_money_perday=Double.parseDouble(s.nextLine());
		int road=420;
		int day=3;
		double gasoline=420*1.00/100*7;
		double gasoline_price=gasoline*1.85;
		double souvenir_food_total=3*(souvenir_money_perday+food_money_perday);
		double firstday_hotel=hotel_money_perday*0.9;
		double second_hotel=hotel_money_perday*0.85;
		double third_hotel=hotel_money_perday*0.80;
		double hotel_total=firstday_hotel+second_hotel+third_hotel;
		double total_money=gasoline_price+souvenir_food_total+hotel_total;
		
		
		
		
		
		System.out.printf("Money needed: %.2f",total_money);

	}

}
