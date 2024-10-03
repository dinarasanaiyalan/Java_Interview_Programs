package com.dinatechy.challange;

public class SquareRootOfNumber {
	
	public static void main(String[] args) {
		
		int number = 17;
		
		for(int i=1; i<16; i++) {
			int squareRoot = i*i;
			if(squareRoot == number) {
				System.out.println(i+"*"+i+"="+squareRoot);
				break;
			} else
				System.out.println(i+"*"+i+"="+squareRoot+" not it's not" );
		}
		
		double guess = number / 2.0;
        double epsilon = 1e-15;  // Very small value for precision
        
        while (Math.abs(guess * guess - number) > epsilon) {
            guess = (guess + number / guess) / 2.0;
        }		
        
        System.out.println(guess);
		
	}

}
