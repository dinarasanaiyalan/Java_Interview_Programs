package com.dinatechy.challange;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {
	
	public static void main(String[] args) {
		
		// Count the number of words in a string using HashMap.
		Scanner scan = new Scanner(System.in);
		String content = scan.nextLine();// hi hello guys guys
		scan.close();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] contentArray = content.split(" ");
		int size = contentArray.length;
		
		for(int i=0; i<size; i++) {
			
			if(map.containsKey(contentArray[i])) {
				
				Integer count = map.get(contentArray[i]);
				map.put(contentArray[i], count+1);
				
			} else {
				map.put(contentArray[i], 1);
			}
			
		}
		
		System.out.println(map);
		
	}

}
