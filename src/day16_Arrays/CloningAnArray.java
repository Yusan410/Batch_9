package day16_Arrays;

import java.util.Arrays;

public class CloningAnArray {
	public static void main(String[] args) {
		
		int a [] = {1,8,5};
		
		int b[] = new int [ a.length];
		
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		b=a;
		System.out.println(Arrays.toString(b));
		
		
		int num1[]= {1,2,3,4,5};
		int num2[]={6,7,8,9,10};
		
		
		int num3[] = new int [num1.length+ num2.length];
		System.out.println(num3.length);
		num3[0] = num1[0];
		
		
	}

}
