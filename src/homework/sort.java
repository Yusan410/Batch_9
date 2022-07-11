package homework;

import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		
		
		
		
		int arr[] = {12,1,3,4,66,77,34};
		
		int maxvalue =0;
		
		for(int i = 0 ; i <arr.length;i++) {
			
			
			if(arr[i]>maxvalue) {
				
				
				maxvalue = arr[i];
				
			}
			
			//System.out.println(maxvalue);
		}
		
		System.out.println(maxvalue);
	}

}
