package internationalWomensDay;

public class StringPracticw {
	
	public static void main(String[] args) {
		
		
		//extract number
		
		
		String num = "ab123c34rfdtg9874";
		
		
		for(int i= 0 ; i < num.length();i++) {
			
			
			char currentchar = num.charAt(i);
			
			int refnumbe = currentchar;
			
			//System.out.println(refnumbe);
			
			if(refnumbe>='0' && refnumbe <='9') {
				
				System.out.println(currentchar);
			}
		}
		
	}

}
