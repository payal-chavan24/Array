package com.arraypractice;

//Find Second Largest Element (without sorting)
//Write a program to find the second largest number in an array without using sorting.
public class SecondLargest {
	public static void main(String[] args) {
		int[] arr1 = { 1, 8, 6, 88, 87, 10 };
		int firstElement = Integer.MIN_VALUE;
		int secondElement = Integer.MIN_VALUE;
		if (arr1[0] < arr1[1]) {
			firstElement = arr1[0];
			secondElement = arr1[1];
		} else {
			firstElement = arr1[1];
			secondElement = arr1[0];
		}
		for (int i = 2; i < arr1.length; i++) {
			if (arr1[i] > firstElement) {
				secondElement = firstElement;
				firstElement = arr1[i];
			} else if (arr1[i] > secondElement && arr1[i] != firstElement) {
				secondElement = arr1[i];
			}

		}
		System.out.println("Second Element =" + secondElement);

	}
}
