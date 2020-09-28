package programming_basics;

import java.util.Scanner;

public class maxNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int n=Integer.parseInt(scanner.nextLine()); 
		int i=0;
		while(i<n) {
			int currentnum=Integer.parseInt(scanner.nextLine());
			if(currentnum>max) {
				max=currentnum;
			}
			i++;
		}
		System.out.println(max);

	}

}
