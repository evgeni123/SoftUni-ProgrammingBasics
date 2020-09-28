package programming_basics;

import java.util.Scanner;

public class purva {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double average_speed=Double.parseDouble(s.nextLine());
		double fuel_per_100=Double.parseDouble(s.nextLine());
		
		double distance=384400*2.00;
		double time=(384400*2.00/average_speed)+3;
		double time_stay=time+3;
		double all_fuel=(fuel_per_100*distance)/100;
		
		System.out.printf("%.0f%n",Math.ceil(time));
		System.out.printf("%.0f",all_fuel);

	}

}
