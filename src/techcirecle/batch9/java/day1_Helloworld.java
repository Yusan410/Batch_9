package techcirecle.batch9.java;

public class day1_Helloworld {
	public static void main(String[] args) {
	
       String str1= "Yusan";
       String str2="Samira";
       String str3= "Sazgur";
       
       for(int i = 1 ; i < 31 ; i ++) {
    	   
    	   
    	   if (i % 2 == 0 ) {
    		   System.out.println(str1);
    		   
    		   if (i % 3 == 0) {
    			   System.out.println(str2);
    			   if (i % 5 == 0 ) {
    				   System.out.println(str3);
    			   }else {
    				   System.out.println(i);
    			   }
    			   
    		   }
    			   
    	   }
       }
		
	}
}
	
