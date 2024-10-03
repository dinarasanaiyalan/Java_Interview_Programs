package com.dinatechy.challange;

import java.util.Scanner;

public class FindFirstUniqueChar {
	
	public static void main(String[] args) {
		
		// Finding the First Unique Character in the given String
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		scan.close();
		
		int size = data.length()-1;
		for(int i=0; i<size; i++) {
			char value = data.charAt(i);
			System.out.println(value+" "+data.indexOf(value) +" "+ data.lastIndexOf(value));
			if(data.indexOf(value) == data.lastIndexOf(value)) {
				System.out.println(value);
				break;
			}
		}
		
	}

}
