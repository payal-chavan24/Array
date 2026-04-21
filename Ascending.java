package com.arraypractice;

import java.util.Arrays;
import java.util.Collections;

//Write a program to sort a 1D array in ascending order.
public class Ascending {
	public static void main(String[] args) {
		int[] arr = { 12, 465, 67, 98, 5 };
System.out.println("Without using method with selection sorting method");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

			System.out.println(arr[i]);
		}
		System.out.println("Sorting array in with using buuble sortion method");
		int[] arr1 = { 12, 465, 67, 98, 5 };
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp =arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
				}

			}
			
		}
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("With using method");
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
