package day35_exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIndexIssue {
	public static void main(String[] args) {
		
		
		
		try {
		ArrayList<String> friuts = new ArrayList<>(Arrays.asList("Apple","pear","orange"));
		
		
		System.out.println(friuts.get(4));
		}catch(Exception e) {
			
			
			e.printStackTrace();
			
			
		}
		
		System.out.println("After exceptions handling");
		
	}

}
