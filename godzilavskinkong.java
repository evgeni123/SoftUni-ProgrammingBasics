package programming_basics;

import java.util.Scanner;

public class godzilavskinkong {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double budget=Double.parseDouble(scanner.nextLine());
		int person=Integer.parseInt(scanner.nextLine());
		double person_outfit=Double.parseDouble(scanner.nextLine());
		
		double decor=budget*0.1;
		double total_outfit_price=person*person_outfit;
		
		if(person>150) {
			total_outfit_price=total_outfit_price-(total_outfit_price*0.1);
		}
		double total_price=decor+total_outfit_price;
		if(total_price>budget) {
			System.out.println( "Not enough money!");
			double diff=Math.abs(total_price-budget);
			System.out.printf("Wingard needs %.2f leva more.",diff);
		}else {
			System.out.println("Action!");
			double diff=Math.abs(total_price-budget);
			System.out.printf("Wingard starts filming with %.2f leva left.",diff);
			
		}
		
	}

}
