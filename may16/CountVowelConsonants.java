package com.may16;

public class CountVowelConsonants {
	public static void main(String[] args) {
		String str = "PayalChavan";
		int vowel = 0;
		int consonants = 0;
		String str1=str.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {

			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;

			} else {
				consonants++;

			}

		}
		System.out.println("Vowel =" + vowel);
		System.out.println("consonants =" + consonants);
	}
}
