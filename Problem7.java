package javaBasics;

import java.util.Arrays;

public class Problem7 {
	
	/* 
	7. Take an array of length n where all the numbers are nonnegative and unique. 
	Find the element in the array possessing the highest value. 
	Split the element into two parts where first part contains the next highest value in the array and 
	second part hold the required additive entity to get the highest value. 
	Print the array where the highest value get splitter into those two parts.
	Sample input: 4 8 6 3 2
	Sample output: 4 6 2 6 3 2
	*/

		
		public static void main(String[] args) {
			
			int[] arr = new int[] { 4, 8, 6, 3, 2 };
			int[] res = new int[arr.length + 1];
			int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					secondMax = max;
					max = arr[i];
				} else if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
			
			for (int i = 0, j = 0; i < res.length; i++, j++) {
				if (arr[j] == max) {
					res[i++] = secondMax;
					res[i] = max - secondMax;
				} else {
					res[i] = arr[j];
				}
			}
			System.out.println(Arrays.toString(res));
		}

	}

