package day12_String;

public class StringReplace {
	public static void main(String[] args) {
		
		//  String .replace  word 2 is cat      word 1 still 1
		
		String word1 ="prgramming";
		String word2 =word1.replace('m','l'); 
		System.out.println(word1);
		System.out.println(word2);
		
		
		
		
		String str = "House,Mostly Along Party Lines ,Censures Gosar For Violent";
		
		String str2 = str.replace("House", "Yusan");
		System.out.println(str);
		System.out.println(str2);
		
		String str3 = str.replace("       ", "");
		System.out.println(str3);
	}

}
