package practise;

import java.util.Arrays;

public class hhhhhh {
	
	public static void main(String[] args) {
		
		int arr[] = {2,0,4,6,0,0,0};
		
		int num[] = new int[arr.length];
		
		int positios=0;
		
		for(int i =0; i< arr.length;i++) {
			
			if (arr[i] !=0) {
				
				num[positios] =arr[i];
				
				positios++;
			}
			
			
		}
		
		System.out.println(Arrays.toString(num));
		
		
	}

}
