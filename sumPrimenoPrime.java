package programming_basics;

import java.util.Scanner;

public class sumPrimenoPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		int primeSum = 0;
		int nonprime = 0;

		while (!input.equals("stop")) {
			int n = Integer.parseInt(input);
			if (n < 0) {
				System.out.println("Number is negative.");
				input = s.nextLine();
				continue;
			} else {

			}
			boolean isPrime = true;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeSum += n;
			} else {
				nonprime += n;
			}
			input = s.nextLine();

		}
		System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
		System.out.printf("Sum of all non prime numbers is: %d", nonprime);

	}

}
