package day_27Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class IteratorTest2 {
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
		
		
		
		
		Iterator i = nums.iterator();
		
		
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		
		
	}
	
	

}
