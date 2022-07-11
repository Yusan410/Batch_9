package CollectionsInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest_1 {

	public static void main(String[] args) {
		
		
		

		String arr[] = { "JAVA", "SDET", "TECHCIRCLE" };// ARRAY OF STRING

		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

		list.add("SQL");

		System.out.println(list.size());//4

		System.out.println(list);

		list.addAll(list);

		System.out.println(list.size());///8

		System.out.println(list);// Duplicate
		
		list.clear();
		
		Collection<String> name = new ArrayList<>(Arrays.asList(arr));
		
		name.add("JDBC");
		
		name.addAll(name);
		
		//name.clear();
		
		//boolean result = name.isEmpty();
		
		//System.out.println(result);
		
   List<String> name1 = new ArrayList<>(Arrays.asList(arr));
		
		name1.add("JDBC");
		
		name1.addAll(name1);
		
		
		for(int i = 0 ; i < name1.size();i++) {
			
			System.out.println(name1.get(i));
		}
		
		for(String a : name1) {
			
			System.out.println(a);
		}
		
		Iterator itr = name1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		Collection<Integer> nums = new LinkedList<>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums.size());
		
		Collection<Animal_2> animals = new LinkedList<>();
		
		animals.add(new Dog_3());
		animals.add(new Dog_3());
		animals.add(new Dog_3());
		animals.add(new Shark_4());
		
		for(Animal_2 a:animals) {
			
			a.makesound();
			a.move();
			
			
			
			
		}
			
		}
		}
		
	



