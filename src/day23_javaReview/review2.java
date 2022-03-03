package day23_javaReview;

import java.util.Arrays;

public class review2 {
	public static void main(String[] args) {
		//how to convert string to integer and itner to string 
		String abc = "Yusan";
		
		System.out.println(abc.contains("a"));
		
		int [] nums = {20,20,30,40,50,50,50};
		
		String str = "";
		
		for(int a = 0 ; a < nums.length;a++) {
			
			String num = nums[a]+"";
			
			System.out.println(num);
			
			if(!str.contains(num)) {
				
				str += num+",";
			}
			
		}
		
		
		System.out.println(str);
		
		String numarr[] = str.split(",");
		System.out.println(Arrays.toString(numarr));
		
		
		int newIntarr[] = new int[numarr.length];
		
		System.out.println(Arrays.toString(newIntarr));
		
		for ( int i = 0 ; i < numarr.length;i++) {
			
			int numb = Integer.parseInt(numarr[i]);
			
			newIntarr[i] = numb;
			
			
		}
		
		
		System.out.println(Arrays.toString(newIntarr));
		
	}

}
