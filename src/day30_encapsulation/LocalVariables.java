package day30_encapsulation;

public class LocalVariables {
	
	
	
	int A =50;
	
	
	
	public static void main(String[] args) {
		
		
		LocalVariables lv = new LocalVariables();
		
		lv.methodA();
		lv.methodB();
		lv.methodD();
		lv.methodE();
		
	int a =	lv.methodc();
	
	System.out.println(a);
		
	
	for( int i = 0 ; i < 6 ; i++) {
		
		System.out.println(i);
		
		int b = i +1; // b is local variable
	}
		
		
		
		
		
	}
	
	public void methodA() {
		
		
	int a =10;	
		
		System.out.println(a);
		
	}
	
	public void methodB() {
		
		int a = 20;
		
		System.out.println(a);
		
		
	}
	
	public int methodc () {
		int a = 30;
		
		return a;
	}
	
	
	public void methodD() {
		
		int a = A+20;// a is local variable
		
		//A is instanve varible
		
		System.out.println(a);
		
		
	}
	
	
	public void methodE () {
		
		System.out.println(A);
	}
	
	void methoF () {
		
		System.out.println(A);
		
	}
	protected void methodH () {
		
		System.out.println(A);
	}
}
