package com.dinatechy.challange;

import java.util.Scanner;

public class CheckDigitsOnly {
	
	public static void main(String[] args) {
		
		//To check if the String contains only Digit's
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		scan.close();
		
		boolean isDigits = checkDigits(data);
		
		System.out.println(isDigits ? "Yes it is" : "No it's not");
		
	}

	private static boolean checkDigits(String data) {
		// "    "
		if(null == data || data.isEmpty() || data.isBlank())
			return false;
		
		int size = data.length();
		for(int i=0; i<size; i++) {
			if(!Character.isDigit(data.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}

}
