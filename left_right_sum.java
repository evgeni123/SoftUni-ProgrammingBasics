package programming_basics;

import java.util.Scanner;

public class left_right_sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		int leftsum = 0;
		int rightsum = 0;
		for (int i = 0; i < n; i++) {
			int currentNum = Integer.parseInt(scanner.nextLine());
			leftsum = leftsum + currentNum;
		}
		for (int i = 0; i < n; i++) {
			int currentNum = Integer.parseInt(scanner.nextLine());
			rightsum = rightsum + currentNum;
		}
		if (leftsum == rightsum) {
			System.out.printf("Yes, sum = %d", leftsum);
		} else {
			int diff = Math.abs(leftsum - rightsum);
			System.out.printf("No, diff = %d", diff);
		}
	}

}
