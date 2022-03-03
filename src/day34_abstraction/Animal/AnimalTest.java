package day34_abstraction.Animal;

public class AnimalTest {
	public static void main(String[] args) {
		
		//Animal a = new Animal();
		
		//a.makesound();
		//a.walk();
				
			//Dog b = new Dog();
			
			//b.makesound();
			//b.walk();
			System.out.println("-------------------");
			Animal d2 = new Dog();
			//overriding
			d2.makesound();
			d2.walk();
			d2.eat();
			System.out.println("-------------------");
			Animal c = new Cat();
			c.walk();
			c.makesound();
			c.eat();
			System.out.println("-------------------");
			Animal h = new Horse();
			
			h.walk();
			h.makesound();
			h.eat();
		
			
			System.out.println("=============================");
			Animal animals[]= {d2,c,h,new Dog(),new Horse(),new Cat()};
			System.out.println("-------------------------");
			for(int i = 0 ; i < animals.length;i++) {
				
				animals[i].eat();
				animals[i].makesound();
				
				animals[i].walk();
				
				System.out.println("++++++++++++++++++=");
				
				
				
				
				
			}
			
			
			
			
			
			
	}

}
