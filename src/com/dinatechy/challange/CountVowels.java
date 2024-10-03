package com.dinatechy.challange;

public class CountVowels {
	
	public static void main(String[] args) {
		
		//Count number of Vowels - a e i o u
		String value = "DinaTechy";// vowels = 3
		String vowels = "aeiou";
		int count = 0;
		int size = value.length();
		for(int i=0; i<size; i++) {
			if(vowels.contains(String.valueOf(value.charAt(i))))
				count++;
		}
		
		System.out.println("Vowels Count : "+count);
		
	}

}
