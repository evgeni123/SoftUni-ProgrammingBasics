package programming_basics;

import java.util.Scanner;

public class cake {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int width = Integer.parseInt(scanner.nextLine());
		int height = Integer.parseInt(scanner.nextLine());
		int pieces_cake = width * height;
		String input = scanner.nextLine();

		while (!input.equals("STOP")) {
			int piecesTaken = Integer.parseInt(input);
			pieces_cake -= piecesTaken;

			if (pieces_cake < 0) {
				break;
			}
			input = scanner.nextLine();

		}
		if(pieces_cake>=0) {
			System.out.printf("%d pieces are left.",pieces_cake);
		}else {
			System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces_cake));
		}

	}

}
