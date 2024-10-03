package com.dinatechy.challange;

import java.util.Scanner;

public class CheckCharacter {
	
	public static void main(String[] args) {
		
		//Check the String only contains Character or Not
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String data = scan.next();
		scan.close();
		
		boolean isChar = checkOnlyCharacter(data);
		System.out.println(isChar ? "Yes" : "No");

	}

	private static boolean checkOnlyCharacter(String data) {
		
		if(null == data || data.isEmpty())
			return false;
		
		int size = data.length();
		for(int i=0; i<size; i++) { // DinaTechy
			if(!Character.isAlphabetic(data.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}

}
