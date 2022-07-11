package internationalWomensDay;

public class FeRequncyElement {

	public static void main(String[] args) {
		// 1,

		/*
		 * input = aaabbbbccccccccdddddd char frequency of 'a' output : 3
		 * 
		 * returns the frequency of given char from the given string, as int
		 */
		String a = "aaabbbbccccccccdddd";

		char c = 'a';

		int b = 0;

		for (int i = 0; i < a.length(); i++) {

			if (c == a.charAt(i)) {

				b++;
			}

		}

		System.out.println(b);
	}

}
