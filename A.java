package com.arrayquestion;

public class A {
	public static void main(String[] args) {
		// upper to lower change without using inbuild method

		String str = "PAYALCHAVAN";

		char ch[] = str.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//
//			if (ch[i] >= 'A' && ch[i] <= 'Z') {
//
//				char temp = (char) (ch[i] + 32);
//				System.out.print(temp);
//
//			}

		// }
		char ch1[] = { 'P', 'A', 'Y', 'A', 'L' };
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] >= 'A' && ch1[i] <= 'Z') {
				char ch2 = (char) (ch[i] + 32);
				System.out.print(ch2);
			}

		}

	}
}
