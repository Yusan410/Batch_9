package internationalWomensDay;

import java.util.Arrays;

public class HenRyInterViewQuestion {

	public static void main(String[] args) {

		// Input: list1 = [1,2,4], list2 = [1,3,4];
		
		//output = [1,1,2,3,4,4]

		int arr[] = { 1, 2, 4 };

		int arr2[] = { 1, 3, 4 };

		int arr3[] = new int[arr.length + arr2.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			arr3[j] = arr[i];

			j++;

		}
		//System.out.println(Arrays.toString(arr3));

		for (int i = 0; i < arr2.length; i++) {

			arr3[j] = arr2[i];

			j++;
		}

		Arrays.sort(arr3);

		System.out.println(Arrays.toString(arr3));
	}

}
