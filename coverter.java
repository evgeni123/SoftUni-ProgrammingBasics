package programming_basics;

import java.util.Scanner;

public class coverter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double num=Double.parseDouble(scanner.nextLine());
		String from_what=scanner.nextLine();
		String to_what=scanner.nextLine();
		
		if(from_what.equals("m")&&to_what.equals("mm")) {
			num=num*1000;
			System.out.printf("%.3f",num);
		}else if(from_what.equals("m")&&to_what.equals("cm")) {
			num=num*100;
			System.out.printf("%.3f",num);
			
		}else if(from_what.equals("cm")&&to_what.equals("m")) {
			num=num/100;
			System.out.printf("%.3f",num);
		}else if(from_what.equals("cm")&&to_what.equals("mm")){
			num=num*10;
			System.out.printf("%.3f",num);
		}else if(from_what.equals("mm")&&to_what.equals("m")) {
			num=num/1000;
			System.out.printf("%.3f",num);
		}else if(from_what.equals("mm")&&to_what.equals("cm")) {
			num=num/10;
			System.out.printf("%.3f",num);
		}
	}

}
