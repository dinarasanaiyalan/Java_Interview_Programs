package com.dinatechy.challange;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		// 121 = count - 3 = 1*1*1 = 1, 2*2*2 = 8, 1*1*1 = 1 = 1+8+1 = 10
		// Same - Armstrong number - not an.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		int number = scan.nextInt();
		int count = 0, temp = number, result = 0;
		
		// 121/10 = 12/10 = 1
		while(temp > 0) {
			temp = temp / 10;
			count++;
		}
		
//		System.out.println(count);
		temp = number;
		
		while(temp > 0) {
			int remainder = temp % 10;// 121 - 1 = 12 - 2 = 1
			result += Math.pow(remainder, count);// 1 power 3, 2 power 3
			temp = temp / 10;// 121 - 12 - 1
		}
		
		if(result == number) {
			System.out.println("Yes it is.");
		} else {
			System.out.println("No");
		}
		
	}

}
