package CollectionsInterface;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListTest {

	// class_5

	public static void main(String[] args) {

		Queue<Integer> list = new LinkedList<>();
		
		//first in //first out 
		
		

		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		System.out.println(list.peek());
		
	   list.remove();//first out 
	
	    System.out.println(list);
		
		// list.peek(); peek mean is head of element // get first element

		//list.offer(4);// offer mean is add for Queue
		//list.remove();
		//list.poll();// pool mean is remove for Queue
		
		

		//System.out.println(list);
		
		LinkedList<Double> listt = new LinkedList<>();
		
		listt.add(1.3);
		listt.add(2.3);
		listt.addFirst(0.1);//apply for linked list
		listt.addLast(4.0);//apply for linked list
		
		//remove first //remove last
		
		//listt.removeLast();

		System.out.println(listt);
		
		Queue<Integer> nums = new PriorityQueue<>();
		
		nums.add(2);
		nums.offer(3);
		nums.offer(4);
		System.out.println(nums);
		System.out.println(nums.element());//heade
		
		
		
	}

}
