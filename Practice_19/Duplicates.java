package com.arraypractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Find duplicate elements in an array
public class Duplicate {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 5, 2, 8, 4, 4 };
//	for(int i=0;i<arr1.length;i++) {
//		boolean isrepeated=false;
//		boolean isalredyPrinted=false;
//		for(int j=i+1;j<arr1.length;j++) {
//			if(arr1[i]==arr1[j]) {
//				isrepeated=true;
//				
//			}
//			
//		}
//		for(int k=0;k<i;k++) {
//			if(arr1[i]==arr1[k]) {
//				isalredyPrinted=true;
//				break;
//			}
//			
//		}
//		if(isrepeated==true&&isalredyPrinted==false) {
//			System.out.println(arr1[i]);
//		}
//		
//	}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr1) {
			list.add(i);
		}
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (Integer integer : list) {
			if (!set1.add(integer)) {
				set2.add(integer);

			}

		}
		System.out.println(set2);

	}
}
