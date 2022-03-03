package homework;

public class review2 {
	public static void main(String[] args) {
		
		
	//	String str  = "yusan";
		
	//	String a = str.toUpperCase();
	//	String b = str.toLowerCase();
	//	String c = a.substring(0,1)+b.substring(1);
	//	System.out.println(c);
		
		review2 re = new review2();
		System.out.println(re.changeString("yusan"));
	}
	
	public String  changeString (String str) {
		String a = str.toUpperCase();
		String b = str.toLowerCase();
		String c = a.substring(0,1)+b.substring(1);
		//System.out.println(c);
		return c;
	}
	
	
		
	}
	
	
	


