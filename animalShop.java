package programming_basics;

import java.util.Scanner;

public class animalShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogs_count = Integer.parseInt(scanner.nextLine());
		int animals_count = Integer.parseInt(scanner.nextLine());
		double dogs_food = 2.50 * dogs_count;
		double animals_food = 4.0 * animals_count;
		double total_price = dogs_food + animals_food;

		System.out.printf("%.2f lv.",total_price);
	}

}
