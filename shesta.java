package programming_basics;

import java.util.Scanner;

public class shesta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int key = Integer.parseInt(input.nextLine());
        boolean flag = false;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (a + b + c == key) {
                        if (a < b && b < c ) {
                            System.out.printf("%d + %d + %d = %d%n",a,b,c,key);
                            flag = true;
                        }
                    }
                    if (a * b * c == key) {
                        if (a > b && b > c) {
                            System.out.printf("%d * %d * %d = %d%n",a,b,c,key);
                            flag = true;
                        }
                    }

                }
            }
        }
        if (!flag) {
            System.out.println("No!");
        }
	}

}
