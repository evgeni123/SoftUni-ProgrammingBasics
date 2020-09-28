package programming_basics;

import java.util.Scanner;

public class prostiOperacii {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String input=scanner.nextLine();
		int side=Integer.parseInt(input);
		int area=side*side;
		System.out.println(area);
	}

}
