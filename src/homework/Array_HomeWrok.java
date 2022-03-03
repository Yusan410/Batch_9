package homework;

import java.util.Arrays;

public class Array_HomeWrok {
	public static void main(String[] args) {
		
//		Task1:
//		Given an array, the task is to reverse the given array in Java.
//		
//		Input : 1, 2, 3, 4, 5
//		Output :5, 4, 3, 2, 1
//
//		 
		int input[] = {20,30,40,50};
		
		int ouput[] = new int [input.length];
		
		int j  = input.length;
		
		for(int i = 0 ; i < input.length;i++) {
			
			j--;
			
			ouput[i] = input[j];
			
			//System.out.println(Arrays.toString(ouput));
			
		}
		
		 
		System.out.println(Arrays.toString(ouput));
	 
	 	}	
}
