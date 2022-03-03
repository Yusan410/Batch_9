package day32_inheritance.concept.car;

public class Bmwobject {
	public static void main(String[] args) {
		
	
		
		BMW x5 = new BMW();
		
		System.out.println(x5.toString());
		
		BMW car2 = new BMW("X5","BLACK",2020,65000,1020);
		
		car2.drive();//driver and park  are come from super class
		
		car2.park();
		
		car2.race();// race come from subclass
		System.out.println(car2.toString());
		
		Toyota c2 = new Toyota("Camry","Black",2020,23000,26000);
		System.out.println("----------------------------");
		System.out.println(c2.toString());
		System.out.println(!c2.isAfordbale);
		c2.drive();
		c2.park();
		
		
	}

}
