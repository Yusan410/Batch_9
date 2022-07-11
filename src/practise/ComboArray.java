package practise;

import java.util.Arrays;

public class ComboArray {
	public static void main(String[] args) {
	
		
		
		
		
		int arr[] = {1,2,3,4,5};
		
		int arr1[] = {6,7,8,9,10};
		
         int arr2 []= new int [ arr.length+arr1.length];
        
         
         int position = 0;
         
         
         for(int i = 0 ; i < arr.length;i++) {
        	 
        	 
        	 arr2[position] = arr[i];
        	 position++;
        	 
        	 
         }
         
         System.out.println(Arrays.toString(arr2));
         
         for(int i = 0 ; i < arr1.length; i++) {
        	 
        	 arr2[position] = arr1[i];
        	 position++;
        	 
        	 
         }
         
         System.out.println(Arrays.toString(arr2));
	

	}
}
	
	
	
	

