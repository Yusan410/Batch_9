package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber_2 {

	public static void main(String[] args) {

		System.out.println("input the limit");
		Scanner scan = new Scanner(System.in);

		int limit = scan.nextInt();

		List<Integer> primenumber = new ArrayList();

		for (int nums = 2; nums <= limit; nums++) {

			boolean isprime = true;

			for (int factor = 2; factor <= nums / 2; factor++) {

				if (nums % factor == 0) {

					isprime = false;

					break;

				}

			}

			if (isprime) {

				primenumber.add(nums);

			}

		}

		for (int number : primenumber) {

			System.out.println(number);
		}

	}

}
