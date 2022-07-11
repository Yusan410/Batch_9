package internationalWomensDay;

public class TryCatch {
	
	
	public static void main(String[] args) {
		
	String arr[] = {"dog","cat","monkey"};
	
	try {
		
		System.out.println(arr[5]);
		
		
	}catch(Exception e) {
		
		e.printStackTrace();

		System.out.println("element not found index 5!");
		
	}
    
	int arr1[]= {1,2,3,4};
	
	try {
		
		
		
		System.out.println(arr1[5]);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		
		e.printStackTrace();
		
		
	}
	
	
	System.out.println("line number 35");
	
	
	
	}
	
	}



