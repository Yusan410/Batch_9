package homework;

public class Task2 {
	public static void main(String[] args) {
		
		
//		   Task2:
//		   Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.
//
//		   Input: arr[] = [5, 1, 1, 9, 7, 2, 6, 10], key = 7
//		   Output: true
//
//		   Input: arr[] = [-1, 1, 5, 8], key = -2
//		   Output: false
	
		
		
		int arr[] = {5,1,1,9,7,2,6,10};
		
		int key = 7;
		
		int key2 = -2;
		
		boolean result = false;
		
		for(int i = 0 ; i < arr.length; i ++) {
			
			if(arr[i] == key) {
				
				result = true;
			}
			//boolean result2 = true;
		}
		
		
		
		System.out.println(result);
		
	
		
		
	}
		}
	



