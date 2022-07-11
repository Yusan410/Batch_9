package practise;

import java.util.Scanner;

public class switchStatment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your month");

		int nums = scan.nextInt();

		String output = "";

		switch (nums) {

		case 1:

			output = "Januray";
			break;
		case 2:

			output = "Februray";

			break;
		case 3:

			output = "March";

			break;
		case 4:

			output = "Happy Birthday";

			break;
		case 5:

			output = "March";

			break;

		case 6:

			System.out.println("June");

			break;

		case 7:

			System.out.println("July");

			break;

		case 8:

			System.out.println("August");

			break;

		default:

			System.out.println("Please enter correct month");

		}
		
		System.out.println("You enterd "+output);

	}

}
