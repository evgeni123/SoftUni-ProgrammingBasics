package programming_basics;

import java.util.Scanner;

public class spaceship {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double width = Double.parseDouble(s.nextLine());
		double length = Double.parseDouble(s.nextLine());
		double height = Double.parseDouble(s.nextLine());
		double avrg_h = Double.parseDouble(s.nextLine());

		double volume_rocket = width * length * height;
		double volume_room = (avrg_h + 0.40) * 2 * 2;
		int astro = (int) (volume_rocket / volume_room);

		if (astro >= 3 && astro <= 10) {
			System.out.printf("The spacecraft holds %d astronauts.", astro);
		} else if (astro < 3) {
			System.out.println("The spacecraft is too small.");
		} else if (astro > 10) {
			System.out.println("The spacecraft is too big.");
		}
	}

}
