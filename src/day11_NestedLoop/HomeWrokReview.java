package day11_NestedLoop;

public class HomeWrokReview {

	public static void main(String[] args) {
		// multi line
		int num =34567;
		int output =76543;
		
		System.out.println(num%10);
		
	//	int result =num%10; //7
		
	//	System.out.println(num/10);
		int result = 0;
//		num = num/10;
//		num = num/10;
//		num = num/10;
//		num = num/10;
//		
//		int remainder  = num%10;
//		
//		result = result *10+(num%10);
//		
//		System.out.println(result);
//		
		
		
		while(num != 0) {
	
			int remainder = num % 10;
			result = result *10+ remainder;
			num = num /10;
			System.out.println(result);
			
			
			if (result==output) {
				System.out.println("test passed");
				
				}else{
					System.out.println("test failed");
				}
			}	
		
		
		
		//task5		
		
		
		int sumOfOddNumbers =0;
		int sumOfEvenNumbers =0;
		
		for(int i = 1; i <101;i++) {
			
			if(i% 2 == 0) {
				sumOfEvenNumbers +=i;
				
				
					
				}else {
					sumOfOddNumbers +=i;
				}
				}
					
				

		System.out.println("sumOfOddNumbers"+sumOfOddNumbers);
		System.out.println("sumOfEvenNumbers="+sumOfEvenNumbers);
		
		
		
		
		
		// task 6 
//		for(int i = 0 ;i<=50;i++) {
//          if(i % 3 != 1) {
//        	  System.out.println(i);
//        	  
        	  
        	  
        	  //task7
        	  for(char i1 ='A'; i1<='Z';i1++) {
        		 System.out.println(i1);
        		 
        		 
        		 
        		 
        		   // task 9
        	  }
        	  
       for(int i = 1;i <=30;i++) {
    	   if(i %3  ==0) {
    		   System.out.println("fin");
    		   
    		   
    	   }else if (i % 5 ==0) {
    			   System.out.println("RA");
    			   
    		   }else  if(i % 5 ==0 && i % 3 == 0) {
    				   System.out.println("Finra");
    				   
    			   }else {
    				   System.out.println(i);
    			   }
    		   }
       }
    		   
    	   
    	   
        	  
        	  
        	  
        	  
        	  
        	  
          
		}
		
		
		
		
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	





















