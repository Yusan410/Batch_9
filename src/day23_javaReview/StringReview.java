package day23_javaReview;

public class StringReview {
	public static void main(String[] args) {
		
		
		String str ="Techcircle";
		String str2= new String();
		System.out.println(str2.length());
		
		int a = str.length();
		System.out.println(a);
		System.out.println(str.length());
		int b = str2.length();
		
		System.out.println(b);
		
		if (a==0) {
			System.out.println(str+"is empty string");
			
		}else {
			System.out.println(str+"is not empty string");
			
		}
		
		str.isEmpty();
		System.out.println(str.isEmpty());
		
		if (str.isEmpty()) {
			System.out.println(str+"is empty string");
			
		}else {
			System.out.println(str+"is not empty string");
			
	}

	}
}