package javaBasics;

public class problem3 {
	
	/*
	3. Write a program to check if elements of an array are same or not it read from front or back.
	*/


		public static void main(String[] args) {
			
			int[] arr = new int[] { 10, 12, 20, 30, 20, 12, 10};
			int lastIndex = arr.length - 1;
			
			for (int i = 0, j = lastIndex; i < j; i++, j--) {
				if (arr[i] != arr[j]) {
					System.out.println("Not same");
					return;
				}
			}

			System.out.println("Same");
			
		}

	}

