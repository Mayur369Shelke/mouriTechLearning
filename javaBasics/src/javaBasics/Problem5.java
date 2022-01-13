package javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	
	/*
	5.Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. 
	*/

		
		public static void main(String[] args) {
			
			int len = 3;
			int[] arr = new int[len];
			int[] reverseArr = new int[len];
			
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}
			
			for (int i = 0, j = len - 1; i < len; i++, j--) {
				reverseArr[i] = arr[j];
			}
			
			sc.close();
			
			System.out.println(Arrays.toString(reverseArr));
		}

	}

