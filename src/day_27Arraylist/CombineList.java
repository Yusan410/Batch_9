package day_27Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineList {

	public static void main(String[] args) {
		
		
		
		
		
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		
		
		ArrayList<Integer> num2 = new ArrayList<>(num);
		
		ArrayList<Integer> num3 = new ArrayList<>();
		
		System.out.println(num3.size());
		
		System.out.println(num2.size());
		
		
		num3.addAll(num2);
		num3.addAll(num);
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println(num3);

		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
		
		
		ArrayList<String> list2= new ArrayList<>(Arrays.asList("e","f"));
		
		System.out.println(list1);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		
	}
}
