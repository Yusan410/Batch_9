package homework;

import java.util.Arrays;

public class task3 {
	public static void main(String[] args) {
		

//		Task3:
//			Write a Java program to calculate the average value of array elements.
//			
//			 int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
//		
//		Sample Output:
//
//			Average value of the array elements is : 7.0 
		
		
		int [] nums = new int[] {20,30,25,35,-16,60,-100};
		
		double avg = 0;
		
		for(int i = 0 ; i < nums.length; i ++) {
			
			avg += nums[i];
			
			//avg /= nums.length;
			
			
		}
		avg /= nums.length;
		System.out.println(Arrays.toString(nums));
		
		System.out.println(avg);
		
	}
	//System.out.println(avg);
}
