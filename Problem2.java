package javaBasics;

import java.util.Arrays;

public class Problem2 {
	
	/*
	2.your program should be able to find that the sub array lies between the indexes 3 and 8.
	*/
		
		public static void main(String[] args) {
			
			int[] arr = new int[] { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
			int[] subArr = new int[6];
			
			for (int i = 0, j = 3; j <= 8; i++, j++) {
				subArr[i] = arr[j];
			}
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(subArr));

	}

}
