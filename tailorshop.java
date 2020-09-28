package programming_basics;

import java.util.Scanner;

public class tailorshop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int table_count = Integer.parseInt(scanner.nextLine());
		double table_length = Double.parseDouble(scanner.nextLine());
		double table_width = Double.parseDouble(scanner.nextLine());

		//double additional_cloth = (table_length * 0.6 + table_width * 0.6) * table_count;

		//double total_area_table = table_length * table_width * table_count;
		double area=table_count*(table_length+2*0.3)*(table_width+2*0.3);

		double side = table_length / 2;
		double square_cover_cloth = side * side * table_count;

		double covers_price_usd = area * 7;
		double square_cover_price_usd = square_cover_cloth * 9;
		double price_usd= covers_price_usd+square_cover_price_usd;
		double price_bg=price_usd*1.85;
		
		System.out.printf("%.2f USD%n",price_usd);
		System.out.printf("%.2f BGN",price_bg);

	}

}
