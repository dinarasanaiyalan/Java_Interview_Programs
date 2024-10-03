package com.dinatechy.challange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepetitiveCharacter {
	
	public static void main(String[] args) {
		
		// Java Program :
		// 		To print Repetitive Character in a String
		// aabcdd = a d
		String content = "aabccdd";// ad
		
		Set<Character> charSet = new HashSet<Character>();
		int size = content.length();
		for(int i=0; i<size-1; i++) {
			if(content.charAt(i) == content.charAt(i+1)) // a a
				charSet.add(content.charAt(i));
		}
		
		List<Character> list = new ArrayList<Character>(charSet);
		Collections.sort(list);	
		
		list.forEach(System.out::println);
		
	}

}
