package day36_Colloections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
public static void main(String[] args) {
	
	
	String [] topic = {"JAVA","SDET","TECHCIRCLE"};
	
	ArrayList <String> names = new  ArrayList<>(Arrays.asList(topic));
	
	names.add("ali");
	
	System.out.println(names.size());
	System.out.println(names);
	
	names.addAll(names);
	System.out.println(names.size());
	System.out.println(names);
	names.clear();
	
	Collection<String> names2 = new ArrayList<>(Arrays.asList(topic));
	
	names2.add("JDBC");
	
	names2.addAll(names2);
	
	System.out.println(names2.size());
	System.out.println(names2);
	names2.clear();
	
	List<String> names3 = new ArrayList<>(Arrays.asList(topic));
	
	names3.add("JDBC");
	names3.addAll(names3);
	
	System.out.println(names3.size());
	System.out.println(names3);
	
	for (int i = 0 ; i < names3.size(); i++) {
		
		System.out.println(names3.get(i));
		//System.out.println("====================");
		
	}
	for (String name : names3) {
		
		System.out.println(name);
	}
	
	
	System.out.println("-------------------------------");
	
Iterator itr = names3.iterator();

while (itr.hasNext()) {
	
	System.out.println(itr.next());
}
//LinkedList
Collection<Integer> nums = new LinkedList<>();

nums.add(1);
nums.addAll(Arrays.asList(1,2,3,4,5));


Collection <Animal>  animal = new LinkedList<>();

//animal.add(new Dog());

animal.add(new Dog());

//animal.add(new Shark());

animal.add(new Dog());

animal.add(new Shark());


for (Animal a : animal) {
	
	a.move();
	a.walk();
}


	
}





















}
	
	

