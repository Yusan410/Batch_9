package day30_encapsulation.constructor;

public class CatObject {
	public static void main(String[] args) {
		
		
		Cat c1 = new Cat("sazgur",4,"gray","shorthair");
		
		c1.showinfo();
		
		System.out.println("------------------");
		
		Cat c2 = new Cat ("mimi",3,"white","birtish shorthair");
		
		System.out.println("------------------");
		
		c2.showinfo();
		System.out.println("------------------");
		
		Cat c3 =new Cat ("Samira",7,"black","Russian blue");
		
		c3.showinfo();
		
		
	}

}
