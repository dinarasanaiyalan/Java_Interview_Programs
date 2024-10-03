package com.dinatechy.challange;

public class CountSpecialCharacter {
	
	public static void main(String[] args) {
		
		// Count Special Character : DinaTechy!!!! = ! - 4 Count
		
		String value = "DinaTechy%%%%";
		
		int count = 0;
		for(int i=0; i<value.length(); i++) {
			if( "%".equalsIgnoreCase(String.valueOf(value.charAt(i))) )
				count++;
		}
		
		System.out.println("Count : "+count);
 		
	}

}
