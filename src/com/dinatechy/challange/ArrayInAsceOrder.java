package com.dinatechy.challange;

public class ArrayInAsceOrder {
	
	public static void main(String[] args) {
		
		// Sort the Array in Ascending order.
		int[] arr = {3,2,5,6,4,7,93,24,54};
		
		int size = arr.length;
		for(int i=0; i<size; i++) { // i=0
			for(int j=i+1; j<size; j++) {// j=i+1 = 0+1 = 1
				if(arr[i]>arr[j]) {
					int temp = arr[i];//3
					arr[i] = arr[j];//2
					arr[j] = temp;//3
				}
			}
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
	}

}
