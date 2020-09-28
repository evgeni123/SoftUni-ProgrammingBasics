package programming_basics;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double income=Double.parseDouble(s.nextLine());
		int months=Integer.parseInt(s.nextLine());
		double moneyneeded=Double.parseDouble(s.nextLine());
		
		double additCost=income*0.3;
		double saved=income-additCost-moneyneeded;
		double percentSavedm=saved/income*100;
		
		double total=saved*months;
		System.out.printf("She can save %.2f%%%n",percentSavedm);
		System.out.printf("%.2f",total);
	}

}
