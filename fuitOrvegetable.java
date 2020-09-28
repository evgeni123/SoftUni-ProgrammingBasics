package programming_basics;

import java.util.Scanner;

public class fuitOrvegetable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String kurvi = scanner.nextLine();
// ili boolean isFruit=input.equals("banana")||input.equals("apple")..
		switch (kurvi) {
		case "banana":
		case "apple":
		case "kiwi":
		case "cherry":
		case "lemon":
		case "grapes":
			System.out.println("fruit");
			break;
		case "tomato":
		case "cucumber":
		case "pepper":
		case "carrot":
			System.out.println("vegetable");
			break;
		default:
			System.out.println("unknown");
			break;

		}
	}

}
