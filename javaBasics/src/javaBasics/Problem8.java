package javaBasics;

import java.util.Arrays;

public class Problem8 {
	
	/* 
	8.Write a program to shift every element of an array to circularly right.
	*/

		
		public static void main(String[] args) {
			
			int[] arr = new int[] { 1, 2, 3, 4, 5 };
			
			int lastIndex = arr.length - 1;
			int temp = arr[lastIndex];
			for (int i = lastIndex; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			System.out.println(Arrays.toString(arr));
			
	}

}
