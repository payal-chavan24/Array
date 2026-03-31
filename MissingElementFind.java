package com.arrayquestion;

public class MissingElementFind {
	public static void main(String[] args) {
		int[] array = { 1, 4, 5, 6, 7, 2 };
		int n = array.length + 1;// 7
		int totalSum = n * (n + 1) / 2;// 28
		int arraySum = 0;
		for (int i = 0; i < array.length; i++) {
			arraySum = arraySum + array[i];

		}
		int missingNumber = totalSum - arraySum;
		System.out.println(missingNumber);

	}
}
