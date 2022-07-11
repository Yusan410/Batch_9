package day_27Arraylist;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		// arrayslist

		ArrayList<String> names = new ArrayList<>();

		names.add("Yusan");
		names.add("Hasan");

		names.add("Samira");

		names.add("Dilbar");
		
		

		System.out.println(names.size());
		System.out.println(names.get(0));

		System.out.println(names.get(1));

		System.out.println(names.get(2));
		System.out.println(names.get(3));

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 1; i < 11; i++) {

			numbers.add(i);

		}//.remove

		System.out.println(numbers);

		numbers.set(2, 30);

		System.out.println(numbers);
		numbers.remove(2);

		System.out.println(numbers);
		
		System.out.println(numbers.size());
		
		numbers.remove(8);
		System.out.println(numbers);
		
		numbers.remove(numbers.size()-1);//same result
		
		System.out.println(numbers);
		
		ArrayList<String> grocerylist = new ArrayList<>();
		
		grocerylist.add("water");
		
		grocerylist.add("bread");
		
		grocerylist.add("milk");
		
		grocerylist.add("egg");
		
		
		grocerylist.set(0, "soda");
		
		System.out.println(grocerylist);
		
		grocerylist.remove(0);
		
		System.out.println(grocerylist);
		
		
		grocerylist.remove(grocerylist.size()-1);
		
		System.out.println(grocerylist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
