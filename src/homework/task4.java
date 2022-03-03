package homework;

import java.util.Arrays;

public class task4 {
	public static void main(String[] args) {
		
//		Task4:
//		Write a Java program to sort a numeric array and a string array.
//	    int[] my_array1 = {
//	            1789, 2035, 1899, 1456, 2013, 
//	            1458, 2458, 1254, 1472, 2365, 
//	            1456, 2165, 1457, 2456};
//	            
//	    String[] my_array2 = {
//	            "Java",
//				
//	            "Python",
//	            "PHP",
//	            "C#",
//	            "C Programming",
//	            "C++",
//		        "Jenkins",
//		        "SQL"
//	        };
		
		
		int arr[] = { 1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
                 1456, 2165, 1457, 2456};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		String arrr[] = {"Java",
				
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++",
		        "Jenkins",
		        "SQL"};
		
		Arrays.sort(arrr);
		
		System.out.println(Arrays.toString(arrr));
		
		
	       
		
		
	}

}
