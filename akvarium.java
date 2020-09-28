package programming_basics;

import java.util.Scanner;

public class akvarium {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int lenght=Integer.parseInt(scanner.nextLine());
		int width=Integer.parseInt(scanner.nextLine());
		int height=Integer.parseInt(scanner.nextLine());
		double percent=Double.parseDouble(scanner.nextLine());
		
		double liter=lenght*width*height/1000.0;
		double stuff=liter*percent/100;
		double totalLiters=liter-stuff;
		System.out.printf("%.3f",totalLiters);
	}

}
