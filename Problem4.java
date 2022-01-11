package javaBasics;

import java.util.Scanner;

public class Problem4 {
	
	/*
	4. Take 20 integer inputs from user and print the following:
	number of positive numbers
	number of negative numbers
	number of odd numbers
	number of even numbers
	number of 0s.
	*/

		
		public static void main(String[] args) {
			
			int positiveCount = 0, negativeCount = 0, oddCount = 0, evenCount = 0, zeroCount = 0;
			
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < 20; i++) {
				int n = sc.nextInt();
				if (n > 0) {
					positiveCount++;
					if (n % 2 == 1) {
						oddCount++;
					} else {
						evenCount++;
					}
				} else if (n < 0) {
					negativeCount++;
				} else {
					zeroCount++;
				}
			}
			
			sc.close();
			
			System.out.println("No.of positive numbers: " + positiveCount);
			System.out.println("No.of negative numbers: " + negativeCount);
			System.out.println("No.of odd numbers: " + oddCount);
			System.out.println("No.of even numbers: " + evenCount);
			System.out.println("No.of 0s: " + zeroCount);
			
		}

	}

