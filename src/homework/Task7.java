package homework;

public class Task7 {
	public static void main(String[] args) {
//		Task8:
//		Write a Java program to find the maximum and minimum value of an array.
//		
//		Original Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]                                                     
//				 Maximum value for the above array = 77                                                                       
//				 Minimum value for the above array = 14 
		
		
		int arr[] = {-1,3,14,56,15,36,56,77,18,2,29,49};
		
		int maxnum = arr[0];
		
		int minnum = arr[0];
		
		for(int i = 0 ; i < arr.length; i++) {
			
			if(maxnum<arr[i]) {
				
				
				maxnum = arr[i];
			}
			
			if(minnum > arr[i]) {
				
				
				minnum =arr[i];
				
			}
			
			
			
		}
		
		
		System.out.println("Max num is: "+maxnum);
		System.out.println("Minnum is: "+minnum);
		
				}
	
		
	}
	
	


