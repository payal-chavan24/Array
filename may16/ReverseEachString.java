package com.may16;

public class ReverseEachString {
	public static void main(String[] args) {
		String str = "Java is easy";
		String store = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				store = store + str.charAt(i);

			} else {
				for (int j = store.length() - 1; j >= 0; j--) {
					System.out.print(store.charAt(j));

				}
				System.out.print(" ");
				store = "";
			}

		}
		for (int k = store.length() - 1; k >= 0; k--) {
			System.out.print(store.charAt(k));

		}
	}
}
