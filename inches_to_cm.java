package programming_basics;

import java.util.Scanner;

public class inches_to_cm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String input=scan.nextLine();PREOBRAZUVA STRING V CHISLO
		double inches = Double.parseDouble(scanner.nextLine());
		//kato izpolzvash gornoto vmesto scnner.. pishesh input
		double cm=inches*2.54;
		System.out.println(cm);
	}

}
