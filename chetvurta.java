package programming_basics;

import java.util.Scanner;

public class chetvurta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int m = Integer.parseInt(s.nextLine());
		int s1 = Integer.parseInt(s.nextLine());
		
		while (m > n) {

			if (n >= m) {
				break;
			}

			if (m % 2 == 0 && m % 3 == 0) {
				if(m==s1) {
					continue;
				}

				System.out.print(m + " ");
			}
			
			

			m--;

		}
		
			
		
	}

}
