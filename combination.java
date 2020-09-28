package programming_basics;

import java.util.Scanner;

public class combination {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = Integer.parseInt(scanner.nextLine());
		int end = Integer.parseInt(scanner.nextLine());
		int magicNumber = Integer.parseInt(scanner.nextLine());
		int cnt = 0;
		boolean flag = false;

		for (int x = start; x <= end; x++) {
			for (int y = start; y <= end; y++) {
				int result = x + y;
				cnt++;
				if (result == magicNumber) {
					System.out.printf("Combination N:%d (%d + %d = %d)", cnt, x, y, result);
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (!flag) {
			System.out.printf("%d combinations - neither equals %d",cnt,magicNumber);
		}

	}

}
