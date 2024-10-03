package com.dinatechy.challange;

import java.util.Scanner;

public class PermutationOfString {
	
	 // Helper function to swap characters at position i and j in a char array
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Recursive function to generate permutations
    private static void permute(char[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            // Base case: if currentIndex is the last index, print the permutation
            System.out.println(String.valueOf(array));
        } else {
            // Recursive case
            for (int i = currentIndex; i < array.length; i++) {
                // Swap the current index with the i-th element
                swap(array, currentIndex, i);
                // Recur for the next index
                permute(array, currentIndex + 1);
                // Backtrack: swap back to restore the original order
                swap(array, currentIndex, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcd"; // Input string
        char[] charArray = str.toCharArray(); // Convert string to char array
        permute(charArray, 0); // Call the permutation function
    }

}
