package day12_String;

import java.util.Arrays;

public class practicess {
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5};
		
		int arr1[] = {6,7,8,9,10};
		
		int Narr[] = new int [arr.length+arr1.length];
		
		int position =0;
		
		
		for(int i =0; i < arr.length;i++) {
			
			Narr[position] =arr[i];
			position++;
		}
		for(int i =0; i< arr1.length;i++) {
			
			Narr[position] = arr1[i];
			
			position++;
		}
		
		System.out.println(Arrays.toString(Narr));
		
		for(int j = Narr.length-1; j >=0; j--) {
			
			System.out.print(" "+Narr[j]);
		}
		
		
	
			}
			
			
		}
		
		
