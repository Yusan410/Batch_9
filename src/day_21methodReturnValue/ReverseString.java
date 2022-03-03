package day_21methodReturnValue;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString fc = new ReverseString();
		
		String result = fc.reverString("Samira"+"yusan");
		fc.reverString("Yusan");
		System.out.println(result);
		

	}
	
	public String reverString(String str) {
		
		
		StringBuilder sb = new StringBuilder();
              sb.append(str);
              
              return sb.reverse().toString();

		
	} 
	
	
	
	
	
	
	
	

}
