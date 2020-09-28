package programming_basics;

import java.util.Scanner;

public class journey {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double budget = Double.parseDouble(scanner.nextLine());
		String season = scanner.nextLine();
		String destination = "";
		String vactype = "";
		double money_spent = 0.0;

		if (budget <= 100) {
			destination = "Bulgaria";
			if (season.equals("summer")) {
				money_spent = budget * 0.3;
				vactype = "Camp";
			} else if (season.equals("winter")) {
				money_spent = budget * 0.7;
				vactype = "Hotel";

			}
		} else if (budget <= 1000) {
			destination = "Balkans";
			if (season.equals("summer")) {
				money_spent = budget * 0.4;
				vactype = "Camp";
			} else if (season.equals("winter")) {
				money_spent = budget * 0.8;
				vactype = "Hotel";
			}
		} else {
			destination = "Europe";
			money_spent = budget * 0.9;
			vactype = "Hotel";
		}
		System.out.printf("Somewhere in %s", destination);
		System.out.printf("%n%s - %.2f", vactype, money_spent);
	}

}
