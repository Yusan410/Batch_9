package internationalWomensDay;

import java.util.HashSet;

public class uniqueChar {
	
	public static void main(String[] args) {
		
		
		String charcr = "aaaaaaaaaabbbbbbbbbbcccccccc";
		
		
		//i want to store only unique charractor
		
		String unique = "";
		
		
		for(int i = 0 ; i < charcr.length();i++) {
			
			char currencahr = charcr.charAt(i);
			
			
			String s  = String.valueOf(currencahr);
			
			//comprae 
			if(!unique.contains(s)) {
				
				unique += s;
			}
		}
		
		System.out.println(unique);
		
		
		
		
		
		
	}
	
	

}
