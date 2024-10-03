package com.dinatechy.challange;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		
		// Check the number is Palindrome or not without using reverse() method in string
		int number = 12321; // 22321
		int originalNumber= number;
		int reversedNumber = 0; // 0 1 12 123 1232 12321
		
		
		while(number > 0) {
			int digit = number % 10; // 12321%10 = 1, 1232 % 10 = 2, 123 % 10 = 3, 12 % 10 = 2, 1%10 = 1
			reversedNumber = reversedNumber * 10 + digit;
			// 0*10 + 1 = 1 --> 1*10+2 = 12 --> 12*10+3 = 120+3 = 123 --> 123*10+2 = 1230+2 = 1232
			// 1232*10+1 = 12320+1 = 12321
			number /= 10;// 1232 , 123, 12, 1, 0
		}
		
		if(reversedNumber == originalNumber)
			System.out.println("Yes it is");
		else
			System.out.println("No it is not");
		
	}

}
