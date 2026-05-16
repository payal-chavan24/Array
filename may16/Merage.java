package com.may16;

import java.util.ArrayList;
import java.util.Arrays;

public class Merage {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 9, 10));
		ArrayList<Integer> result = new ArrayList<>();
		for (Integer integer : list1) {
			result.add(integer);

		}
		for (Integer integer : list2) {
			result.add(integer);

		}
		System.out.println("Without removing =" + result);
		result.stream().distinct().forEach(System.out::println);

	}
}
