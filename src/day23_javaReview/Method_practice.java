package day23_javaReview;

public class Method_practice {
	public static void main(String[] args) {
		
		Method_practice re = new Method_practice();
		
		System.out.println(re.numbers(8, 9));
	
		//String str = "Yusan";
		//String Str2="Ali";
		
		//String str3= str+Str2;
		//System.out.println(str3);
		System.out.println(re.name("yusan", "Ali"));
		
		System.out.println(re.number(8.0, 9.7));
	}
	
	public int numbers(int a , int b) {
		
		int result = a*b;
		return result;
		
	}
	
public String name (String str,String Str2) {
	String str3= str+Str2;
	
	return str3;
	
}

public double number (double a , double b ) {
	
	
	double result2 = a+b;
	
	return result2;
	
	
}


}

