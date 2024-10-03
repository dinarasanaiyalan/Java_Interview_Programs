package com.dinatechy.challange;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintEachWord {
	
	public static void main(String[] args) {
		
		//Print each word based on space.
		String content = "thanks for subscribtion, hello";
		String ptn = "(\\w+)";
		
		Pattern pattern = Pattern.compile(ptn);
		Matcher matcher = pattern.matcher(content);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
	}

}
