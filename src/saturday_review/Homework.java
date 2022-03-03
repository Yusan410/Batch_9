package saturday_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework {
	public static void main(String[] args) {

		// *Task1:
		// Write a Java program to iterate through all elements in a array list
		// Sample Output:
		// Red
		// Green
		// Orange
		// White
		// Black

		ArrayList<String> str = new ArrayList<>(Arrays.asList("Red", "Green", "Orange", "White", "Black"));

		Iterator itr = str.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		
		//Task2
		
		 // Write a Java program to update specific array element by given element.
	       // Sample Output:
	            //[Red, Green, Orange, White, Black]                                     
	            //[Red, Green, Yellow, White, Black] 
		
		ArrayList<String> str1 = new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));
		
		System.out.println(str1);
		
		str1.set(2, "Yellow");
		
		System.out.println(str1);
		
		

	    /*
	     * Task4: Write a Java program to remove the third element from a array list.
	     * Sample Output:
	     * 
	     * [Red, Green, Orange, White, Black]
	     * 
	     * After removing third element from the list: [Red, Green, White, Black]
	     */
		ArrayList<String> str2 =new ArrayList<>(Arrays.asList("Red","Green","Orange","White","Black"));
		
		System.out.println(str2);
		
		str2.remove(2);
		
		System.out.println(str2);
		
		
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
		
		String color[]= {"Red","Green","Orange","White","Black"};
		
		ArrayList<String> color1= new ArrayList<String>(Arrays.asList(color));

		String found = "Black";
		
		String element = "Purple";
		
		
		if(color1.contains(found)) {
			
			System.out.println("Found the element");
			
			if(!color1.contains(element)) {
				
				System.out.println("element not found");
				
				/*
				 * Task5: Write a Java program to sort a given array list. Sample Output:
				 * 
				 * List before sort: [Red, Green, Orange, White, Black] List after sort: [Black,
				 * Green, Orange, Red, White]
				 * 
				 */
				
				
				String arr[]= {"Red","Green","Orange","White","Black"};
				
				
				ArrayList<String> str3 = new ArrayList<>(Arrays.asList(arr));
				
				
				
				Arrays.sort(arr);
				
				System.out.println(Arrays.toString(arr));
				
				
				
				
				
				
				
			}
		}

			}
		

	}
	

	
	
	
	
	
	

	


