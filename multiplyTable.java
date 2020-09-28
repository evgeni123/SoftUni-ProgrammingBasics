package programming_basics;

import java.util.Scanner;

public class multiplyTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int left = n;
		int rev = 0;
		int rev1 = 0;
		int rev2 = 0;

		int r = left % 10;
		rev += r;
		left /= 10;

		r = left % 10;
		rev1 += r;
		left /= 10;
		r = left % 10;
		rev2 += r;

		for (int i = 1; i <= rev; i++) {
			for (int y = 1; y <= rev1; y++) {
				for (int w = 1; w <= rev2; w++) {
					System.out.println(i + " " + "*" + " " + y + " " + "*" + " " + w + " " + "=" + " " + i * y * w + ";");
				}
			}
		}

	}

}
