package day12_String;

public class StringImmutable {

	public static void main(String[] args) {
		
		// str1 can not be changed   immutable String 
		String str1= "Hello Java";
		
		 String str2="Hello ";
		 
		 String Str3 = "Java";
		 
		 String Str4= str2+Str3;
		 String Str5 = new String (str2 +Str3);
		 
		 
		 System.out.println(str1);
		 System.out.println(Str4);
		 System.out.println(Str5);
		 
		 
		 
		boolean result = str1 == Str4;
		
		System.out.println(result);
		System.out.println("--------");
		System.out.println(str1==Str5);
		System.out.println("---------");
		System.out.println(str1.equals(Str5));
		
		int a = 6;
		int b = 4;
		int c = 2;
		int d = b+c;
		
		boolean result2 = a ==d;
		System.out.println("---------");
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
