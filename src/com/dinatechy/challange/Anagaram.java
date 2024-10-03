package com.dinatechy.challange;

import java.util.Arrays;

public class Anagaram {
	
	public static void main(String[] args) {
		
		//listen, silent
		
		String nameOne = "listen";
		String nameTwo = "sileat";
		
		if(nameOne.length() != nameTwo.length())
			System.out.println("It is not.");
		else {
			
			char[] arrayOne = nameOne.toCharArray();
			char[] arrayTwo = nameTwo.toCharArray();
			
			Arrays.sort(arrayOne);
			Arrays.sort(arrayTwo);
			System.out.println(String.valueOf(arrayOne)+" "+String.valueOf(arrayTwo));
			
			if(String.valueOf(arrayOne).equals(String.valueOf(arrayTwo)))
				System.out.println("Yes it is");
			else 
				System.out.println("No it is");
			
		}
	}

}
