package com.arrayquestion;

public class FindFirstDuplicatesElemnts {
	public static void main(String[] args) {
		int array[] = { 5, 3, 4, 5, 8, 9, 3 };
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					flag = true;

				}

			}
			if (flag == true) {
				System.out.println(array[i]);
				break;

			}

		}
	}
}
