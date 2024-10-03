package com.dinatechy.challange;

import java.util.Scanner;

public class FindingLeapYear {
	
	public static void main(String[] args) {
		
		//Finding the given year is leap year or not.
		// Con - 1 : if a year is divisible by 400
		// Con - 2 : if a year is divisible by 4 and not divisible by 100
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		
		if( (year % 400 == 0) || ( year % 4 == 0 && year % 100 != 0 ) ) {
			System.out.println("Yes it is");
		} else 
			System.out.println("No it is");
		
	}

}
