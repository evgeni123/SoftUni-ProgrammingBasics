package programming_basics;

import java.util.Scanner;

public class clever_lily {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		double washing_mashine = Double.parseDouble(scanner.nextLine());
		int priceToy = Integer.parseInt(scanner.nextLine());
		int toys_count = 0;
		double lilys_money = 0.0;
		double money_bday = 10;

		for (int i = 1; i <= age; i++) {
			if (i % 2 == 0) {
				lilys_money = lilys_money + money_bday - 1;
				money_bday = money_bday + 10;
			} else {
				toys_count++;

			}

		}
		double moneyfromtoys = toys_count * priceToy;
		lilys_money = lilys_money + moneyfromtoys;
		if (lilys_money >= washing_mashine) {
			double diff = lilys_money - washing_mashine;
			System.out.printf("Yes! %.2f", diff);
		} else {
			double money_need = washing_mashine - lilys_money;
			System.out.printf("No! %.2f", money_need);
		}

	}

}
