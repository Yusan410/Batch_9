package homework;

public class task5 {
	public static void main(String[] args) {
		
		
//		Task5:
//			Write a Java program to sum values of an array
//			
//			int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	//	
//		The sum is 55
			// += is sum value
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		for(int i = 0 ; i < arr.length; i ++) {
			
			
			sum += arr[i];
		}
		
		System.out.println(sum);
		
	}

}
