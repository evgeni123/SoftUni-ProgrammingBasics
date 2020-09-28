package programming_basics;

import java.util.Scanner;

public class rad {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double radiant=Double.parseDouble(scanner.nextLine());
		double grad=radiant*180/Math.PI;
		System.out.printf("%.0f",grad);
	}
	

}
