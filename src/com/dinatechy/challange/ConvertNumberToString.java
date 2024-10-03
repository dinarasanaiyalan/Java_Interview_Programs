package com.dinatechy.challange;

import java.util.StringJoiner;

public class ConvertNumberToString {
	
	public static void main(String[] args) {
		
		//Convert the integer to string with delimeter ( - ) 
		// 1,2,3,4,5,6,7
		// 1-2-3-4-5-6-7
		
		Integer[] givenNumber = {1,2,3,4,5,6,7};
		
		StringJoiner joiner = new StringJoiner(",");
		// add method in StringJoiner.
		
		
		for(Integer a : givenNumber) {
			joiner.add(String.valueOf(a));
		}
		
		System.out.println(joiner.toString());
		
	}

}
