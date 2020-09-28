package programming_basics;

import java.util.Scanner;

public class minNum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int n=Integer.parseInt(scanner.nextLine()); 
		int i=0;
		while(i<n) {
			int currentnum=Integer.parseInt(scanner.nextLine());
			if(currentnum<min) {
				min=currentnum;
			}
			i++;
		}
		System.out.println(min);

	}

}
