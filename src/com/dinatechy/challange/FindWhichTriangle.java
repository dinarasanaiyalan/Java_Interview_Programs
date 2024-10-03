package com.dinatechy.challange;

public class FindWhichTriangle {
	
	public static void main(String[] args) {
		
		// Find the Which Triangle based on the given Three length's
		// Equilateral == all the three lenght's are equal, 
		// Isosceles == either two side's are equal or 
		// Scalene == all three side's are different
		
		int a = 23, b = 231, c = 232;
		
		if( a==b && b==c && c==a )
			System.out.println("Equilateral");
		else if( a==b || b==c || c==a )
			System.out.println("Isosceles");
		else if( a!=b && b!=c && c!=a )
			System.out.println("Scalene");
		
	}

}
