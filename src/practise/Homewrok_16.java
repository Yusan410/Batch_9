package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class Homewrok_16 {
	
	public static void main(String[] args) {
		
		/*Task1:
		Write a Java program to iterate through all elements in a array list
		Sample Output:

		Red                                                                    
		Green                                                                  
		Orange                                                                 
		White                                                                  
		Black 
	*/
	
		ArrayList<String>  str = new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));
		
		
		Iterator itr = str.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println(itr.next());
		}
		/*
		 * Task2:
		Write a Java program to update specific array element by given element.
		Sample Output:

			[Red, Green, Orange, White, Black]                                     
			[Red, Green, Yellow, White, Black] 
		 */
	
		ArrayList<String>  str1= new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black")); 
		
		
		
		str1.set(2, "Yellow");
		
		System.out.println(str1.toString());
		
		/*
		 * Task4:
		Write a Java program to remove the third element from a array list.
		Sample Output:

		[Red, Green, Orange, White, Black]     
		                                
		After removing third element from the list:                            
		[Red, Green, White, Black] 
		 */
		
		ArrayList<String>  str2= new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black")); 
		
			 str2.remove(2);
			 
			 System.out.println(str2.toString());
				/*
				 * Task6:
				Write a Java program to search an element in a array list.
				Sample Output:

				[Red, Green, Orange, White, Black]     
				                                
				
				looking for "Orange"
					"Found the element"
				
				looking for "Purple"
					"Element not found"
				 */
				
			 
			 ArrayList<String>  str3 = new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black")); 
			 
			 String lookigfor = "Orange";
			 String lookingfor1 = "purple";
			 
			 
			 if(str3.contains(lookigfor)) {
				 
				 System.out.println("Found the element");
				 
				 if(!str3.contains(lookingfor1)) {
					 
					 System.out.println("Elment not found ");
				 }
			 }
			 
		 }
	
	
	
	
}
	

	
	


