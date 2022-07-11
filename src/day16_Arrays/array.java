package day16_Arrays;

import java.util.Arrays;

public class array {
	
	
	public static void main(String[] args) {
		
		
	int arr[] = {2,2,1,3,4,4,5,6,6,7};
	
	
	int len = arr.length;
	
	int j =0;
	
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	
	for(int i = 0 ; i < len-1;i++) {
		
		
		if(arr[i] != arr[i+1]) {
			
			
			arr[j++] =arr[i];
			
			System.out.println(j);
		}
		
		
	}
	
	arr[j++] = arr[len-1];
	
	System.out.println(j);
		
	}

}
