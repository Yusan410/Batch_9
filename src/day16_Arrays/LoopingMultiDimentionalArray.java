package day16_Arrays;

import java.util.Arrays;

public class LoopingMultiDimentionalArray {

	public static void main(String[] args) {
		int numarr1[] = { 1, 2, 3, 4, 5 };

		int numarr2[] = { 11, 22, 33, 44, 55 };

		int numarr3[] = { 111, 222, 333, 444, 555, 666 };
		
		
		int nums[][] = {numarr1,numarr2,numarr3};
		
		for (int i = nums.length-1; i >= 0; i --) {
			
			System.out.println(Arrays.toString(nums[i]));
			
			
			
			for (int j = nums[i].length-1; j >= 0 ; j --) {
				
				System.out.println(nums[i][j]);
				
				
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
