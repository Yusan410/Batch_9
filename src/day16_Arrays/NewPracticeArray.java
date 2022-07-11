package day16_Arrays;

import java.util.Arrays;

public class NewPracticeArray {
	public static void main(String[] args) {
		
		
		int score[] = {12,13,14,15};
		
		
		System.out.println(score.length);
		
		// we can assignd with index number ;
		
		
	score[1] = 55;
	
	System.out.println(Arrays.toString(score));
	
	
	int nums[] = {22,33,44,55};
	
	for(int i = nums.length-1; i >= 0; i-- ) {
		
		System.out.print(nums[i]);
		
		if(i !=0) {
			
			System.out.print(",");
		}
		
	}
	}
		
	}


