package techcirecle.batch9.java;

import java.util.Arrays;

public class parctise3 {
	public static void main(String[] args) {
		
		parctise3 us = new parctise3();
		
		System.out.println(us.addition(9, 8));
		
	System.out.println(us.addition(9, 5.6));
	
	System.out.println(us.addition(9.8, 7.6));
	System.out.println(us.addition(3, 4, 6));
	
	int result = us.addition(1,2,3,4,5,6,7,8,9,10);
	System.out.println(result);
	
	int input[]= {2,4,1,3,5};
	int newArr[]= us.intArrayDescendingOrder(input);
	
	Arrays.sort(input);
	
	int resultArr[]= new int [input.length];
	
	
	
	int index = 0;
	
	for (int i = input.length-1; i >= 0 ; i --) {
		
		
		System.out.println(input[i]);
		resultArr[index]= input[i];
		index++;
	}
	
	
	
	System.out.println(Arrays.toString(input));
	System.out.println(Arrays.toString(resultArr));
	
	
	
	
	}
public int addition (int a , int b ) {
	
	return a +b;
	
}

public double addition (int a , double b ) {
	
	return a +b;
	
	
}
public double addition (double a , double b ) {
	return a + b ; 
	
	
}


	public int addition (int a , int b , int c) {
		return a+b+c;
		
		
	}//...numbers = array
	
	public int addition (int...numbers) {
		int total = 0 ;
		
		for (int i :numbers) {
			total+=i;
		}
		return total;
	}

public int[] intArrayDescendingOrder(int arr[]) {
	return null;
	


}


	


}
  

