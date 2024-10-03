package com.dinatechy.challange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LenghtPattern {
	
	public static void main(String[] args) {
		
		// Pattern for validate length
		String content = "DinaTechy0";// length - 9
		
		Pattern pattern = Pattern.compile("^.{9}$");
		Matcher matcher = pattern.matcher(content);
		
		if(matcher.matches())// return true based on condition
			System.out.println("Matched");
		else 
			System.out.println("Not Matched");
		
	}

}
