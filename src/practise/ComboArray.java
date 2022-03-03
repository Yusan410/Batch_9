package practise;

public class ComboArray {
	public static void main(String[] args) {
	
		
		
		
		
		int arr[] = {1,2,3,4,5};
		
		int arr1[] = {6,7,8,9,10};
		
         int arr2 []= new int [ arr.length+arr1.length];
         
         for(int i = 0 ; i < arr2.length; i ++) {
        	 
        	 if(i < arr.length) {
        		 
        		 arr2[i] = arr[i];
        		 
        		 
        	 }
        	 
        	 if(i >= arr.length) {
        		 
        		 
        		 
        		 arr2[i] = arr1 [ i - arr.length];
        	 }
        	 
        	 System.out.print(arr2[i]+" "); 
         }
        // System.out.println(arr2[i]);
	
	

	}
}
	
	
	
	

