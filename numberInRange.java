package programming_basics;

import java.util.Scanner;

public class numberInRange {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=Integer.parseInt(scanner.nextLine());
		boolean isTrue=num>=-100&& num<=100 && num!=0;
		
		if(isTrue) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
	}

}
