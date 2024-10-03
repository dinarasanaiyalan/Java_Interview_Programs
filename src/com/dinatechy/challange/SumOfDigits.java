package com.dinatechy.challange;

import java.util.Scanner;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		// Sum of digits in the given number
		// 123 = 1+2+3 = 6
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt(); // 135 - 13 - 1 - 0
		scan.close();
		
		int result = 0;// 0 5 8
		
		while(number > 0) {
			int temp = number%10; // 135%10 = 5, 13%10 = 3, 1%10 = 1
			result += temp; // 0+5 = 5 + 3 = 8 + 1 = 9
			number = number/10;// 135/10 = 13, 13/10 = 1, 1/10 = 0
		}
		
		System.out.println("Sum of digit's is : "+result);
		
	}

}
