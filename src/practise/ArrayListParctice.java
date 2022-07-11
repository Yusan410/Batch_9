package practise;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListParctice {
	
	public static void main(String[] args) {
		

		String fruits[] = {"Apple","Banana","Orange","Pear","Mango"};
		String names[] = {"TechCircle","Irfan","Java","SDET"};
		String cars[] = {"Tesla","BMW","Honda"};
		
		ArrayList<String[]> namelist = new ArrayList<>();
		
		namelist.add(fruits);
		namelist.add(cars);
		namelist.add(names);
		
		
		
		//System.out.println(namelist.toString());
		
		for(int i = 0; i < namelist.size(); i++) {
			
			
			
			String[] element = namelist.get(i);
			
			
			System.out.println(Arrays.toString(element));
			
			
			for(int a = 0 ; a < element.length;a++) {
				
				
				System.out.println(element[a]);
				
				
			}
			
			 
		}
	}
}




