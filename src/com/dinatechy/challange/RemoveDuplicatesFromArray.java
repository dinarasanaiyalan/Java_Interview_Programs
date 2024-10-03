package com.dinatechy.challange;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,2,5,3,5,6,7,1,3};
		int[] uniqueArray = removeDuplicates(arr);
		for(int a: uniqueArray) {
			System.out.print(a+" ");
		}
	}
	
	public static int[] removeDuplicates(int[] arr) {
		
		if(arr.length == 0 || arr.length == 1)
			return arr;
		
		Arrays.sort(arr);
		
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1])
				temp[j++] = arr[i];
		}
		
		temp[j++] = arr[arr.length-1];
		
		int[] uniqueArray = new int[j];
		System.arraycopy(temp, 0, uniqueArray, 0, j);
		
		return uniqueArray;
	}

}
