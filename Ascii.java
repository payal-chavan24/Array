package com.arrayquestion;

public class Ascii {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 40, 50, 60 };
		for (int i = 0; i < arr1.length; i++) {
			int output = arr1[i] * arr2[i];
			char ch = (char) output;
			System.out.println(ch);
		}
	}
}
