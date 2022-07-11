package internationalWomensDay;

import java.util.Arrays;

public class returnType {
	public static void main(String[] args) {

		returnType a = new returnType();

		System.out.println(a.name("1234Ali321"));

		System.out.println(a.number(1.2, 3.5));

		System.out.println(a.number(10, 5));

		int arrr[] = { 2, 1, 3, 4, 5 };

		a.arr(arrr);

		a.target(arrr, 6);

		int number[] = {22,33,44,100,678,1};

		a.maxnumber(number);
		
		
	}

	public String name(String str) {

		StringBuilder m = new StringBuilder();

		m.append(str);

		return m.reverse().toString();

	}

	public int number(int a, int b) {

		return a * b;

	}

	public double number(double y, double x) {

		return y + x;

	}

	public int[] arr(int arr[]) {

		Arrays.sort(arr);

		int result[] = new int[arr.length];

		int index = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			result[index] = arr[i];
			index++;

		}

		System.out.println(Arrays.toString(result));

		return result;

	}

	public int[] target(int a[], int element) {

		int num[] = new int[a.length + 1];

		for (int i = 0; i < a.length; i++) {

			num[i] = a[i];

			num[num.length - 1] = element;

		}
		System.out.println(Arrays.toString(num));
		return num;

	}

	public int maxnumber(int c[]) {

		int maxnum = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] > maxnum) {

				maxnum = c[i];
			}
		}
		System.out.println(maxnum);
		return maxnum;

	}

	}
