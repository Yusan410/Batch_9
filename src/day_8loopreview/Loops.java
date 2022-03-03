package day_8loopreview;

public class Loops {

	public static void main(String[] args) {
		
		//print   number 0 to 100;
		int i =0;
		do {
			System.out.println(i);
			   i++;
			   
			
			
		}while(i<100);
		System.out.println(i);
	 i++;
	
	
	
	
	
	

	// 1 to 100 even number
	  for (int i1 = 0; i1<=100;i1++) {
		  System.out.println(i1);
		  
		  
		  
		if(i1%2!=1) {
			System.out.println(i1);
			
			
			
			// do 500 push up
			
			for(int g=1;g<=500;) {
				System.out.println("push up"+g);
				g++;
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
		}
	  }
		  
	  
	
	
	
	// print out all the numbers divisible by 2 3 5 
	
	for (int i1 = 0; i1<=100;i1++) {
		if(i1%2==0) {
			System.out.println("codility");
		}
	else if (i1 %3==0)
	System.out.println("test");
		
	else if (i1 %5==0)
		System.out.println("coder");
	else {
		System.out.println(i1);
	
	}
	}
	}
}

             












