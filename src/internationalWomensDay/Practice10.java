package internationalWomensDay;

public class Practice10 {

	public static void main(String[] args) {

		Practice10 m = new Practice10();

		String str = "Yuuusaaaaaaaaaan";
		char target = 'a';

		System.out.println(m.frequncyOfchar(str, target));

	}

	public int frequncyOfchar(String str, char target) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (target == str.charAt(i)) {

				target = str.charAt(i);
				count++;
			}
		}

		return count;
	}
}
