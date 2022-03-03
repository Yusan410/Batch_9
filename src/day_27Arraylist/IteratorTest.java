package day_27Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        
		
		
		int count = 0;
		
		do {
			
			System.out.print(nums.get(count));
			System.out.print(",");
			count++;
			
		}while(count<nums.size());
		
		System.out.println();
		System.out.println();
		
		count = 0;
		
		
		
		while(count<nums.size()) {
			
			System.out.print(nums.get(count));
			System.out.print(",");
			count++;
			
			
		}
		
		for(Integer num:nums) {
			
			System.out.println(num);
			
			
		}
		
		
	}

}
