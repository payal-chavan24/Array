package com.arrayquestion;

import java.util.ArrayList;

public class CommonElements {
	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 5, 3, 3};
		int array2[] = { 4, 56, 6, 3, 1, 12 };

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < array1.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					isFound = true;
					break;

				}

			}
			if (isFound == false) {
				list.add(array1[i]);

			}
		}
		for (int i = 0; i < array2.length; i++) {
			boolean isfound = false;
			for (int j = 0; j < array1.length; j++) {
             if(array2[i]==array1[j]) {
            	   isfound=true;
            	   break;
            	 
             }
			}
			if(isfound==false) {
				list.add(array2[i]);
				
			}

		}
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}
}