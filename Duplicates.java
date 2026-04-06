package com.arrayquestion;

//Remove duplicates from array
public class Duplicates {
	public static void main(String[] args) {
		int[] array = { 1, 4, 5, 7, 2, 3, 4, 5, 1, 1 };

		for (int i = 0; i < array.length; i++) {
			boolean isDuplicates = false;
			boolean isprinted = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					isDuplicates = true;
					break;

				}

			}
			for (int k = 0; k < i; k++) {
				if (array[i] == array[k]) {
					isprinted = true;
					break;

				}

			}
			if (isDuplicates == true && isprinted == false) {
				System.out.println(array[i]);

			}

		}
	}
}
