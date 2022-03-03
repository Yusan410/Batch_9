package day12_String;

public class StringTrimMethod {

	public static void main(String[] args) {
		
		// trim is remove the space at begin or end
		String str ="Hellojava           ";
		System.out.println(str.length());
		
		str=str.trim();
		System.out.println(str.length());
		
		String str2 = "           Hellojava";
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.trim());
		System.out.println(str2);
		
		str2=str2.trim();
	System.out.println(str2);
	
	
	
	
	String str3 ="         Hello yusan      ";
	System.out.println(str3.length());
	str3=str3.trim();
	System.out.println(str3.length());
	
	
	
	
	
	
	
	
	
	}
}
