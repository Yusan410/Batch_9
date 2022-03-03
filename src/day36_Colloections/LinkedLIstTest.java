package day36_Colloections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedLIstTest {
	public static void main(String[] args) {
		
		Queue <Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		
		list.offer(4);
		
		list.remove();
		
		System.out.println(list);
		
		list.peek();
		System.out.println(list);
		
		list.poll();
		
		System.out.println(list);
		
		
	LinkedList<Double> list2 = new LinkedList<>();
	
	list2.add(1.4);
	list2.add(3.3);
	list2.add(1.7);
	list2.add(0.1);
	System.out.println(list2);
	
	//priorityQueue//
	
		Queue <Integer> nums = new PriorityQueue<>();
		
		nums.offer(1);
		nums.offer(2);
		nums.offer(3);
		nums.offer(4);
		
		
		nums.addAll(Arrays.asList(5,6,7,8));
		
		
		System.out.println(nums.peek());
		
		System.out.println(nums.element());
		
		nums.remove();
		nums.poll();
		
		System.out.println(nums);
		
	//	Iterator kk = nums.iterator();
	 
		
		//while(kk.hasNext()) {
			
			
			//System.out.println(kk.next());
		
		
			
			
		}
		
		
		
		}
	
	
	
	
		
		
		
		
		
	


