package com.dinatechy.challange;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		// Reversing a sentence
		// thanks for support - support for thanks
		
		String content = "don't forget to hit the like button";
		
		StringBuilder reversedSentence = new StringBuilder();
		
		String[] contentArray = content.split("\\s+");
		
		int size = contentArray.length;
		for(int i=size-1; i>=0; i--) {
			reversedSentence.append(contentArray[i]).append(" ");
		}
		System.out.println("Original : "+content);
		System.out.println("Reverse : "+reversedSentence);
		
	}

}
