package Day20_Method;

import java.util.Arrays;

public class CalculatorWithPramiter {
	
	public static void main(String[] args) {
			
		CalculatorWithPramiter cal = new CalculatorWithPramiter();
		// prameter
		cal.addition(20, 35);
		cal.addition(7,90);
		cal.addition(7,-900);
		cal.yusan(8,4);
		cal.yusan(9, 3);
		
	}
	
	
	
	public void addition (int a , int b ) {
		
		int result = a * b ;
		System.out.println(result);
	}
	
	
	
	
	public void yusan (int a , int b) {
		
		int result = a / b ;
		System.out.println(result);
		
		
		
		
		int arr[]= {1,3,5,7};
		int newelment = 9 ;
		int expectarr[]= {1,3,5,7,9};
		
		int targetarr[]= new int [arr.length];
		System.out.println(Arrays.toString(targetarr));
		for (int i = 0 ; i <arr.length;i++) {
			targetarr[i]=arr[i];
		}
		
		targetarr[targetarr.length-1]=newelment;
		System.out.println(Arrays.toString(targetarr));
	}
	
	
	

}
