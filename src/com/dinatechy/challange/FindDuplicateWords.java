package com.dinatechy.challange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateWords {
	
	public static void main(String[] args) {
		
		//Find and Replace Duplicate Consecutive words
		String content = "hi hi hello hello hello people";
		// hi hello people
		
		String ptn = "\\b(\\w+)(?:\\W+\\1\\b)+";
		
		Pattern pattern = Pattern.compile(ptn);
		Matcher matcher = pattern.matcher(content);
		System.out.println("Original : "+content);
		while(matcher.find()) {
			content = content.replaceAll(matcher.group(), matcher.group(1));
			// replaceAll("hi hi","hi")
			// hi hi hello hello hello people ---> hi hello hello hello people
			// replaceAll("hello hello hello", "hello")
			// hi hello hello hello people ---> hi hello people
		}
		
		System.out.println("After removing Duplicates : "+content);
		
	}

}
