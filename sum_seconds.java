package programming_basics;

import java.util.Scanner;

public class sum_seconds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time_first = Integer.parseInt(scanner.nextLine());
		int time_second = Integer.parseInt(scanner.nextLine());
		int time_third = Integer.parseInt(scanner.nextLine());
		int total_time = time_first + time_second + time_third;

		int minutes = total_time / 60;
		int seconds = total_time % 60;

		if (seconds < 10) {
			System.out.printf("%d:0%d", minutes, seconds);
		} else {
			System.out.printf("%d:%d", minutes, seconds);
		}
	}

}
