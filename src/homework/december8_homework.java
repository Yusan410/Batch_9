package homework;

import java.util.Arrays;

public class december8_homework {
	public static void main(String[] args) {
		int[] array_nums = { 0, 0, 1, 0, 3, 5, 0, 6 };

		int newArr[] = new int[array_nums.length];
		int position = 0;
		for (int i = 0; i < array_nums.length; i++) {

			if (array_nums[i] != 0) {

				//System.out.println(array_nums[i]);

				newArr[position++] = array_nums[i];

			}

		}

		//System.out.println(Arrays.toString(array_nums));

		System.out.println(Arrays.toString(newArr));
	}

}
