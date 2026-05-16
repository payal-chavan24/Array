package com.may16;

import java.util.ArrayList;

public class FindCommonElements {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 3, 4, 5, 6, };
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list.add(arr1[i]);

				}

			}

		}

		for (Object object : list) {
			System.out.println(object);
		}

	}
}
