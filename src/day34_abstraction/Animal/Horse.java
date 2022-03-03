package day34_abstraction.Animal;

public class Horse extends Animal  {
public void walk () {
		
		System.out.println("I am horse , i am walking ");
	}
	
	public void makesound () {
		
		
		System.out.println("I am horse,  negii");
	}

	@Override
	public void eat() {
		System.out.println("Horse eatting food !!!!");
		
	}


}
