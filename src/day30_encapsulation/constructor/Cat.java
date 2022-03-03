package day30_encapsulation.constructor;

public class Cat {
	
	String breed;
	
	int age;
	
	String name;
	
	String color;
	
	
	public Cat() {
		
	}
	
	public Cat (String fname, int fage , String fcolor, String fbreed) {
		
		
		
		breed = fbreed;
		
		age = fage;
		name=fname;
		color=fcolor;
		
		
	}
	
	public void showinfo () {
		
		System.out.println("Breed: "+breed);
		System.out.println("color: "+color);
		System.out.println("age: "+age);
		System.out.println("Name: "+name);
		
	}
	
	

}
