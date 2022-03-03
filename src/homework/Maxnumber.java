package homework;

public class Maxnumber {
	
	public static void main(String[] args) {
		
		
		
		
		int arr[] = {22,44,55,66,100,200,500};
		
		int max = 0;
		
		for(int i = 0 ; i < arr.length;i++) {
			
			if(max < arr[i]) {
				
				max = arr[i];
				
				//System.out.println(max);
				
			}
			
			
		}
		
		System.out.println(max);
	}

}
