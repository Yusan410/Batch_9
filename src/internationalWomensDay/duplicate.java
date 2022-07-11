package internationalWomensDay;

import java.util.Arrays;

public class duplicate {
	public static void main(String[] args) {
		
		
		int num[] = {0,0,0,0,1,2,3,4,5,5,6};
		
		
		int arr[] = new int[num.length];
		
		int position =0;
		
		
		for(int i = 0; i<num.length;i++) {
			
			if(num[i]!=0) {
				
				arr[position] = num[i];
						position++;
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		String name = "YusanAli";
		
		String reverse = "";
		
		for(int i = name.length()-1;i>=0; i--) {
			
			
		  reverse += name.charAt(i);
		}
		
		System.out.println(reverse);

	}

}
