package day31_eEncapsulation;

public class CircleObject {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		
		System.out.println(c1.getDiameter());
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.toString());
		
		
		System.out.println("------------------------");
		
		
		Circle c2 = new Circle(20);

		System.out.println(c2.getDiameter());
		System.out.println(c2.getArea());
		System.out.println(c2.getPerimeter());
		System.out.println(c2.toString());
	}

}
