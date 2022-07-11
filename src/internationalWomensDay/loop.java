package internationalWomensDay;

import java.util.Arrays;

public class loop {

	
	public static void main(String[] args) {
		
		
		
		int num[] = {1,2,2,3,4,4,5,6,6,7};
		
		int len = num.length;
		
		int j=0;
		
		
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		for(int i = 0 ; i < len-1; i++) {
			
			//System.out.println(i);
			
			if(num[i]!= num[i+1]) {
				
				
				num[j++] = num[i];
				
				System.out.println(j);
			}
			
			//System.out.println(num[j]);
		}
		num[j++] = num[len-1];
		
		System.out.println(j);
		
		
	}
}
