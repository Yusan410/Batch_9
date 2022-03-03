package day12_String;

public class ChangingCase {
	public static void main(String[] args) {
		
		
		String word = "jAva";
		
		System.out.println(word.toLowerCase());
		
		word = word.toLowerCase();
		
		
		System.out.println(word);
		
		
		word=word.toUpperCase();
		System.out.println(word);
		
		String str1="yusan";
		String str2="YusAn";
		boolean result = str1.equals(str2);
        boolean result2 = str1.toLowerCase().equals(str2.toLowerCase());
        System.out.println(result);
        System.out.println(result2);
		
		
	}

}
