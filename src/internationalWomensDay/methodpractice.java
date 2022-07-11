package internationalWomensDay;

import java.util.Arrays;

public class methodpractice {

	public static void main(String[] args) {

		mehhod();

		methodpractice m = new methodpractice();
		
		

		m.calculate(10, 20);

		String[] name = { "Yusan", "Samira", "Sazgur" };

		for (String a : name) {

			m.addition(a);
			
			

		}

	}

	public static void mehhod() {

		System.out.println("Yusan ali");
	}

	public void calculate(int a, int b) {

		int result = a + b;

		System.out.println(result);

	}

	public void addition(String str) {

		System.out.println("Hello " + str);

	}
	


}
