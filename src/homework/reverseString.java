package homework;

public class reverseString {
	public static void main(String[] args) {
		
		


		//3,
	    /*
	    reverses the given string object and returns it
	   
	    */

		
		reverseString hh = new reverseString();
		
		
		String str = "Yusan";
		
		String str2 = hh.reverstring(str);
		
		System.out.println(str2);
		
		
		//
		
            
		
		

		}
		public String reverstring (String str) {
			
			
			StringBuilder hh = new StringBuilder();
			
			hh.append(str);
			hh.reverse();
			
			
			return hh.toString();
			
			
			
			
			
			
		}
		
	
		
		
	}
		
