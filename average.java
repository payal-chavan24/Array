package com.arraypractice;

//Write a program to find the average of elements in a 1D array.
public class average {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 78, 98 };
		int sum = 0;
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			length++;

		}
		double avg = sum / length;
		System.out.println("Average =" + avg);
	}
}
