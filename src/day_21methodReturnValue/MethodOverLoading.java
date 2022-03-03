package day_21methodReturnValue;

public class MethodOverLoading {
	public static void main(String[] args) {
		MethodOverLoading md = new MethodOverLoading();
		
		
	System.out.println(md.sumOfTwoNUm(3, 8));
	
	System.out.println(md.sumOfTwoNUm(9, 5.5));
	
	System.out.println(md.sumOfTwoNUm(9.8, 7.8));
	
	}

	public int sumOfTwoNUm(int a , int b) {
		
		return a + b;
		
	}
	
	public double sumOfTwoNUm(int a , double b) {
		
		return a +b;
	}
	public double sumOfTwoNUm(double a , double b ) {
		return a +b ;
	}
}
