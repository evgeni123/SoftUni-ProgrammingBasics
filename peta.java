package programming_basics;

import java.util.Scanner;

public class peta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int width = Integer.parseInt(input.nextLine());
        int length = Integer.parseInt(input.nextLine());
        int height = Integer.parseInt(input.nextLine());
        int roomSize = width * height * length;
        int spaceTakenFromPc = 0;
        String command = input.nextLine();
        while (!command.equals("Done")) {
            spaceTakenFromPc += Integer.parseInt(command);
            if (spaceTakenFromPc > roomSize) {
                break;
            }

            command = input.nextLine();
        }
        if (roomSize - spaceTakenFromPc >= 0) {
            System.out.printf("%d Cubic meters left.%n",roomSize - spaceTakenFromPc);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(roomSize - spaceTakenFromPc));
        }
	}

}
