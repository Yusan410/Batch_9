package internationalWomensDay;

public class StringPractice {

	public static void main(String[] args) {

		String name = "Yusan";

		String reverse = "";

		// accseec last charctor first
		for (int i = name.length() - 1; i >= 0; i--) {

			reverse += name.charAt(i);

			

			// string. value of is convert the string
			
			//int a = 669;
			
			//String num = string.valueof(a);
			
			//System.out.prinln(a);
		}
		
		System.out.println(reverse.toLowerCase());

	}

}
