package programming_basics;

import java.util.Scanner;

public class old_books {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String favbook = scanner.nextLine();
		int libcapacity = Integer.parseInt(scanner.nextLine());
		int bookCnt = 0;
		boolean isFound = true;

		String currentbook = scanner.nextLine();
		while (!currentbook.equals(favbook)) {
			bookCnt++;
			if (bookCnt == libcapacity) {
				isFound = false;
				break;
			}

			currentbook = scanner.nextLine();
		}
		if (isFound) {
			System.out.printf("You checked %d books and found it.", bookCnt);
		} else {
			System.out.printf("The book you search is not here!%n" + "You checked %d books.", bookCnt);
		}

	}

}
