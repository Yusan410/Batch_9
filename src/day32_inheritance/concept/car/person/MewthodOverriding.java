package day32_inheritance.concept.car.person;

public class MewthodOverriding {

	public static void main(String[] args) {
		
		// polyymethodoverritting//
		
		Person p1 = new Tester("Sal",32,'M',"Engner",201,80);
 		Person p2 = new Tester ("kkk",32,'M',"Engner",201,8);
		Person p3 = new Developer("Yusan",24,'M',"Developer",201,89);
		         p1.eat();
                p1.sleep();
                System.out.println(p1.toString());
                System.out.println("-------------------");
                p3.eat();
                p3.sleep();
                System.out.println(p3.toString());
                
            
	}

}
