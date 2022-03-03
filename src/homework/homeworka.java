package homework;

import java.util.Arrays;

public class homeworka {
	public static void main(String[] args) {
		
		
		
		
		
		homeworka vv = new homeworka();
		
		String str1 = "Yusan";
		
	   String str2 =  vv.reverse(str1);
	   
	   System.out.println(str2);
	   
	   System.out.println(vv.ispalindrome(str2));
	   
	 String str3 = "321";
	 
	 String str4 = "123";
	 
	char charArr1[] = str3.toCharArray();
	
	char charArr2[] = str4.toCharArray();
	
	
	Arrays.sort(charArr1);
	
	Arrays.sort(charArr2);
	
	System.out.println(Arrays.toString(charArr1));
	
	System.out.println(Arrays.toString(charArr2));
	
	System.out.println(Arrays.equals(charArr1, charArr2));
	   
	   }
	   
	   
	
	public String reverse(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(str);
		sb.reverse();
	 
		
		return sb.toString();
	}

	
	
	public boolean ispalindrome(String str) {
		
		homeworka vv = new homeworka();
		 String str3 = "Samira";
		
		str3 = str3.toUpperCase();
		   
		   System.out.println(str3);

		   String str4 = vv.reverse(str3);
		   
		   if (str3.equals(str4)) {
			   
			   System.out.println("plaindrome");
			   
		   }else {
			   System.out.println("not plindrome");
		   }
			   
			  
		
		
		return false;
		
		
	}
	
	
	
}
