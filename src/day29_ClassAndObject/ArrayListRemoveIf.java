package day29_ClassAndObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveIf {
	
	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<Integer> Nums = new ArrayList<>();
		
		
		Nums.add(23);
		Nums.add(2);
		Nums.add(3);
		Nums.add(9);
		
		Nums.removeIf(n ->(n * 3==0));
		
		System.out.println(Nums);
		
		
		ArrayList <LocalDate> date = new ArrayList<>();
		
		date.add(LocalDate.of(1999, 10, 10));
		date.add(LocalDate.of(2000, 10, 10));
		date.add(LocalDate.of(2001, 10, 10));
		date.add(LocalDate.of(2002, 10, 10));
		date.add(LocalDate.of(2003, 10, 10));

		//date.removeIf(d ->d.isBefore(d)((LocalDate.of(2001, 10, 10))));
		date.removeIf(d -> d.isAfter((LocalDate.of(2001, 10, 10))));
		
		System.out.println(date);
		
		Integer num1 []= {1,2,3,4};
		Integer num2[] = {11,22,33,44};
		
		Integer num3[]= {111,222,333,444};
		
		
		
		
		
ArrayList<Integer[]>nums  = new ArrayList<>();

nums.add(num1);
nums.add(num2);
nums.add(num3);

System.out.println(Arrays.toString(nums.get(0)));



for(Integer[] integer :nums) {
	
	for(Integer a: integer) {
		
		System.out.println(a);
	}
	
	//System.out.println(Arrays.toString(integer));
}


String fruits[]= {"Apple","Banana","Orange","Pear"};
String names[]= {"Teccircle","Irfan","Java","Sdet"};
String cars []= {"Toyota","BMW","HONDA"};





ArrayList<String[]> str = new ArrayList<>();

str.add(cars);
str.add(fruits);
str.add(names);

//System.out.println(Arrays.toString(str.get(0)));

for(int i = 0 ; i <str.size(); i++) {
	
	System.out.println(Arrays.toString(str.get(i)));
	
	String Yusan[] = str.get(i);
	System.out.println(Arrays.toString(Yusan));
	
	for(int a = 0  ; a < Yusan.length; a ++) {
		
		System.out.println(Yusan[a]);
	}
	
}
		
		
	}

}
