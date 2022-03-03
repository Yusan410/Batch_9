package day32_inheritance.concept.car.person;

public class AppleInc {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.SetInfo("Yusan", 28, 'M');
		
		
		Employee p2 = new Employee();
		
		p2.SetInfo("Samira", 29, 'F', "QA Tester", 3420,100);
		
		Tester p3 = new Tester("Sal",32,'M',"Engner",201,80);
		
		Developer p4 = new Developer("yusa",31,'M',"Developer",598,120);
		
		p1.eat();
		p1.sleep();
		
		p2.eat();
		p2.work();
		p2.sleep();
		
		
		p3.eat();
		p3.sleep();
		p3.testing();
		p3.work();
		
		
		p4.eat();
		p4.sleep();
		p4.code();
		p4.work();
		
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		          

		
	}
}