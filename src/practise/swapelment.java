package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapelment {
	
	public static void main(String[] args) {
		
		
		
		
		
	String arr[] = {"Red","Green","Black","White","pink"};
	
	
	
	
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	
	
	ArrayList<String> color = new ArrayList<>(Arrays.asList("Red","Green","Black","White","pink"));
	
	color.set(0, "Black");
	
	color.set(2, "Red");
	
	System.out.println(color);
	}

}
