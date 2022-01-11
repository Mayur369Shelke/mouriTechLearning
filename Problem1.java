package javaBasics;

import java.util.Arrays;

public class Problem1 {
	
	
	/*
	1. Take an array of 10 elements. Split it into middle and store the elements in two different arrays.
	*/

		public static void main(String[] args) {
			
			int[] arr = new int[] { 58, 24, 13, 15, 63, 9, 8, 81, 1, 78 };
			
			int firstHalfLength = arr.length / 2;
			int[] firstHalf = new int[firstHalfLength];
			
			int secondHalfLength = arr.length - firstHalfLength;
			int[] secondHalf = new int[secondHalfLength];
			
			for (int i = 0; i < firstHalfLength; i++) {
				firstHalf[i] = arr[i];
			}
			
			for (int i = 0, j = firstHalfLength; i < secondHalfLength; i++, j++) {
				secondHalf[i] = arr[j];
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(firstHalf));
			System.out.println(Arrays.toString(secondHalf));
		}

	}

