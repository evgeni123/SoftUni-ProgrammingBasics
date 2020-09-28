package programming_basics;

import java.util.Scanner;

public class toyshop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double trip = Double.parseDouble(scanner.nextLine());
		int puzzle_count = Integer.parseInt(scanner.nextLine());
		int doll_count = Integer.parseInt(scanner.nextLine());
		int bears_count = Integer.parseInt(scanner.nextLine());
		int minions_count = Integer.parseInt(scanner.nextLine());
		int trucks_count = Integer.parseInt(scanner.nextLine());

		double sum = puzzle_count * 2.60 + doll_count * 3 + bears_count * 4.10 + minions_count * 8.20
				+ trucks_count * 2;
		int toys_count = puzzle_count + doll_count + bears_count + minions_count + trucks_count;

		if (toys_count >= 50) {
			double discount = sum * 25 / 100;
			sum = sum - discount;
		}
		double rent = sum*0.1;
		sum = sum - rent;

		double money_left = sum - trip;

		if (money_left >= 0) {
			System.out.printf("Yes! %.2f lv left.", money_left);
		} else {
			System.out.printf("Not enough money! %.2f lv needed.", Math.abs(money_left));
		}
	}

}
