import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestions {
	public static void main(String[] args) {

		/*
		 * Write a function that can find the maximum number from an int Array
		 */
         
		InterviewQuestions aa = new InterviewQuestions();
		
		int arrr1[] = {1,2,3,4};
		int arrr[] = {5,6,7,8};
		
		aa.arr(arrr1, arrr);
		
		int Array[] = {0,0,0,1,2,3,4};
		aa.numsA(Array);
		
		int numsA[] = {1,1,2,2,3,3,4,4,5,5,6,6};
		aa.DuplicateElement(numsA);
		
		int reverse[] = {1,2,3,4,5};
		
		aa.reverse(reverse);
		
		
		
		int arr[] = { 1, 2, 55, 65, 75, 100 };

		int maxnum = arr[0];

		int minnum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxnum) {

				maxnum = arr[i];
			}
			if (arr[i] < minnum) {

			}
		}
		System.out.println(maxnum);
		System.out.println(minnum);

	}

	public int[] arr(int arrr[] , int abs[]) {
		
		int positon = 0;
		int num[] = new int [ arrr.length+abs.length];
		
		for(int i =0 ; i < arrr.length;i++) {
			
			num[positon] = arrr[i];
			
			positon++;
			
			
		}
		for(int j =0; j < abs.length; j++) {
			
			num[positon] = abs[j];
			positon++;
			
			
		}
		System.out.println(Arrays.toString(num));
		
		return num;

	}
	
	public int[] numsA(int nums[]) {
		
		int array[] = new int[nums.length];
		
		int temp =0;
		
		for(int i =0; i < nums.length;i++) {
			
			if(nums[i] !=0) {
				
				array[temp] = nums[i];
				temp++;
				
			}
		}
		System.out.println(Arrays.toString(array));
		return array;
		
	
		
	}
	
	
	public ArrayList<Integer> DuplicateElement(int Number[]){
		
		ArrayList<Integer>unique = new ArrayList<>();
		
		for(Integer a : Number) {
			
			if(!unique.contains(a)) {
				
				unique.add(a);
			}
		}
		
		System.out.println("---------p--------------");
		System.out.println(unique);
		return unique;
		
		
		
	}
	public int[] reverse(int revers[]) {
		
		for(int i = revers.length-1 ; i >=0; i--) {
			
			
			System.out.print(revers[i]+" ");
		
		}
		
		return revers;
		
		
		
		
	}

}


