package homework;

public class day_16Homework {
	
	public static void main(String[] args) {
		

		  /*
		   * Create an method that accepts an array of int as parameter and 
	        returns the maximum number 
	      */
		
		day_16Homework hh = new day_16Homework();
		
		int arr[] = {22,33,44,55,100};
		 int maxnumber = hh.maxnumber(arr);
		 
		 System.out.println(maxnumber);
		
		
		int minnumber = hh.minnumber(arr);
		
		
		System.out.println(minnumber);
		
	}
	public int maxnumber(int arr[]) {
		
		int maxnumber=arr[0];
		
		for(int i = 0 ; i <arr.length; i ++)
			
			if(maxnumber<arr[i]) {
				
				maxnumber = arr[i];
				
				
			}
		
		
		return maxnumber;
		//return maxnumber;
	}
	
	public int minnumber (int arr[]) {
		int minnumber = arr[0];
		
		for (int i = 0 ; i > arr.length; i++) {
			
			minnumber = arr[i];
			
			if (minnumber > arr[i]) {
				
				
				
				
				
			}
		}
		return minnumber;
	}

}
