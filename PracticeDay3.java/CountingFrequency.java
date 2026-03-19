package com.arraypractice;

//Write a program to count frequency of each element in a 1D array.
public class Frequency {
	public static void main(String[] args) {
		int[] arr = { 121, 87, 22, 22, 12, 78, 78,12,78};
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean isCounted = false;
			
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isCounted = true;
					break;
				}

			}
			if (!isCounted) {
				for (int k = 0; k < arr.length; k++) {
					if (arr[k] == arr[i]) {
						count++;
					}

				}
				//System.out.println(arr[i] + " " + count);
				if(count > 1)
				{
					System.out.println(arr[i]);
				}

			}
		}
	}

}
