package day30_encapsulation.constructor;

public class PuppyObject {
	
	public static void main(String[] args) {
		
		Puppy tom = new Puppy();
		
		System.out.println(tom.name);
		
		Puppy jhon = new Puppy("jhon");
		
		System.out.println(jhon.name);
		
	}

}
