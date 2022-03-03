package day30_encapsulationA;

public class Modifiers {
	
	int a = 10;
	
	
	private int b = 20;
	
	protected int c =30;
	
	public int d = 40;
	
	
	
	
	
	void methodA () {
		System.out.println("default");
		
		
	}

	void methodB () {
		System.out.println("praivate");
		
}
	

	void methodC () {

		
		System.out.println("protected");
		
}
	

	void methodD () {
		
		System.out.println("public");
		
}
	
	
	
	public void useAlltheVariable() {
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public void callAlltheMethod() {
		
		methodA();
		methodB();
		methodC();
		methodD();
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Modifiers m = new Modifiers();
	
		
		System.out.println(m.a);
		
		System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.d);
		System.out.println();
		
	}
	
}


