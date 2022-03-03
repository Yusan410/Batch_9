package day30_encapsulationA;

public class Test {
	
	public static void main(String[] args) {
		
		
		 Modifiers m =  new  Modifiers();
		 
		 System.out.println(m.a);
		m.methodA();
		
		
		System.out.println(m.c);
		
		m.methodC();
		
		System.out.println(m.d);
		
		m.methodD();
		
		
		m.callAlltheMethod();
		
		m.useAlltheVariable();
		
		
		
	}

}
