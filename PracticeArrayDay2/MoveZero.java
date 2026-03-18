package com.arraypractice;

//Move All Zeros to End
//Given an array, move all 0s to the end while maintaining the order of other elements.
//Example:
//Input: [0, 1, 0, 3, 12]
//Output: [1, 3, 12, 0, 0]
public class MoveZero {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 3, 12 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		while (index < arr.length) {
			arr[index] = 0;
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}
}
