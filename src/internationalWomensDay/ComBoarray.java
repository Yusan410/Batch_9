package internationalWomensDay;

import java.util.Arrays;

public class ComBoarray {
	
	public static void main(String[] args) {
		
		
		
		int num[] ={1,2,3,4,5};
		
		int num1[] = {6,7,8,9,10};
		
		int arr[] = new int[num.length+num1.length];
		
		int j =0;
		
		for(int i = 0 ; i < num.length;i++) {
			
			
			arr[j++]=num[i];
			   
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int a = 0 ; a < num1.length;a++) {
			
			arr[j++] = num1[a];
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

}
