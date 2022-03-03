package day34_abstraction.Animal;

public class Cat extends Animal {
	
public void walk () {
		
		System.out.println("Iam a cat,I am walking ");
		
	}
	
	public void makesound () {
		
		System.out.println("I am cat , Meow ");
	}

	@Override
	public void eat() {
		System.out.println("Cat is etting food!!");
		
	}
	
	

}
