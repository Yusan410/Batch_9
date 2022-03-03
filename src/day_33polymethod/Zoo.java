package day_33polymethod;

import java.util.ArrayList;

public class Zoo {
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		//Animal a =new Cat();
		
		
		//test(a);
		
		
		
		
		Horse s = new Horse();
		
		//Animal b = new Horse();
		//b.walk();
		//b.makesound();
		
		
		//test(b);
		
		Dog D= new Dog();
		
		//Animal e = new Dog();
		
		//e.makesound();
		//e.walk();
		
		
	 //test(e);
		
		
		ArrayList<Animal>list = new ArrayList<>();
		
		list.add(c);
		list.add(D);
		list.add(s);
		
		
		for (Animal a: list) {
			
			a.walk();
			a.makesound();
			
			
			
			
			
		}
		
		
	}
	
	
	//public static void  test(Animal e) {
		
		//e.makesound();
		//e.walk();
	}
	
	//public static void test(Horse s) {
		
		//s.walk();
		//s.makesound();
		
		
		
	
	
	//public static void test(Dog D) {
		
		//D.makesound();
		//D.walk();
	


