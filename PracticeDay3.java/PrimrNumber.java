package com.arraypractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int array[] = { 1, 43, 78, 66, 79 };
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			int num = array[i];
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(array[i]);

			}
		}

	}
}
