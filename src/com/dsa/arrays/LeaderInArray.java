package com.dsa.arrays;

public class LeaderInArray {

	public static void main(String[] args) {
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		printLeaders(arr, n);
	}

	private static void printLeaders(int[] arr, int n) {
		int maxFromRight = arr[n - 1];

		System.out.print("Leaders : " + (maxFromRight));

		for (int i = n - 2; i >= 0; i--) {
			if (maxFromRight < arr[i]) {
				maxFromRight = arr[i];
				System.out.print(" " + maxFromRight);
			}

		}

	}

}
