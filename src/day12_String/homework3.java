package day12_String;

public class homework3 {
	public static void main(String[] args) {
		// write program extrac number to string   output 12345678
		
		String str = "ab123456cde78d";	
		
		//String output = str.replaceAll("[abcde]","");
		//System.out.println(output);
		
		for(int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
			
			char yusan = str.charAt(i);
			
			int refnumber=yusan;
			
			if(refnumber>= '0'&& refnumber <'9') {
				System.out.println(yusan);
			}
			
			
			
			
		}
		


}
}