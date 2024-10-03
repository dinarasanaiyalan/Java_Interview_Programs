package com.dinatechy.challange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
	
	public static void main(String[] args) {
		
		// Pattern Matching in Java
		// Example : content = "Hello people hi", pattern = "hi"
		// Regex
		
		String content = "Hello people hi";
		String ptn = "hi people";
		Pattern pattern = Pattern.compile(ptn);
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.find()) {
			System.out.println("Matched");
		} else {
			System.out.println("No Matched");
		}
		
	}

}
