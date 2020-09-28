package programming_basics;

import java.util.Scanner;

public class sum_numbers_while {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum =0;
		String input=scanner.nextLine();
		while(!"Stop".equals(input)) {
			int currentNumber=Integer.parseInt(input);
			sum+=currentNumber;
			input=scanner.nextLine();
		}
		System.out.println(sum);
	}

}
