package techcirecle.batch9.java;

public class review {
	
	
	
	public static void main(String[] args) {
		
		
		String str ="TechCircle";
		
		String str2 = "";
		
		for (int i = str.length()-1; i >=0 ;i --){
			
			str2 = str2+str.charAt(i);
					
			System.out.print(str.charAt(i));
			
	
		}
		

		String str3 = str2.toUpperCase();
		String str4 = str2.toLowerCase();
		String str5 = str3.substring(0,1)+str4.substring(1);
		
		System.out.println(str5);
	}
	
	
	
	

	
	}

