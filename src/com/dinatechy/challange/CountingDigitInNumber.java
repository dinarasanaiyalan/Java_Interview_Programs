package com.dinatechy.challange;

public class CountingDigitInNumber {
	
	public static void main(String[] args) {
		
		// Count how many digit in given number
		
		int number = 1434; // 1 2 3 = 3
		
		int count = 0;
		
		while(number>0) {// 123>0-t, 12>0-t, 1>0-t, 0>0-f
			number /= 10;// 123/10 = 12, 12/10 = 1, 1/10 = 0
			count++;// 0 1 2 3
		}
		
		System.out.println("Digit count is : "+count);
		
	}

}
