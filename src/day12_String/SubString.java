package day12_String;

public class SubString {
	public static void main(String[] args) {
		
		//string substring   
		             //012345678
		String word = "televesion";
		
		String word2 =word.substring(2,5);
		System.out.println(word2);
		
		System.out.println(word.substring(4));//vesion
		
		System.out.println(word.indexOf('o'));//8
		
		System.out.println(word.charAt(7));
		
		System.out.println(word.length());
		
		
		             // 012345678910
		String word3 = "yissan517@gmail.com";
		
		System.out.print(word3.substring(0,6));
		
				
		
		int startPosition =word3.indexOf('@')+1;
		int endposition =word3.indexOf('.');
		
		System.out.println(word3.substring(startPosition,endposition));
		
		
		String email2 = "yusan.samira.@techcircle.org";
		
		int b =email2.indexOf('"')+1;
		int e = email2.indexOf('.',b);
		
		
		
		String domailName = email2.substring(b,e);
		
		System.out.println(domailName);
		
	

		String email5 ="shafkat.ali@techcircle.org";
		
		System.out.println(email5.substring(0,7));
		System.out.println(email5.substring(8,11));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
