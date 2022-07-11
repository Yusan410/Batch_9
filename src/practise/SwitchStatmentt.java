package practise;

import java.util.Scanner;

public class SwitchStatmentt {

	public static void main(String[] args) {

		int score;

		char grade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your score");

		score = scan.nextInt();

		if (score >= 90) {

			grade = 'A';

		} else if (score >= 80) {

			grade = 'B';

		} else if (score >= 70) {

			grade = 'C';

		} else if (score >= 60) {

			grade = 'D';

		} else {

			grade = 'F';
		}

		scan.close();

		System.out.println("Your grade is " + grade);
		System.out.println("Your scre is " + score);

	}
}
