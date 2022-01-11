package javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
	
	/*
	6.Consider an integer array, the number of elements in which is determined by the user. 
	The elements are also taken as input from the user. 
	Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
	maximum difference = highest-lowest
	minimum difference = second lowest - lowest
	
*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		if (len > 1) {
			Arrays.sort(arr);
			System.out.println("Maximum difference: " + (arr[arr.length - 1] - arr[0]));
			System.out.println("Minimum difference: " + (arr[1] - arr[0]));
		} else {
			System.out.println("Please provide atleast two numbers");
		}
	}

}
