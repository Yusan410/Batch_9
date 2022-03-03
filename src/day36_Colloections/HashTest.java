package day36_Colloections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		
		
		String [] topic = {"JAVA","SDET","TECHCIRCLE"};
		
		
		
		ArrayList <String> names = new  ArrayList<>(Arrays.asList(topic));
		
		names.add("ali");
		
		System.out.println(names.size());
		System.out.println(names);
		
		names.addAll(names);
		
		System.out.println(names.size());
		System.out.println(names);
		
		
		List<String> uni = new ArrayList<>();
		
		for (String a : names) {
			
			System.out.println(a);
			
			if (!uni.contains(a)) 
			uni.add(a);{
				
				
			}
			
		}
		
		
		System.out.println(uni);
		
		
		Set<String> list1 = new HashSet<>();
		
		list1.add("Techcircle");
		list1.add("Techcircle");
		list1.add("Techcircle");
		list1.add("Techcircle");
		list1.add("Techcircle");
		list1.add("ALI");
		list1.add("ALI");
		list1.add("ALI");
		
		list1.add("Techcircle");System.out.println(list1);
		
		HashSet<String> lis2 = new HashSet<>();
		
		Collection <String> list4 = new HashSet<>();
		
		for (String name : names ) {
			
			lis2.add(name);
			list4.add(name);
		}
		
		System.out.println(lis2);
		
		System.out.println(list4);
		
		
	}
	
	

}
