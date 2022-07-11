package day28_ArrayList_rEVIEW;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtracNumberFromString {

	public static void main(String[] args) {
		
		
		
		String str = "abc123567def";
		
		String digit = "";
		
		//String letter = "";
		
		char chars[] = str.toCharArray();
		
		//ArrayList<Character> list = new ArrayList<>();
		
		
		for(char c: chars) {
			
			if(Character.isDigit(c)) {
				
				digit+=c;
				
						
			
			
		}
			
			
			
		
			
		}
			System.out.println(digit);
		
	}
	

	
	
	
}
	

