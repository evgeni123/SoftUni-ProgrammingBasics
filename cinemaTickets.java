package programming_basics;

import java.util.Scanner;

public class cinemaTickets {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String filmName = s.nextLine();
		int studentCnt = 0;
		int standardCnt = 0;
		int kidCnt = 0;

		while (!"Finish".equals(filmName)) {
			int capacity = Integer.parseInt(s.nextLine());
			int cnt = 0;

			for (int i = 0; i < capacity; i++) {
				String ticketT = s.nextLine();
				if ("End".equals(ticketT)) {
					break;
				}
				cnt++;
				switch (ticketT) {
				case "student":
					studentCnt++;
					break;
				case "standard":
					standardCnt++;
					break;
				case "kid":
					kidCnt++;
					break;
				}
			}
			double percent = cnt * 1.0 / capacity * 100;
			System.out.printf("%s - %.2f%% full.%n", filmName, percent);
			filmName = s.nextLine();
		}
		int totaltickets = kidCnt + standardCnt + studentCnt;
		System.out.printf("Total tickets: %d%n", totaltickets);
		double studentPer = studentCnt * 1.0 / totaltickets * 100;
		System.out.printf("%.2f%% student tickets.%n", studentPer);
		double standardPer = standardCnt * 1.0 / totaltickets * 100;
		System.out.printf("%.2f%% standard tickets.%n", standardPer);
		double kidPer = kidCnt * 1.0 / totaltickets * 100;
		System.out.printf("%.2f%% kids tickets.", kidPer);

	}

}
