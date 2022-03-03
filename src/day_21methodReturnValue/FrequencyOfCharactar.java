package day_21methodReturnValue;

public class FrequencyOfCharactar {
	public static void main(String[] args) {
		
		
		String str = "Yusan";
		char targetChar = 'a';
		
		FrequencyOfCharactar fc = new FrequencyOfCharactar();	
		
	int count =	fc.frequencyOfTargetChar(str, targetChar);
	
	System.out.println(count);
	}	
	
			
	

	
	
	
	public int frequencyOfTargetChar(String str , char targetChar)
	{
int count = 0;
		
		for(int i = 0 ;i < str.length();i++) {
			
			//System.out.println(str.charAt(i));
			
	if(str.charAt(i) == targetChar) {
		count++;
		
	}		
			
			
			
			
		}
		
		
		//System.out.println("character<"+targetChar+">occured"+count+"times");
		return count;
		
	}
	
	
	
	
	
	
	
}
