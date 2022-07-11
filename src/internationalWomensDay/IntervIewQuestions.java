package internationalWomensDay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntervIewQuestions {
	public static void main(String[] args) {

		// Write a function that can find the maximum number from an int Array

		// Write a function that can find the maximum number from an int Array

		int arr[] = { 22, 33, 55, 100, 200, 300, -8 };

		int maxvalue = arr[0];

		int minvalue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (maxvalue < arr[i]) {

				maxvalue = arr[i];
			} else if (minvalue > arr[i]) {

				minvalue = arr[i];
			}

		}
		System.out.println("Max Value is" + maxvalue);

		System.err.println("Minvalue is" + minvalue);

		String arr1[] = { "Hello", "Hello", "World", "SDET", "Chelsea", "Chelsea" };

		Set<String> store = new HashSet<String>();

		for (String a : arr1) {

			// System.out.println(a);

			if (store.add(a) == false) {
				System.out.println(a);

			}

			int nnnn[] = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };

			Set<Integer> aaa = new HashSet<Integer>();

			for (Integer l : nnnn) {

				aaa.add(l);

			}
			System.out.println(aaa);
		}
		
	int arrr[] = {1,2,3,4,5};
	
	int arr2[] = {6,7,8,9,10};
	
	
	int input[] = new int[arrr.length+arr2.length];
	
	int temp =0;
	
	for(int i = 0 ; i < arrr.length;i++) {
	
		
		input[temp] = arrr[i];
		temp++;
	   
	  
	}

	 System.out.println("#############################");
	   
	 
	   
	   for(int j = 0 ; j < arr2.length;j++) {
		   
		   input[temp] = arr2[j];
			temp++;
		   
	   }
	
	   System.out.println(Arrays.toString(input));
	}
}