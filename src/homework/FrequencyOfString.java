package homework;

public class FrequencyOfString {
	public static void main(String[] args) {
		
		/*
	     * input = aaabbbbccccccccdddddd
	     * char frequency of 'a'
	     * output : 3
	     * 
	    returns the frequency of given char from the given string, as int
	    */
		
		String input = "aaaaaaaabbbbcccccdddddd";
		char strr = 'b';
		int frequncy = 0;
		
		
		//System.out.println(frequncy);
		
		
		for(int i = 0 ; i < input.length();i++) {
			
			if(input.charAt(i) == strr)
				
				frequncy++;
			
			//System.out.println(frequncy);
			
			//System.out.println(input);
		}
		
		
		System.out.println(frequncy);
		
	}

}
