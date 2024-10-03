package com.dinatechy.challange;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		//Check if the given number is Prime or not
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		boolean result = isPrime(number);
		System.out.println( result ? "Yes it is" : "No it's not" );
		
	}
	
	public static boolean isPrime(int num) {
		
		// a number is divisible by own or 1
		if(0 == num || 1 == num) 
			return true;
		
		// 5/2 = 4.5 -> 5/3
		for(int i=2; i<num/2; i++) {
			if( num % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}

}
