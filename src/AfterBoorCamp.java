
public class AfterBoorCamp {
	
	public static void main(String[] args) {
		
		
		
		AfterBoorCamp hw = new AfterBoorCamp();
		
		
		String name = "Techcircle";
		
		String str2 = hw.reverse(name);
		System.out.println(hw.pliandrome(str2));
		System.out.println(str2);
		
		
		String str3 = "Hannah";
		str3 = str3.toUpperCase();
		
         hw.reverse(str3);
        
         
         
	}
	
	public String reverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb.reverse();
		
		return sb.toString();
	}
	
	
	public boolean pliandrome(String str) {
		
		
		return false;
		
	}
	

}
