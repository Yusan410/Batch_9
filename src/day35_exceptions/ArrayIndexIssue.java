package day35_exceptions;

public class ArrayIndexIssue {

	public static void main(String[] args) {
		
		
		 //exceptions error//
		 
		
		try {
		
		
		int nums[] = {1,2,3,4,5};
		
	

		System.out.println(nums[5]);
		}catch(ArrayIndexOutOfBoundsException c) {
			
			c.printStackTrace();
		}
		
		System.out.println("Line number 21");
	}

}
