package day05_ifStatment;

public class Review {

	public static void main(String[] args) {
		
		int a = 10;
		int b =15;
		System.out.println(a>b && b>a);// false
		
		System.out.println(a>b | b>a);// true 
		
		System.out.println(!(a>b &&b>a));// true
		
		
		
		
		int c = (a>b)? 1:2;
	
	System.out.println(c);
		
		
	System.out.println(c++);//3
		
		
		
		System.out.println(c);
		
		c += 5;
		System.out.println(c);
		

		System.out.println(--c);
	
	
		
	double pi =3.14;
	
	
	 pi = 6.14;
	 
	System.out.println(pi);
	
	
	
	
	
	
	
	int result =23%6;
	
	System.out.println(result);
	
	
	
	String str = (result>3)?"str1":"str2";
	System.out.println(str);
	
// write a prgram to find a given number is positive or 
//negative
	
	
	int num1 = -10;
	
	System.out.println(num1 > 0 ?num1 +"is positive":"is negative");
	
	
	
	
	
	
	
	
	
	
	}

}
