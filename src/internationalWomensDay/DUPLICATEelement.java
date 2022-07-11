package internationalWomensDay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DUPLICATEelement {
	
	public static void main(String[] args) {
		
		
		int arr[] = {1,1,2,2,4,4,5,3,3,6,6,7,7};
		
		
		
		Set<Integer> arrr = new HashSet<>();
		
		for(Integer a: arr) {
			
			System.out.println(a);
			
			arrr.add(a);
		}
		
		System.out.println(arrr);
		
		int arr1[] = {0,0,0,0,1,2,3,4,5};
		
		int temp[] = new int[arr1.length];
		
		int num = 0;
		
		
		for(int i =0 ; i< arr1.length;i++) {
			
			
			if(arr1[i] != 0 ) {
				
				temp[num++] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		
		String name = "YusanAli";
		
		String name1 = " ";
		
		for(int i = name.length()-1; i >= 0; i--) {
			
			
			name1 += name.charAt(i);
			
		}
		
		System.out.println(name1);
	}
}
