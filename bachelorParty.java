package programming_basics;

import java.util.Scanner;

public class bachelorParty {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int performerMoney = Integer.parseInt(s.nextLine());

        String command = s.nextLine();

        int count = 0;
        int pricePerGuest = 0;
        int diff = 0;
        int totalMoney = 0;
		int minut=0;
		int monet=0;
		int total=0;
		int tutal=0;
        while (!command.equals("The restaurant is full")) {
            int guests = Integer.parseInt(command);

            if (guests < 5) {
                pricePerGuest = 100;
                minut=guests*pricePerGuest;
                total+=minut;
            } else {
                pricePerGuest = 70;
                monet=guests*pricePerGuest;
                tutal+=monet;
            }

            count += guests;

            totalMoney = total+tutal;

            diff = Math.abs(totalMoney - performerMoney);
            command = s.nextLine();
        }
		if (diff >= performerMoney) {
            System.out.printf("You have %d guests and %d leva left.", count, diff);
        } else {
            System.out.printf("You have %d guests and %d leva income, but no singer.", count, totalMoney);
        }

    }
}


