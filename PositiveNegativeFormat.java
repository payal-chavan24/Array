package com.arraypractice;

public class PositiveNegativeFormat {
public static void main(String[] args) {
	int array1[]= {2,9,-7,3,-8,-4,87};
	int array2[]= new int[array1.length];
	int index=0;
	int pos=0;
	int neg=array2.length-1;
	for(int i=0;i<array1.length;i++) {
		if(array1[i]>=0) {
			array2[index]=array1[i];
			index++;
		}
		
	}
	for(int i=0;i<array1.length;i++) {
		if(array1[i]<0) {
			array2[index]=array1[i];
			index++;
		}
		
	}
//	for(int i=0;i<array1.length;i++) {
//		System.out.println(array2[i]);
//		
//	}
	for(int k=0;k<array1.length;k++) {
		if(array2[pos]>0&&array2[neg]<0) {
			System.out.print(array2[pos]+" ");
			System.out.print(array2[neg]+" ");
			pos++;
			neg--;
			
		}
		
	}
	
	
	
	
}
}
