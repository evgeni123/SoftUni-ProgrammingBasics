package programming_basics;

import java.util.Scanner;

public class moving {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int width_free = Integer.parseInt(scanner.nextLine());
		int length_free = Integer.parseInt(scanner.nextLine());
		int heigth_free = Integer.parseInt(scanner.nextLine());

		int volume = width_free * length_free * heigth_free;

		String input = scanner.nextLine();
		while (!input.equals("Done")) {
			int boxes = Integer.parseInt(input);
			volume -= boxes;
			if (volume < 0) {
				break;
			}

			input = scanner.nextLine();
		}
		if (volume < 0) {
			int spaceNeeded = Math.abs(volume);
			System.out.printf("No more free space! You need %d Cubic meters more.", spaceNeeded);
		}else {
			System.out.printf("%d Cubic meters left.",volume);
		}

	}

}
