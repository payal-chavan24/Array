package com.may16;

import java.util.ArrayList;
import java.util.Collections;

public class CheckAnagram {
	public static void main(String[] args) {
		String str1 = "slient";
		String str2 = "listen";
		ArrayList<Character> list1 = new ArrayList<>();
		ArrayList<Character> list2 = new ArrayList<>();
		for (Character character : str1.toCharArray()) {
			list1.add(character);

		}
		for (Character character : str2.toCharArray()) {
			list2.add(character);

		}
		Collections.sort(list1);
		Collections.sort(list2);
		if (list1.equals(list2)) {
			System.out.println("Annagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}