package homework;

public class Minumber {
	public static void main(String[] args) {
		
		
		
		
		
int arr[] = {200,88,55,22,-8};
		
		
		int minnumber = arr[0];
		
		for(int i = 0 ; i < arr.length; i++) {
			
			
			if(minnumber > arr[i]) {
				
				minnumber = arr[i];
				
				
			}
			//System.out.println(minnumber);
		}
		
		System.out.println(minnumber);
		
	}
	
	
	}

