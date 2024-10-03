package com.dinatechy.challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckTwoArrayIsSame {
	
	public static void main(String[] args) {
		
		// Check the given two Array are containing the same elements
		// to check size of each array. 5 == 8
		
		Integer[] arr1 = {1,2,3,4,5};
		Integer[] arr2 = {1,2,3,4,5};
		
		boolean flag = checkSameOrNot(arr1, arr2);
		if(flag)
			System.out.println("Both are same");
		else
			System.out.println("Both are not same");
		
	}

	private static boolean checkSameOrNot(Integer[] arr1, Integer[] arr2) {
		if(arr1.length != arr2.length)
			return false;
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
		
		if(list1.containsAll(list2) && list2.containsAll(list1)) {
			return true;
		}
		
		return false;
		
	}

}
