package day30_encapsulation.constructor;

public class Dog {
	
	String breed;
	String size;
	int age;
	String color;
	//Constructor
	
	//Instance method
	
	public Dog() {}
		
	
	
	// paramererized constructor
	
	public Dog (String fbreed) {
		
		breed = fbreed;
		
	}
	public Dog (String fbreed , String fsize) {
		
		breed = fbreed;
		
		size = fsize;
		
	}
	public Dog (String fbreed ,String fsize , int fage) {
		
       breed = fbreed;
		
		size = fsize;
		
		age = fage;
		
		
		
		
	}
	
	
	public Dog(String fbreed ,String fsize , int fage, String fcolor) {
		 breed = fbreed;
			
			size = fsize;
			
			age = fage;
			
			color = fcolor;
		
	}
	
		
		public void ShowInfo () {
			
			
			System.out.println("Breed:"+breed);
			System.out.println("size:"+size);
			System.out.println("age:"+age);
			
		System.out.println("color:"+color);
			
		}
		
	
	
	
	public void eat() {
		
		System.out.println(breed +" Eatting");
	}
	
	public void sleep() {
		
		
		System.out.println(breed +" slepping");
		
	}
	
	public void sit() {
		
		System.out.println(breed +" sitting");
		
	}
	public void run () {
		
		System.out.println(breed +" running");
	}


}



