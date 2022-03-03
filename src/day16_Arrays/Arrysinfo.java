package day16_Arrays;

import java.util.Arrays;

public class Arrysinfo {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
	int nums[] = {num1,num2,num3,num4,num5};
//                 0    1    2   3     4
	System.out.println(num1);
		
		System.out.println(nums[0]);
		System.out.println(nums[4]);
		
		
		
		int num6 = nums[1]+nums[3];
		System.out.println(num6);
		
		
		int numbers[] = new int[6];
		
		System.out.println(nums[0]);
		
		
		
		numbers[1] = 60;
		numbers[2] = 60;
		numbers[3] =100;
		
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		
		String[] cars = {"bmw","toyota","mazda"};
		
		
		for (String car : cars) {
			System.out.println(car);
		}
			
			for (int i = cars.length-1; i >=0; i --) {
				
				
				System.out.println(Arrays.toString(cars));
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}


