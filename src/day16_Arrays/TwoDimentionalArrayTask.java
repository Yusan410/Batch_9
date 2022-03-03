package day16_Arrays;

import java.util.Arrays;

public class TwoDimentionalArrayTask {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6 };
		int[] c = { 7, 8, 9 };
		int[] d = { 13, 14, 15, 16, 17 };

		int Y[][] = { a, b, c, d };
		
		for (int i = 0 ; i < Y.length;i++) {
			System.out.println(Arrays.toString(Y[i]));
			
			for (int j = 0 ; j < Y[i].length; j++) {
				System.out.println(Y[i][j]);
			}
		}

	}

}
