package day23_javaReview;

import java.util.Arrays;

public class Review {
	
	public static void main(String[] args) {
		//string split
	
	String str = "return 4 as the nww length of the array";
	

		String arr[] = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		for (String s : arr) {
			
			System.out.println(s);
		}
		String str2 = "YUSAN,yusan,YusAn";
		
		String arr2[] = str2.split(",");
		System.out.println(Arrays.toString(arr2));
		
		for (String a : arr2) {
			
			System.out.println(a);
			
			
			
			String email = "Samira@gmail.com";
			
			String arr3[] = email.split("@");
					
			
			System.out.println(Arrays.toString(arr3));
			
			
			
			
			
			
			
		}

	}

}
