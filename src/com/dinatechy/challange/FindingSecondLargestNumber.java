package com.dinatechy.challange;

public class FindingSecondLargestNumber {
	
	public static void main(String[] args) {
		
		//Finding second largest number in Array
		int[] arr = {34,23,54,66,43,55}; // second largest is 65
		
		int largest = Integer.MIN_VALUE;// minus
		int secondlar = Integer.MIN_VALUE;// minus
		
		for(int a : arr) { // 34 23
			if( a > largest ) { // 34 > -1 , 23 > 34 
				secondlar = largest; // -1
				largest = a; // 34
			} else if( a > secondlar && a != largest ) {// 23 > -1 && 23 != 34
				secondlar = a; // 23
			}
		}
		
		System.out.println("Second largest is : "+secondlar);
		
	}

}
