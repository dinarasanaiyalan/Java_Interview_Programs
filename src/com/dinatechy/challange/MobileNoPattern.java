package com.dinatechy.challange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoPattern {
	
	public static void main(String[] args) {
		
		// Mobile number Pattern
		// length should be 10
		// must be digits
		String mobileNo = "987654d210";
		
		Pattern pattern = Pattern.compile("^\\d{10}$");
		// d refers to only digit's
		// 10 length
		Matcher matcher = pattern.matcher(mobileNo);
		
		if(matcher.matches())
			System.out.println("Matched");
		else 
			System.out.println("Not Matched");
		
	}

}