package internationalWomensDay;

import java.util.ArrayList;
import java.util.Arrays;

public class HandleeXCEPTION {
	public static void main(String[] args) {
		
		try {
			
			ArrayList<String>fruits= new ArrayList<>(Arrays.asList("Apple","Banana","Grape"));
			
			System.out.println(fruits.get(4));
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			
			
			
			
			
		}
		
		System.out.println("After Exception handling");
		
	}

}
