package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
	
	public static void main(String[] args) {
		
		
		
		ArrayList <String> color = new ArrayList<>(Arrays.asList("Red","Green","orange","White","Black"));
		
		ArrayList<String> Str = new ArrayList<>();
		
		
		for (int i = color.size()-1; i>=0; i --) {
			
			
		Str.add(color.get(i));
		
	
		}	
		
		
		System.out.println(Str);
		
		
	}

}
