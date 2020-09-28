package programming_basics;

import java.util.Scanner;

public class bus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int passenger_1st=Integer.parseInt(s.nextLine());
		int stop=Integer.parseInt(s.nextLine());
		int getOff=0;
		int getIn=0;
		
		for (int i=1;i<=stop;i++) {
			getOff=Integer.parseInt(s.nextLine());
			getIn=Integer.parseInt(s.nextLine());
			
			passenger_1st-=getOff;
			passenger_1st+=getIn;
			
			if(i%2==0) {
				passenger_1st-=2;
			}else if(i%2==1) {
				passenger_1st+=2;
			}
		}
		System.out.printf("The final number of passengers is : %d",passenger_1st);

	}

}
