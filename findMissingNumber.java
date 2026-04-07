package com.arrayquestion;

import java.util.ArrayList;

//give array from 1 to N with one missing number
public class findMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 6 };

		int n = arr.length + 1;
		int totalSum = n * (n + 1) / 2;
		int arrySum = 0;

		for (int i = 0; i < arr.length; i++) {
			arrySum = arrySum + arr[i];

		}
		int missing = totalSum - arrySum;
		System.out.println("Missing number in elements =" + missing);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		list.add(missing);
		list.sort(null);
		System.out.println("Update ArrayList with include missingNumber" + list);

	}
}
