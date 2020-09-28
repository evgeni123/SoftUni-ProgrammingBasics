package programming_basics;

import java.util.Scanner;

public class numberPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int currentNum = 1;
		for (int row = 1; row <= n; row++) {
			boolean isReached = false;
			for (int col = 1; col <= row; col++) {
				System.out.print(currentNum + " ");

				if (currentNum >= n) {
					isReached = true;
					break;
				}
				currentNum++;
			}

			System.out.println();
			if (isReached) {
				break;
			}
		}

	}

}
