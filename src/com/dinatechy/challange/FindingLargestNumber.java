package com.dinatechy.challange;

public class FindingLargestNumber {
	
	public static void main(String[] args) {
		
		//Finding Largest Number in Array
		int[] array = {8,9,38,82,4,888,14};// largest number = 82
		
		int max = array[0];// 8 - 9
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max)
				max = array[i];// 8 > 8, 9>8 = 
		}
		
		System.out.println("Largest number in Arrays is : "+max);
		
	}

}
