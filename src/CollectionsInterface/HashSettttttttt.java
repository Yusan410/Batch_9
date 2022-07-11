package CollectionsInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSettttttttt {
	
	//class_6
	
	public static void main(String[] args) {
		
		
		
		String arr[] = { "JAVA", "SDET", "TECHCIRCLE" };// ARRAY OF STRING

		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

		list.add("SQL");

		System.out.println(list.size());//4

		System.out.println(list);

		list.addAll(list);

		System.out.println(list.size());///8

		System.out.println(list);// Duplicate
		
		List<String> unique = new ArrayList<>();
		
		for(String name : list) {
			
			System.out.println(name);
			
			if(!unique.contains(name)) {
				
				unique.add(name);
			}
		}
		
		System.out.println(unique);
		
		Set<String> list1 = new HashSet<>();// Hash set remove duplicate element
		
		list1.add("Yusan");
		list1.add("Samira");
		list1.add("Yusan");
		list1.add("Samira");
		list1.add("Yusan");
		list1.add("Samira");
		list1.add("Tech");
		list1.add("Tech");
		
		System.out.println(list1);
		
		HashSet<Integer> list2 = new HashSet<>(Arrays.asList(1,2,3,4,4,5,5,6,10,10,28,28));
		
		System.out.println(list2);
		
		
	}

}
