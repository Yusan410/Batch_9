package InterviewQuestions;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {

		System.out.println(findPrimes(1, 16)); // findPrimes(1,16)

	}

	public static ArrayList<Integer> findPrimes(int start, int end) {

		ArrayList<Integer> primes = new ArrayList<Integer>();

		for (int n = start; n < end; n++) {
			
			//System.out.println(n);

			boolean prime = true;

			int i = 2;

			while (i <= n / 2) {

				if (n % i == 0) {

					prime = false;
					break;

				}

				i++;
			}

			if (prime) {

				primes.add(n);

			}

		}

		return primes;

	}

}
