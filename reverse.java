package com.arrayquestion;

public class reverse {
	public static void main(String[] args) {
		String str = "hello world";
		char[] arr = str.toCharArray();

		String word = "";

		for(int i=0;i<arr.length;i++) {																											
			if(arr[i]!=' ') {
				word=word+arr[i];
				
			}else {
				for(int j=word.length()-1;j>=0;j--) {
					System.out.print(word.charAt(j));
					
				}
				System.out.print(" ");
				word="";
			}
			
		}
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
			
		}
		
	}

}
