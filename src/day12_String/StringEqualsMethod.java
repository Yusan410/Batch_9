package day12_String;

public class StringEqualsMethod {

	public static void main(String[] args) {
		
		
		// capital letters
		
		
		String str1="java";
		String str2="JAVA";
		String str3 ="Java";
		String str4 = "JAVA";
		
		System.out.println(str1.equals(str4));//false
		System.out.println(str2.equals(str4));//true
		
		System.out.println(str1.equalsIgnoreCase(str4));//true same value

	}

}
