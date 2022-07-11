package internationalWomensDay;

import java.util.Arrays;

public class Arrayyysssss {
	
	
	public static void main(String[] args) {
		
		
		
		Arrayyysssss mb = new Arrayyysssss();
		
	 mb.uniquechar("aaabbbccc");
	    
	    
	    
	   
		
//		 After moving 0's to the end of the array:                              
//		 1  3  5  6  0  0  0  0  0 
		int[] num = {0,0,1,0,3,0,1,0,6};
		
		int result[] = new int [num.length];
		
		int index =0;
		
		for(int i = 0 ; i < num.length; i++) {
			
			
			if(num[i] != 0) {
				
				result[index]=num[i];
				
				index++;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		int arr[] = { 1,9,8,7, 8, 4,2, 7, 9, 2, 3,142 };
		
		int maxvalue = arr[0];
		
		int minvalue =arr[0];
		
		for(int i = 0 ; i < arr.length;i++) {
			
			
			if(arr[i]>maxvalue) {
				
				maxvalue=arr[i];
				
				
			}else if(arr[i] < minvalue) {
				
				
			}
			
			
		}
		
		
		System.out.println("MaxValue is " +maxvalue);
		
		System.out.println("Minvalue is " +minvalue);
		
		
		

}
	
	public void uniquechar(String current) {
		
		
		String uqine = "";
		
		
		for(int i = 0 ; i < current.length();i++ ) {
			
			char currentChar = current.charAt(i);
			
			String s = String.valueOf(currentChar);
			
			if(!uqine.contains(s)){
				
				uqine += s;
			}
		}
		
		System.out.println(uqine);
		
	}
}
