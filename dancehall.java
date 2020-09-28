package programming_basics;

import java.util.Scanner;

public class dancehall {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double l=Double.parseDouble(scanner.nextLine());
		double w=Double.parseDouble(scanner.nextLine());
		double wardrobe_side=Double.parseDouble(scanner.nextLine());
		
		double hall_area=(l*100)*(w*100);
		double wardrobe_area=(wardrobe_side*100)*(wardrobe_side*100);
		double bench_area=hall_area/10;
		double free_space=hall_area-wardrobe_area-bench_area;
		int dancers= (int) (free_space/(7000+40));
		
		System.out.printf("%d",dancers);
	}

}
