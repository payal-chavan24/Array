package com.arraypractice;
//Move all negative numbers to one side of array
//Write a program to move all negative numbers to the left side and positive numbers to the right side.
//
//👉 Example:
//Input: arr = {2, -3, 4, -1, 5, -6}
//Output: -3 -1 -6 2 4 5
public class Practice {
public static void main(String[] args) {
	int[]arr1={2, -3, 4, -1, 5, -6};
	int left=0;
	int right =arr1.length-1;
	while(left<right) {
		if(arr1[left]<0) {
			left++;
			
		}else if(arr1[right]>0) {
			right--;
			
		}else {
			int temp=arr1[left];
			arr1[left]=arr1[right];
			arr1[right]=temp;
			left++;
			right--;
			
		}
		
		
		
	}
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
		
	}
	
		
	}
	
}

