package homework;

public class Uniquecharacters {
	public static void main(String[] args) {
		
		

		//2,
		/*  * input = aaabbbbccccccccdddddd
	     * 
	     * output : abcd
		 * 
	    returns the unique characters for the given string
	    */
		
	
		
		String input = "aaabbbbbcccccc";
		
		
		String ouput = "";
		
		for (int i = 0 ; i < input.length();i++) {
			
			char currentchar = input.charAt(i);
			
			String str = input.valueOf(currentchar);
			
			if(!ouput.contains(str)) {
				
				ouput = ouput+str;
				
			}
			
			
		}
		System.out.println(ouput);
		

}
}