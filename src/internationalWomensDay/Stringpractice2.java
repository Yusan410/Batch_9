package internationalWomensDay;

public class Stringpractice2 {

	public static void main(String[] args) {

		String element = "abcdde";

		if (element.length() % 2 == 0) {

			System.out.println(element.length() / 2);

			System.out.println(element.charAt(element.length() / 2));
		}

		if (element.length() % 2 == 1) {
			
			System.out.println(element.length()/2);
			
			System.out.println(element.charAt(element.length()/2));

		}

	}

}
