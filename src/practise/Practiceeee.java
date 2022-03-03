package practise;

import java.util.Arrays;

public class Practiceeee {
	public static void main(String[] args) {
		
//		Task8:
//		Write a Java program to find the maximum and minimum value of an array.
//		
//		Original Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]                                                     
//				 Maximum value for the above array = 77                                                                       
//				 Minimum value for the above array = 14 
		
		int arr[] = {25,14,56,15,36,56,77,18,29,49,100};
		
		int maxnumber =arr[0];
		
		int minnumber = arr[0];
		
		for(int i = 0 ; i < arr.length; i ++) {
			
			
			if(maxnumber< arr[i]) {
				
				maxnumber = arr[i];
				
				
				}
			
			if(minnumber > arr[i]) {
				
				minnumber =arr[i];
			}
			
		}
		
		System.out.println("maxnumber is :"+maxnumber);
		
		System.out.println("minnumber is: "+minnumber);
		
	}
	
	
	}

	

