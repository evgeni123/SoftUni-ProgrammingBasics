package programming_basics;

import java.util.Scanner;

public class summershopping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int budget = Integer.parseInt(s.nextLine());
		double towel = Double.parseDouble(s.nextLine());
		int discount = Integer.parseInt(s.nextLine());

		double umbrellaPrice = towel * 2 / 3;
		double flipflops = umbrellaPrice * 0.75;
		double beachbag = (flipflops + towel) / 3;

		double total = towel + umbrellaPrice + flipflops + beachbag;
		double discountper = discount * 1.0 / 100;
		double finalPrice = total - total * discountper;

		if (finalPrice > budget) {
			double moneyneeded = finalPrice - budget;
			System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", finalPrice, moneyneeded);
		} else {
			double moneyLeft = budget - finalPrice;
			System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", finalPrice, moneyLeft);
		}

	}

}
