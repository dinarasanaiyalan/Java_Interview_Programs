package com.dinatechy.challange;

public class SwappingTwoNumbers {
	
	public static void main(String[] args) {
		
		//Swapping Two Numbers without using third number
		int a = 23, b = 40;
		System.out.println("a value is : "+a+", b value is : "+b);
		a = a+b;// 23+40 = 63
		b = a-b;// 63-40 = 23
		a = a-b;// 63-23 = 40
		System.out.println("a value is : "+a+", b value is : "+b);		
		
	}

}
