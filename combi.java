package programming_basics;

import java.util.Scanner;

public class combi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int cnt = 0;

		for (int x1 = 0; x1 <= n; x1++) {
			for (int x2 = 0; x2 <= n; x2++) {
				for (int x3 = 0; x3 <= n; x3++) {
					int result = x1 + x2 + x3;
					if (result == n) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
