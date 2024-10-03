package com.dinatechy.challange;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		//Find Factorial of a given Number
		/*
		 * 4 - 1*2*3*4 = 24
		 * 5 - 1*2*3*4*5 = 125
		 * */
		
		Scanner scan = new Scanner(System.in);
		int factNo = scan.nextInt();
		scan.close();
		
		int result = calculateFact(factNo);// 4
		
		System.out.println("Factorial of "+factNo+" is : "+result);
		
	}

	private static int calculateFact(int factNo) { // 4
		if(0 == factNo || 1 == factNo)
			return 1;
		return factNo * calculateFact(factNo-1); // 4*3 = 12*2 = 24*1 = 24
	}

}
