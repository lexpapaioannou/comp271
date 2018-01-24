import java.util.Random;
import java.util.Scanner;

public class PSR {
	static Random rn = new Random();

	public static char getCompVal() {
		char foo = 'r';
		int i = rn.nextInt(3);
		switch (i) {
		case 0:
			foo = 'r';
		case 1:
			foo = 's';
		case 2:
			foo = 'p';
		}
		return foo;
	}

	public static void rerun() {
		System.out.println("\n\nOn the count of three, you'll choose");
		System.out.println("For Rock type r, For Scissors type s, For Paper type p.");
		System.out.println("To quit press q,\n1..2..3..");
	}

	public static void main(String[] args) {
		char computerValue;
		char userValue = 'q';
		Scanner scan = new Scanner(System.in);
		System.out.println("We are going to play a game!");
		System.out.println("Rock, Scissors, Paper!");
		while (userValue == 'q') {
			rerun();
			userValue = scan.next().charAt(0);
			computerValue = getCompVal();
			if (computerValue == userValue) {
				System.out.println("TIE!");
			} else if (userValue == 'q') {
				System.out.println("Bye Felicia");
			} else {
				if (computerValue == 'r') {
					if (userValue == 's') {
						System.out.println("You Lose, Rock beats Scissors.");
					} else {
						System.out.println("You Win, Paper beats Rocks.");

					}
				}
				if (computerValue == 's') {
					if (userValue == 'r') {
						System.out.println("You Win, Rock beats Scissors.");

					} else {
						System.out.println("You Lose, Scissors beat Paper.");

					}
				}
				if (computerValue == 'p') {
					if (userValue == 'r') {
						System.out.println("You Lose, Paper beats Rocks.");
					} else {
						System.out.println("You Win, Scissors beats Paper.");
					}
				}
			}
		}
	}
}
