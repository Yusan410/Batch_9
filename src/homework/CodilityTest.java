package homework;

public class CodilityTest {
	public static void main(String[] args) {
		
		/*
	     * That, given positive Integer N, Points the consecutive numbers from 1 to N,
	     * each on a separate line, However, and number divisible by 2, 3, 5, should be
	     * replaced by the word Codility, Test, Coders respectively.
	     * 
	     * If the number divisible by more than one if the numbers: 2,3 or 5, it should
	     * be replaced by a concatenation of the respective words Codility, Test, and
	     * Coders in the given order. For example, numbers divisible by both 2 and 3
	     * should be replaced by CodilityTest and numbers divisible by all three
	     * numbers: 2,3, and 5, should be replaced by CodilityTestCoders. For example,
	     * here is the output for 24: 
	     *
	     * 
	     */ 
		
		String str1 = "Codility";
		String str2 = "Test";
		String str3 = "Coders";
		
		
		
		for(int i = 1; i < 31 ; i++) {
			
			String output = "";
			
			
			if (i % 2 == 0) {
//				System.out.println(str1);
				output = str1;
			}
			
			if (i % 3 == 0) {
//				System.out.println(str1);
				output = str2;
			}
			
			if (i % 5 == 0) {
//				System.out.println(str1);
				output = str3;
			}
			
			
			if (i% 2 == 0 && i % 3 == 0) {
				output = str1+str2;
			}
			
			if (i% 2 == 0 && i % 5 == 0) {
				output = str1+str3;
			}
			
			
			if (i% 3 == 0 && i % 5 == 0) {
				output = str2+str3;
			}
			
			if (i% 2 == 0 && i% 3 == 0 && i % 5 == 0) {
				output = str1 + str2+str3;
			}
			
			
			if (output != "") {
				System.out.println(output);
			}else {
				System.out.println(i);
			}
			
			
			
		
	}
	
	
	

}
}