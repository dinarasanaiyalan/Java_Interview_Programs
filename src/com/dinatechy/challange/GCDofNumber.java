package com.dinatechy.challange;

import java.util.Scanner;

public class GCDofNumber {
	
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        // Calculate the GCD
        int gcd = findGCD(num1, num2);

        // Print the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Method to find the GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        
    	// b = a % b, c = num2 % c, 
    	while(b != 0) {
    		int temp = b;
    		System.out.println(a+" % "+b);
        	b = a % b;
        	a = temp;
        	System.out.println(b);
    	}
    	
        return a;
    }

}
