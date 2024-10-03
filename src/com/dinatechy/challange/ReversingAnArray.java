package com.dinatechy.challange;

public class ReversingAnArray {
	
	public static void main(String[] args) {
		
		// Reversing an Array with Time Complexity
		int[] arr = {3,2,5,4,6,1,3}; // {3,1,6,4,5,2,3}
		
		reversedArray(arr);
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
	}

	private static int[] reversedArray(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;// length it's call back method - Time Complexity --> 7-1 = 6
		//{3,1,6,4,5,2,3}
		while(start < end) { // 0<6 - t, 1<5 - t, 2<4 - t, 3<3 - f
			int temp = arr[start]; // 3 2 5
			arr[start] = arr[end]; // 3 1 6
			arr[end] = temp; // 3 2 5
			
			start++; // 0 1 2 3
			end--; // 6 5 4 3
		}
		
		return null;
	}

}
