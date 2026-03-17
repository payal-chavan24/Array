package com.arraypractice;

import java.util.Iterator;

//Find duplicate elements in an array
public class Duplicate {
public static void main(String[] args) {
	int[] arr1= {2,4,5,2,8,4,4};
	
	for(int i=0;i<arr1.length;i++) {
		boolean repeat=false;
		boolean isAlready=false;
		for(int j=i+1;j<arr1.length;j++) {
			if(arr1[i]==arr1[j]) {
				repeat=true;
				break;
			}
			
			
		}
		for(int k=0;k<i;k++) {
			if(arr1[k]==arr1[i]) {
				isAlready=true;
				break;
			}
			
		}
		if(repeat==true&&isAlready==false) {
			System.out.println(arr1[i]);
			
		}
		
		
		
	}
}
}
