package programming_basics;

import java.util.Scanner;

public class newHouse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String flowers = scanner.nextLine();
		int flower_count = Integer.parseInt(scanner.nextLine());
		int budget = Integer.parseInt(scanner.nextLine());
		double total_price = 0;
		double discount = 1;
		double flower_price = 0;
		switch (flowers) {

		case "Roses":
			flower_price = 5;
			if (flower_count > 80) {
				discount = 0.9;
			}
			break;
		case "Dahlias":
			flower_price = 3.80;
			if (flower_count > 90) {
				discount = 0.85;
			}
			break;
		case "Tulips":
			flower_price = 2.80;
			if (flower_count > 80) {
				discount = 0.85;
			}
			break;
		case "Narcissus":
			flower_price = 3;
			if (flower_count < 120) {
				discount = 1.15;
			}
			break;
		case "Gladiolus":
			flower_price = 2.50;
			if (flower_count < 80) {
				discount = 1.20;
			}
			break;
		default:
			break;

		}
		total_price = (flower_count * flower_price) * discount;
		if (total_price <= budget) {
			double money = budget - total_price;
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flower_count, flowers,
					money);
		} else {
			double diff = budget - total_price;
			System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
		}

	}

}
