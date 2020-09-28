package programming_basics;

import java.util.Scanner;

public class examprep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maxFailCount = Integer.parseInt(scanner.nextLine());

		int totalGradeScore = 0;
		int gradeCnt = 0;
		String lastPro = "";
		String input = scanner.nextLine();
		int currentfailCount = 0;
		while (!input.equals("Enough")) {
			int grade = Integer.parseInt(scanner.nextLine());
			totalGradeScore += grade;
			gradeCnt++;
			lastPro = input;
			if (grade <= 4) {
				currentfailCount++;
				if (currentfailCount == maxFailCount) {
					break;
				}

			}
			input = scanner.nextLine();

		}
		double avgScore = (double) totalGradeScore / gradeCnt;
		if (input.equals("Enough")) {
			System.out.printf("Average score: %.2f%n" + "Number of problems: %d%n" + "Last problem: %s", avgScore,
					gradeCnt, lastPro);
		} else {
			System.out.printf("You need a break, %d poor grades.", currentfailCount);
		}
	}

}
